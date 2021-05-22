package chapter2;


import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown1  {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		WebElement ele = driver.findElement(By.name("birthday_year"));
		Select s = new Select(ele);
		s.selectByValue("1998");
		WebElement ele1 = driver.findElement(By.id("month"));
		Select s1=new Select(ele1);
		List<WebElement> option = s1.getOptions();  //give the refrence of s1 here 
		
		ArrayList a=new ArrayList<>();
		
		for(WebElement allOptions:option) {
			String text = allOptions.getText();
			System.out.println(text);
			a.add(text);
		}
		System.out.println("------------AFTER SORTING------------");
		Collections.sort(a);
		
		for(Object sortedOption:a) {
			System.out.println(sortedOption);
		}
		driver.close();
	}
}