package steps;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.HomePage;

public class PesquisaProdutoSteps
{
	private static WebDriver driver;
	
	HomePage homePage = new HomePage(driver);
	
	@Before
	public static void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@After
	public static void tearDown()
	{
		driver.quit();
	}
	
	@Dado("que estou na pagina inicial")
	public void que_estou_na_pagina_inicial() {
	    homePage.carregaPaginaIncial();
	    MatcherAssert.assertThat(homePage.obterTituloPagina(),CoreMatchers.is("Loja de Teste"));
	}

	@Quando("preencho a poesquisa de produto com texto {string}")
	public void preencho_a_poesquisa_de_produto_com_texto(String produto) {
	    homePage.pesquisaProdutoPreencheCampo(produto);
	}

	@Quando("clico na lupa")
	public void clico_na_lupa() 
	{
		homePage.pesquisaProdutoClicaLupa();
	}

	@Então("lista o produto {string}")
	public void lista_o_produto(String string) 
	{
		MatcherAssert.assertThat(homePage.obterNomeProdutoPesquisado(),CoreMatchers.is("Hummingbird Printed T-Shirt"));
	}
}
