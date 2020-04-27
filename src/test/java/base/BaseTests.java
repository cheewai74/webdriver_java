package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

import java.util.List;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        //driver.get("https://the-internet.herokuapp.com/");
        goHome();
        homePage = new HomePage(driver);
        //driver.manage().window().maximize();
       // driver.manage().window().fullscreen();

       // List<WebElement> links = driver.findElements(By.tagName("a"));
       // System.out.println(links.size());

        //driver.manage().window().setSize(new Dimension(375, 812));
       // System.out.println(driver.getTitle());

      //  WebElement inputsLink =  driver.findElement(By.linkText("Inputs"));
      //  inputsLink.click();

    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
