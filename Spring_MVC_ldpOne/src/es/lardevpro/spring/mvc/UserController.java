package es.lardevpro.spring.mvc;

import javax.validation.Valid;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
@RequestMapping("/user")
public class UserController {

	//para validar espacios en blanco
	@InitBinder
	public void myBinder(WebDataBinder binder) {
		
		StringTrimmerEditor trim = new StringTrimmerEditor(true);
		
		binder.registerCustomEditor(String.class, trim);
		
	}
	
	
	@RequestMapping("/viewFormRegister")
	public String userRegistration(Model model) {
		
		
		//usuario
		model.addAttribute("currentUser",new User()); //Model añade como atributo del página 
		
		//sexo
		model.addAttribute("sexOptions", Sex.getSexOptions());
	    
	    //país
	    model.addAttribute("countryOptions", CountryOptions.getCountryOptions());

		
		return "formUserRegister";
		
	}
	
	//@Valid dice al sistema que está usando validación
	//@ModelAttribute inyecta el usuario actual
	//BindigResult 
	@RequestMapping("/userConfirmation")
	public String processForm(@Valid @ModelAttribute("currentUser") User user, BindingResult resVal, Model model) {
		
		
		if(resVal.hasErrors()) {
				model.addAttribute("sexOptions", Sex.getSexOptions());
				model.addAttribute("countryOptions", CountryOptions.getCountryOptions()); // Si tienes más opciones dinámicas
		     return "formUserRegister"; // Vuelve al formulario con errores
		} else {
			return "userRegistrationConfirmation";//si no hay error va a la página de confirmación
		}
		
	}	
}
