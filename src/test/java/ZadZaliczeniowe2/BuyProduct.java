package ZadZaliczeniowe2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class BuyProduct {

    private WebDriver driver;
    private String CodersTestFormUrl = "https://prod-kurs.coderslab.pl/index.php";

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.get(this.CodersTestFormUrl);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void BuyProduct() throws InterruptedException, IOException {

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

        WebElement signIn = driver.findElement(By.xpath("//*[@id=\"submit-login\"]"));
        signIn.click();

        String product = "Hummingbird Printed Sweater";
        WebElement searchInCatalogField = this.driver.findElement(By.xpath("//*[@id=\"search_widget\"]/form/input[2]"));
        if (searchInCatalogField.isEnabled()) {
            searchInCatalogField.clear();
            searchInCatalogField.sendKeys(new CharSequence[]{product});

        } else {
            Assert.fail();
        }
        WebElement searchProductButton = driver.findElement(By.xpath("//*[@id=\"search_widget\"]/form/button"));
        searchProductButton.click();

        WebElement productChoice = driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article[1]/div/div[1]/h2/a"));
        productChoice.click();

        WebElement sizeSelectElement = this.driver.findElement(By.id("group_1"));
        Select roleDropDown = new Select(sizeSelectElement);
        roleDropDown.selectByVisibleText("M");

        WebElement quantityInput = this.driver.findElement(By.id("quantity_wanted"));
        quantityInput.click();
        sleep(1000);
        quantityInput.clear();
        quantityInput.sendKeys("5");

        WebElement addToCartButton = this.driver.findElement(By.xpath("/html/body/main/section/div/div/section/div[1]/div[2]/div[2]/div[2]/form/div[2]/div/div[2]/button"));
        addToCartButton.click();

        sleep(1000);
        WebElement proceedToCheckoutButton = this.driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a"));
        proceedToCheckoutButton.click();

        WebElement proceedToCheckoutButton2 = this.driver.findElement(By.xpath("/html/body/main/section/div/div/section/div/div[2]/div[1]/div[2]/div/a"));
        proceedToCheckoutButton2.click();

        WebElement continueAddressButton = this.driver.findElement(By.xpath("/html/body/section/div/section/div/div[1]/section[2]/div/div/form/div[2]/button"));
        continueAddressButton.click();

        WebElement shippingMethodInput = this.driver.findElement(By.id("delivery_option_1"));
        if (shippingMethodInput.isSelected()) {
            WebElement continueShippingMethodButton = this.driver.findElement(By.xpath("//*[@id=\"js-delivery\"]/button"));
            continueShippingMethodButton.click();
        } else {
            Assert.fail();
        }

        WebElement paymentInput = this.driver.findElement(By.id("payment-option-1"));
        paymentInput.click();

        WebElement conditionsToApproveCheckbox = this.driver.findElement(By.id("conditions_to_approve[terms-and-conditions]"));
        conditionsToApproveCheckbox.click();

        WebElement obligationToPayButton = this.driver.findElement(By.xpath("/html/body/section/div/section/div/div[1]/section[4]/div/div[3]/div[1]/button"));
        obligationToPayButton.click();

        String url = "https://prod-kurs.coderslab.pl/index.php?controller=order-confirmation&id_cart=51173&id_module=11&id_order=5488&key=8c01f0ee8b4f69e15afe0b04791dfc52";
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        Screenshot s = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
        ImageIO.write(s.getImage(), "PNG", new File("C:\\Users\\Kamil\\Pictures\\orderConfirmation.png"));
        driver.quit();
    }

    @After
    public void tearDown() {
    }
}