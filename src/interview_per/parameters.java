package interview_per;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

public class parameters {

	WebDriver driver = new ChromeDriver();
	SoftAssert myAssert = new SoftAssert();

	@BeforeTest()

	public void mySutup() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.get("https://ae.almosafer.com/en");

	}

}
