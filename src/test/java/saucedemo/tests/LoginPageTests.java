package saucedemo.tests;

import org.testng.annotations.Test;

import base.BaseClass;
import saucedemo.pages.CartPage;
import saucedemo.pages.CheckOutPage;
import saucedemo.pages.HomePage;
import saucedemo.pages.LoginPage;
import utilities.ReadDataForLogin;

public class LoginPageTests extends BaseClass{
	LoginPage loginpage;
	HomePage homepage;
	CartPage cartpage;
	CheckOutPage checkoutpage;
	
  @Test(priority = 1,dataProviderClass =ReadDataForLogin.class,dataProvider ="login")
  public void login(String uname,String pwd,String fname,String lname,String zcode) throws Exception {
	  loginpage=new LoginPage(driver);
	  homepage=new HomePage(driver);
	  cartpage=new CartPage(driver);
	  checkoutpage=new CheckOutPage(driver);
	  
	  loginpage.login(uname, pwd);
	  homepage.hoverOnFirstProduct();
	  homepage.oneProductToCart();
	  homepage.hoverOnSecondProduct();
	  homepage.secondProductToCart();
	  homepage.clickCartButton();
	  cartpage.verifyFirstProductIsDisplayed();
	  cartpage.verifySecondProductIsDispalyed();
	  cartpage.clickCheckOutButton();
	  checkoutpage.enterInformation(fname,lname,zcode);
	  checkoutpage.clickContinueButton();
	  checkoutpage.clickFinishButton();
	   }
}
