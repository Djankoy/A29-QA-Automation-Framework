import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTests {

    @Test
    public static void LoginValidEmailValidPasswordTest ()  {
        WebDriver driver = new ChromeDriver();
        try {

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            String url = "https://bbb.testpro.io/";
            driver.get(url);

            WebElement emailField = driver.findElement(By.cssSelector("[type='email']"));
            emailField.click();
            emailField.sendKeys("dem@class.com");

            WebElement passwordField = driver.findElement(By.cssSelector("[type='password']"));
            passwordField.click();
            passwordField.sendKeys("te$t$tudent");

            WebElement submitButton = driver.findElement(By.cssSelector("[type='submit']"));
            submitButton.click();

            WebElement avatarIcon = driver.findElement(By.cssSelector("[alt='Avatar of student']"));
            Assert.assertTrue(avatarIcon.isDisplayed());
        }
        finally {
            driver.quit();
        }
    }

    @Test
    public static void LoginInvalidEmailPasswordTest () {
        WebDriver driver = new ChromeDriver();
        try {

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            String url = "https://bbb.testpro.io/";
            driver.get(url);

            WebElement emailField = driver.findElement(By.cssSelector("[type='email']"));
            emailField.click();
            emailField.sendKeys("dem@class.com");

            WebElement passwordField = driver.findElement(By.cssSelector("[type='password']"));
            passwordField.click();
            passwordField.sendKeys("te$t$tudent");

            WebElement submitButton = driver.findElement(By.cssSelector("[type='submit']"));
            submitButton.click();

            WebElement avatarIcon = driver.findElement(By.cssSelector("[alt='Avatar of student']"));
            Assert.assertTrue(avatarIcon.isDisplayed());
        }
        finally {
            driver.quit();
        }
    }

    @Test
    public static void LoginValidEmailEmptyPasswordTest () {
        WebDriver driver = new ChromeDriver();
        try {

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            String url = "https://bbb.testpro.io/";
            driver.get(url);

            WebElement emailField = driver.findElement(By.cssSelector("[type='email']"));
            emailField.click();
            emailField.sendKeys("dem@class.com");

            WebElement passwordField = driver.findElement(By.cssSelector("[type='password']"));
            passwordField.click();

            WebElement submitButton = driver.findElement(By.cssSelector("[type='submit']"));
            submitButton.click();

            WebElement avatarIcon = driver.findElement(By.cssSelector("[alt='Avatar of student']"));
            Assert.assertTrue(avatarIcon.isDisplayed());
        }
        finally {
            driver.quit();
        }
    }

    @Test
    public static void SwitchToSongsMenu () throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        try {

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            String url = "https://bbb.testpro.io/";
            driver.get(url);
            By emailSelector = By.cssSelector("[type='email']");
            WebElement emailField = driver.findElement(emailSelector);
            WebElement passwordField = driver.findElement(By.cssSelector("[type='password']"));
            WebElement submitButton = driver.findElement(By.cssSelector("[type='submit']"));
            By avatarSelector = By.cssSelector("[alt='Avatar of student']");
            By songMenuSelector = By.className("songs");
            By allButtonSelector = By.className("btn-shuffle-all");

            emailField.click();
            emailField.sendKeys("demo@class.com");
            passwordField.click();
            passwordField.sendKeys("te$t$tudent");
            submitButton.click();
            Assert.assertTrue(driver.findElement(avatarSelector).isDisplayed());
            // WebElement songsMenu = driver.findElement(By.className("songs"));
            // WebElement songsMenu = driver.findElement(songMenuSelector);
            driver.findElement(songMenuSelector).click();
            Assert.assertTrue(driver.findElement(allButtonSelector).isDisplayed());
            Thread.sleep(2000);


        }
        finally {
            driver.quit();
        }
    }

    @Test
    public static void SearchSong () throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        try {

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            String url = "https://bbb.testpro.io/";
            driver.get(url);
            By emailSelector = By.cssSelector("[type='email']");
            WebElement emailField = driver.findElement(emailSelector);
            WebElement passwordField = driver.findElement(By.cssSelector("[type='password']"));
            WebElement submitButton = driver.findElement(By.cssSelector("[type='submit']"));
            By avatarSelector = By.cssSelector("[alt='Avatar of student']");
            By searchBarSelector = By.id("searchForm");
            By allButtonSelector = By.className("btn-shuffle-all");

            emailField.click();
            emailField.sendKeys("demo@class.com");
            passwordField.click();
            passwordField.sendKeys("te$t$tudent");
            submitButton.click();
            Assert.assertTrue(driver.findElement(avatarSelector).isDisplayed());
            // WebElement songsMenu = driver.findElement(By.className("songs"));
            // WebElement songsMenu = driver.findElement(songMenuSelector);
            driver.findElement(searchBarSelector).click();
            driver.findElement(searchBarSelector).sendKeys("Veggie Straws");
            //Assert.assertTrue(driver.findElement().isDisplayed());
            Thread.sleep(5000);


        }
        finally {
            driver.quit();
        }
    }
}
