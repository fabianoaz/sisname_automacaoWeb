package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage
{
	private WebDriver driver;
	private By linkContactUs = By.linkText("Contact us");
	private By nomeprimeiroProduto = By.cssSelector("#content > section > div > article:nth-child(1) > div > div.product-description > h3 > a");
	private By caixaTextoPesquisaProduto = By.cssSelector("input.ui-autocomplete-input");
	private By botaoPesquisaProduto = By.cssSelector("#search_widget > form > button");
	private By nomeProdutoPesquisado = By.cssSelector("#js-product-list > div.products.row > article > div > div.product-description > h2 > a");
	
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

	public void carregaPaginaIncial()
	{
		driver.get("https://marcelodebittencourt.com/demoprestashop/");
		driver.manage().window().maximize();		
	}

	public String obterTituloPagina()
	{
		return driver.getTitle();
	}
	
	public void pesquisaProdutoPreencheCampo(String produto) 
	{
		driver.findElement(caixaTextoPesquisaProduto).sendKeys(produto);
		
	}
	
	public void pesquisaProdutoClicaLupa() 
	{
		driver.findElement(botaoPesquisaProduto).click();
	}

	public String obterNomeProdutoPesquisado()
	{
		return driver.findElement(nomeProdutoPesquisado).getText();
	}
}
