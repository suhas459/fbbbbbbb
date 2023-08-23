package testClass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass.baseClass;
import pomClasses.signUpPage;

public class NewTest extends baseClass{
  
	signUpPage s;
	@BeforeMethod
	public void stepsToLaunch() {
		launchTheBrowser();
		
		 s= new signUpPage(driver);
		
	}
	
	
	@Test
  public void f() throws InterruptedException {
		s.useSelectClass(driver);
		
		
		
		
		
		
		
		
		
		
	Thread.sleep(7500);	
	driver.close();
		
  }
}
