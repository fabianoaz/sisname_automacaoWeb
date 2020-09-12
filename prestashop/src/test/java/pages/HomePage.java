package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage
{
	private WebDriver driver;
	private By linkContactUs = By.linkText("Contact us");
	private By nomeprimeiroProduto = By.cssSelector("#content > section > div > article:nth-child(1) > div > div.product-description > h3 > a");
	
	public HomePage(WebDriver driver) 
	{
		this.driver = driver;
	}

	public String obterTextLinkContactUs()
	{
		return driver.findElement(linkContactUs).getText();
	}

	public String obterNomePrimeiroProduto()
	{
		return driver.findElement(nomeprimeiroProduto ).getText();
	}

	public ProdutoPage clicarNomePrimeiroProduto()
	{
		driver.findElement(nomeprimeiroProduto ).click();	
		return new ProdutoPage(driver);
	}
}
