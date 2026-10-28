package selenium;
import java.awt.Toolkit;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadExample {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\java files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.file.io/");
        WebElement Uploadclick = driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div[3]/div/div[3]/div/div[2]/div[1]/div/div/div[2]/div/label"));
        WebElement AgreePrivacy = driver.findElement(By.id("accept-btn"));
        AgreePrivacy.click();
        Uploadclick.click();
        
        String file = "C:\\Users\\ramvm\\Downloads\\pngwing.com.png";
        StringSelection selection = new StringSelection(file);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        
        
	}

}
