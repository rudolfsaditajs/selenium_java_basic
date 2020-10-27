package selenium.sample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Sample2Task {
    WebDriver driver;

    // method which is being run before each test
    @Before
    public void startingTests() throws Exception {
        // from Sample 1:
        String libWithDriversLocation = System.getProperty("user.dir") + "\\lib\\";
        System.setProperty("webdriver.chrome.driver", libWithDriversLocation + "chromedriver.exe");
        // declaration above:
        driver = new ChromeDriver();

        //open page:
        driver.get("https://kristinek.github.io/site/examples/locators");
    }

    // method which is being run after each test
    @After
    public void endingTests() throws Exception {
        driver.quit();
    }

    @Test
    public void findElementByID() throws Exception {
        System.out.println(driver.findElement(By.id("heading_2")).getText());
//         TODO:
//         get text "Heading 2 text" using id

    }

    @Test
    public void findElementByName() throws Exception {
//         TODO:
        System.out.println(driver.findElement(By.name("randomButton2")).getAttribute("value"));
        System.out.println(driver.findElement(By.name("randomButton2")).getAttribute("id"));
//         get attribute "id" and "value" of button "This is also a button" using name
    }

    @Test
    public void findElementByClassFirst() throws Exception {
//         TODO:
//         get first text of class "test" (should be "Test Text 1")
        System.out.println(driver.findElement(By.className("text")).get(0).getText());
    }
    @Test
    public void findElementByClassAll() throws Exception {
//         TODO:
        System.out.println(driver.findElements(By.id("test")).size());
//         get size text of class "test" (should be 5)
//         get text of class "test"
        Iterable<? extends WebElement> allElementsWithClass;
        for (WebElement elementWithClass : allElementsWithClass) {
            System.out.println(elementWithClass.getText());
           
        }
//         get third text of class "test" (should be "Test Text 4")
        System.out.println(driver.findElement(By.className("text")).get(3).getText());

    }

}
