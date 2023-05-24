package testScripts;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import pages.AddCart;
import pages.FinalCartCheckout;
import pages.Homepage;
import pages.OrderPage;

public class PlaceOrder extends TestBase{
	
	Homepage homepage;
	AddCart addcart;
	OrderPage orderpage;
	
	
	@BeforeMethod
	public void setup()
	{
		initialize();
	}
	
	@Test
	public void selectItem() throws InterruptedException
	{
		homepage=new Homepage();
		homepage.selectItem1();
		addcart =new AddCart();
		addcart.addCart();
		homepage.homebtn();
		homepage.selectItem2();
		addcart.addCart();
		homepage.homebtn();
		homepage.selectItem3();
		addcart.addCart();
		//homepage.homebtn();
		
		orderpage=new OrderPage();
		orderpage.checkout("vijay", "India", "Bengaluru", "55656", "May", "2023");
		
		
	}

}
