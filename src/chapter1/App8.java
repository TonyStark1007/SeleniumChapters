package chapter1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App8 {
public static void main(String[] args) throws InterruptedException {
	WebDriver Drive=new ChromeDriver();
	Drive.get("https://juiceshop.com/");
	Drive.manage().window().maximize();
	Drive.findElement(By.xpath("//span[text()='Login']")).click();
	Drive.findElement(By.xpath("//input[@id='customer_email']")).sendKeys("deepakjabhade5@gmail.com");
	Drive.findElement(By.xpath("//input[@id='customer_password']")).sendKeys("Pass@123");
	Drive.findElement(By.xpath("//input[@value='Login']")).click();
	System.out.println(Drive.getTitle());
//	Thread.sleep(5000);
	if(Drive.getTitle().equals("Account - JuiceShopSF")) {
		System.out.println("login successfully");
	}
	else {
		System.out.println("login fail");
	}
	Drive.findElement(By.xpath("//a[text()='Logout']")).click();
	if(Drive.getTitle().equals("Juice Shop | 100% RAW Organic Cold-Pressed Juices Cleanses & Elixirs")) {
		System.out.println("logout successfully");
	}
	else {
		System.out.println("logout failed");
	}
Drive.close();
}
}
