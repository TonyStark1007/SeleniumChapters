package chapter1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args){
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demoapp.skillrary.com/login.php?type=login");
		d.findElement(By.id("email")).sendKeys("user");
		
		d.findElement(By.name("password")).sendKeys("user");
		d.findElement(By.id("toPasswordRecoveryPageLink")).click();
		d.findElement(By.name("login")).click();
		
		String title = d.getTitle();
	
		System.out.println(title);
		String url = d.getCurrentUrl();
	
		System.out.println(url);
		
		d.close();


	}
}

