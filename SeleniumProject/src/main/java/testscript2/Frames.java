package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class Frames extends Base {
	public void frames() {
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		driver.switchTo().frame(frame2);
		WebElement frame1 = driver.findElement(By.xpath("//img[@src = 'Jmeter720.png']"));
		frame1.click();
	}
	
	public static void main(String[] args) {
		Frames frame = new Frames();
		frame.browserInitialization();
		frame.frames();

	}

}
