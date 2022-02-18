import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopeeProductDetails {

	// Product image enlarging (TC_21)
	@Ignore
	@Test
	public void productImageEnlarging() {
		try {
			// create driver
			System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver_win32\\\\chromedriver.exe");
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

			// navigate to product page
			driver.navigate().to(
					"https://shopee.com.my/10-pcs-Bundle-Pack-KF94-3D-Fish-Mouth-Face-Mask-Disposable-Earloop-4ply-Mask-(Non-Medical-Mask)-i.130086432.7881734632?sp_atk=de4c56d7-7f07-4b87-834d-cddee9ff08de");
			Thread.sleep(5000);

			// click on product image to enlarge
			WebElement enlarge = driver.findElement(
					By.xpath("//div[@id=\"main\"]/div/div[2]/div/div/div[2]/div/div[2]/div[2]/div/div/div/div[2]/div"));
			execute.executeScript("arguments[0].click();", enlarge);
			Thread.sleep(2000);

			// verify error message
			WebElement img = driver.findElement(By.className("_1RZOE3"));

			// click on next button
			WebElement next1 = driver.findElement(By.xpath("//div[@id=\"modal\"]/div[3]/div[1]/div/div[1]/div[4]"));
			execute.executeScript("arguments[0].click();", next1);
			Thread.sleep(5000);

			// click on next button
			WebElement next2 = driver.findElement(By.xpath("//div[@id=\"modal\"]/div[3]/div[1]/div/div[1]/div[3]"));
			execute.executeScript("arguments[0].click();", next2);
			Thread.sleep(3000);

			// click on next button
			WebElement next3 = driver.findElement(By.xpath("//div[@id=\"modal\"]/div[3]/div[1]/div/div[1]/div[3]"));
			execute.executeScript("arguments[0].click();", next3);
			Thread.sleep(5000);

			// close enlarged picture
			WebElement closepic = driver.findElement(By.xpath("//div[@id=\"modal\"]/div[3]/div[2]"));
			execute.executeScript("arguments[0].click();", closepic);

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// Shipping destination validation option (TC_22)
	@Ignore
	@Test
	public void shippingDestinationValidationOption() {
		try {
			// create driver
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

			// navigate to product page
			driver.navigate().to(
					"https://shopee.com.my/10-pcs-Bundle-Pack-KF94-3D-Fish-Mouth-Face-Mask-Disposable-Earloop-4ply-Mask-(Non-Medical-Mask)-i.130086432.7881734632?sp_atk=de4c56d7-7f07-4b87-834d-cddee9ff08de");
			Thread.sleep(5000);

			// scroll down
			execute.executeScript("window.scrollBy(0,300)");

			// click on destination
			WebElement destination = driver.findElement(By.xpath(
					"//div[@id=\"main\"]/div/div[2]/div/div/div[2]/div/div/div[3]/div/div[4]/div/div/div/div[2]/div[2]/div/div[2]/div/div/div/span"));
			execute.executeScript("arguments[0].click();", destination);
			Thread.sleep(2000);

			// pick state
			WebElement pick1 = driver.findElement(By.xpath(
					"//div[@id=\"main\"]/div/div[2]/div/div/div[2]/div/div/div[3]/div/div[4]/div/div/div/div[2]/div[2]/div/div[2]/div[2]/div/div[2]/ul/li[9]"));
			execute.executeScript("arguments[0].click();", pick1);
			Thread.sleep(2000);

			// pick town
			WebElement pick2 = driver.findElement(By.xpath(
					"//div[@id=\"main\"]/div/div[2]/div/div/div[2]/div/div/div[3]/div/div[4]/div/div/div/div[2]/div[2]/div/div[2]/div[2]/div/div[2]/ul/li[28]"));
			execute.executeScript("arguments[0].click();", pick2);
			Thread.sleep(3000);

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// Product price stated (TC_23)
	@Ignore
	@Test
	public void productPriceStated() {
		try {
			// create driver
			System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver_win32\\\\chromedriver.exe");
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

			// navigate to product page
			driver.navigate().to(
					"https://shopee.com.my/10-pcs-Bundle-Pack-KF94-3D-Fish-Mouth-Face-Mask-Disposable-Earloop-4ply-Mask-(Non-Medical-Mask)-i.130086432.7881734632?sp_atk=de4c56d7-7f07-4b87-834d-cddee9ff08de");
			Thread.sleep(5000);

			// click on product 1 to check price
			WebElement price1 = driver.findElement(By.xpath(
					"//div[@id=\"main\"]/div/div/div/div/div[2]/div/div[2]/div[3]/div/div[4]/div/div[2]/div/div/div/button[3]"));
			execute.executeScript("arguments[0].click();", price1);
			Thread.sleep(3000);

			// verify assert passed
			WebElement product1 = driver.findElement(By.xpath(
					"//div[@id=\"main\"]/div/div[2]/div[1]/div/div[2]/div/div[2]/div[3]/div/div[3]/div/div/div/div/div/div"));
			Assert.assertEquals(true, product1.isDisplayed());
			System.out.println("Assert passed");

			// click on product 2 to check price
			WebElement price2 = driver.findElement(By.xpath(
					"//div[@id=\"main\"]/div/div[2]/div[1]/div/div[2]/div/div[2]/div[3]/div/div[4]/div/div[2]/div/div[1]/div/button[2]"));
			execute.executeScript("arguments[0].click();", price2);
			Thread.sleep(3000);

			// verify assert passed
			WebElement product2 = driver.findElement(By.xpath(
					"//*[@id=\"main\"]/div/div[2]/div[1]/div/div[2]/div/div[2]/div[3]/div/div[3]/div/div/div/div/div/div"));
			Assert.assertEquals(true, product2.isDisplayed());
			System.out.println("Assert passed");

			// click on product 3 to check price
			WebElement price3 = driver.findElement(By.xpath(
					"//div[@id=\"main\"]/div/div[2]/div[1]/div/div[2]/div/div[2]/div[3]/div/div[4]/div/div[2]/div/div[1]/div/button[1]"));
			execute.executeScript("arguments[0].click();", price3);
			Thread.sleep(3000);

			// verify assert passed
			WebElement product3 = driver.findElement(By.xpath(
					"//div[@id=\"main\"]/div/div[2]/div[1]/div/div[2]/div/div[2]/div[3]/div/div[3]/div/div/div/div/div/div"));
			Assert.assertEquals(true, product3.isDisplayed());
			System.out.println("Assert passed");

			System.out.println("Test case completed");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// Seller shop review section (TC_24)
	@Ignore
	@Test
	public void sellerShopReviewSection() {
		try {
			// create driver
			System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver_win32\\\\chromedriver.exe");
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

			// navigate to product page
			driver.navigate().to(
					"https://shopee.com.my/10-pcs-Bundle-Pack-KF94-3D-Fish-Mouth-Face-Mask-Disposable-Earloop-4ply-Mask-(Non-Medical-Mask)-i.130086432.7881734632?sp_atk=de4c56d7-7f07-4b87-834d-cddee9ff08de");
			Thread.sleep(5000);

			// scroll down
			execute.executeScript("window.scrollBy(0,1100)");
			Thread.sleep(3000);
			execute.executeScript("window.scrollBy(0,500)");
			Thread.sleep(3000);

			// click on Ratings
			WebElement ratings = driver.findElement(
					By.xpath("//div[@id=\"main\"]/div/div[2]/div/div/div[2]/div/div[4]/div/div[2]/div/button/span"));
			execute.executeScript("arguments[0].click();", ratings);
			Thread.sleep(5000);

			// verify assert passed
			WebElement shoprating = driver
					.findElement(By.xpath("//div[@id=\"main\"]/div/div[2]/div[2]/div/nav/ul/li[1]/span/span[1]"));
			String page1 = shoprating.getText();
			Assert.assertTrue(page1.contains("Shop Rating"));
			System.out.println("Assert passed");

			// go back to product page
			driver.navigate().back();
			Thread.sleep(5000);

			// click on Products sold
			WebElement products = driver.findElement(
					By.xpath("//div[@id=\"main\"]/div/div[2]/div/div/div[2]/div/div[4]/div/div[2]/div/a/span"));
			execute.executeScript("arguments[0].click();", products);
			Thread.sleep(5000);

			// verify assert passed
			WebElement allproducts = driver.findElement(By.xpath(
					"//div[@id=\"main\"]/div/div[2]/div[2]/div[1]/div[2]/div/div[4]/div[2]/div[1]/div[2]/div[1]"));
			String page2 = allproducts.getText();
			Assert.assertTrue(page2.contains("All Products"));
			System.out.println("Assert passed");

			// go back to product page
			driver.navigate().back();
			Thread.sleep(5000);

			// click on Response rate
			WebElement response = driver.findElement(
					By.xpath("//div[@id=\"main\"]/div/div[2]/div/div/div[2]/div/div[4]/div/div[2]/div[2]/button/span"));
			execute.executeScript("arguments[0].click();", response);
			Thread.sleep(3000);

			// verify assert passed
			WebElement responserate = driver.findElement(By.xpath("/html/body/div[16]/div/div[2]/div/div"));
			Assert.assertEquals(true, responserate.isDisplayed());
			System.out.println("Assert passed");

			// click on OK button
			WebElement okbutton = driver
					.findElement(By.xpath("/html/body/div[16]/div/div[2]/div/div/div[2]/button[2]"));
			execute.executeScript("arguments[0].click();", okbutton);
			Thread.sleep(3000);

			System.out.println("Test case completed");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// Out of stock or in stock (TC_25)
	@Ignore
	@Test
	public void outOfStockOrInStock() {
		try {
			// create driver
			System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver_win32\\\\chromedriver.exe");
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

			// navigate to product page
			driver.navigate().to(
					"https://shopee.com.my/10-pcs-Bundle-Pack-KF94-3D-Fish-Mouth-Face-Mask-Disposable-Earloop-4ply-Mask-(Non-Medical-Mask)-i.130086432.7881734632?sp_atk=de4c56d7-7f07-4b87-834d-cddee9ff08de");
			Thread.sleep(5000);

			// scroll down
			execute.executeScript("window.scrollBy(0,900)");
			Thread.sleep(3000);

			// click on product 1 to check item quantity
			WebElement item1 = driver.findElement(By.xpath(
					"//div[@id=\"main\"]/div/div[2]/div[1]/div/div[2]/div/div[2]/div[3]/div/div[4]/div/div[3]/div/div[1]/div/button[39]"));
			execute.executeScript("arguments[0].click();", item1);
			Thread.sleep(3000);

			// verify assert passed
			WebElement quantity1 = driver.findElement(By.xpath(
					"//div[@id=\"main\"]/div/div[2]/div[1]/div/div[2]/div/div[2]/div[3]/div/div[4]/div/div[3]/div/div[2]/div[2]/div[2]"));
			Assert.assertEquals(true, quantity1.isDisplayed());
			System.out.println("Assert passed");

			// click on product 2 to check item quantity
			WebElement item2 = driver.findElement(By.xpath(
					"//div[@id=\"main\"]/div/div[2]/div[1]/div/div[2]/div/div[2]/div[3]/div/div[4]/div/div[3]/div/div[1]/div/button[40]"));
			execute.executeScript("arguments[0].click();", item2);
			Thread.sleep(3000);

			// verify assert passed
			WebElement quantity2 = driver.findElement(By.xpath(
					"//div[@id=\"main\"]/div/div[2]/div[1]/div/div[2]/div/div[2]/div[3]/div/div[4]/div/div[3]/div/div[2]/div[2]/div[2]"));
			Assert.assertEquals(true, quantity2.isDisplayed());
			System.out.println("Assert passed");

			// click on product 3 to check item quantity
			WebElement item3 = driver.findElement(By.xpath(
					"//div[@id=\"main\"]/div/div[2]/div[1]/div/div[2]/div/div[2]/div[3]/div/div[4]/div/div[3]/div/div[1]/div/button[41]"));
			execute.executeScript("arguments[0].click();", item3);
			Thread.sleep(3000);

			// verify assert passed
			WebElement quantity3 = driver.findElement(By.xpath(
					"//div[@id=\"main\"]/div/div[2]/div[1]/div/div[2]/div/div[2]/div[3]/div/div[4]/div/div[3]/div/div[2]/div[2]/div[2]"));
			Assert.assertEquals(true, quantity3.isDisplayed());
			System.out.println("Assert passed");

			System.out.println("Test case completed");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// Similar product (TC_26)
	@Ignore
	@Test
	public void similarProduct() {
		try {
			// create driver
			System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver_win32\\\\chromedriver.exe");
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

			// navigate to product page
			driver.navigate().to(
					"https://shopee.com.my/10-pcs-Bundle-Pack-KF94-3D-Fish-Mouth-Face-Mask-Disposable-Earloop-4ply-Mask-(Non-Medical-Mask)-i.130086432.7881734632?sp_atk=de4c56d7-7f07-4b87-834d-cddee9ff08de");
			Thread.sleep(5000);

			// scroll down
			execute.executeScript("window.scrollBy(0,2000)");
			Thread.sleep(3000);
			execute.executeScript("window.scrollBy(0,3800)");
			Thread.sleep(3000);

			// click on See All for similar products
			WebElement similar = driver.findElement(By.xpath(
					"//div[@id=\"main\"]/div/div[2]/div[1]/div/div[2]/div/div[4]/div[2]/div[1]/div[4]/div/div[1]/div[1]/a"));
			execute.executeScript("arguments[0].click();", similar);

			// verify test complete
			WebElement similarproduct = driver.findElement(By.xpath("//div[@id=\"main\"]/div/div[2]/div[2]/div[1]/h1"));
			String page = similarproduct.getText();
			Assert.assertTrue(page.contains("Similar Products"));
			System.out.println("Test case completed");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// Breadcrumb navigation (TC_27)
	@Ignore
	@Test
	public void breadcrumbNavigation() {
		try {
			// create driver
			System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver_win32\\\\chromedriver.exe");
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

			// navigate to product page
			driver.navigate().to(
					"https://shopee.com.my/10-pcs-Bundle-Pack-KF94-3D-Fish-Mouth-Face-Mask-Disposable-Earloop-4ply-Mask-(Non-Medical-Mask)-i.130086432.7881734632?sp_atk=de4c56d7-7f07-4b87-834d-cddee9ff08de");
			Thread.sleep(5000);

			// go back to Shopee homepage from breadcrumb navigation
			WebElement breadcrumb = driver
					.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[2]/div/div[1]/a"));
			execute.executeScript("arguments[0].click();", breadcrumb);

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// Shop vouchers (TC_28)
	 @Ignore
	@Test
	public void shopVoucher() {
		try {// create driver
			System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver_win32\\\\chromedriver.exe");
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

			// click on Log In With QR
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

			if (newUrl.equals("https://shopee.com.my/")) {// navigate to product page
				driver.navigate().to(
						"https://shopee.com.my/%E3%80%90New-Style%E3%80%91Scrub-Suit-Uniform-Baju-Scrub-Beauty-Salon-Workwear-Top-Pants-i.422106732.11002326407");
				Thread.sleep(5000);

				// scroll down
				execute.executeScript("window.scrollBy(0,1400)");
				Thread.sleep(2000);

				// click on claim button
				WebElement voucher = driver.findElement(By.xpath(
						"//div[@id=\"main\"]/div/div[2]/div[1]/div/div[2]/div/div[3]/div[3]/div[2]/div[1]/div/div[2]/div[1]/div/div[2]/div/div/button"));
				execute.executeScript("arguments[0].click();", voucher);

				// verify test complete
				WebElement claim = driver.findElement(By.xpath(
						"//div[@id=\"main\"]/div/div[2]/div[1]/div/div[2]/div/div[3]/div[3]/div[2]/div[1]/div/div[2]/div[1]/div/div[2]/div/div/button"));
				String use = claim.getText();
				Assert.assertTrue(use.contains("Use"));
				System.out.println("Test case completed");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// Customer review (TC_29)
	@Ignore
	@Test
	public void customerReview() {
		try {
			// create driver
			System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver_win32\\\\chromedriver.exe");
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

			// navigate to product page
			driver.navigate().to(
					"https://shopee.com.my/%F0%9F%92%96Short-pants-women-A-line-shorts-wide-leg-Sports-Pants-cotton-Women-Shorts-Korean-Style-Gray-Sports-Shorts-Loose-New-Casual-All-Matching-Hot-Pants-Student-Fashion-i.408189642.6088163226?sp_atk=c50db617-78f4-4ae9-a2de-1f477ff25783");
			Thread.sleep(5000);

			// scroll down
			execute.executeScript("window.scrollBy(0,2000)");
			Thread.sleep(3000);
			execute.executeScript("window.scrollBy(0,800)");
			Thread.sleep(3000);

			// click on 5 stars category
			WebElement five = driver.findElement(By.xpath(
					"//div[@id=\"main\"]/div/div[2]/div[1]/div/div[2]/div/div[3]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div[2]"));
			execute.executeScript("arguments[0].click();", five);
			Thread.sleep(5000);

			// click on 4 stars category
			WebElement four = driver.findElement(By.xpath(
					"//div[@id=\"main\"]/div/div[2]/div[1]/div/div[2]/div/div[3]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div[3]"));
			execute.executeScript("arguments[0].click();", four);
			Thread.sleep(5000);

			// click on 3 stars category
			WebElement three = driver.findElement(By.xpath(
					"//div[@id=\"main\"]/div/div[2]/div[1]/div/div[2]/div/div[3]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div[4]"));
			execute.executeScript("arguments[0].click();", three);
			Thread.sleep(5000);

			// click on 2 stars category
			WebElement two = driver.findElement(By.xpath(
					"//div[@id=\"main\"]/div/div[2]/div[1]/div/div[2]/div/div[3]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div[5]"));
			execute.executeScript("arguments[0].click();", two);
			Thread.sleep(5000);

			// click on 1 stars category
			WebElement one = driver.findElement(By.xpath(
					"//div[@id=\"main\"]/div/div[2]/div[1]/div/div[2]/div/div[3]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div[6]"));
			execute.executeScript("arguments[0].click();", one);
			Thread.sleep(5000);

			// click on comment category
			WebElement comment = driver.findElement(By.xpath(
					"//div[@id=\"main\"]/div/div[2]/div[1]/div/div[2]/div/div[3]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div[7]"));
			execute.executeScript("arguments[0].click();", comment);
			Thread.sleep(7000);

			// click on media category
			WebElement media = driver.findElement(By.xpath(
					"//div[@id=\"main\"]/div/div[2]/div[1]/div/div[2]/div/div[3]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div[8]"));
			execute.executeScript("arguments[0].click();", media);

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	// Share and Favorite (TC_30)
	@Ignore
	@Test
	public void shareAndFavourite() {
		try {
			// create driver
			System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver_win32\\\\chromedriver.exe");
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

			// click on Log In With QR
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

			if (newUrl.equals("https://shopee.com.my/")) {// navigate to product page
				driver.navigate().to(
						"https://shopee.com.my/%F0%9F%92%96Short-pants-women-A-line-shorts-wide-leg-Sports-Pants-cotton-Women-Shorts-Korean-Style-Gray-Sports-Shorts-Loose-New-Casual-All-Matching-Hot-Pants-Student-Fashion-i.408189642.6088163226?sp_atk=c50db617-78f4-4ae9-a2de-1f477ff25783");
				Thread.sleep(5000);

				// scroll down
				execute.executeScript("window.scrollBy(0,300)");
				Thread.sleep(3000);

				// click on Facebook icon to share product on
				WebElement share = driver.findElement(By.xpath(
						"//div[@id=\"main\"]/div/div[2]/div[1]/div/div[2]/div/div[2]/div[2]/div[2]/div[1]/button[1]"));
				execute.executeScript("arguments[0].click();", share);
				Thread.sleep(7000);

				// check new window
				List<String> browserTabs = new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(browserTabs.get(1));

				// verify assert passed
				WebElement window = driver.findElement(By.xpath("/html/body/div/div[1]/div/div/h2"));
				String windowmsg = window.getText();
				Assert.assertTrue(windowmsg.contains("Facebook"));
				System.out.println("Assert passed");
				driver.close();
				driver.switchTo().window(browserTabs.get(0));

				// click on favourite button or heart icon
				WebElement favourite = driver.findElement(By.xpath(
						"//div[@id=\"main\"]/div/div[2]/div[1]/div/div[2]/div/div[2]/div[2]/div[2]/div[2]/button"));
				execute.executeScript("arguments[0].click();", favourite);
				boolean fav = favourite.isEnabled();

				// verify assert passed
				if (fav) {
					System.out.println("Assert passed");
					System.out.println("Test case completed");
				} else {
					System.out.println("Assert failed");
				}

			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}// end ShopeeProductDetails
