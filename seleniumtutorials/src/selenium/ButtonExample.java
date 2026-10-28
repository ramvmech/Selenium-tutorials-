package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\java files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/button.xhtml");
        WebElement getPositionButton = driver.findElement(By.id("j_idt88:j_idt94"));
        Point xypoint = getPositionButton.getLocation();
        int xValue = xypoint.getX();
        int yValue = xypoint.getY();
        System.out.println("X value is :"+xValue+"Y value is :"+ yValue );
        WebElement getColourButton = driver.findElement(By.id("j_idt88:j_idt102:imageBtn"));
        String value = getColourButton.getCssValue("background");
        System.out.println(value);
        WebElement sizeButton = driver.findElement(By.id("j_idt88:j_idt98"));
        int Height = sizeButton.getSize().getHeight();
        int Width = sizeButton.getSize().getWidth();
        System.out.println("The Height of the Button is: " + Height+ "The Width of the Button is :"+ Width);
        WebElement clickbutton = driver.findElement(By.id("j_idt88:j_idt90"));
        clickbutton.click();
//        WebElement changecolorButton = driver.findElement(By.id("j_idt88:j_idt100"));
//        String beforeColor = changecolorButton.getCssValue("background-color");
//        System.out.println("Beforehover Color : "+ beforeColor);
        // Mouse Hover 
        
        
	}

}
