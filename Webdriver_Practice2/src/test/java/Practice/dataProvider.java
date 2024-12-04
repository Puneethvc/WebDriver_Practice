package Practice;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {

	@Test(dataProvider = "bookingticket",priority = 1)
	public void travellingTest(String src, String dest) {
		System.out.println("Booked from " + src + " to "+ dest);
		
	}
	
	@DataProvider
	public Object[][] bookingticket(){
		
		Object [][] obj = new Object[3][2];
		
		obj[0][0]="Bangalore";
		obj[0][1]="chennai";
		
		obj[1][0]="kolar";
		obj[1][1]="vadagur";
		
		obj[2][0]="mysore";
		obj[2][1]="kolar";
		
		return obj;
		
		
	}
	
//	@Test(invocationCount = 4)
//	public void puni() {
//		System.out.println("invocationCount is running ");
//	}
	
	@Test
	public void test1() {
		int a=3,b=3;
		int c = a-b;
		Assert.assertEquals(a, b);
	}
	
	@Test(dependsOnMethods = "test1")
	public void test2dependstest1() {
		System.out.println("dependsOnMethod Method is failing ----");
	}
	
	@Test(enabled = false)
	public void test()
	{
		System.out.println("Test method is testing");
	}
	
	
	}

