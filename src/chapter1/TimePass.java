package chapter1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimePass {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver Drive=new ChromeDriver();
		Drive.manage().window().maximize();
		Drive.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Drive.navigate().to("https://www.instagram.com/");
		
		Drive.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Drive.findElement(By.name("username")).sendKeys("deepakjabhade5");
			Drive.findElement(By.name("password")).sendKeys("Pass@123");
			 WebElement log = Drive.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     ']"));
			if(log.isEnabled()) {
				log.click();
			}
			//Thread.sleep(3000);
			 WebElement search = Drive.findElement(By.xpath("//div[@class='eyXLr wUAXj ']"));
		System.out.println(search.isEnabled());
	     search.click();
	      List<WebElement> ele = Drive.findElements(By.xpath("(//div[@role='none'])[2]"));
	     
	}	

}
