package fr.springrecipes.court.web.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Test;


public class WelcomeControllerTest extends ControllerIntegrationTest {
	
	@Test
	public void welcome_200_ok() throws Exception {
		mockMvc().perform(get("/"))
	   	 .andDo(print())
	   	 .andExpect(status().isOk())
	   	 .andExpect(view().name("welcome"))
	   	 .andExpect(model().attributeExists("today"));
		
	   	
	}
	
	

}
