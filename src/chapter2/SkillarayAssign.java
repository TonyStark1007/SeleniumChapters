package chapter2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SkillarayAssign {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		WebElement ele1 = driver.findElement(By.xpath("//a[text()=' Core Java For Selenium Trainin']"));
		//WebElement ele = driver.findElement(By.xpath("(//img[@class='thumb lazy'])[6]"));
		ele1.click();
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='play rounded-box state-paused']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='play rounded-box state-paused']")).click();
		//mouse.click();
		//js.executeScript("arguments[0].click()",mouse);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()=' TAKE THIS COURSE ']")).click();
		driver.close();
	}

}
