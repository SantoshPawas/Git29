package Maven_Adactin.FileDownload;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileDownload3 
{
	public static void main(String[] args) 
	{
		
		ChromeOptions co=new ChromeOptions();
		
		HashMap mp=new HashMap();
		
		String s1=System.getProperty("user.dir")+"All_Download\\";
		
		
		mp.put("download.default_directory", s1);
		
		co.setExperimentalOption("prefs", mp);
		
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://chromedriver.storage.googleapis.com/index.html?path=114.0.5735.90/");
		
		driver.manage().window().maximize();
		
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//*[text()='chromedriver_win32.zip']")).click();
	
		
		
		
		
		
		
		
		
	}

}
