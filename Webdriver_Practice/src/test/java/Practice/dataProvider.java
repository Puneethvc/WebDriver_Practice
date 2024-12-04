package Practice;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {

	/*
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
	*/
	
	/*
	@Test(dataProvider="tripTicket")
	public void ticket(String src,String dest) {
		System.out.println("from--"+ src + "destionation"+ dest);
	}
	
	@DataProvider
	public Object[][] tripTicket(){
		Object obj [][] =new Object[3][2];
		obj[0][0]="kolar";
		obj[0][1]="Bangalore";
		
		obj[1][0]="Banglore";
		obj[1][1]="ooty";
		
		return obj;
	}
	
	*/
	
	public static WebDriver driver ;
	@BeforeSuite
	public void setUp() {
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	}
	
	@Test(dataProvider="login")
	public void DataproviderTest(String name,String pwd) {
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(name);
		driver.findElement(By.id("input-password")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		
		boolean status = driver.findElement(By.xpath("//h2[text()='My Account']")).isDisplayed();
		if(status==true) {
			driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
			Assert.assertTrue(true);
		}else {
			Assert.fail();
		}
	}	
	@DataProvider
	public Object[][] login(){
		Object obj[][]=new Object[2][2];
		obj[0][0]="puneethvcvivek@gmail.com";
		obj[0][1]="Puneeth@4441";
		
		
		
		return obj;
		
	}
	}


