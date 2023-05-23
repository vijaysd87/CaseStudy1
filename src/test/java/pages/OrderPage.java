package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class OrderPage extends TestBase {

	//pageFatory
	
	@FindBy(xpath="//a[.='Cart']")
	WebElement cart;
	
	@FindBy(xpath="//button[.='Place Order']")
	WebElement chkout;
	
	@FindBy(id="name")
	WebElement pname;
	
	@FindBy(id="country")
	WebElement country;
	
	@FindBy(id="city")
	WebElement city;
	
	@FindBy(id="card")
	WebElement card;
	
	@FindBy(id="month")
	WebElement month;
	
	@FindBy(id="year")
	WebElement year;
	
	@FindBy(xpath="//button[.='Purchase']")
	WebElement buy;
	
	@FindBy(xpath="//button[.='OK']")
	WebElement ok;
	@FindBy(xpath="(//button[.='Close'])[3]")
	WebElement cls;
	
	
	//Actions
	//login
	//signup
	//searchItem
	
	public OrderPage()
	{
		PageFactory.initElements(driver, this);

	
	}
	
	public void checkout(String str1,String str2,String str3,String str4,String str5,String str6) throws InterruptedException
	{
		cart.click();
		chkout.click();
		pname.sendKeys(str1);
		country.sendKeys(str2);
		city.sendKeys(str3);
		card.sendKeys(str4);
		month.sendKeys(str5);
		year.sendKeys(str6);
		buy.click();
		Thread.sleep(2000);
		ok.click();
		Thread.sleep(2000);
		cls.click();
	}
}

