package fr.springrecipes.court.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import fr.springrecipes.court.domain.Hobby;



@Controller
public class HobbyController {

			@RequestMapping(value="/welcome/add1")  
	     public ModelAndView hobbyFormPage() {  
	         return new ModelAndView("add1", "hobby", new Hobby());  
     }  
	       
	     @RequestMapping(value="/welcome/display1")  
	     public ModelAndView processHobby(@ModelAttribute Hobby hobby) {  
	         ModelAndView modelAndView = new ModelAndView("display1");  
	         modelAndView.addObject("hobby", hobby);  
	         return modelAndView;  
	     }  
}
