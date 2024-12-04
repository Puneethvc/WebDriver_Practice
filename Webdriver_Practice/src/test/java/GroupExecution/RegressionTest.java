
package GroupExecution;

import org.testng.annotations.Test;

public class RegressionTest {
	
	@Test(priority=1,groups= {"regression"})
	public void LogInMethod() {
		System.out.println("log in method successful.....");
	}
	
	@Test(dependsOnMethods= "LogInMethod",groups= {"regression"})
	public void HomePageMethod() {
		System.out.println("homepage display succesfull *****");
	}
	
	@Test(groups= {"regression", "sanity","functional"})
	public void PaymentPage() {
		System.out.println("Payment successfull in regression");
	}

}
