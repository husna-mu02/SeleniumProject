package testscript2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class AlertHandling extends Base {

	public void simpleAlert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement simple1 = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		simple1.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public void confirmationAlert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement confirmation1 = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		confirmation1.click();
		Alert alert = driver.switchTo().alert();
		//alert.accept();
		alert.dismiss();
	}
	
	public void promptAlert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement prompt1 = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		prompt1.click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Husna");
		alert.accept();
	}
	
	public static void main(String[] args) {
		AlertHandling alerthandling = new AlertHandling();
		alerthandling.browserInitialization();
		alerthandling.simpleAlert();
		//alerthandling.confirmationAlert();
		//alerthandling.promptAlert();
	}

}
