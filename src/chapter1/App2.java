package chapter1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App2 {
	public static void main(String[] args) {
	WebDriver Drive=new ChromeDriver();
	Drive.manage().window().maximize();
	Drive.get("https://demo.vtiger.com/vtigercrm/index.php");
	Drive.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Drive.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
	Drive.findElement(By.xpath("//input[@id='password']")).sendKeys("admin");
	Drive.findElement(By.xpath("//button[text()='Sign in']")).click();
	System.out.println(Drive.getTitle());
	if(Drive.getTitle().equals("Dashboard")) {
		System.out.println("Login Successfully");
	}
	else {
		System.out.println("login failed");
	}
	
	Drive.findElement(By.xpath("//span[@class='fa fa-user']")).click();
	Drive.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
	if(Drive.getTitle().equals("vtiger")) {
		System.out.println("logout successfully");
	}
	else {
		System.out.println("logout failed");
	}
	

}

}
