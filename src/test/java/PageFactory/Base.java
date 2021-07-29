package PageFactory;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base {

	public static WebDriver driver;
	public static Properties prob;

	public static void OpenBrowser() {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static void NavigateTo(String url) throws IOException {

		LoadFile();

		driver.get(prob.getProperty("" + url + ""));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("Navigate to : " + driver.getCurrentUrl());

	}
	
	public static void sendKeys(By Locater, String x) {

		WebElement elem = driver.findElement(Locater);
		
		if (x.equals("empty")) {

			elem.sendKeys("");
		} else {
			elem.sendKeys(x);
		}
	}

	public static void LoadFile() throws IOException {
		prob = new Properties();
		FileInputStream fs = new FileInputStream("./src/test/java/PageFactory/global.properties");
		prob.load(fs);
	}

	public static void click(By locator) {
		WebElement elem;
		try {
			elem = driver.findElement(locator);
			elem.click();
		} catch (NoSuchElementException e) {

			CaptureScreenShot("No such Element found" + locator);

			driver.quit();
			System.out.println("No Such element  found .");
			fail("No such Element found" + locator);
		}

		wait(2);
	}
	
	public static void SwitchToFrame(By Locater)

	{
		WebElement elem = driver.findElement(Locater);
		driver.switchTo().frame(elem);
	}

	public static void MouseHover(By locater) {

		Actions action = new Actions(driver);
		WebElement elem = driver.findElement(locater);
		action.moveToElement(elem).build().perform();
	}

	public static void quit() {
		driver.quit();
	}


	public static void match(String value) {

		value = value.trim();
		boolean m = driver.getPageSource().contains(value);
		try {
			assertTrue(m);

		} catch (AssertionError e) {

			CaptureScreenShot(value);
			driver.quit();
			System.out.println(" The" + value + " is not found ");
			fail(value);

		}

	}



	public static void Select(By locater, String value) {

		WebElement elem = driver.findElement(locater);
		Select dropdown = new Select(elem);

		dropdown.selectByValue(value);

	}


	public static void UrlMatch(String value) {

		boolean Url = driver.getCurrentUrl().contains(value);
		assertTrue(Url);
	}

	
	public static void CaptureScreenShot(String screenshotname) {

		try {

			TakesScreenshot ts = (TakesScreenshot) driver;

			File SrcFile = ts.getScreenshotAs(OutputType.FILE);

			File DestFile = new File("./Screenshots/" + screenshotname + ".png");

			FileUtils.copyFile(SrcFile, DestFile);

			System.out.println("Screenshot taken");

		}

		catch (Exception e) {

			System.out.println("Exception while takin screenshot" + e.getMessage());
		}

	}
	
	public static void Enter (By locater) {
		
		WebElement elem = driver.findElement(locater);
		elem.sendKeys(Keys.ENTER);
	}
	
	

	public static void wait(int x) {
		x = x * 1000;
		try {
			Thread.sleep(x);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
