package fr.springrecipes.court.web;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import fr.springrecipes.court.domain.Person;

@Controller
@RequestMapping("/admin")
public class LoginController {
	  static Logger log = Logger.getLogger(WelcomeController.class.getName());
	  
	@RequestMapping( method = RequestMethod.GET)
    public ModelAndView person() {
           
    //return new ModelAndView("add", "command", new Person());
           ModelAndView mav = new ModelAndView("admin");
           mav.addObject("person", new Person());
           return mav;
	  }
		
	@RequestMapping(method = RequestMethod.POST)
    public String login(@ModelAttribute("personne")Person person) {
           //ModelAndView mav = new ModelAndView("login");
           
           if("ADMIN".equals(person.getNom()) &&  "ADMIN".equals(person.getPass())){
        	   
        	   return "login";
           }
           else return "error";
	  }
	
	  }
 

