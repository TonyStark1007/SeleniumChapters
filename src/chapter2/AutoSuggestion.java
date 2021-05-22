package chapter2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement element = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));//1st search and look for suggestion inspect 3 or 4th suggestion and look for list(li tag) 
	element.sendKeys("pythonselen");                                                 //to click of that suggestion make use of xpath group index
	Thread.sleep(3000);//very imp here to suggestions need to be loaded
	List<WebElement> autosuggestion = driver.findElements(By.xpath("//li[@class='sbct']"));//return type for find elements is list of webelement
	System.out.println(autosuggestion.size());//to count the no of suggestion
	for (WebElement web : autosuggestion) {
		System.out.println(web.getText());//to print suggestions
	}
	driver.close();
}
}