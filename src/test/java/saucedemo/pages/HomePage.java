package saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class HomePage extends BaseClass {

	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-backpack\"]")WebElement first_product_to_cart;
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")WebElement second_product_to_cart;
	@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")WebElement cart_button;
	
	public HomePage(WebDriver d) {
		driver=d;
		PageFactory.initElements(driver, this);
	}
public void oneProductToCart() {
	first_product_to_cart.click();
}
public void secondProductToCart() {
	second_product_to_cart.click();
}
public void clickCartButton() {
	cart_button.click();
}
public void hoverOnFirstProduct() {
	Actions a=new Actions(driver);
	a.moveToElement(first_product_to_cart).build().perform();
}
public void hoverOnSecondProduct() {
	Actions a=new Actions(driver);
	a.moveToElement(second_product_to_cart).build().perform();
}

}
