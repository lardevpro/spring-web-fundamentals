package es.lardevpro.spring.mvc;




import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/viewFormRegister")
	public String userRegistration(Model model) {
		
		
		//usuario
		model.addAttribute("currentUser",new User()); //Model a�ade como atributo del p�gina 
		
		//sexo
		model.addAttribute("sexOptions", Sex.getSexOptions());
	    
	    //pa�s
	    model.addAttribute("countryOptions", CountryOptions.getCountryOptions());

		
		return "formUserRegister";
		
	}
	
	//@Valid dice al sistema que est� usando validaci�n
	//@ModelAttribute inyecta el usuario actual
	//BindigResult 
	@RequestMapping("/userConfirmation")
	public String processForm(@Valid @ModelAttribute("currentUser") User user, BindingResult resVal, Model model) {
		
		
		if(resVal.hasErrors()) {
				model.addAttribute("sexOptions", Sex.getSexOptions());
				model.addAttribute("countryOptions", CountryOptions.getCountryOptions()); // Si tienes m�s opciones din�micas
		     return "formUserRegister"; // Vuelve al formulario con errores
		} else {
			return "userRegistrationConfirmation";//si no hay error va a la p�gina de confirmaci�n
		}
		
	}
	
}
