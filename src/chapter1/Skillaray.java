package chapter1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Skillaray {
public static void main(String[] args) throws InterruptedException {
	WebDriver Drive=new ChromeDriver();
	Drive.manage().window().maximize();
	Drive.get("https://demoapp.skillrary.com/");
	Drive.findElement(By.linkText("LOGIN")).click();
	Thread.sleep(3000);
	//Drive.findElement(By.partialLinkText("?")).click();//here there no need of give full text we can give partial text also insted of "Forgot your password?"we can use Forgot,your,? or password 
	//Drive.findElement(By.linkText("Forgot your password?")).click();//in linkText we need give full text AS"Forgot your password?"

	Drive.findElement(By.name("email")).sendKeys("user");
	Drive.findElement(By.name("password")).sendKeys("user");
	Drive.findElement(By.name("login")).click();
	System.out.println(Drive.getCurrentUrl());
	String title = Drive.getTitle();
	/*very imp always do validation*/if(title.equals("SkillRary Courses")) {
		System.out.println("test Script pass");
	}
	else
		System.out.println("failed");
	Drive.close();
	
}
}
