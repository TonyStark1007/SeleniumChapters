package chapter1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App5 {
public static void main(String[] args) throws InterruptedException {
	WebDriver d1=new ChromeDriver();
	d1.get("https://www.quora.com/");
	d1.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	d1.findElement(By.xpath("//input[@id='email']")).sendKeys("deepakjabhade5@gmail.com");
	d1.findElement(By.xpath("//input[@id='password']")).sendKeys("TonyStark@123");
	d1.findElement(By.xpath("(//div[text()='Login'])[2]")).click();
	Thread.sleep(5000);
	if(d1.getTitle().equals("Quora")) {
		System.out.println("Login pass");
	}
	else {
		System.out.println("Login fail");
	}
	d1.findElement(By.xpath("(//div[contains(@class,'q-box qu-borderRadius--circle ')])[1]")).click();
	Thread.sleep(5000);
d1.findElement(By.xpath("//div[text()='Logout']")).click();
Thread.sleep(5000);
if(d1.getTitle().equals("Quora - A place to share knowledge and better understand the world")) {
	System.out.println("logout pass");
}
else {
	System.out.println("logout failed");
}
d1.close();
}
}
