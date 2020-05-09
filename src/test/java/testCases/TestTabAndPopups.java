package testCases;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestTabAndPopups {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.way2automation.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//first window:
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/header/div[2]/div/div[2]/div/a[1]")).click();
		Set<String> widids = driver.getWindowHandles();
		Iterator<String> iterate = widids.iterator();
		String first_wind = iterate.next();
		System.out.println(first_wind);

//second window:
		System.out.println("***************************************************");
		widids = driver.getWindowHandles();
		iterate = widids.iterator();
		iterate.next(); // first window
		String second_wind = iterate.next(); // second window
		System.out.println(second_wind);
		
		driver.switchTo().window(second_wind);

		driver.findElement(By.xpath("//*[@id=\"new_user\"]/div[4]/input")).click();
		
//first window: -----> returning to first window
		widids = driver.getWindowHandles();
		iterate = widids.iterator();
		iterate.next(); 
		
		driver.switchTo().window(first_wind);
		
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/header/div[2]/div/div[2]/div/a[2]")).click();
		
//third window:
		widids = driver.getWindowHandles();
		iterate = widids.iterator();
		iterate.next(); // first window
		iterate.next(); // second window
        String third_wind = iterate.next(); // third window
		System.out.println(third_wind);
		
		driver.switchTo().window(third_wind);
		System.out.println(driver.getTitle().contains("Selenium Tutorial"));

		driver.findElement(By.xpath("//*[@id=\"navbar\"]/div/div/div/ul/li[6]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"new_user\"]/center/a")).click();
		driver.findElement(By.xpath("//*[@id=\"new_user\"]/center/input")).click();
     
//	    driver.close();
//      driver.switchTo().window(second_wind);
//	    driver.close();
		driver.quit();
        /*
		 * while(iterate.hasNext()) 
		 * { iterate.next(); }     // whenever we are having more windows/tab than we can use loops..
		 */
		
	
	}

}
