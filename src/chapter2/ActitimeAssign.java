package chapter2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeAssign {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();	
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.get("https://demo.actitime.com/login.do");
    driver.findElement(By.name("username")).sendKeys("admin");
    driver.findElement(By.name("pwd")).sendKeys("manager");
    driver.findElement(By.xpath("//div[text()='Login ']")).click();
    driver.findElement(By.xpath("//a[@class='content users']")).click();
    driver.findElement(By.xpath("//div[text()='New User']")).click();
   WebElement ele = driver.findElement(By.xpath("(//input[@name='firstName'])[2]"));
   Thread.sleep(5000);  
    ele.sendKeys("deepak");
    driver.findElement(By.xpath("(//div[text()='Cancel'])[7]")).click();
    driver.switchTo().alert().accept();
    driver.close();
	}

}
