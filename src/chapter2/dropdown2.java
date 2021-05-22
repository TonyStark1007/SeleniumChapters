package chapter2;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class dropdown2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.name("addresstype"));

		Select s = new Select(ele);
		 java.util.List<WebElement> option = s.getOptions();
		System.out.println(option.size());
		for(WebElement allOptions:option) {
			System.out.println(allOptions.getText());
		}
		s.selectByValue("category.php?category=testing");
		//s.selectByIndex(0);
		System.out.println(s.isMultiple());
		WebElement ele1 = driver.findElement(By.xpath("(//a[text()='Selenium Training'])[2]"));
		ele1.click();
		if(s.isMultiple()) {
			s.deselectByValue("99");
			s.deselectByIndex(5);	
		}
		driver.close();
	}
}