package chapter2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
     JavascriptExecutor js=(JavascriptExecutor) driver;
     js.executeScript("window.scrollBy(0, 5000)");//for upward
     
     js.executeScript("window.scrollBy(0, -5000)");//for downward  
     
     /*for horizontal scroll bar change x=5000 or some value*/
	}
	
	

}
