package dr;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HOOT {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:5501/index.html");
		String MyTitle = driver.getTitle();
		System.out.println(MyTitle);
		
List <WebElement> myoptions = driver.findElements(By.tagName("option"));
//System.out.println(myoptions.size());

for (int i=0; i<myoptions.size(); i++) {
	System.out.println(myoptions.get(i).getText());
	
}

	}

}
