package ITestListener;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Practice.FaceBookTest;

public class MyITestListener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(" ****Test is start **** Test Name ---"+ result.getName());
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(" ****Test is success **** Test Name ---"+ result.getName());
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(" ****Test is skipped **** Test Name ---"+ result.getName());
		
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(" ****Test is failed **** Test Name ---"+ result.getName());
	
		LocalDateTime timenow = LocalDateTime.now();
		 DateTimeFormatter dateFormetter = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
		 
		 String dynamicScreenShot = result.getName()+dateFormetter.format(timenow);
	
		File src =  ((TakesScreenshot)FaceBookTest.driver).getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\ScreenShots\\"+ dynamicScreenShot+".png");
	
		try {
			
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
