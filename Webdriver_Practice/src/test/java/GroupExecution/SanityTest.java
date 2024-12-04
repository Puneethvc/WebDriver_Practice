package GroupExecution;

import org.junit.Assert;
import org.testng.annotations.Test;

public class SanityTest {
	
	@Test(groups= {"sanity"})
	public void CartPage() {
		System.out.println(" cart page log in successful");
		Assert.assertTrue(true);
	}
	
	@Test(dependsOnMethods= {"CartPage"},groups= {"sanity"})
	public void WishList() {
		System.out.println("WishList display succesfull *****");
		Assert.assertTrue(true);
	}
	
	@Test(groups= {"sanity","regression"})
	public void OrderPage() {
		System.out.println("Order Iteam successfull!!!!!!");
	}
	
	@Test(groups= {"regression","sanity","functional"})
	public void PaymentPage() {
		System.out.println("Payment successfull in sanity");
	}

}
