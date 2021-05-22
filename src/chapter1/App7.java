package chapter1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App7 {
	public static void main(String[] args) {
		WebDriver Drive=new ChromeDriver();
		Drive.get("https://demo.opencart.com/index.php?route=account/login");
	
		Drive.findElement(By.xpath("//input[@id='input-email']")).sendKeys("deepakjabhade5@gmail.com");
		Drive.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Pass@123");
		Drive.findElement(By.xpath("//input[@type='submit']")).click();
		if(Drive.getTitle().equals("My Account")){
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
	}
		Drive.findElement(By.linkText("Logout")).click();
		
		Drive.close();	
	}
	

}
