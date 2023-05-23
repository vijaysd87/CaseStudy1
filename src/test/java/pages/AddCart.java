package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.TestBase;

public class AddCart extends TestBase  {
	
	@FindBy(xpath="//a[.='Add to cart']")
	WebElement cart;
	

	
	public AddCart()
	{
		PageFactory.initElements(driver, this);

	
	}

	public void  addCart() throws InterruptedException
	{
		cart.click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		
		driver.navigate().back();
	}
	

}
