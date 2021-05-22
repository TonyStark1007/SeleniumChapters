package chapter2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class skil {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.findElement(By.name("q")).sendKeys("Selenium");
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("( //a[@title='Core Java For Selenium Training'])")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@class='play-icon']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='pause-icon']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		driver.close();

	}



	}

