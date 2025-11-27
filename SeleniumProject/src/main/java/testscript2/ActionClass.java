package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import testscript.Base;

public class ActionClass extends Base {
	
	public void dragAndDrop() {
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement drag1 = driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement drop2 = driver.findElement(By.xpath("//div[@id='mydropzone']"));
		Actions action = new Actions(driver);
		action.dragAndDrop(drag1, drop2).perform();
	}
	
	public void rightClick() {
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement click1 = driver.findElement(By.xpath("//span[text()='Draggable n°2']"));
		Actions action = new Actions(driver);
		action.contextClick(click1).perform();
	}
	
	public void mouseOver() {
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement mouseover1 = driver.findElement(By.xpath("//span[text()='Draggable n°3']"));
		Actions action = new Actions(driver);
		action.moveToElement(mouseover1).perform();
	}
	
	public void doubleClick() {
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement doubleclick = driver.findElement(By.xpath("//span[text()='Draggable n°4']"));
		Actions action = new Actions(driver);
		action.doubleClick(doubleclick).perform();
	}
	
	public void click() {
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement click1 = driver.findElement(By.xpath("//span[text()='Draggable n°2']"));
		Actions action = new Actions(driver);
		action.click(click1).perform();
	}
	public static void main(String[] args) {
		ActionClass actionclass = new ActionClass();
		actionclass.browserInitialization();
		//actionclass.dragAndDrop();
		//actionclass.rightClick();
		//actionclass.mouseOver();
		//actionclass.doubleClick();
		actionclass.click();
	}

}
