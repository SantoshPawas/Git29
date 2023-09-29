package Maven_Adactin.FileDownload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload1 
{
	public static void main(String[] args) throws AWTException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//*[@id='pickfiles']")).click();
		
		StringSelection s1=new StringSelection("D:\\15th April Morning - External_Mock_Group (1).pdf");
		
		//copy into clipboard
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s1, null);
		
		//control+V
		
		Robot r1=new Robot();
		r1.delay(2000);
		r1.keyPress(KeyEvent.VK_CONTROL);
		r1.keyPress(KeyEvent.VK_V);
		
		//relase control & v
		
		r1.keyRelease(KeyEvent.VK_CONTROL);
		r1.keyRelease(KeyEvent.VK_V);
		
		
		//sumbit file by pressing & releasing enter key
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		
	}

}
