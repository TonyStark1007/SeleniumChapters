package chapter2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
public static void main(String[] args) throws InterruptedException {
	WebDriver Driver =new ChromeDriver();
	Driver.manage().window().maximize();
	Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	Driver.get("https://www.amazon.com/");
	WebElement ele = Driver.findElement(By.id("searchDropdownBox"));
	Select s=new Select(ele);
	List<WebElement> allopt = s.getOptions();//to get the options present in dropdown(getOptions())
	System.out.println(allopt.size());
	for (WebElement alloption : allopt) {
		System.out.println(alloption.getText());//to print the option
	}
	s.selectByValue("search-alias=automotive-intl-ship");  //to select the otions expand select tag and copy the value 
	Thread.sleep(3000);
	s.selectByIndex(5);
	Thread.sleep(3000);
	s.selectByVisibleText("Prime Video");
	Driver.close();
}
}