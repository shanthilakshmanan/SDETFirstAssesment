package StepDef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ALoginStep  {
		WebDriver driver;
		
		@Given("launch the login page")
		public void launch_the_login_page() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Shanthi_bkp\\CRD_Project\\Study Materials\\ManipalPro\\chromedriver_88\\chromedriver.exe");
			//Start a new instance of Chrome Driver
			driver = new ChromeDriver();
			driver.get("http://elearningm1.upskills.in/");
			Thread.sleep(3000);

		}

		@When("Enter valid name {string}")
		public void enter_valid_name(String string) throws InterruptedException {
		    driver.findElement(By.xpath("//input[@id='login']")).sendKeys(string);
		    Thread.sleep(3000);
		}
		
		@When("Enter valid pwd {string}")
		public void enter_valid_pwd(String string) throws InterruptedException {
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(string);
		    Thread.sleep(3000);
		}
		
		@When("click on login button")
		public void click_on_login_button() throws InterruptedException {
			driver.findElement(By.xpath("//button[@name='submitAuth']")).click();
			Thread.sleep(2000);
		}
		
		@Then("login success {string}")
		public void login_success(String string) throws InterruptedException {
			Thread.sleep(3000);
			System.out.println("insdie login success method");
			String expected =driver.findElement(By.xpath("(//*[text()='Shanthi Lakshmanan'])[3]")).getText();
			String actual=string;
			Assert.assertEquals(expected, actual);
			Thread.sleep(3000);

		}



}
