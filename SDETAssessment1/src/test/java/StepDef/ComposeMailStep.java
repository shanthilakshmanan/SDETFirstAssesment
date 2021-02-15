package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ComposeMailStep {
		WebDriver driver;
		
		@Given("Logged into the elearn page")
		public void logged_into_the_elearn_page() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Shanthi_bkp\\CRD_Project\\Study Materials\\ManipalPro\\chromedriver_88\\chromedriver.exe");
			//Start a new instance of Chrome Driver
			driver = new ChromeDriver();
			driver.get("http://elearningm1.upskills.in/");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='login']")).sendKeys("shanthi");
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("shanthi");
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//button[@name='submitAuth']")).click();
			Thread.sleep(2000);
		}

		@When("Click on the compose link")
		public void click_on_the_compose_link() throws InterruptedException {
			System.out.println("inside compose link method");
			driver.findElement(By.xpath("//*[@id='profileCollapse']/div/ul/li[2]/a")).click();
			Thread.sleep(2000);
		}
		@When("Enter the mail id")
		public void enter_the_mail_id() throws InterruptedException {
//			Select sendTodd = new Select(driver.findElement(By.xpath("//*[@id='compose_message']/fieldset/div[1]/div[1]/span/span[1]/span/ul/li/input")));
			Select sendTodd = new Select(driver.findElement(By.xpath("//*[@id='compose_message']/fieldset/div[1]/div[1]/span/span[1]/span/ul/li[1]")));
			sendTodd.selectByVisibleText("naveen naveen (naveen)");
			Thread.sleep(2000);			
		}
		@When("Enter the subject")
		public void enter_the_subject() {
			driver.findElement(By.xpath("//input[@id='compose_message_title']")).sendKeys("Test Mail");

		}
		@When("Enter the message content")
		public void enter_the_message_content() {

		}
		@When("Click on the send button")
		public void click_on_the_send_button() {

		}
		@Then("Message sent successfully")
		public void message_sent_successfully() {

		}

}
