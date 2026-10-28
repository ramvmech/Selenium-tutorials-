package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\java files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/checkbox.xhtml");
        WebElement Basic = driver.findElement(By.id("j_idt87:j_idt89"));
        Basic.click();
        boolean status1 = Basic.isSelected();
        System.out.println(status1);
        
        
        
        
	}

}
