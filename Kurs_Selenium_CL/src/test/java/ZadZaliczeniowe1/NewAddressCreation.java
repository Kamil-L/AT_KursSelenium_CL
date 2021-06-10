package ZadZaliczeniowe1;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class NewAddressCreation {

    private WebDriver driver;
    private String CodersTestFormUrl = "https://prod-kurs.coderslab.pl/index.php";

    @Given("an logged in user on the page https://prod-kurs\\.coderslab\\.pl/index\\.php$")
    public void anLoggedInUserOnThePageHttpsProdKursCoderslabPlIndexPhp() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.get(this.CodersTestFormUrl);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div/a/span"));
        signInButton.click();

        WebElement emailInput = driver.findElement(By.xpath("//*[@id=\"login-form\"]/section/div[1]/div[1]/input"));
        emailInput.click();
        emailInput.clear();
        emailInput.sendKeys("john.does@mail.com");

        WebElement passwordInput = driver.findElement(By.xpath("//*[@id=\"login-form\"]/section/div[2]/div[1]/div/input"));
        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys("johndoes");
        sleep(1000);

        WebElement submitLoginButton = driver.findElement(By.id("submit-login"));
        submitLoginButton.click();

    }

    @When("user info button is clicked")
    public void userInfoButtonIsClicked() {
        WebElement desktopUserInfoButton = driver.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div/a[2]"));
        desktopUserInfoButton.click();

    }

    @And("the field with ADDRESSES is clicked on the customer account view")
    public void theFieldWithADDRESSESIsClickedOnTheCustomerAccountView() {
        WebElement addressesLinkItem = driver.findElement(By.xpath("//*[@id=\"addresses-link\"]"));
        addressesLinkItem.click();

    }

    @And("the address link action Create new address is chosen")
    public void theAddressLinkActionCreateNewAddressIsChosen() {
        WebElement addFirstAddressButton = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/a"));
        addFirstAddressButton.click();
    }

    @And("^the Alias (.*) is entered in input field$")
    public void theAliasAliasIsEnteredInInputField(String alias) {
        WebElement aliasInput = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/section/div[1]/div[1]/input"));
        aliasInput.click();
        aliasInput.clear();
        aliasInput.sendKeys(alias);
    }

    @And("^the Address (.*) is entered in input field$")
    public void theAddressAddressIsEnteredInInputField(String address) {
        WebElement addressInput = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/section/div[6]/div[1]/input"));
        addressInput.click();
        addressInput.clear();
        addressInput.sendKeys(address);

    }

    @And("^the City (.*) is entered in input field$")
    public void theCityCityIsEnteredInInputField(String city) {
        WebElement cityInput = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/section/div[8]/div[1]/input"));
        cityInput.click();
        cityInput.clear();
        cityInput.sendKeys(city);

    }

    @And("^the Postal code (.*) is entered in input field$")
    public void thePostalCodePostalCodeIsEnteredInInputField(String postalCode) {
        WebElement postalCodeInput = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/section/div[9]/div[1]/input"));
        postalCodeInput.click();
        postalCodeInput.clear();
        postalCodeInput.sendKeys(postalCode);

    }

    @And("the Country is chosen in dropdown list")
    public void theCountryCountryIsEnteredInInputField() {
        WebElement CountryInput = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/section/div[10]/div[1]/select"));
        CountryInput.click();
        Select roleDropDown = new Select(CountryInput);
        roleDropDown.selectByVisibleText("United Kingdom");
    }

    @And("^the Phone (.*) is entered in input field$")
    public void thePhonePhoneIsEnteredInInputField(String phone) {
        WebElement phoneCodeInput = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/section/div[11]/div[1]/input"));
        phoneCodeInput.click();
        phoneCodeInput.clear();
        phoneCodeInput.sendKeys(phone);

    }

    @And("the button SAVE is clicked")
    public void theButtonSAVEIsClicked() throws InterruptedException {
        WebElement saveNewAddressButton = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/footer/button"));
        saveNewAddressButton.click();
        sleep(1000);
        String addressCheck = driver.findElement(By.xpath("//*[@id=\"notifications\"]/div/article/ul/li")).getText();
        Assert.assertEquals("Address successfully added!", addressCheck);
    }

    @Then("the new user address is added")
    public void theNewUserAddressIsAdded() {
    }

    @And("close browser")
    public void cLoseBrowser() {
        driver.quit();
    }
}


















