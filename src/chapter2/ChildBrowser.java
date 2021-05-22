package chapter2;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {
      
	//prg for close specific browser
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		String parent = driver.getWindowHandle();//it will fetch the address of parent browser
		Set<String> child = driver.getWindowHandles();//it will fetch the address of parent as well as child
		System.out.println(child);
		child.remove(parent); // here we are removing the address of parent browser from set(collection) because of it parent browser will remain open to to close all child browser
		for (String str : child) {
			driver.switchTo().window(str); // switch to  other window(child browser) pass the address of browser
			System.out.println(driver.getTitle());
			if(driver.getTitle().equals("Cognizant"))//to remove specific child browser
			driver.close();
		}
	
    //driver.quit(); using this method we can close all the browser 
		//driver.close(); it will close only 1st browser or parent browser it will not closes child browser   
	

	}}
