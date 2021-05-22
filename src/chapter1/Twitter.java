package chapter1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Twitter {

	public static void main(String[] args) throws InterruptedException {
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://twitter.com/");	
		Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Driver.findElement(By.xpath("//span[text()='Log in']")).click();
		Thread.sleep(5000);
		WebElement dis = Driver.findElement(By.name("session[username_or_email]"));
		if(dis.isDisplayed()) {
			System.out.println("Pass");
			dis.sendKeys("admin");
		}else {
			System.out.println("Fail");
		}
		WebElement lg = Driver.findElement(By.xpath("(//div[@dir='auto'])[5]"));
		if(lg.isEnabled()) {
			System.out.println("Enabled");
		}else {
			System.out.println("Disable");
		}

		Driver.close();
	}
}




