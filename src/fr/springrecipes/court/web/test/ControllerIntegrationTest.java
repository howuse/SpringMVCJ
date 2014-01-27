package fr.springrecipes.court.web.test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import fr.springrecipes.court.web.AddController;
import fr.springrecipes.court.web.DisplayController;
import fr.springrecipes.court.web.WelcomeController;
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration("file:WebContent/WEB-INF/court-servlet.xml")
public class ControllerIntegrationTest {
	/* @Autowired
	 private WebApplicationContext applicationContext;
	 */
	
	protected MockMvc mockMvc() {
		//	return MockMvcBuilders.webAppContextSetup(applicationContext).build();
		return MockMvcBuilders.standaloneSetup(new WelcomeController()).build();
		}
	protected MockMvc addMockMvc(){
		return  MockMvcBuilders.standaloneSetup(new AddController()).build();
	}
	
	protected MockMvc displayInfoMockMvc(){
		return  MockMvcBuilders.standaloneSetup(new DisplayController()).build();
	}
}
