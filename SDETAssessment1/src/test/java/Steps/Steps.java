package Steps;

import java.util.List;

import org.apache.commons.exec.util.StringUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	WebDriver driver;
	
	@Given("launch the login page")
	public void launch_the_login_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Shanthi_bkp\\CRD_Project\\Study Materials\\ManipalPro\\chromedriver_88\\chromedriver.exe");
		//Start a new instance of Chrome Driver
		driver = new ChromeDriver();
		driver.manage().window().maximize();
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
	/*
	@Given("Logged into the elearn page")
	public void logged_into_the_elearn_page() {
		System.out.println("insdie login success1 method");
//		String expected =driver.findElement(By.xpath("(//*[text()='Shanthi Lakshmanan'])[3]")).getText();
//		String actual="Shanthi Lakshmanan";
//		Assert.assertEquals(expected, actual);
	}
	*/

	@When("Click on the compose link")
	public void click_on_the_compose_link() throws InterruptedException {
		System.out.println("inside compose link method");
		driver.findElement(By.xpath("//*[@id='profileCollapse']/div/ul/li[2]/a")).click();
		Thread.sleep(2000);
	}
	@When("Enter the mail id")
	public void enter_the_mail_id() throws InterruptedException {
		System.out.println("inside enter mail id method");
    	WebElement dd = driver.findElement(By.xpath("//*[@id='compose_message']/fieldset/div[1]/div[1]/span/span[1]/span/ul/li/input"));
    	dd.sendKeys("naveen");
    	Thread.sleep(2000);
    	dd.sendKeys(Keys.ENTER);
    	Thread.sleep(3000);
	}
	@When("Enter the subject")
	public void enter_the_subject() throws InterruptedException {
		System.out.println("inside subject method");
		driver.findElement(By.xpath("//input[@id='compose_message_title']")).sendKeys("Test Mail");
		Thread.sleep(2000);	
	}
	@When("Enter the message content")
	public void enter_the_message_content() throws InterruptedException {
		System.out.println("inside message content method");
		WebElement frm = driver.findElement(By.xpath("//*[@id='cke_1_contents']/iframe"));
		Thread.sleep(2000);
		driver.switchTo().frame(frm);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//html//body[@contenteditable='true']")).sendKeys("Test Message from Shanthi");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);	
	}
	@When("Click on the send button")
	public void click_on_the_send_button() throws InterruptedException {
		System.out.println("inside send method");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='compose_message_compose']")).click();
		Thread.sleep(2000);	
	}
	@Then("Message sent successfully")
	public void message_sent_successfully() throws InterruptedException {
		System.out.println("inside message sent method");
		Thread.sleep(2000);	
		String expected =driver.findElement(By.xpath("//*[@id=\"cm-content\"]/div/div[2]/div/div[contains(text(),'The message has been sent')]")).getText();
		System.out.println(expected);
		String actual="The message has been sent";
		Assert.assertTrue(expected.contains(actual));
//		Assert.assertEquals(expected, actual);
		driver.close();
	}
}
