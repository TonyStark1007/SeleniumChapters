package chapter2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselect {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://demoapp.skillrary.com/\\");
	WebElement ele = driver.findElement(By.id("cars"));
	Select s=new Select(ele);
	List<WebElement> allopt = s.getOptions();//to get the options present in dropdown(getOptions())
	System.out.println(allopt.size());
	for (WebElement alloption : allopt) {
		System.out.println(alloption.getText());//to print the option
	}
	s.selectByValue("99");  //to select the otions expand select tag and copy the value 
	s.selectByIndex(3);
	//Thread.sleep(3000);
	System.out.println(s.isMultiple());//to check whether dropdown is multiselect or single select because we cannot deselect for single select dropdown
	if(s.isMultiple()) {
		s.deselectByValue("99");
		//Thread.sleep(3000);
		s.deselectByIndex(3);
	}
	driver.close();
}
}
