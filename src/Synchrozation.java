import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchrozation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/brendangreene/workspace/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/vacationpackages?MDPCID=ALASKA-US.TPS.BRAND.VACATIONPACKAGES.PACKAGE");
		driver.findElement(By.linkText("Hotel only")).click();
		//driver.findElement(By.id("H-destination")).sendKeys("Dublin, Ireland (DUB)");//Binghamton, NY (BGM-Greater Binghamton)
		driver.findElement(By.id("H-destination")).sendKeys("Binghamton, NY (BGM-Greater Binghamton)");
		driver.findElement(By.id("H-destination")).sendKeys(Keys.TAB);
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		//*[@id="H-fromDate-label"]/div
		Date date = new Date();
		String dateFormatted = dateFormat.format(date);

		String dateFormatted2 = dateFormat.format(new Date(1));
		driver.findElement(By.id("H-fromDate")).sendKeys(Keys.TAB,Keys.TAB,Keys.TAB, Keys.ENTER);
		//driver.findElement(By.id("H-fromDate")).sendKeys(Keys.TAB);
		//driver.findElement(By.id("H-toDate")).sendKeys(dateFormatted2);
		//driver.findElement(By.id("H-toDate")).sendKeys(Keys.TAB);
		driver.findElement(By.id("H-searchButtonExt1")).click();
		
		WebDriverWait d = new WebDriverWait(driver,20);
		//d.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@data-track, 'DealOfDay')]")));
		d.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='resultsContainer']/section/article[1]")));
		
		//driver.findElement(By.xpath("//a[contains(@data-track, 'DealOfDay')]")).click();
		driver.findElement(By.xpath("//div[@id='resultsContainer']/section/article[1]")).click();
		Thread.sleep(30000L);
		driver.quit();

	}

}
