package test.automation.school.tasks;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;


public class LocatorsTest {

    private WebDriver driver;

    @BeforeClass
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "../drivers/chromedriver-v2.39-win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void locateElementByIdTest() throws Exception {
        //TODO 1 - locate search input field by ID and assign to a variable named elementById
        WebElement elementById = driver.findElement(By.id("search_query_top"));
        Assert.assertTrue(elementById.isDisplayed());
        //TODO 1
    }


    @Test
    public void locateElementByClassNameTest() throws Exception {
        //TODO 2 - locate *all* (also that are not visible on the screen) products by class name and put them into ArrayList Collection and check that elements list size is 14
        List<WebElement> allElements = driver.findElements(By.className("product-container"));
        Assert.assertTrue(allElements.size() == 14);

    }

    @Test
    public void locateElementByTagNameTest() throws Exception {
        //TODO 3 - locate all images by tag name and put them into ArrayList Collection

        List<WebElement> imagesByTagName = driver.findElements(By.tagName("img"));
        Assert.assertTrue(imagesByTagName.get(0).isDisplayed());
        Assert.assertTrue(imagesByTagName.get(1).isDisplayed());
        //.....

    }


    @Test
    public void locateElementByNameTest() throws Exception {
        //TODO 4 - locate newsletter subscription input element by name
        WebElement newSubscription = driver.findElement(By.name("email"));
        Assert.assertTrue(newSubscription.isDisplayed());

    }


    @Test
    public void locateElementByLinkTextTest() throws Exception {
        //TODO 5 - locate "T-Shirts" element by link text
        // NOTE - linkText() is case sensitive and should be selected as it is rendered on the screen, not in HTML
        WebElement linkText = driver.findElement(By.linkText("T-SHIRTS"));
        Assert.assertTrue(linkText.isDisplayed());
        //TODO 5
    }


    @Test
    public void locateElementByCssSelectorTest() throws Exception {
        //TODO 6 - locate only *visible* products element by CSS and put them into ArrayList Collection and check that elements list size is 7

        //TODO 6
        List<WebElement> vibibleProducts = driver.findElements(By.cssSelector("#homefeatured .ajax_block_product"));
        Assert.assertTrue(vibibleProducts.size() == 7);

    }

    @Test
    public void locateElementByXpathTest() throws Exception {
        //TODO 7 - locate only *visible* products element by XPATH and put them into ArrayList Collection and check that elements list size is 7
        //NOTE - you have to indicate all class names that are specified on the current element
        // This is contrary to CSS Selector where you can specify just one of the class names
        // TIP - use 'contains()'

        //TODO 7
      //  List<WebElement> visibleProductsByXpath = driver.findElements(By.ByXPath("//*[id="));
        //Assert.assertTrue(visibleProductsByXpath.size() == 7);


    }
}