package selenium;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\java files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/window.xhtml");
        String oldWindow = driver.getWindowHandle();// parent Window 
        
        WebElement clicktonewtab = driver.findElement(By.id("j_idt88:new"));
        clicktonewtab.click();
        Set<String> handles = driver.getWindowHandles();
        for (String newWindows : handles) {
        	
        	if (!newWindows.equals(oldWindow)) {

                driver.switchTo().window(newWindows);
        	
                WebElement newWindow = driver.findElement(By.id("email"));
                newWindow.sendKeys("test@gmnail.com");
                
                break;
        	}
        
        }
        driver.switchTo().window(oldWindow);

    	driver.quit();

	}
	
}
