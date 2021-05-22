package chapter1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App3 {
public static void main(String[] args) {
	WebDriver Driver=new ChromeDriver();
	Driver.manage().window().maximize();
	Driver.get("https://demo.actitime.com/login.do");
	Driver.findElement(By.xpath("//input[@name='username']")).sendKeys("trainee");
	Driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("trainee");
	Driver.findElement(By.xpath("//div[text()='Login ']")).click();
	System.out.println();
	if(Driver.getTitle().equals("actiTIME - Login")) {
		System.out.println("Test Script pass");
	}
	else {
		System.out.println("failed");
	}
	Driver.findElement(By.linkText("Logout")).click();
}	

}
