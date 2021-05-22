package chapter2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.name("addresstype"));
		Select s = new Select(ele);
		s.selectByValue("category.php?category=testing");
		WebElement src = driver.findElement(By.xpath("(//a[text()='Selenium Training'])[2]"));
		WebElement dest = driver.findElement(By.id("cartArea"));
		Actions act=new Actions(driver);
		act.dragAndDrop(src, dest).perform();
		//this program is right it performing drag and drop action but there is problem in web app 

	}

}
