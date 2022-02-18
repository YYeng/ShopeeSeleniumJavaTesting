import java.io.File;
import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
import org.junit.Ignore;

public class ShopeeSearchAndEditProfile {

	// TC_01// SearchMaskProduct

	@Ignore
	@Test
	public void SearchMaskProduct() {
		// TODO Auto-generated method stub

		String URL = "https://shopee.com.my/";
		try {
			// create driver
			File file = new File("C:\\\\chromedriver_win32\\\\chromedriver.exe");
			// automate browser to shopee
			System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
			ChromeDriver driver = new ChromeDriver();
			driver.get(URL);

			// wait for browser open
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			driver.manage().window().maximize();

			// close pop up messages

			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div[3]/div[1]/button\r\n")).click();

			Thread.sleep(2000);

			driver.findElement(By.xpath("//html")).click();

			Thread.sleep(2000);

			// CheckMaskProduct
			driver.findElement(By.className("shopee-searchbar-input__input")).click();
			// EnterProduct
			driver.findElement(By.className("shopee-searchbar-input__input")).sendKeys("Mask");

			// click button search
			driver.findElement(By.xpath(
					"/html/body/div[1]/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div[1]/button"))
					.click();

			Thread.sleep(2000);

			// check actual messages
			WebElement actualMsg = driver.findElement(By.className("shopee-search-result-section__title"));
			String act = actualMsg.getText();

			// verify error message with Assertion
			Assert.assertTrue(act.contains("Search result for 'mask'"));
			System.out.println("Test Search Mask Product Completed");

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	// TC_02//LatestSearchHistory
	@Ignore
	@Test
	public void LatestSearchHistory() {
		// TODO Auto-generated method stub

		String URL = "https://shopee.com.my/";
		try {
			// create driver
			File file = new File("C:\\\\chromedriver_win32\\\\chromedriver.exe");
			// automate browser to shopee
			System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
			ChromeDriver driver = new ChromeDriver();
			driver.get(URL);

			// open and maximize browser
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			driver.manage().window().maximize();

			// close pop up messages

			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div[3]/div[1]/button\r\n")).click();

			Thread.sleep(2000);

			driver.findElement(By.xpath("//html")).click();

			Thread.sleep(2000);

			// ClickSearchBar
			driver.findElement(By.className("shopee-searchbar-input__input")).click();
			driver.findElement(By.className("shopee-searchbar-input__input")).sendKeys("beg");

			Thread.sleep(2000);

			// click button search
			driver.findElement(By.xpath(
					"/html/body/div[1]/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div[1]/button"))
					.click();

			Thread.sleep(2000);

			// ClearSearchBar
			// select all text in textbox
			driver.findElement(By.className("shopee-searchbar-input__input")).sendKeys(Keys.CONTROL, Keys.chord("a"));

			// delete it
			driver.findElement(By.className("shopee-searchbar-input__input")).sendKeys(Keys.BACK_SPACE);

			Thread.sleep(2000);

			// check actual messages in popover search box
			WebElement actualMsg = driver.findElement(By.className("shopee-popover"));

			// get all element in pop over search box
			String act = actualMsg.getText();

			// print element in pop over search box
			System.out.println(act);

			// verify history "beg" with Assertion
			Assert.assertTrue(act.contains("beg"));
			System.out.println("Test Latest Search Completed");

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	// TC_03//DefaultSearch
	@Ignore
	@Test
	public void DefaultSearch() {
		// TODO Auto-generated method stub

		String URL = "https://shopee.com.my/";
		try {
			// create driver
			File file = new File("C:\\\\chromedriver_win32\\\\chromedriver.exe");
			// automate browser to shopee
			System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
			ChromeDriver driver = new ChromeDriver();
			driver.get(URL);

			// open and maximize browser
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			driver.manage().window().maximize();

			// close pop up messages

			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div[3]/div[1]/button\r\n")).click();

			Thread.sleep(2000);

			driver.findElement(By.xpath("//html")).click();

			Thread.sleep(2000);

			// EnterDefaultSearch
			driver.findElement(By.className("shopee-searchbar-input__input")).click();
			driver.findElement(By.className("shopee-searchbar-input__input")).sendKeys("");

			Thread.sleep(2000);

			// click button search
			driver.findElement(By.xpath(
					"/html/body/div[1]/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div[1]/button"))
					.click();
			Thread.sleep(2000);

			System.out.println("Test Default Search Completed");

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	// TC_04
	// VerifySearchWithRelatedKeyword
	@Ignore
	@Test
	public void VerifyRelatedSearch() {
		// TODO Auto-generated method stub

		String URL = "https://shopee.com.my/";
		try {
			// create driver
			File file = new File("C:\\\\chromedriver_win32\\\\chromedriver.exe");
			// automate browser to shopee
			System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
			ChromeDriver driver = new ChromeDriver();
			driver.get(URL);

			// open and maximize browser
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			driver.manage().window().maximize();

			// close pop up messages
			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div[3]/div[1]/button\r\n")).click();

			Thread.sleep(2000);

			driver.findElement(By.xpath("//html")).click();

			Thread.sleep(2000);

			// CheckandVerifySearch
			driver.findElement(By.className("shopee-searchbar-input__input")).click();
			// Enter Keyword
			driver.findElement(By.className("shopee-searchbar-input__input")).sendKeys("qwesaz");

			// click button search
			driver.findElement(By.xpath(
					"/html/body/div[1]/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div[1]/button"))
					.click();

			Thread.sleep(2000);

			// check actual messages
			WebElement actualMsg = driver.findElement(By.className("shopee-search-result-section__title"));
			String act = actualMsg.getText();

			// verify error message with Assertion
			Assert.assertTrue(act.contains("We couldn't find a qwesaz for sale. Showing results for 'wealtz'."));
			System.out.println("Verify Related Keyword Completed");

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	// TC_05//CheckSpecialCharacters

	@Ignore
	@Test
	public void CheckSpecialCharacters() {
		// TODO Auto-generated method stub

		String URL = "https://shopee.com.my/";
		try {
			// create driver
			File file = new File("C:\\\\chromedriver_win32\\\\chromedriver.exe");
			// automate browser to shopee
			System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
			ChromeDriver driver = new ChromeDriver();
			driver.get(URL);

			// wait for browser open
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			driver.manage().window().maximize();

			// close pop up messages

			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div[3]/div[1]/button\r\n")).click();

			Thread.sleep(2000);

			driver.findElement(By.xpath("//html")).click();

			Thread.sleep(2000);

			// CheckSpecialCharacters
			driver.findElement(By.className("shopee-searchbar-input__input")).click();
			// enter special char
			driver.findElement(By.className("shopee-searchbar-input__input")).sendKeys("*!@#$%");

			// click button search
			driver.findElement(By.xpath(
					"/html/body/div[1]/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div[1]/button"))
					.click();

			Thread.sleep(2000);

			// check actual messages
			WebElement actualMsg = driver.findElement(By.className("shopee-search-empty-result-section__title"));
			String act = actualMsg.getText();

			// verify error message with Assertion
			Assert.assertTrue(act.contains("No results found"));
			System.out.println("Test Keyword not Found Completed");

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	// TC_06
	@Ignore
	@Test
	public void EditProfileName() {
		String URL = "https://shopee.com.my/";
		try {
			// create driver
			File file = new File("C:\\\\chromedriver_win32\\\\chromedriver.exe");
			// automate browser to shopee
			System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
			ChromeDriver driver = new ChromeDriver();
			driver.get(URL);
			JavascriptExecutor execute = (JavascriptExecutor) driver;

			// wait for browser open
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			driver.manage().window().maximize();

			// close pop up messages

			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div[3]/div[1]/button\r\n")).click();

			Thread.sleep(2000);

			driver.findElement(By.xpath("//html")).click();

			Thread.sleep(2000);

			// click login
			driver.findElement(
					By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div/div[1]/div/ul/a[3]"))
					.click();

			// login with qr
			WebElement qr = driver
					.findElement(By.xpath("//div[@id=\"main\"]/div/div[2]/div/div/form/div/div[1]/div/div[2]/a"));
			execute.executeScript("arguments[0].click();", qr);
			Thread.sleep(5000);

			String currentUrl = driver.getCurrentUrl();
			String newUrl;
			do {
				newUrl = driver.getCurrentUrl();
				Thread.sleep(20);

			} while (newUrl.contentEquals(currentUrl));

			// GoToMyAccount
			driver.findElement(By.className("stardust-popover__target")).click();
			driver.findElement(By.className("navbar__link--account__container")).click();
			driver.findElement(
					By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/a/div[2]/span")).click();

			Thread.sleep(2000);

			// ChangeName
			// driver.findElement(By.className("input-with-validator")).click();
			driver.findElement(By.xpath(
					"/html/body/div[1]/div/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/form/div[2]/div/div[2]/div/div/input"))
					.click();
			driver.findElement(By.xpath(
					"/html/body/div[1]/div/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/form/div[2]/div/div[2]/div/div/input"))
					.sendKeys("TestName");

			// SaveChanges
			driver.findElement(
					By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/form/div[8]/button"))
					.click();

			Thread.sleep(2000);

			// CheckActualMessage
			WebElement actualMsg = driver.findElement(By.className("/html/body/div[2]/div/div/div[2]/div/div/span"));
			String act = actualMsg.getText();

			// verify error message with Assertion
			Assert.assertTrue(act.contains("Profile Updated"));
			System.out.println("Test Profile Update Complete");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

//TC_07//UploadNewImage
	@Ignore
	@Test
	public void UploadNewImage() {
		String URL = "https://shopee.com.my/";
		try {
			// create driver
			File file = new File("C:\\\\chromedriver_win32\\\\chromedriver.exe");
			// automate browser to shopee
			System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
			ChromeDriver driver = new ChromeDriver();
			driver.get(URL);
			JavascriptExecutor execute = (JavascriptExecutor) driver;

			// wait for browser open
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			driver.manage().window().maximize();

			// close pop up messages

			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div[3]/div[1]/button\r\n")).click();

			Thread.sleep(2000);

			driver.findElement(By.xpath("//html")).click();

			Thread.sleep(2000);

			// click login
			driver.findElement(
					By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div/div[1]/div/ul/a[3]"))
					.click();

			WebElement qr = driver
					.findElement(By.xpath("//div[@id=\"main\"]/div/div[2]/div/div/form/div/div[1]/div/div[2]/a"));
			execute.executeScript("arguments[0].click();", qr);
			Thread.sleep(5000);

			String currentUrl = driver.getCurrentUrl();
			String newUrl;
			do {
				newUrl = driver.getCurrentUrl();
				Thread.sleep(20);

			} while (newUrl.contentEquals(currentUrl));

			// GoToMyAccount
			driver.findElement(By.className("stardust-popover__target")).click();
			driver.findElement(
					By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/a/div[2]/span")).click();

			Thread.sleep(2000);

			// InputNewImage
			// GoToSelectImageButton

			driver.findElement(
					By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/button"))
					.click();

			Thread.sleep(2000);

			// PickNewImage
			// SaveChanges

			driver.findElement(
					By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/form/div[8]/button"))
					.click();

			Thread.sleep(2000);

			// CheckActualMessage
			WebElement actualMsg = driver.findElement(By.className("/html/body/div[2]/div/div/div[2]/div/div/span"));
			String act = actualMsg.getText();

			// verify error message with Assertion
			Assert.assertTrue(act.contains("Profile Updated"));
			System.out.println("Upload New Image Complete");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

//TC_08//NoModification
	@Ignore
	@Test
	public void EditNoModification() {
		String URL = "https://shopee.com.my/";
		try {
			// create driver
			File file = new File("C:\\\\chromedriver_win32\\\\chromedriver.exe");
			// automate browser to shopee
			System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
			ChromeDriver driver = new ChromeDriver();
			driver.get(URL);
			JavascriptExecutor execute = (JavascriptExecutor) driver;

			// wait for browser open
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			driver.manage().window().maximize();

			// close pop up messages

			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div[3]/div[1]/button\r\n")).click();

			Thread.sleep(2000);

			driver.findElement(By.xpath("//html")).click();

			Thread.sleep(2000);

			// FindLoginButton
			// driver.findElement(By.className("navbar_link navbarlink--account
			// navbar_link--login")).click();

			driver.findElement(
					By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div/div[1]/div/ul/a[3]"))
					.click();

			WebElement qr = driver
					.findElement(By.xpath("//div[@id=\"main\"]/div/div[2]/div/div/form/div/div[1]/div/div[2]/a"));
			execute.executeScript("arguments[0].click();", qr);
			Thread.sleep(5000);

			String currentUrl = driver.getCurrentUrl();
			String newUrl;
			do {
				newUrl = driver.getCurrentUrl();
				Thread.sleep(20);

			} while (newUrl.contentEquals(currentUrl));

			// GoToMyAccount
			driver.findElement(By.className("stardust-popover__target")).click();
			driver.findElement(
					By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/a/div[2]/span")).click();

			Thread.sleep(2000);

			// SaveChanges
			driver.findElement(
					By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/form/div[8]/button"))
					.click();

			Thread.sleep(2000);

			// CheckActualMessage
			WebElement actualMsg = driver.findElement(By.className("/html/body/div[2]/div/div/div[2]/div/div/span"));
			String act = actualMsg.getText();

			// verify error message with Assertion
			Assert.assertTrue(act.contains("Profile Updated"));
			System.out.println("Test Profile Update Complete");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

//TC_09//InputEmptyNameField
	@Ignore
	@Test
	public void InputEmptyName() {
		String URL = "https://shopee.com.my/";
		try {
			// create driver
			File file = new File("C:\\\\chromedriver_win32\\\\chromedriver.exe");
			// automate browser to shopee
			System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
			ChromeDriver driver = new ChromeDriver();
			driver.get(URL);
			JavascriptExecutor execute = (JavascriptExecutor) driver;

			// wait for browser open
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			driver.manage().window().maximize();

			// close pop up messages

			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div[3]/div[1]/button\r\n")).click();

			Thread.sleep(2000);

			driver.findElement(By.xpath("//html")).click();

			Thread.sleep(2000);

			// FindLoginButton
			// driver.findElement(By.className("navbar_link navbarlink--account
			// navbar_link--login")).click();

			driver.findElement(
					By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div/div[1]/div/ul/a[3]"))
					.click();

			WebElement qr = driver
					.findElement(By.xpath("//div[@id=\"main\"]/div/div[2]/div/div/form/div/div[1]/div/div[2]/a"));
			execute.executeScript("arguments[0].click();", qr);
			Thread.sleep(5000);

			String currentUrl = driver.getCurrentUrl();
			String newUrl;
			do {
				newUrl = driver.getCurrentUrl();
				Thread.sleep(20);

			} while (newUrl.contentEquals(currentUrl));

			// GoToMyAccount
			driver.findElement(By.className("stardust-popover__target")).click();
			driver.findElement(
					By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/a/div[2]/span")).click();

			Thread.sleep(2000);

			// EmptyNameField

			// select all text in textbox
			driver.findElement(By.xpath(
					"/html/body/div[1]/div/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/form/div[2]/div/div[2]/div/div/input"))
					.sendKeys(Keys.CONTROL, Keys.chord("a"));

			// delete it
			driver.findElement(By.xpath(
					"/html/body/div[1]/div/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/form/div[2]/div/div[2]/div/div/input"))
					.sendKeys(Keys.BACK_SPACE);

			Thread.sleep(2000);

			// CheckActualMessage
			WebElement actualMsg = driver.findElement(By.className("/html/body/div[2]/div/div/div[2]/div/div/span"));
			String act = actualMsg.getText();

			// verify error message with Assertion
			Assert.assertTrue(act.contains("Name cannot be empty"));
			System.out.println("Input No Name Complete");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

//TC10_InputInvalidEmail
	@Ignore
	@Test
	public void InputInvalidEmail() {
		String URL = "https://shopee.com.my/";
		try {
			// create driver
			File file = new File("C:\\\\chromedriver_win32\\\\chromedriver.exe");
			// automate browser to shopee
			System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
			ChromeDriver driver = new ChromeDriver();
			driver.get(URL);
			JavascriptExecutor execute = (JavascriptExecutor) driver;

			// wait for browser open
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			driver.manage().window().maximize();

			// close pop up messages

			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div[3]/div[1]/button\r\n")).click();

			Thread.sleep(2000);

			driver.findElement(By.xpath("//html")).click();

			Thread.sleep(2000);

			// FindLoginButton
			// driver.findElement(By.className("navbar_link navbarlink--account
			// navbar_link--login")).click();

			driver.findElement(
					By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div/div[1]/div/ul/a[3]"))
					.click();

			WebElement qr = driver
					.findElement(By.xpath("//div[@id=\"main\"]/div/div[2]/div/div/form/div/div[1]/div/div[2]/a"));
			execute.executeScript("arguments[0].click();", qr);
			Thread.sleep(5000);

			String currentUrl = driver.getCurrentUrl();
			String newUrl;
			do {
				newUrl = driver.getCurrentUrl();
				Thread.sleep(20);

			} while (newUrl.contentEquals(currentUrl));

			// GoToMyAccount
			driver.findElement(By.className("stardust-popover__target")).click();
			driver.findElement(
					By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/a/div[2]/span")).click();

			Thread.sleep(2000);

			// ClickChangeEmailAddress
			driver.findElement(By.xpath(
					"/html/body/div[1]/div/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div[1]/button"))
					.click();

			// Enter Password for Verification
			driver.findElement(By.xpath(
					"/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/form/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input"))
					.click();

			// Replace *** with your password
			driver.findElement(By.xpath(
					"/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/form/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input"))
					.sendKeys("***");

			Thread.sleep(10000);

			// Confirm Password
			driver.findElement(By
					.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/form/div[2]/button"))
					.click();

			// Enter New Email
			driver.findElement(By.xpath(
					"/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/form/div[2]/div[1]/div[2]/div[1]/div[1]/input"))
					.click();
			driver.findElement(By.xpath(
					"/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/form/div[2]/div[1]/div[2]/div[1]/div[1]/input"))
					.sendKeys("123");

			// Click Confirm
			driver.findElement(By.xpath(
					"/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/form/div[3]/div[1]/div[1]/div[1]/button[1]"))
					.click();

			Thread.sleep(2000);

			// CheckActualMessage
			WebElement actualMsg = driver.findElement(By.className(
					"/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/form/div[2]/div[2]/div[1]"));
			String act = actualMsg.getText();

			// verify error message with Assertion
			Assert.assertTrue(act.contains("Invalid Email"));
			System.out.println("Input Invalid Email Complete");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
