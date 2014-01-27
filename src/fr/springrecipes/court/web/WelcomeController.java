package fr.springrecipes.court.web;

import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
 * 
 * 
 */
@Controller
public class WelcomeController {

	 static Logger log = Logger.getLogger(WelcomeController.class.getName());

	    @RequestMapping(value="/",method= RequestMethod.GET )
		public String welcome(Model model){
			
			Date today = new Date() ;
			model.addAttribute("today",today);
			
		    log.info("test du : http://localhost:8080/SpringMVCJ");
			return "welcome";
		}
		
}
