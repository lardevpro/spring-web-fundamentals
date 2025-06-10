package es.lardevpro.spring.mvc;

import javax.validation.Valid;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import es.lardevpro.connectionHibernate.Customers;




@Controller
@RequestMapping("/user")
public class UserController {


	@InitBinder
	public void myBinder(WebDataBinder binder) {
		
		StringTrimmerEditor trim = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, trim);	
	}
	
	
	@RequestMapping("/viewFormRegister")
	public String userRegistration(Model model) {
		
		model.addAttribute("currentUser",new User()); 
		model.addAttribute("sexOptions", Sex.getSexOptions());
	    model.addAttribute("countryOptions", CountryOptions.getCountryOptions());

		
		return "formUserRegister";
		
	}
	
	
	@RequestMapping("/userConfirmation")
	public String processForm(@Valid @ModelAttribute("currentUser") User user, BindingResult resVal, Model model) {
		
		
		if(resVal.hasErrors()) {
				model.addAttribute("sexOptions", Sex.getSexOptions());
				model.addAttribute("countryOptions", CountryOptions.getCountryOptions()); 
		     return "formUserRegister";
		} else {
			return "userRegistrationConfirmation";
		}
	}	
	
	@RequestMapping("/hibernateView")
	public String hibernateConnection() {
		
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Customers.class).buildSessionFactory();
		
		Session session = sf.openSession();
		
		try {
			
			Customers client = new Customers("Juan", "Lara", "España");
			
			session.beginTransaction();
			session.save(client);
			session.getTransaction().commit();
			
			
		} finally {
			
			sf.close();
			
		}
		
		return "hibernateConnection";
	}
}
