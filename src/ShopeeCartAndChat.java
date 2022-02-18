import java.time.Duration;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.junit.Ignore;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopeeCartAndChat {

	// (TC_11) Plus and Minus Cart Item
	@Ignore
	@Test
	public void plusMinusCart() {
		try {
			// create drive
			System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver_win32\\\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();

			// open and maximize browser
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			driver.manage().window().maximize();

			// navigate to Shopee website
			driver.get("https://shopee.com.my/");
			JavascriptExecutor execute = (JavascriptExecutor) driver;
			// choose language
			WebElement language = driver.findElement(By.xpath("//div[@id=\"modal\"]/div/div/div/div[3]/div/button"));
			execute.executeScript("arguments[0].click();", language);

			// close pop up
			driver.findElement(By.xpath("//html")).click();

			// click login
			driver.findElement(
					By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div/div[1]/div/ul/a[3]"))
					.click();
			// click on login with qr
			WebElement qr = driver
					.findElement(By.xpath("//div[@id=\"main\"]/div/div[2]/div/div/form/div/div[1]/div/div[2]/a"));
			execute.executeScript("arguments[0].click();", qr);
			Thread.sleep(5000);

			String currentUrl = driver.getCurrentUrl();
			String newUrl;
			do {
				newUrl = driver.getCurrentUrl();
				Thread.sleep(5);

			} while (newUrl.contentEquals(currentUrl));
			// navigate to cart page
			driver.findElement(By.xpath("//*[@id=\"cart_drawer_target_id\"]")).click(); // click cart icon
			Thread.sleep(4000);

			WebElement plusitem = driver.findElement(By.xpath(
					"//*[@id=\"main\"]/div/div[2]/div[2]/div/div[3]/div[1]/div[3]/div[2]/div[1]/div/div[5]/div/button[2]")); // select
																																// +

			execute.executeScript("arguments[0].click();", plusitem);
			Thread.sleep(4000);

			WebElement minusitem = driver.findElement(By.xpath(
					"//*[@id=\"main\"]/div/div[2]/div[2]/div/div[3]/div[1]/div[3]/div[2]/div[1]/div/div[5]/div/button[1]")); // select
																																// -
			execute.executeScript("arguments[0].click();", minusitem);
			Thread.sleep(4000);

		} catch (Exception e) {
			System.out.println(e);
		}
	}// plusMinusCart

	@Ignore
	@Test
	// (TC_12) Delete Cart Item
	public void deletecartitem() {
		try {
			// create driver
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();

			// open and maximize browser
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			driver.manage().window().maximize();

			// navigate to Shopee website
			driver.get("https://shopee.com.my/");
			JavascriptExecutor execute = (JavascriptExecutor) driver;

			// choose website language
			WebElement language = driver.findElement(By.xpath("//div[@id=\"modal\"]/div/div/div/div[3]/div/button"));
			execute.executeScript("arguments[0].click();", language);

			// click on Login
			WebElement login = driver.findElement(By.xpath("//div[@id=\"main\"]/div/div[2]/div/div/div/ul/a[3]"));
			execute.executeScript("arguments[0].click();", login);
			Thread.sleep(1000);

			// click on Login With QR
			WebElement qr = driver
					.findElement(By.xpath("//div[@id=\"main\"]/div/div[2]/div/div/form/div/div[1]/div/div[2]/a"));
			execute.executeScript("arguments[0].click();", qr);
			Thread.sleep(5000);

			// get current URL to match Shopee website before continuing
			String currentUrl = driver.getCurrentUrl();
			String newUrl;
			do {
				newUrl = driver.getCurrentUrl();
				Thread.sleep(5);
			} while (newUrl.contentEquals(currentUrl));

			// navigate to cart page
			driver.findElement(By.xpath("//div[@id=\"cart_drawer_target_id\"]")).click();
			Thread.sleep(5000);

			// scroll down
			execute.executeScript("window.scrollBy(0,300)");
			Thread.sleep(2000);

			// select cart item
			WebElement checkbox = driver.findElement(By.xpath(
					"//div[@id=\"main\"]/div/div[2]/div[2]/div/div[3]/div[1]/div[3]/div[2]/div/div[2]/div/div[1]/label"));
			execute.executeScript("arguments[0].click();", checkbox);
			Thread.sleep(2000);

			// verify assert passed
			WebElement check = driver.findElement(By.xpath(
					"//div[@id=\"main\"]/div/div[2]/div[2]/div/div[3]/div[1]/div[3]/div[2]/div/div[2]/div/div[1]/label/input"));
			Assert.assertEquals(true, check.isEnabled());
			System.out.println("Assert passed");

			// click on delete button
			WebElement deleteitem = driver.findElement(By.xpath(
					"//div[@id=\"main\"]/div/div[2]/div[2]/div/div[3]/div[1]/div[3]/div[2]/div/div[2]/div/div[7]/button"));
			execute.executeScript("arguments[0].click();", deleteitem);
			boolean delete = deleteitem.isEnabled();

			// verify assert passed
			if (delete) {
				System.out.println("Assert passed");
				System.out.println("Test case completed");
			} else {
				System.out.println("Assert failed");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}// delete cart item

	@Ignore
	@Test
	// (TC_13) Check for Cart Detail Page
	public void checkcartdetails() {
		try {
			// create drive
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			// open and maximize browser
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			driver.manage().window().maximize();

			// navigate to Shopee website
			driver.get("https://shopee.com.my/");
			JavascriptExecutor execute = (JavascriptExecutor) driver;

			// choose language
			WebElement language = driver.findElement(By.xpath("//div[@id=\"modal\"]/div/div/div/div[3]/div/button"));
			execute.executeScript("arguments[0].click();", language);

			// close pop up message

			driver.findElement(By.xpath("//html")).click();

			driver.findElement(
					By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div/div[1]/div/ul/a[3]"))
					.click();
			// click on login with qr
			WebElement qr = driver
					.findElement(By.xpath("//div[@id=\"main\"]/div/div[2]/div/div/form/div/div[1]/div/div[2]/a"));
			execute.executeScript("arguments[0].click();", qr);
			Thread.sleep(5000);

			String currentUrl = driver.getCurrentUrl();
			String newUrl;
			do {
				newUrl = driver.getCurrentUrl();
				Thread.sleep(5);
			} while (newUrl.contentEquals(currentUrl));

			driver.findElement(By.xpath("//*[@id=\"cart_drawer_target_id\"]")).click(); // click cart icon
			Thread.sleep(4000);

			WebElement itemselect = driver.findElement(By.xpath(
					"//*[@id=\"main\"]/div/div[2]/div[2]/div/div[3]/div[1]/div[3]/div[2]/div/div[2]/div/div[2]/div/div/a"));
// click cart item name
			execute.executeScript("arguments[0].click();", itemselect);
			Thread.sleep(4000);

		} catch (Exception e) {
			System.out.println(e);
		}
	}// view cart item details page

	@Ignore
	@Test
	// (TC_14) Claim Voucher for Discounts
	public void claimVoucher() {
		try {
			// create drive
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();

			// open and maximize browser
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			driver.manage().window().maximize();

			// navigate to Shopee website
			driver.get("https://shopee.com.my/");
			JavascriptExecutor execute = (JavascriptExecutor) driver;

			// choose language
			WebElement language = driver.findElement(By.xpath("//div[@id=\"modal\"]/div/div/div/div[3]/div/button"));
			execute.executeScript("arguments[0].click();", language);

			// close pop up message

			driver.findElement(By.xpath("//html")).click();

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
				Thread.sleep(5);
			} while (newUrl.contentEquals(currentUrl));

			driver.findElement(By.xpath("//*[@id=\"cart_drawer_target_id\"]")).click(); // click cart icon
			Thread.sleep(4000);

			// ("https://shopee.com.my/iPad-Air-4th-Generation-Wi-Fi-i.304504082.4360899712")<-
			// The cart item claim by me
			WebElement checkitem = driver.findElement(By.xpath(
					"//*[@id=\"main\"]/div/div[2]/div[2]/div/div[3]/div[1]/div[3]/div[2]/div[3]/div/div[1]/label"));// click
																													// item
																													// to
																													// claim
			execute.executeScript("arguments[0].click();", checkitem);
			Thread.sleep(2000);

			WebElement claim = driver.findElement(By.xpath(
					"//*[@id=\"main\"]/div/div[2]/div[2]/div/div[3]/div[1]/div[3]/div[3]/div/div[2]/div/button"));
// directly claim voucher
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", claim);

		} catch (Exception e) {
			System.out.println(e);
		}
	}// directly claim the voucher and update the price

	@Ignore
	@Test
	// (TC_15) Checkout Cart Item Functioning or Not
	public void checkoutcart() {
		try {
			// create drive
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			// open and maximize browser
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			driver.manage().window().maximize();

			// navigate to Shopee website
			driver.get("https://shopee.com.my/");
			JavascriptExecutor execute = (JavascriptExecutor) driver;
			// choose language
			WebElement language = driver.findElement(By.xpath("//div[@id=\"modal\"]/div/div/div/div[3]/div/button"));
			execute.executeScript("arguments[0].click();", language);

			// close pop up message

			driver.findElement(By.xpath("//html")).click();

			driver.findElement(
					By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div/div[1]/div/ul/a[3]"))
					.click();
			// click on login with qr
			WebElement qr = driver
					.findElement(By.xpath("//div[@id=\"main\"]/div/div[2]/div/div/form/div/div[1]/div/div[2]/a"));
			execute.executeScript("arguments[0].click();", qr);
			Thread.sleep(5000);

			String currentUrl = driver.getCurrentUrl();
			String newUrl;
			do {
				newUrl = driver.getCurrentUrl();
				Thread.sleep(5);
			} while (newUrl.contentEquals(currentUrl));

			driver.findElement(By.xpath("//*[@id=\"cart_drawer_target_id\"]")).click(); // click cart icon
			Thread.sleep(4000);

			WebElement checkbox = driver.findElement(By
					.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div/div[3]/div[1]/div[3]/div[2]/div/div/div[1]/label"));// select
																														// any
																														// cart
																														// item
			execute.executeScript("arguments[0].click();", checkbox);
			Thread.sleep(2000);

			WebElement checkoutitem = driver
					.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div/div[3]/div[2]/div[7]/button[4]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", checkoutitem);

		} catch (Exception e) {
			System.out.println(e);
		}
	}// check out cart item

	@Ignore
	@Test
	// (TC_16) Checkout Cart with Zero Cart Item
	public void zerocheckout() {
		try {
			// create driver
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();

			// open and maximize browser
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			driver.manage().window().maximize();

			// navigate to Shopee website
			driver.get("https://shopee.com.my/");
			JavascriptExecutor execute = (JavascriptExecutor) driver;

			// choose website language
			WebElement language = driver.findElement(By.xpath("//div[@id=\"modal\"]/div/div/div/div[3]/div/button"));
			execute.executeScript("arguments[0].click();", language);

			// click on Login
			WebElement login = driver.findElement(By.xpath("//div[@id=\"main\"]/div/div[2]/div/div/div/ul/a[3]"));
			execute.executeScript("arguments[0].click();", login);
			Thread.sleep(1000);

			// click on Login With QR
			WebElement qr = driver
					.findElement(By.xpath("//div[@id=\"main\"]/div/div[2]/div/div/form/div/div[1]/div/div[2]/a"));
			execute.executeScript("arguments[0].click();", qr);
			Thread.sleep(5000);

			// get current URL to match Shopee website before continuing
			String currentUrl = driver.getCurrentUrl();
			String newUrl;
			do {
				newUrl = driver.getCurrentUrl();
				Thread.sleep(5);
			} while (newUrl.contentEquals(currentUrl));

			// navigate to cart page
			driver.findElement(By.xpath("//div[@id=\"cart_drawer_target_id\"]")).click();
			Thread.sleep(5000);

			// click on Check Out button
			WebElement zerocheckout = driver
					.findElement(By.xpath("//div[@id=\"main\"]/div/div[2]/div[2]/div/div[3]/div[2]/div[7]/button[4]"));
			execute.executeScript("arguments[0].click();", zerocheckout);
			Thread.sleep(2000);

			// verify test complete
			WebElement noitem = driver.findElement(By.xpath("//div[@id=\"modal\"]/div[2]/div/div[2]/div/div[1]"));
			String warning = noitem.getText();
			Assert.assertTrue(warning.contains("You have not selected any items for checkout"));
			System.out.println("Test case completed");
		} catch (Exception e) {
			System.out.println(e);
		}
	}// zero checkout cart

	@Ignore
	@Test
	// (TC_17) Search Chat
	public void searchchat() {
		try {
			// create drive
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();

			// open and maximize browser
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			driver.manage().window().maximize();

			// navigate to Shopee website
			driver.get("https://shopee.com.my/");
			JavascriptExecutor execute = (JavascriptExecutor) driver;

			// choose language
			WebElement language = driver.findElement(By.xpath("//div[@id=\"modal\"]/div/div/div/div[3]/div/button"));
			execute.executeScript("arguments[0].click();", language);

			// close pop up
			driver.findElement(By.xpath("//html")).click();

			driver.findElement(
					By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div/div[1]/div/ul/a[3]"))
					.click();
			// click on login with qr
			WebElement qr = driver
					.findElement(By.xpath("//div[@id=\"main\"]/div/div[2]/div/div/form/div/div[1]/div/div[2]/a"));
			execute.executeScript("arguments[0].click();", qr);
			Thread.sleep(5000);

			String currentUrl = driver.getCurrentUrl();
			String newUrl;
			do {
				newUrl = driver.getCurrentUrl();
				Thread.sleep(5);
			} while (newUrl.contentEquals(currentUrl));

			driver.findElement(By.xpath("//*[@id=\"shopee-mini-chat-embedded\"]/div")).click(); // click chat button
			Thread.sleep(4000);

			driver.findElement(
					By.xpath("//*[@id=\"shopee-mini-chat-embedded\"]/div[1]/div[2]/div[2]/div[1]/div[1]/input"))
					.click(); // search chat

			driver.findElement(
					By.xpath("//*[@id=\"shopee-mini-chat-embedded\"]/div[1]/div[2]/div[2]/div[1]/div[1]/input"))
					.sendKeys("coscopremium");
// enter chat name to search and make sure the chat name is available in your site
			Thread.sleep(2000);

			driver.findElement(By.xpath(
					"//*[@id=\"shopee-mini-chat-embedded\"]/div[1]/div[2]/div[2]/div[3]/div/div/div/div[1]/div/div/div/div[2]/div[1]"))
					.click();
// click the search result chat name and now user can send message to the chat selected
			Thread.sleep(2000);

			// verify test complete
			WebElement message = driver
					.findElement(By.xpath("//div[@id=\"shopee-mini-chat-embedded\"]/div[1]/div[2]/div[2]/div[3]/div"));
			String warning = message.getText();
			Assert.assertTrue(warning.contains("No conversation found"));
			System.out.println("Test case completed");
		} catch (Exception e) {
			System.out.println(e);
		}
	}// Search Chat

	@Ignore
	@Test
	// (TC_18) Delete Chat
	public void deletechat() {
		try {
			// create drive
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();

			// open and maximize browser
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			driver.manage().window().maximize();

			// navigate to Shopee website
			driver.get("https://shopee.com.my/");
			JavascriptExecutor execute = (JavascriptExecutor) driver;

			// choose language
			WebElement language = driver.findElement(By.xpath("//div[@id=\"modal\"]/div/div/div/div[3]/div/button"));
			execute.executeScript("arguments[0].click();", language);

			// close pop up
			driver.findElement(By.xpath("//html")).click();

			driver.findElement(
					By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div/div[1]/div/ul/a[3]"))
					.click();
			// click on login with qr
			WebElement qr = driver
					.findElement(By.xpath("//div[@id=\"main\"]/div/div[2]/div/div/form/div/div[1]/div/div[2]/a"));
			execute.executeScript("arguments[0].click();", qr);
			Thread.sleep(5000);

			String currentUrl = driver.getCurrentUrl();
			String newUrl;
			do {
				newUrl = driver.getCurrentUrl();
				Thread.sleep(5);
			} while (newUrl.contentEquals(currentUrl));

			driver.findElement(By.xpath("//*[@id=\"shopee-mini-chat-embedded\"]/div")).click(); // click chat button
			Thread.sleep(4000);

			WebElement dropdown = driver.findElement(By.id("472903919887919674")); // select hidden drop down option
			execute.executeScript("arguments[0].click();", dropdown);

			WebElement deletechat = driver.findElement(By.xpath("/html/body/div[7]/div/div/div[3]")); // select delete
																										// chat option
																										// and wait for
																										// confirmation
																										// message
			execute.executeScript("arguments[0].click();", deletechat);

		} catch (Exception e) {
			System.out.println(e);
		}
	}// Delete Chat

	@Ignore
	@Test
	// (TC_19) Send Picture or Video for Specific Chat Selected
	public void sendpicvideo() {
		try {
			// create drive
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();

			// open and maximize browser
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			driver.manage().window().maximize();

			// navigate to Shopee website
			driver.get("https://shopee.com.my/");
			JavascriptExecutor execute = (JavascriptExecutor) driver;

			// choose language
			WebElement language = driver.findElement(By.xpath("//div[@id=\"modal\"]/div/div/div/div[3]/div/button"));
			execute.executeScript("arguments[0].click();", language);

			// close pop up
			driver.findElement(By.xpath("//html")).click();

			driver.findElement(
					By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div/div[1]/div/ul/a[3]"))
					.click();

			// click on login with qr
			WebElement qr = driver
					.findElement(By.xpath("//div[@id=\"main\"]/div/div[2]/div/div/form/div/div[1]/div/div[2]/a"));
			execute.executeScript("arguments[0].click();", qr);
			Thread.sleep(5000);

			String currentUrl = driver.getCurrentUrl();
			String newUrl;
			do {
				newUrl = driver.getCurrentUrl();
				Thread.sleep(5);
			} while (newUrl.contentEquals(currentUrl));

			driver.findElement(By.xpath("//*[@id=\"shopee-mini-chat-embedded\"]/div")).click(); // click chat button

			driver.findElement(By.xpath(
					"//*[@id=\"shopee-mini-chat-embedded\"]/div[1]/div[2]/div[2]/div[3]/div/div/div/div[1]/div/div/div/div[2]/div[1]/div"))
					.click(); // click chat name available in the chat
			Thread.sleep(2000);

			driver.findElement(By.xpath(
					"//*[@id=\"shopee-mini-chat-embedded\"]/div[1]/div[2]/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div/i"))
					.click(); // click picture icon shown in the chat
			Thread.sleep(2000);
			// close windows file upload
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ESCAPE);
			r.keyRelease(KeyEvent.VK_ESCAPE);

			driver.findElement(By.xpath(
					"//*[@id=\"shopee-mini-chat-embedded\"]/div[1]/div[2]/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div[3]/div/div/i"))
					.click(); // click video icon shown in the chat
			Thread.sleep(2000);

			// close windows file upload
			Robot r1 = new Robot();
			r1.keyPress(KeyEvent.VK_ESCAPE);
			r1.keyRelease(KeyEvent.VK_ESCAPE);

		} catch (Exception e) {
			System.out.println(e);
		}
	}// Verify the send picture and video icon in chat can be used it or not

	@Ignore
	@Test
	// (TC_20) Click Chat Name and View the Shop Details
	public void viewshopdetails() {
		try {
			// create drive
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();

			// open and maximize browser
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			driver.manage().window().maximize();

			// navigate to Shopee website
			driver.get("https://shopee.com.my/");
			JavascriptExecutor execute = (JavascriptExecutor) driver;

			// choose language
			WebElement language = driver.findElement(By.xpath("//div[@id=\"modal\"]/div/div/div/div[3]/div/button"));
			execute.executeScript("arguments[0].click();", language);

			// close pop up
			driver.findElement(By.xpath("//html")).click();

			driver.findElement(
					By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div/div[1]/div/ul/a[3]"))
					.click();

			// click on login with qr
			WebElement qr = driver
					.findElement(By.xpath("//div[@id=\"main\"]/div/div[2]/div/div/form/div/div[1]/div/div[2]/a"));
			execute.executeScript("arguments[0].click();", qr);
			Thread.sleep(5000);

			String currentUrl = driver.getCurrentUrl();
			String newUrl;
			do {
				newUrl = driver.getCurrentUrl();
				Thread.sleep(5);
			} while (newUrl.contentEquals(currentUrl));

			driver.findElement(By.xpath("//*[@id=\"shopee-mini-chat-embedded\"]/div")).click(); // click chat button

			driver.findElement(By.xpath(
					"//*[@id=\"shopee-mini-chat-embedded\"]/div[1]/div[2]/div[2]/div[3]/div/div/div/div[1]/div/div/div/div[2]/div[1]/div"))
					.click(); // click chat name available in the chat
			Thread.sleep(2000);

			driver.findElement(
					By.xpath("//*[@id=\"shopee-mini-chat-embedded\"]/div[1]/div[2]/div[1]/div[1]/div/div/div/div/div"))
					.click(); // select option from drop down
			Thread.sleep(2000);

			driver.findElement(By.xpath("/html/body/div[7]/div/div/div/div[2]/div[1]")).click(); // click on view
																									// profile
			Thread.sleep(2000);

		} catch (Exception e) {
			System.out.println(e);
		}
	}// Click view profile in the chat and view the shop details

}// (TC_11-TC_20) Cart and Chat
