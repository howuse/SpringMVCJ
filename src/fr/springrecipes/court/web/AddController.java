package fr.springrecipes.court.web;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import fr.springrecipes.court.domain.Person;
import fr.springrecipes.court.domain.Sport;

@Controller
public class AddController {
	
	static Logger log = Logger.getLogger(WelcomeController.class.getName());
	
	@RequestMapping(value="/add",method = RequestMethod.GET)
    public ModelAndView person() {
           
    //return new ModelAndView("add", "command", new Person());
           ModelAndView mav = new ModelAndView("personForm");
           Map<String, String> pays = new HashMap<String, String>();
           pays.put("MAROC", "MAROC");
           pays.put("ALGERIE", "ALGERIE");
           pays.put("TUNISIE", "TUNISIE");
           pays.put("LIBYE", "LIBYE");
          
           Sport sport = new Sport();
        
           mav.addObject("paysMap", pays);
           mav.addObject("person", new Person(sport));
           log.info("test du : http://localhost:8080/SpringMVCJ/welcome/add");
           return mav;
	  }

}
