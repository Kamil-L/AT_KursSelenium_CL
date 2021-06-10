/*
package przyklad2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KatalonTestZad3 {

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
        WebElement firstNameInput = driver.findElement(By.id("first-name"));
       if(firstNameInput.isEnabled()) {
           firstNameInput.clear();
           firstNameInput.sendKeys("Karol");
       }
       else {
           Assert.fail();
       }
        WebElement lastNameInput = driver.findElement(By.id("last-name"));
        if(lastNameInput.isEnabled()) {
            lastNameInput.clear();
            lastNameInput.sendKeys("Kowalski");
        }
        else {
            Assert.fail();
        }


        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
       // WebElement firstNameInput = driver.findElement(By.id("first-name"));
        // Wyczyść teskst zapisany w elemencie
        firstNameInput.clear();

        // Wpisz informacje do wyszukania
        firstNameInput.sendKeys("Karol");

        WebElement roleSelectElement = driver.findElement(By.id("role"));
        Select roleDropDown = new Select(roleSelectElement);
        roleDropDown.selectByVisibleText("QA");

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.submit();

        // Prześlij formularz
        //element.submit();
    }

    @After
    public void tearDown() throws Exception {
        // Zamknij przeglądarkę
        //driver.quit();
    }
}*/
