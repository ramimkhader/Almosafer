package interview_per;


import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase extends parameters {

//	@Test(invocationCount = 6)
//
//	public void checkTheWebsiteLanguage() {
//
//		String[] myWebsitelLanguage = { "https://ae.almosafer.com/en", "https://ae.almosafer.com/ar" };
//
//		Random rand = new Random();
//		int Randomm = rand.nextInt(0, 8000) % 2;
//		driver.get(myWebsitelLanguage[Randomm]);
//		String ActualTitle = driver.getTitle();
//
//		if (Randomm == 1) {
//
//			myAssert.assertEquals(ActualTitle, "فنادق، احجز فنادق رخيصة واحصل على أسعار منخفضة على المسافر.");
//
//		} else {
//			myAssert.assertEquals(ActualTitle, "Hotels, book cheap hotels & get discounted prices on Almosafer");
//
//		}
//		myAssert.assertAll();
//	}
//
//	@Test()
//	public void Defult_Currency_Is_correct_SAR() {
//
//		String expecteddefult_Currency = "SAR";
//		WebElement Currency = driver
//				.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/div[1]/div/button"));
//		String ActualSUR = Currency.getText();
//
//		myAssert.assertEquals(ActualSUR, expecteddefult_Currency);
//
//		myAssert.assertAll();
//
//	}
//
//	@Test()
//	public void test_qitaf_logo() {
//
//		WebElement divVisa = driver
//				.findElement(By.xpath(" //*[@id=\"__next\"]/footer/div[3]/div[3]/div[1]/div[2]/div"));
//		divVisa.isDisplayed();
//		myAssert.assertEquals(divVisa.isDisplayed(), true);
//		myAssert.assertAll();
//
//	}
//
//	@Test()
//	public void allPhotos() {
//
//		List<WebElement> myList = driver.findElements(By.tagName("img"));
//
//		for (int i = 0; i < myList.size(); i++) {
//
//			String rami = myList.get(i).getAttribute("src");
//			System.out.println(rami);
//		}
//
//	}

//	@Test()
//	public void hotel_tab_is_not_selected() {
//
//		WebElement hotelTab = driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tab-hotels\"]"));
//		String ActualhotelTab = hotelTab.getAttribute("aria-selected");
//		String expectedhotelTab = "false";
//
//		myAssert.assertEquals(ActualhotelTab, expectedhotelTab);
//		myAssert.assertAll();
//	}

	@Test(invocationCount = 1)
	public void location_field() {
		String[] myWebsitelLanguage = { "https://ae.almosafer.com/en", "https://ae.almosafer.com/ar" };
		String[] EnglishCites = { "Dubai", "Jeddah", "Riyadh" };
		String[] ArabicCites = { "دبي", "جدة" };

		Random rand = new Random();
		int randWebSite = rand.nextInt(2);
		int randArabic = rand.nextInt(2);
		int randEnglish = rand.nextInt(3);

		driver.get(myWebsitelLanguage[randWebSite]);
		if (randWebSite == 0) {
			driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[2]/div[1]/div/div[2]/div[1]/div/div/div/input")).sendKeys(EnglishCites[randEnglish]);
			driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[2]/div[1]/div/div[2]/div[3]/div[1]/div/div/input")).sendKeys("amman");
     		System.out.println("00000000000000000000000000000000000000000");
			driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[4]/button")).click();
			System.out.println("1111111111111111111111111111111111111111");
		}
		else {
		
			driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[2]/div[1]/div/div[2]/div[1]/div/div/div/input")).sendKeys(EnglishCites[randEnglish]);
			driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[2]/div[1]/div/div[2]/div[3]/div[1]/div/div/input")).sendKeys("amman");
	    	System.out.println("00000000000000000000000000000000000000000");
			driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[4]/button")).click();
			System.out.println("1111111111111111111111111111111111111111");

			
			
			driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[4]/button")).sendKeys(ArabicCites[randArabic]);
			driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[2]/div[1]/div/div[2]/div[3]/div[1]/div/div/input")).sendKeys("عمان");
			driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[4]/button")).click();
			
			
		}
	}

	
}
