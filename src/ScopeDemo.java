import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScopeDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/brendangreene/workspace/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.qaclickacademy.com/practice.php");
		
		//give me the count of links on the page
		
		System.out.println("all links "+driver.findElements(By.tagName("a")).size());
		System.out.println("links in footer using xpath "+driver.findElements(By.xpath("//div[@id=\"gf-BIG\"]//a")).size());
		
		WebElement footerDriver=driver.findElement(By.id("gf-BIG"));//limiting web driver scope
		
		System.out.println("number of links in footer by limiting scope "+footerDriver.findElements(By.tagName("a")).size());
		
		WebElement columnDriver= footerDriver.findElement(By.xpath("//td/*"));
		WebElement columnDriver2= footerDriver.findElement(By.xpath("//td[2]/*"));
		
		System.out.println("number of links in first column"+columnDriver.findElements(By.tagName("a")).size());
		System.out.println("number of links in second column"+columnDriver2.findElements(By.tagName("a")).size());
		
		Actions a = new Actions(driver);
		a.moveToElement(footerDriver).build().perform();
		int column1count = columnDriver.findElements(By.tagName("a")).size();
		
		for (int i=1;i<column1count;i++) {
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(Keys.COMMAND, Keys.ENTER);
			Thread.sleep(1000);
		}	
		
		Set<String> openWindows = driver.getWindowHandles();
		Iterator<String> ops=openWindows.iterator();
		System.out.println("---------");
		System.out.println("using Iterator and while loop");
		while(ops.hasNext()){
			driver.switchTo().window(ops.next());
			System.out.println(driver.getTitle());
		}
		System.out.println("---------");
		System.out.println("using for loop");
		for(String openWindow : openWindows) {
			driver.switchTo().window(openWindow);
			System.out.println(driver.getTitle());
			driver.close();
		}

		Thread.sleep(30000L);
		driver.quit();

	}

}
