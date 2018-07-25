import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Miscellaneous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/brendangreene/workspace/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("http://www.qaclickacademy.com/practice.php");
		int number=getFrame(driver, By.xpath("//input[@name='email']"));
		driver.switchTo().frame(number);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("xysss");

		driver.close();
	}
	
	public static int getFrame(WebDriver driver, By by) {
		int i;
		int framescount=driver.findElements(By.tagName("iframe")).size();
		
		for (i=0;i<framescount;i++) {
			driver.switchTo().frame(i);
			int count=driver.findElements(by).size();
			
			if(count>0) {
				break;
			}else {
				System.out.println("looping");
			}
		}
		driver.switchTo().defaultContent();
		return i;
	}

}
