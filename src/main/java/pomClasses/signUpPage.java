package pomClasses;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class signUpPage {

	@FindBy(xpath="//select[@id='day']") private WebElement day;
	@FindBy(xpath="//select[@id='month']") private WebElement month;
	public signUpPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void useSelectClass(WebDriver driver) throws InterruptedException {
		
		Select s= new Select(day);
		

	Actions a= new Actions(driver);
		
		a.moveToElement(day);
		
		a.scrollToElement(day).perform();
		
	//	Point p= new Point (500,200);
		
		Point p= new Point(100,200);
		driver.manage().window().setPosition(p);
		
		
	
		Dimension d= new Dimension(200,300);
		driver.manage().window().setSize(d);
		
//		id, name,classname, tagname, linktext, partialLinktext,css slector & xpath
//		
//		xpath :- 1) Absolute xpath & Relative xpath
//
//relative xpath :- xpath by attribute
//xpath by contains 
//xpath by text()


		
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

		
		
		
		
		
}	
	
}















	
