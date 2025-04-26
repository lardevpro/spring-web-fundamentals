package es.lardevpro.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/ini")
public class HelloWorld {
	
	@RequestMapping("/helloWorldForm")
	public String formView() { // abre la vista del formulario
	
		return "HelloWorldFormPerson";
		
	}
	

	@RequestMapping("/formsProcessor")
	//public String anotherFormProcess (HttpServletRequest req, Model model ) { //procesa un formulario 
	public String anotherFormProcess (@RequestParam("namePerson") String name, Model model ) {	
		
		name+= ", que tengas un buen día¡";
		
		String message = "Bienvenido, "+name;
		
		// agregar información al modelo
		model.addAttribute("message", message);
		
		return "FormsProcessorName";
		
	}
	
}
