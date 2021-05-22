package chapter2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PopupAlert {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
       WebElement ele = driver.findElement(By.id("course"));
   	Actions act=new Actions(driver);
	
	act.moveToElement(ele).perform();
	driver.findElement(By.xpath("//a[text()='Selenium Training']")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-flat']")).click();
	Alert a = driver.switchTo().alert();
	System.out.println(a.getText());
	a.dismiss();
	driver.close();
	}

}
