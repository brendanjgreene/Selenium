import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXPath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/brendangreene/workspace/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");

		// syntax for xpath //tagname[@attribute='value']
		//driver.findElement(By.xpath("//input[@type='email']")).sendKeys("emailforxpath");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("xpathpassword");
		//driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		// syntax for css tagname[attribute='value']
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("myCss");
		//driver.findElement(By.cssSelector("[value='Log In']")).click();
		
		//regular expression - //tagName[contains(@attribute, 'value')]
		driver.findElement(By.cssSelector("input[id*='u_']")).click();
		Thread.sleep(30000L);
		driver.close();
	}

}
