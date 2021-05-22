package chapter1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App1{
public static void main(String[] args) throws InterruptedException {
	WebDriver Drive=new ChromeDriver();
	Drive.manage().window().maximize();
	Drive.get("https://demoapp.skillrary.com/");
	Drive.findElement(By.linkText("LOGIN")).click();
	Drive.findElement(By.name("email")).sendKeys("user");
	Drive.findElement(By.name("password")).sendKeys("user");
	Drive.findElement(By.xpath("//button[text()='Login']")).click();
	System.out.println(Drive.getCurrentUrl());
	String title = Drive.getTitle();
	if(title.equals("SkillRary Courses")) {
		System.out.println("test Script pass");
	}
	else
		System.out.println("failed");
	Drive.close();
	
}
}

