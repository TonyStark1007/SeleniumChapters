package chapter2;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {
	//steps to take screenshot
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//step1::typecasting
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		//step2::use method of takescreenshot
		
     File src = ts.getScreenshotAs(OutputType.FILE);
     //step3::give the file destination and name with png or jpeg extension 
     
      File dest=new File("./photo/amazon.png");//  "."means in currant directory
      
      //step4::copy the file and paste it in destination
      FileUtils.copyFile(src, dest); //fileUtils is from apache.commons.io.FileUtils
      driver.close();
	}
   //to view the photo 1st refresh the project because after execution it will not present in photo folder
}
