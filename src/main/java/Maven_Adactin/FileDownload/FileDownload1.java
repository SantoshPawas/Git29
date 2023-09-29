package Maven_Adactin.FileDownload;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//update by santosh pawase on 29/09/2023
public class FileDownload1 
{
	public static void main(String[] args) 
	{
		ChromeOptions co=new ChromeOptions();
		String s1=System.getProperty("user.dir")+"\\All_Download\\";
		//this is default directory where we have to stoare our file
		
		HashMap mp=new HashMap();
		mp.put("download.default_directory", s1);
		
		//set chrome browser
		
		co.setExperimentalOption("prefs", mp);
		
		WebDriver driver=new ChromeDriver(co);
		
		driver.get("https://chromedriver.storage.googleapis.com/index.html?path=114.0.5735.90/");
		
		driver.manage().window().maximize();
		
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//*[text()='chromedriver_win32.zip']")).click();
	
		
	}
}
