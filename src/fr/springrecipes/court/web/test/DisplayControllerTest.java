package fr.springrecipes.court.web.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.ui.ModelMap;

import fr.springrecipes.court.domain.Person;
import fr.springrecipes.court.web.DisplayController;

public class DisplayControllerTest extends ControllerIntegrationTest{
	
	@Test
	public void display_200_ok() throws Exception {
		MockHttpServletRequest request = new MockHttpServletRequest();
	    Person person = new Person("salah","24");
	   
	    //isUserValid = false;
	    DisplayController disp = new DisplayController();
	    ModelMap model = new ModelMap("nom", person.getNom());

	    // Inject mock user service into controller
	  


	    // Attempt the validation
	    String mav = disp.display(person,model);

	    // Check the result
	    assertEquals("personInfo", mav.toString());

}
}
