package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class Homepage extends TestBase {
	
	@FindBy(xpath="//a[.='Samsung galaxy s7']")
	WebElement ele1;
	
	@FindBy(xpath="//a[.='Sony xperia z5']")
	WebElement ele2;
	
	@FindBy(xpath="//a[.='Iphone 6 32gb']")
	WebElement ele3;
	
	@FindBy(xpath="//a[.='Sony vaio i5']")
	WebElement ele4;
	
	@FindBy(xpath="//a[@href='index.html' and @class='nav-link']")
	WebElement hbtn;
	
	public Homepage()
	{
		PageFactory.initElements(driver, this);

	
	}

	public void  selectItem1()
	{
		ele1.click();
		
	}
	
	public void  selectItem2()
	{
		ele2.click();
		
	}

	public void  selectItem3()
	{
		ele3.click();
	
	}
	
	public void  selectItem4()
	{
		ele4.click();
		
	}
	public void homebtn()
	{
		hbtn.click();
	}
}
