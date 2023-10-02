package utilities;

import org.testng.annotations.DataProvider;

public class ReadDataForLogin {

	@DataProvider(name="login")
	public Object[][]logintest1(){
		return new Object[][] {{"standard_user","secret_sauce","arun","sagar","234567"}};
		
	}
}
