package StepDefinitions;

import PageFactory.Base;
import io.cucumber.java.After;

public class Hooks extends Base{
	
	@After
	public void aftertest() {
		
		wait(2);
		driver.close();
	}

}