package testscript2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class MultipleWindowHandling extends Base {
	
	public void multipleWindowHandling() {
		driver.navigate().to("https://webdriveruniversity.com/");
		WebElement contactUs = driver.findElement(By.xpath("//h1[text() = 'CONTACT US']"));
		contactUs.click();
		WebElement loginPortal = driver.findElement(By.xpath("//h1[text() = 'LOGIN PORTAL']"));
		loginPortal.click();
		String handle = driver.getWindowHandle();
		System.out.println(handle);
		System.out.println("*****************************************************************************************");
		Set<String> handles = driver.getWindowHandles();
		for(String temp : handles) {
			System.out.println("Window handling "+temp);
			driver.switchTo().window(temp);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println("***********************************************************************************");
		}
		
		
	}
	
	public static void main(String[] args) {
		MultipleWindowHandling multiplewindowhandling = new MultipleWindowHandling();
		multiplewindowhandling.browserInitialization();
		multiplewindowhandling.multipleWindowHandling();

	}

}
