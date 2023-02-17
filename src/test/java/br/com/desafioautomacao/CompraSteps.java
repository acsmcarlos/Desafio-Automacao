package br.com.desafioautomacao;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CompraSteps {
	
	static WebDriver driver;
	static CompraPage page;

//CENÁRIO 001 ===============================================================================
	@Given("que acesso a pagina de login")
	public void que_acesso_a_pagina_de_login() throws Throwable {
		
		inicio();
		
	}

	@When("entro com minhas credenciais de usuario e senha")
	public void entro_com_minhas_credenciais_de_usuario_e_senha() throws Throwable {
		
		page.fazerLogin("performance_glitch_user", "secret_sauce");
		
	}

	@When("seleciono um produto")
	public void seleciono_um_produto() throws InterruptedException {
		
		page.filtarProdutoPorZtoA();
	}

	@When("adiciono o produto ao carrinho")
	public void adiciono_o_produto_ao_carrinho() throws InterruptedException {
		
		page.adicionarProdutoAoCarrinho();
	}

	@When("realizo o checkout")
	public void realizo_o_checkout() throws InterruptedException {
		
		page.realizarCheckout();
		page.preencherCampos();
	}

	@Then("devo finalizar a compra")
	public void devo_finalizar_a_compra() throws InterruptedException {
		
		page.validandoVendaComSucesso();
		
		cleanup();
	}
	
// CENÁRIO 002 ===============================================================================
	@When("entro com minhas credenciais de usuario e senha diferentes")
	public void entro_com_minhas_credenciais_de_usuario_e_senha_diferentes() throws Throwable {
		
		page.fazerLogin("problem_user", "secret_sauce");
		
	}

	@When("adiciono produto diferente ao carrinho")
	public void adiciono_produto_diferente_ao_carrinho() throws InterruptedException {
		
		page.adicionarProdutoDiferenteAoCarrinho();
		
	}

	@Then("devo visualizar mensagem de erro")
	public void devo_visualizar_mensagem_de_erro() throws InterruptedException {
		
		page.validandoVendaSemSucesso();
		cleanup();
		
	}
	
	
	@BeforeClass
	public void inicio() {
	
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		
		driver = new ChromeDriver(options);
		
		driver.get("https://www.saucedemo.com");
		
		page = new CompraPage(driver);
	}

	@AfterClass
	public void cleanup() {
		driver.close();
		driver.quit();
	}

}
