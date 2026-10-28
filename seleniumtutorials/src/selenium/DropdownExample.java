package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class DropdownExample {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\java files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/select.xhtml");
        WebElement dropdown1 = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/select"));
        Select select = new Select(dropdown1);
        select.selectByVisibleText("Playwright");
        select.selectByIndex(4);
        List<WebElement>  listOfOptions = select.getOptions();
        int size = listOfOptions.size();
        System.out.println("No of Elements :"+ size);
        for (WebElement option : listOfOptions) {
            System.out.println(option.getText());

        }
        dropdown1.sendKeys("Selenium");
	}

}
