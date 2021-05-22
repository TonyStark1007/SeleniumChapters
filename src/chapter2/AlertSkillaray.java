package chapter2;


	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javafx.scene.control.Alert;

	public class AlertSkillaray {

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoapp.skillrary.com/login.php");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			org.openqa.selenium.WebElement ele = driver.findElement(By.id("course"));
			
			Actions a = new Actions(driver);
			a.moveToElement(ele).perform();
			driver.findElement(By.xpath("//a[text()='Selenium Training']")).click();
			
			driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-flat']")).click();
			
			org.openqa.selenium.Alert aa = driver.switchTo().alert();
			aa.dismiss();
          driver.close();
		}

	}

