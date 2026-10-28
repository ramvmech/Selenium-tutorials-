package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\java files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/radio.xhtml");
        WebElement below20 = driver.findElement(By.xpath("//*[@id=\"j_idt87:age\"]/div/div[1]/div/div[2]"));
        WebElement bet21to40 = driver.findElement(By.xpath("//*[@id=\"j_idt87:age\"]/div/div[2]/div/div[2]"));
        WebElement bet41to60 = driver.findElement(By.xpath("//*[@id=\"j_idt87:age\"]/div/div[3]/div/div[2]"));
        below20.click();
        boolean status1 = below20.isSelected();
        boolean status2 = bet21to40.isSelected();
        boolean status3 = bet41to60.isSelected();
        
        System.out.println(status1);
        System.out.println(status2);
        System.out.println(status3);
        


	}

}
