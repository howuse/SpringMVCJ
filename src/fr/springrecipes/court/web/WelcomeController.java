package fr.springrecipes.court.web;

import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * 
 * 
 */
@Controller
public class WelcomeController {

	 static Logger log = Logger.getLogger(WelcomeController.class.getName());

	    @RequestMapping("/")
		public String welcome(Model model){
			
			Date today = new Date() ;
			model.addAttribute("today",today);
			
		    log.info("test du : http://localhost:8080/testspring/welcome");
			return "welcome";
		}
		
}
