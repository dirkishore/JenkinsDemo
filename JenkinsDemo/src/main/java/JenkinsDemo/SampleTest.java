package JenkinsDemo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SampleTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver",
				"C://Users//kishore//Downloads//edgedriver_win64//msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		driver.get("https://www.facebook.com/");

		Thread.sleep(3000);

		driver.quit();
	}

}
