package aufin.common.com;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mapping 
{
	static List <WebElement> li1;
	
   public static void main(String ar[]) throws InterruptedException
   {
	   
	   System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\jdk1.8.0_121\\chromedriver.exe");
	   WebDriver dr= new ChromeDriver();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("start-maximized");
		dr= new ChromeDriver (option);
		dr.get("http://my.crmnext.com/sn/app/login/login");
		dr.findElement(By.id("TxtName")).sendKeys("kajali.agrawal@crmnext.in");
		dr.findElement(By.id("TxtPassword")).sendKeys("Kaj@1992");
		dr.findElement(By.xpath(".//*[@id='registration']/ul/li[5]/input")).click();
		WebDriverWait wait= new WebDriverWait(dr,100);
		wait.until(ExpectedConditions.visibilityOf(dr.findElement(By.xpath(".//*[@id='js-vnav']/li[9]/a/i"))));
		WebElement pattern=dr.findElement(By.xpath(".//*[@id='js-vnav']/li[9]/a/i"));
		pattern.click();
		dr.findElement(By.xpath("//table[contains(@class,'listing')]/tbody/tr[1]/td[1]/a")).click();
		dr.findElement(By.xpath("//p[contains(@title,'Test Cases')]")).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(dr.findElement(By.id("ADD_TO_TESTCASELIST"))));
		dr.findElement(By.id("ADD_TO_TESTCASELIST")).click();
		Thread.sleep(4000);
		Set<String> windows=dr.getWindowHandles();
		Iterator<String> I= windows.iterator();
		I.next();
		String child= I.next();
		dr.switchTo().window(child);
		System.out.println("window switched");
		wait.until(ExpectedConditions.urlContains("selectexistinglist"));
		System.out.println("wait cmplt");
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOf(dr.findElement(By.id("m_bs_bts"))));
		System.out.println("elements are storing");
		Select select= new Select(dr.findElement(By.id("m_c_drpfe")));
		select.selectByVisibleText("Create/Edit/Detail");
		Thread.sleep(7000);
		List <WebElement> li=dr.findElements(By.xpath(".//*[contains(text(),'SBC-Complaints-Non-FCR-TC')]/parent::tr/td[1]")); //GRV2
		System.out.println("elements stored");
		int size=li.size();
		System.out.println(size);
		
		while(size<1)
		{
			dr.findElement(By.xpath(".//*[@id='pager']/table/tbody/tr/td/div[2]/a[contains(text(),'Next')]")).click();
			System.out.println("waiting for next page to load");
			Thread.sleep(5000);
			System.out.println("wait cmplt");
			 li1 =dr.findElements(By.xpath(".//*[contains(text(),'SBC-Complaints-Non-FCR-TC')]/parent::tr/td[1]")); //GRV2, NON FCR
			size=li.size();
		}
		
		int i=1;
		for(WebElement k:li1)
		{
			System.out.println(k);
			k.click();
			System.out.println(i);
			i++;
		}
		
		dr.findElement(By.id("m_bs_bts")).click();
		
   }
}
