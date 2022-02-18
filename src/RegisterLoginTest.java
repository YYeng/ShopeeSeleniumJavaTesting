import java.io.File;
import java.time.Duration;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.junit.Assert;

public class RegisterLoginTest {

//TC31 - Verify alert messages for insert empty value in field phone number
	@Ignore
	@Test
	public void registerInsertEmptyPhone() {
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

			// maximize the browser window
			driver.manage().window().maximize();

			// close choose pop up messages
			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div[3]/div[1]/button\r\n")).click();

			Thread.sleep(2000);

			driver.findElement(By.xpath("//html")).click();

			Thread.sleep(2000);

			// click sign up
			driver.findElement(
					By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div/div[1]/div/ul/a[2]"))
					.click();

			Thread.sleep(2000);

			driver.findElement(By.name("phone")).click();
			driver.findElement(By.name("phone")).sendKeys(" ");

			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/form/div/div[2]/button")).click();

			Thread.sleep(2000);

			// identify error messages element
			WebElement actualMsg = driver
					.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/form/div/div[2]/div[2]/div[2]"));
			String act = actualMsg.getText();

			// verify error message with Assertion
			Assert.assertTrue(act.contains("Invalid Phone"));
			System.out.println("Test emtpy value on sign up completed");

		} catch (Exception e) {
			System.out.println(e);
		}

	}// end registerInsertEmptyPhone method

//TC32 - Verify alert messages for insert invalid phone number 
	@Ignore
	@Test
	public void registerInsertInvalidPhone() {
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

			// maximize the browser window
			driver.manage().window().maximize();

			// close choose language pop up messages
			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div[3]/div[1]/button\r\n")).click();

			Thread.sleep(2000);

			driver.findElement(By.xpath("//html")).click();

			Thread.sleep(2000);

			// click sign up
			driver.findElement(
					By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div/div[1]/div/ul/a[2]"))
					.click();

			Thread.sleep(2000);

			driver.findElement(By.name("phone")).click();
			driver.findElement(By.name("phone")).sendKeys("0123");

			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/form/div/div[2]/button")).click();

			Thread.sleep(2000);

			// identify error messages element
			WebElement actualMsg = driver
					.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/form/div/div[2]/div[2]/div[2]"));
			String act = actualMsg.getText();

			// verify error message with Assertion
			Assert.assertTrue(act.contains("Invalid Phone"));
			System.out.println("Test invalid phone on sign up completed");

		} catch (Exception e) {
			System.out.println(e);
		}

	}// end registerInsertInvalidPhone method

//TC33 - Verify "next" button are enable
	@Ignore
	@Test
	public void registerInsertValidPhone() {
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

			// maximize the browser window
			driver.manage().window().maximize();

			// close choose language pop up messages
			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div[3]/div[1]/button\r\n")).click();

			Thread.sleep(2000);

			driver.findElement(By.xpath("//html")).click();

			Thread.sleep(2000);

			// click sign up
			driver.findElement(
					By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div/div[1]/div/ul/a[2]"))
					.click();

			Thread.sleep(2000);

			driver.findElement(By.name("phone")).click();
			driver.findElement(By.name("phone")).sendKeys("0123456789");

			Thread.sleep(2000);

			// identify "Next" button
			WebElement e = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/form/div/div[2]/button"));
			boolean act = e.isEnabled();

			if (act)
				System.out.println("Next button is enabled");
			else
				System.out.println("Next button is disabled");

			Thread.sleep(2000);

		} catch (Exception e) {
			System.out.println(e);
		}

	}

//TC34- Verify messages display for incompleted puzzle
	@Ignore
	@Test
	public void registerVerifyIncompletePuzzle() {
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

			// maximize the browser window
			driver.manage().window().maximize();

			// close choose language pop up messages
			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div[3]/div[1]/button\r\n")).click();

			Thread.sleep(2000);

			driver.findElement(By.xpath("//html")).click();

			Thread.sleep(2000);

			// click sign up on eduit page
			driver.findElement(
					By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div/div[1]/div/ul/a[2]"))
					.click();

			driver.findElement(By.name("phone")).click();
			driver.findElement(By.name("phone")).sendKeys("0123456789");

			Thread.sleep(2000);

			// click "Next" button
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/form/div/div[2]/button")).click();

			Thread.sleep(2000);

			// element slider
			WebElement slider = driver
					.findElement(By.xpath("/html/body/div[2]/aside/div[1]/div/div/div[2]/div[2]/div[3]"));

			Actions actions = new Actions(driver);
			actions.dragAndDropBy(slider, 100, 50).perform();
			slider.click();

			// identify error messages element
			WebElement actualMsg = driver
					.findElement(By.xpath("/html/body/div[2]/aside/div[1]/div/div/div[2]/div[2]/div[1]"));
			String act = actualMsg.getText();

			// print actual error messages
			System.out.println(act);

			// verify error message with Assertion
			Assert.assertTrue(act.contains("Please try again"));
			System.out.println("Test incompleted puzzle completed");

		} catch (Exception e) {
			System.out.println(e);
		}

	}

//TC35- Verify Refresh image puzzle
	@Ignore
	@Test
	public void registerVerifyRefreshImagePuzzle() {
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

			// maximize the browser window
			driver.manage().window().maximize();

			// close choose language pop up messages
			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div[3]/div[1]/button\r\n")).click();

			Thread.sleep(2000);

			// close second pop up
			driver.findElement(By.xpath("//html")).click();

			Thread.sleep(2000);

			// click sign up
			driver.findElement(
					By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div/div[1]/div/ul/a[2]"))
					.click();

			driver.findElement(By.name("phone")).click();
			driver.findElement(By.name("phone")).sendKeys("0123456789");

			Thread.sleep(2000);

			// click "Next" button
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/form/div/div[2]/button")).click();

			Thread.sleep(2000);

			for (int i = 0; i < 3; i++) {
				// get the image before refresh
				WebElement img1 = driver.findElement(By.className("_16yFku"));
				String oriImg = img1.getAttribute("src");

				// click refresh image button
				driver.findElement(By.xpath("/html/body/div[2]/aside/div[1]/div/div/button")).click();
				Thread.sleep(2000);

				// get the image after refresh
				WebElement img2 = driver.findElement(By.className("_16yFku"));
				String refreshImg = img2.getAttribute("src");

				if (oriImg != refreshImg) {
					System.out.println("Test refresh puzzle successfully");
				}
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

//TC36-Login to system
	@Ignore
	@Test
	public void login() {
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

			// maximize the browser window
			driver.manage().window().maximize();

			// close choose language pop up messages
			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div[3]/div[1]/button\r\n")).click();

			Thread.sleep(2000);

			driver.findElement(By.xpath("//html")).click();

			Thread.sleep(2000);

			// click login on eduit page
			driver.findElement(
					By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div/div[1]/div/ul/a[3]"))
					.click();

			// enter phone number
			// remember replace *** with your phone number
			driver.findElement(By.name("loginKey")).click();
			driver.findElement(By.name("loginKey")).sendKeys("***");

			Thread.sleep(1500);

			// enter password
			// remember replace *** with your password
			driver.findElement(By.name("password")).click();
			driver.findElement(By.name("password")).sendKeys("***");


			Thread.sleep(1500);

			// click "Login" button
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/form/div/div[2]/button")).click();

			// security check - verify user account
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[1]/div/div[2]/div/button"))
					.click();

			// click send SMS button
			driver.findElement(By.xpath("/html/body/div[2]/aside/div[1]/div/div[2]/button[1]")).click();

			Thread.sleep(2000);
			System.out.println("Login Successfully");

		} catch (Exception e) {
			System.out.println(e);
		}

	}// end login

//TC37 - insert wrong phone number
	@Ignore
	@Test
	public void loginWithWrongPhoneNumb() {
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

			// maximize the browser window
			driver.manage().window().maximize();

			// close choose language pop up messages
			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div[3]/div[1]/button\r\n")).click();

			Thread.sleep(2000);

			driver.findElement(By.xpath("//html")).click();

			Thread.sleep(2000);

			// click login on eduit page
			driver.findElement(
					By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div/div[1]/div/ul/a[3]"))
					.click();

			// enter wrong phone number
			// remember replace with your phone number
			driver.findElement(By.name("loginKey")).click();
			driver.findElement(By.name("loginKey")).sendKeys("012345678");

			// enter password

			driver.findElement(By.name("password")).click();
			driver.findElement(By.name("password")).sendKeys("Password1");

			Thread.sleep(1500);

			// click "Login" button
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/form/div/div[2]/button")).click();

			Thread.sleep(2000);

			// identify error messages element
			WebElement actualMsg = driver
					.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/form/div/div[2]/div[1]/div[2]/div"));
			String act = actualMsg.getText();

			// verify error message with Assertion
			Assert.assertTrue(act.contains("Your account and/or password is incorrect, please try again"));
			System.out.println("Test wrong phone number completed");

		} catch (Exception e) {
			System.out.println(e);
		}

	}// end loginWithWrongPhoneNumb

//TC38 - verify alert messages in login page
	@Ignore
	@Test
	public void loginWithEmptyValueInsert() {
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

			// maximize the browser window
			driver.manage().window().maximize();

			// close choose language pop up messages
			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div[3]/div[1]/button\r\n")).click();

			Thread.sleep(2000);

			driver.findElement(By.xpath("//html")).click();

			Thread.sleep(2000);

			// click login
			driver.findElement(
					By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div/div[1]/div/ul/a[3]"))
					.click();

			// enter empty space in phone number
			driver.findElement(By.name("loginKey")).click();
			driver.findElement(By.name("loginKey")).sendKeys(" ");

			// enter empty space password
			driver.findElement(By.name("password")).click();
			driver.findElement(By.name("password")).sendKeys(" ");

			Thread.sleep(2000);

			// identify error messages element phone
			WebElement actualMsgPhone = driver
					.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/form/div/div[2]/div[2]/div[2]"));
			String actPhone = actualMsgPhone.getText();

			// identify error messages element password
			WebElement actualMsgPwd = driver
					.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/form/div/div[2]/div[3]/div[2]"));
			String actPwd = actualMsgPwd.getText();

			// verify error message phone with Assertion
			Assert.assertTrue(actPhone.contains("Please enter this field."));
			System.out.println("Test empty value insert in phone completed");

			// verify error message password with Assertion
			Assert.assertTrue(actPwd.contains("Please enter this field."));
			System.out.println("Test empty value insert in password completed");

		} catch (Exception e) {
			System.out.println(e);
		}

	}// end loginWithWrongPassword

//TC39 - invalid email or phone insert 
	@Ignore
	@Test
	public void invalidEmailOrPhoneForgotPwd() {

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

			// maximize the browser window
			driver.manage().window().maximize();

			// close choose language pop up messages
			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div[3]/div[1]/button\r\n")).click();

			Thread.sleep(2000);

			driver.findElement(By.xpath("//html")).click();

			Thread.sleep(2000);

			// click login on eduit page
			driver.findElement(
					By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div/div[1]/div/ul/a[3]"))
					.click();

			// click forgot password
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/form/div/div[2]/div[4]/a[1]")).click();

			Thread.sleep(1500);

			// enter invalid email
			driver.findElement(By.name("emailOrPhone")).click();
			driver.findElement(By.name("emailOrPhone")).sendKeys("1234");

			Thread.sleep(2000);

			driver.findElement(By.name("emailOrPhone")).sendKeys("abcd");

			// identify error messages element in reset password
			WebElement actualMsgPwd = driver
					.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/form/div/div[2]/div[2]/div[2]"));
			String actMsg = actualMsgPwd.getText();

			String[] expectedMsg = { "Invalid Email", "Invalid Phone" };

			for (String exMsg : expectedMsg) {
				if (actMsg.contains(exMsg)) {
					// verify error message with Assertion
					Assert.assertTrue(actMsg.contains(exMsg));
				}
			}

			System.out.println("Test invalid email or phone completed");
			Thread.sleep(1500);

		} catch (Exception e) {
			System.out.println(e);
		}

	}// end invalidEmailForgotPwd

	// TC40 - insert wrong password
//	@Ignore
	@Test
	public void loginWithWrongPassword() {
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

			// maximize the browser window
			driver.manage().window().maximize();

			// close choose language pop up messages
			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div[3]/div[1]/button\r\n")).click();

			Thread.sleep(2000);

			driver.findElement(By.xpath("//html")).click();

			Thread.sleep(2000);

			// click login on eduit page
			driver.findElement(
					By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[2]/div/div[2]/div/div/div[1]/div/ul/a[3]"))
					.click();

			// enter correct phone number
			// remember replace with your phone number
			driver.findElement(By.name("loginKey")).click();
			driver.findElement(By.name("loginKey")).sendKeys("01133407668");

			// enter wrong password
			driver.findElement(By.name("password")).click();
			driver.findElement(By.name("password")).sendKeys("Password1");

			Thread.sleep(2000);

			// click "Login" button
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/form/div/div[2]/button")).click();

			Thread.sleep(2000);

			// identify error messages element
			WebElement actualMsg = driver
					.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/form/div/div[2]/div[1]/div[2]/div"));
			String act = actualMsg.getText();

			// verify error message with Assertion
			Assert.assertTrue(act.contains("Your account and/or password is incorrect, please try again"));
			System.out.println("Test wrong password completed");

		} catch (Exception e) {
			System.out.println(e);
		}

	}// end loginWithWrongPassword

}
