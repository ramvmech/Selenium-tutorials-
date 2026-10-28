package selenium;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\java files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/input.xhtml");
        WebElement Emailbox = driver.findElement(By.id("j_idt88:j_idt99"));
        Emailbox.sendKeys("test@gmail.com");
        WebElement Appendbox = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div/div[1]/div/form/div[2]/div/input"));
        Appendbox.sendKeys("Text");
        WebElement getTextBox = driver.findElement(By.name("j_idt88:j_idt97"));
        String value= getTextBox.getAttribute("value");
        System.out.println(value);
        WebElement ClearBox = driver.findElement(By.name("j_idt88:j_idt95"));
        ClearBox.clear();
        WebElement disabledBox = driver.findElement(By.name("j_idt88:j_idt93"));
        boolean enabled = disabledBox.isEnabled();
        System.out.println(enabled);
        

        
	}

}
