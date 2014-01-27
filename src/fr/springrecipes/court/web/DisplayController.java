package fr.springrecipes.court.web;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.springrecipes.court.domain.Person;

@Controller
public class DisplayController {
	
	static Logger log = Logger.getLogger(WelcomeController.class.getName());

	@RequestMapping(value = "/display", method = RequestMethod.POST)
	   public String display(@ModelAttribute("personne")Person person,
	   ModelMap model) {
	      model.addAttribute("nom", person.getNom());
	      model.addAttribute("prenom", person.getPrenom());
	      model.addAttribute("age", person.getAge());
	      model.addAttribute("pays", person.getPays());
	      model.addAttribute("sportName", person.getSport().getName());
	      model.addAttribute("sportClub", person.getSport().getClub());
	      log.info("##############Sport##########"+person.getSport().getName());
	      return "personInfo";
	   }

}
