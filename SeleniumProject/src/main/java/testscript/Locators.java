package testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
	//General Locators:- id, classname, name, linktext, partial linktext
	//WebElement elementname = driver.findElement(By.Locator("locator value"));check locator value unique or not
	
	void id() {
		
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");	
		
		WebElement messagefield=driver.findElement(By.id("single-input-field"));
		//messagefield.sendKeys("Husna");
		
		WebElement showmessage=driver.findElement(By.id("button-one"));
		//showmessage.click();
		
		WebElement valuea=driver.findElement(By.id("value-a"));
		//valuea.sendKeys("10");
		
		WebElement valueb=driver.findElement(By.id("value-b"));
		//valueb.sendKeys("22");
		
		WebElement total=driver.findElement(By.id("button-two"));
		//total.click();
	}
	//one of one class not found. Just example to understand

	void className() {
		WebElement class1=driver.findElement(By.className("clearfix"));
		WebElement class2=driver.findElement(By.className("container page"));
		WebElement class3=driver.findElement(By.className("copyright"));
		WebElement class4=driver.findElement(By.className("header-top"));
	}
	void name() {
		WebElement name1=driver.findElement(By.name("author"));
		WebElement name2=driver.findElement(By.name("description"));
		WebElement name3=driver.findElement(By.name("keywords"));
		WebElement name4=driver.findElement(By.name("viewport"));	
	}
	//used for small links
	void linkText() {
		WebElement text1=driver.findElement(By.linkText("Ajax Form Submit"));
		WebElement text2=driver.findElement(By.linkText("Form Submit"));
		WebElement text3=driver.findElement(By.linkText("Checkbox Demo"));
		WebElement text4=driver.findElement(By.linkText("Simple Form Demo"));
	}
	//Used for long linktexts to give shortform
	void partialLinkText() {
		WebElement partial1=driver.findElement(By.partialLinkText("Ajax F"));
		WebElement partial2=driver.findElement(By.partialLinkText("Simple F"));
		WebElement partial3=driver.findElement(By.partialLinkText("Checkbox D"));
		WebElement partial4=driver.findElement(By.partialLinkText("Select I"));	
	}
	
	void tagName() {
		List<WebElement> tag1=driver.findElements(By.tagName("a"));
		System.out.println(tag1.size());
	}
	public static void main(String[] args) {

		Locators locator=new Locators();
		locator.browserInitialization();
		locator.id();
		locator.className();
		locator.name();
		locator.linkText();
		locator.partialLinkText();
		locator.tagName();

	}

}
