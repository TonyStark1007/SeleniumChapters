package chapter2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownFb {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create New Account")).click();
		WebElement ele = driver.findElement(By.id("year"));
		Select s1=new Select(ele);
		s1.selectByValue("1997");
		WebElement ele1 = driver.findElement(By.id("month"));
		Select s2=new Select(ele1);
		List<WebElement> option = s2.getOptions();
		 ArrayList arr = new ArrayList<>();
		for (WebElement opt : option) {
			     String text = opt.getText();
			     arr.add(text);	    
		}
		System.out.println("Before sort");
		for (Object text1 : arr) {
			System.out.println(text1);
		}
		System.out.println("-----------After sort-----------------");
		Collections.sort(arr);
		for (Object text1 : arr) {
			System.out.println(text1);
		}
		

	}

}
