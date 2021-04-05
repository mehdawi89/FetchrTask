package Locaters;

import org.openqa.selenium.By;

public class TrackOrder {

	public static By TrackNumber = By.id("tracking_id");
	
	public static By Track = By.xpath("//a[contains(text(),'Track')][1]");
	
	public static By WhereToFind = By.xpath("//a[contains(text(),'Where can I find my tracking number?')][1]");
}
