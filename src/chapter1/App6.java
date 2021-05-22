package chapter1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App6 {
public static void main(String[] args) {
	WebDriver d1=new ChromeDriver();
	d1.manage().window().maximize();
	d1.get("https://www.coursera.org/learn/machine-learning?authMode=login");
	d1.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	d1.findElement(By.linkText("Log In")).click();
	d1.findElement(By.xpath("//input[@id='email']")).sendKeys("deepakjabhade5@gmail.com");
	d1.findElement(By.xpath("//input[@id='password']")).sendKeys("Pass@123");
	d1.findElement(By.xpath("//button[text()='Login']")).click();
}
}
