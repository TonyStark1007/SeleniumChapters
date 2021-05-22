package chapter1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App4 {
public static void main(String[] args) throws InterruptedException {
	WebDriver Drive=new ChromeDriver();
	Drive.get("https://www.myigetit.com/");
	
	Drive.manage().window().maximize();
	Drive.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	Drive.findElement(By.xpath("//a[text()='Log In']")).click();
	Drive.findElement(By.xpath("//input[@id='txtuname']")).sendKeys("deepakjabhade5@gmail.com");
	Drive.findElement(By.xpath("//input[@id='txtpword']")).sendKeys("TonyStark@123");
	Drive.findElement(By.xpath("//input[@id='imgSubmit']")).click();
	Thread.sleep(5000);//to get that particular page title we need to wait until its load
	System.out.println(Drive.getTitle());
	if(Drive.getTitle().equals("Manage Subscriptions - i GET IT")) {
		System.out.println("pass");
	}
	else {
		System.out.println("fail");
	}
	Drive.findElement(By.xpath("(//a[text()='Logout'])[3]")).click();
Drive.close();
}
}
