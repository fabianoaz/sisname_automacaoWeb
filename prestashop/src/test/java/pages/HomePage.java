package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage
{
	private WebDriver driver;
	private By linkContactUs = By.linkText("Contact us");
	
	public HomePage(WebDriver driver) 
	{
		this.driver = driver;
	}

	public String obterTextLinkContactUs()
	{
		return driver.findElement(linkContactUs).getText();
	}
}
