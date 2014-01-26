package fr.springrecipes.court.web;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class DisplayReservationController {
	static Logger log = Logger.getLogger(WelcomeController.class.getName());
	
	@RequestMapping(value = "/reservation", method = RequestMethod.GET)
    public ModelAndView reservation() {
		
           ModelAndView mav = new ModelAndView("reservation");
         
           return mav;
	  }

}
