package przyklad2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class KatalonTestZad2 {

    private WebDriver driver;
    private String katalonTestFormUrl = "https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html";

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.get(this.katalonTestFormUrl);
    }

    @Test
    public void fillFormWithProperData() {
        String name = "Karol";
        WebElement firstNameInput = this.driver.findElement(By.id("first-name"));
        WebElement firstNameLabel = this.driver.findElement(By.xpath("//label[@for='first-name']"));
        if (firstNameInput.isEnabled()) {
            firstNameInput.clear();
            firstNameInput.sendKeys(new CharSequence[]{name});
            System.out.println(firstNameLabel.getText() + ": " + name);
        } else {
            Assert.fail();
        }

        String lastName = "Kowalski";
        WebElement lastNameInput = this.driver.findElement(By.name("lastName"));
        WebElement lastNameLabel = lastNameInput.findElement(By.xpath("./../../label[@for='last-name']"));
        if (lastNameInput.isDisplayed()) {
            lastNameInput.clear();
            lastNameInput.sendKeys(new CharSequence[]{lastName});
            System.out.println(lastNameLabel.getText() + ": " + lastName);
        } else {
            Assert.fail();
        }
        WebElement genderInput = this.driver.findElement(By.name("gender"));
        WebElement genderLabel = genderInput.findElement(By.xpath("//*[@id=\"infoForm\"]/div[3]/div/div/label[1]/input"));
        genderLabel.click();

        /*WebElement dateOfbirth = driver.findElement(By.xpath("//*[@id=\"dob\"]"));
        dateOfbirth.click();
        WebElement yearLabel = driver.findElement(By.xpath("/html/body/div[2]/div[2]/table/thead/tr[2]/th[2]"));
        yearLabel.click();
*//**
 * Select the year
 *//*
        while (!yearLabel.equals(yearLabel)) {
            driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/thead/tr[2]/th[1])")).click();
            yearLabel = driver.findElement(By.xpath("/html/body/div[2]/div[3]/table/tbody/tr/td/span[2])"));
            System.out.println("The Displayed Year::" + yearLabel);
        }*/

        String address = "Prosta 51";
        WebElement addressInput = this.driver.findElement(By.name("address"));
        WebElement addressLabel = addressInput.findElement(By.xpath("./../../label[@for='address']"));
        if (addressInput.isDisplayed()) {
            addressInput.clear();
            addressInput.sendKeys(new CharSequence[]{address});
            System.out.println(addressLabel.getText() + ": " + address);
        } else {
            Assert.fail();
        }
        String email = "karol.kowalski@mailinator.com";
        WebElement emailInput = this.driver.findElement(By.name("email"));
        WebElement emailLabel = emailInput.findElement(By.xpath("./../../label[@for='email']"));
        if (emailInput.isDisplayed()) {
            emailInput.clear();
            emailInput.sendKeys(new CharSequence[]{email});
            System.out.println(emailLabel.getText() + ": " + email);
        } else {
            Assert.fail();

        }
        String password = "Pass123";
        WebElement passwordInput = this.driver.findElement(By.name("password"));
        WebElement passwordLabel = passwordInput.findElement(By.xpath("./../../label[@for='password']"));
        if (passwordInput.isDisplayed()) {
            passwordInput.clear();
            passwordInput.sendKeys(new CharSequence[]{password});
            System.out.println(passwordLabel.getText() + ": " + password);
        } else {
            Assert.fail();
        }
        String company = "Coders Lab";
        WebElement companyInput = this.driver.findElement(By.name("company"));
        WebElement companyLabel = companyInput.findElement(By.xpath("./../../label[@for='company']"));
        if (companyInput.isDisplayed()) {
            companyInput.clear();
            companyInput.sendKeys(new CharSequence[]{company});
            System.out.println(companyLabel.getText() + ": " + company);
        } else {
            Assert.fail();
        }
        WebElement roleSelectElement = this.driver.findElement(By.id("role"));
        Select roleDropDown = new Select(roleSelectElement);
        roleDropDown.selectByVisibleText("QA");


        WebElement jobExpectationSelectElement = this.driver.findElement(By.id("expectation"));
        Select jobExpectationDropDown = new Select(jobExpectationSelectElement);
        jobExpectationDropDown.selectByVisibleText("Nice manager/leader");

        WebElement waysOfDevelopmentLabel = driver.findElement(By.xpath("//*[@id=\"infoForm\"]/div[11]/div/div[1]/label/input"));
        waysOfDevelopmentLabel.click();

        String comment = "To jest mój pierwszy automat";
        WebElement commentInput = this.driver.findElement(By.name("comment"));
        WebElement commentLabel = commentInput.findElement(By.xpath("./../../label[@for='comment']"));
        if (commentInput.isDisplayed()) {
            commentInput.clear();
            commentInput.sendKeys(new CharSequence[]{comment});
            System.out.println(commentLabel.getText() + ": " + comment);
        } else {
            Assert.fail();
        }
        /*WebElement submitButton = this.driver.findElement(By.id("submit"));
        submitButton.submit();*/

    /*    @After
    public void tearDown() {
    }*/
    }
}