package es.lardevpro.spring.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/viewFormRegister")
	public String userRegistration(Model model) {
		
		
		
		model.addAttribute("currentUser",new User());
		
		//sexo
		model.addAttribute("sexOptions", Sex.getSexOptions());
	    
	    //país
	    model.addAttribute("countryOptions", CountryOptions.getCountryOptions());

		
		return "formUserRegister";
		
	}
	
	@RequestMapping("/userConfirmation")
	public String processForm(@ModelAttribute("currentUser") User user) {
		
		
		return "userRegistrationConfirmation";
		
	}
	
}
