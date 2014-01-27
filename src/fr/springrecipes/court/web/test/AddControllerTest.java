package fr.springrecipes.court.web.test;

import static org.hamcrest.Matchers.hasKey;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;

public class AddControllerTest  extends ControllerIntegrationTest{
	
	@Test
	public void person_200_ok() throws Exception {
		addMockMvc().perform(get("/add"))
	   	 .andDo(print())
	   	 .andExpect(status().isOk())
	   	 .andExpect(model().attributeExists("paysMap"))
	   	 .andExpect(model().attribute("paysMap", hasKey("MAROC")))
	   	 .andExpect(model().attribute("paysMap", hasKey("ALGERIE")))
	   	 .andExpect(model().attribute("paysMap", hasKey("LIBYE")))
	   	 .andExpect(model().attribute("paysMap", hasKey("TUNISIE")))
	   	 .andExpect(model().attributeExists("person"));
		
		

		
	}
	

}
