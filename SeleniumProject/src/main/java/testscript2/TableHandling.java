package testscript2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testscript.Base;

public class TableHandling extends Base{
	//to automate a full table
	void tablePrinting() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement tableprinting=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(tableprinting.getText());
	}
	
	//to automate  a row
	void rowPrinting() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement rowprinting=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]")); //tbody and tr from inpect
		System.out.println(rowprinting.getText());
	}
	
	//automate 3rd value data from the first row
	void cellPrinting() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php"); //td - table data
		WebElement cellprinting=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]//td[3]"));
		System.out.println(cellprinting.getText());
	}
	
	//automate only the first Name in the column  
	void columnPrinting() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		//tr - select all tr for column printing because all values are given as row details
		//list of elements are printing - findElements included in list
		List<WebElement> columnprinting = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
		for(WebElement list : columnprinting) {
			System.out.println(list.getText());
		}
	}
	//Checking whether Ashton Cox Name is present in the table or not
	void checkingName() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> checkprinting = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
		String name = "Ashton Cox";
		for (WebElement n1 : checkprinting) {
            if (n1.getText().equalsIgnoreCase(name)) {
                System.out.println(name + " is present in the table.");
            }
        }
	}

	public static void main(String[] args) {
		TableHandling tablehandling=new TableHandling();
		tablehandling.browserInitialization();
		//tablehandling.tablePrinting();
		//tablehandling.rowPrinting();
		//tablehandling.cellPrinting();
		//tablehandling.columnPrinting();
		tablehandling.checkingName();
		
		//tablehandling.browserQuitAndClose();
	}

}
