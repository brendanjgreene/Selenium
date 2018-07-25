import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TableExercise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/brendangreene/workspace/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.cricbuzz.com/");
		driver.findElement(By.cssSelector(".cb-hm-mnu-itm")).click();
		//#page-wrapper > div.html-refresh.ng-isolate-scope > div > nav > a:nth-child(2)
		driver.findElement(By.xpath("//nav[@class='cb-mat-mnu']/a[2]")).click();
		//cb-nav-bar
		driver.findElement(By.xpath("//nav[@class='cb-nav-bar']/a[2]")).click();
		
		WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));	
		
		List<WebElement> runs = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)"));
		int index=runs.size();
		runs.remove(index-1);
		int total = 0;
		for (WebElement run : runs) {
			System.out.println(run.getText());
			try{
		        total += Integer.parseInt(run.getText());
		    }catch(NumberFormatException e){
		        System.out.println("extras");
		    }
		}
		System.out.println("total " +total);
		int Total = Integer.parseInt(table.findElement(By.xpath("//*[text()='Total']/following-sibling::div")).getText());
		System.out.println("Total " +Total);

		if (Total==total) {
			System.out.println("total is correct");
		}else {
			System.out.println("total not correct");
		}
		Thread.sleep(2000);
		
		
		Thread.sleep(30000);
		driver.close();
	}

}
