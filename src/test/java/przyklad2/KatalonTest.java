package przyklad2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class KatalonTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        // Uruchom nowy egzemplarz przeglądarki Chrome
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();

        // Zmaksymalizuj okno przeglądarki
        driver.manage().window().maximize();
        // Przejdź do Google
        driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");
    }

    @Test
    public void testGoogleSearch() {
        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement firstNameInput = driver.findElement(By.id("first-name"));
        // Wyczyść teskst zapisany w elemencie
        firstNameInput.clear();

        // Wpisz informacje do wyszukania
        firstNameInput.sendKeys("Karol");

        WebElement roleSelectElement = driver.findElement(By.id("role"));
        Select roleDropDown = new Select(roleSelectElement);
        roleDropDown.selectByVisibleText("QA");

        // Prześlij formularz
        //element.submit();
    }

    @After
    public void tearDown() throws Exception {
        // Zamknij przeglądarkę
        //driver.quit();
    }
}
