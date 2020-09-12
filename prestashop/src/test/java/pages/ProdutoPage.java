package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProdutoPage
{
	private WebDriver driver;
	private By nomeProudto = By.cssSelector("#main > div.row > div:nth-child(2) > h1"); 
	
	public ProdutoPage(WebDriver driver) 
	{
		this.driver = driver;
	}

	public String obterNomeProduto()
	{
		return driver.findElement(nomeProudto).getText();
		
	}
}
