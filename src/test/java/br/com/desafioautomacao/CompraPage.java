package br.com.desafioautomacao;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CompraPage {

	static WebDriver driver;

	public CompraPage(WebDriver driver) {
		this.driver = driver;
	}

	public void fazerLogin(String nome, String senha) throws Throwable {

		WebElement userName = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement btnLogin = driver.findElement(By.id("login-button"));

		userName.sendKeys(nome);
		password.sendKeys(senha);
		btnLogin.click();

		Assert.assertEquals(driver.findElement(By.className("title")).getText(), "PRODUCTS");
	}

	public void filtarProdutoPorZtoA() throws InterruptedException {

		WebElement elemento = driver.findElement(By.className("product_sort_container"));
		Select select = new Select(elemento);
		select.selectByValue("za");

	}

	public void adicionarProdutoAoCarrinho() throws InterruptedException {

		driver.findElement(By.id("item_3_title_link")).click(); // selecionando produto
		driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click(); // adicionando produto ao carrinho

		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='inventory_details_name large_size']")).getText(),
				"Test.allTheThings() T-Shirt (Red)");
	}

	public void adicionarProdutoDiferenteAoCarrinho() throws InterruptedException {

		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click(); // adicionando produto ao carrinho

	}

	public void realizarCheckout() throws InterruptedException {

		driver.findElement(By.className("shopping_cart_link")).click(); // clicando no carrinho
		Assert.assertEquals(driver.findElement(By.className("title")).getText(), "YOUR CART");

		driver.findElement(By.id("checkout")).click(); // clicando no botão checkout
		Assert.assertEquals(driver.findElement(By.className("title")).getText(), "CHECKOUT: YOUR INFORMATION");

	}

	public void preencherCampos() throws InterruptedException {

		// inserindo informações
		driver.findElement(By.id("first-name")).sendKeys("Antonio");
		driver.findElement(By.id("last-name")).sendKeys("Moreira");
		driver.findElement(By.id("postal-code")).sendKeys("65630020");
		driver.findElement(By.id("continue")).click();

	}
	
	public void validandoVendaComSucesso() throws InterruptedException {
		
		Assert.assertEquals(driver.findElement(By.className("title")).getText(), "CHECKOUT: OVERVIEW");
		driver.findElement(By.id("finish")).click(); // clicando no botão finish

		Assert.assertEquals(driver.findElement(By.className("title")).getText(), "CHECKOUT: COMPLETE!");
		Assert.assertEquals(driver.findElement(By.className("complete-header")).getText(), "THANK YOU FOR YOUR ORDER");

		driver.findElement(By.id("back-to-products")).click(); // voltando para a tela principal
		Assert.assertEquals(driver.findElement(By.className("title")).getText(), "PRODUCTS");
	}
	
	public void validandoVendaSemSucesso() throws InterruptedException {
		
		Assert.assertEquals(driver.findElement(By.cssSelector(".error-message-container h3")).getText(), "Error: Last Name is required");

	}
	
}
