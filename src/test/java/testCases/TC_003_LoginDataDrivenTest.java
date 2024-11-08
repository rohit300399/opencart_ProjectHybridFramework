package testCases;

import org.testng.Assert;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;


/*Data is valid  - login success - test pass  - logout
Data is valid -- login failed - test fail

Data is invalid - login success - test fail  - logout
Data is invalid -- login failed - test pass
*/

public class TC_003_LoginDataDrivenTest extends BaseClass {
	
	@Test(dataProvider="LoginData" , dataProviderClass=DataProviders.class)
	public void test_loginDDT(String email , String pwd , String exp)
 {
	logger.info(" ... Staring TC_003_DataDrivenLoginTest ...");
	
	try
	{
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(email);  
		
		lp.setPassword(pwd);
		
		lp.clickLogin();
		
		MyAccountPage myacc = new MyAccountPage(driver);
		boolean targetpage= myacc.isMyAccountPageExist();
		
		if(exp.equalsIgnoreCase("Valid"))
		{
			if(targetpage==true)
			{
				myacc.clickLogout();
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		
		if(exp.equalsIgnoreCase("Invalid"))
		{
			if(targetpage==true)
			{
				myacc.clickLogout();
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(true);
			}
		}
	}
	catch(Exception e)
	{
		Assert.fail("An exception occurred: " + e.getMessage());
	}
		
	logger.info(" ... Finished TC_003_LoginDDT ...");
	
 }
	
	   
	    
	    

}
