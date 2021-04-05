package Locaters;

import org.openqa.selenium.By;

public class Signup {
	
	
	public static By Firstname = By.id("wpforms-2252-field_0");
	
	public static By Lastname  = By.id("wpforms-2252-field_8");
	
	public static By Email     = By.id("wpforms-2252-field_1");
	
	public static By CompanyName = By.id("wpforms-2252-field_9");
	
	public static By PhoneNumber = By.id("wpforms-2252-field_15");
	
	public static By ContactMe   = By.xpath("//button[contains(text(),'Contact me')]");
	
	public static By CountryDropdown = By.id("wpforms-2252-field_4");
	
	public static By CountryDropdown2 = By.xpath("//label[contains(text(),'Country')]//following::input[1]");

	public static By KSA = By.xpath("//span[contains(text(),'KSA')]");

	public static By Egypt = By.xpath("//span[contains(text(),'Egypt')]");
	
	public static By Oman = By.xpath("//span[contains(text(),'Oman')]");
}
