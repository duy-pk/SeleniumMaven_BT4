package com.duypk.common;

import com.duypk.locator.LocatorCMS;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseTest {

    public static WebDriver driver;
    //Cac bien toan cuc chua Data Test
    public static String categoryName = "Banh Trung Thu 2023";
    public static String productName = "Banh Trung Thu Kinh Do";
    public static String brand = "CMS brand 01";
    public static String unit = "kg";
    public static String weight = "2.5";
    public static String minimumPerchase = "1";
    public static String tags = "Banh";
    public static String galleryImageName = "setBanhtrungthu1";
    public static String thumbnailImageName = "setBanhtrungthu2";
    public static String videoLink = "https://www.youtube.com/channel/UCE7WDaotbqTTebyAjnPgPGA";
    public static String color1 = "Cyan";
    public static String color2 = "Black";
    public static String attributes = "Size";
    public static String unitprice = "60000";
    public static String discountDateRange = "15-09-2023 00:00:00 to 22-09-2023 23:59:59";
    public static String discount = "0.25";
    public static String quantity = "10";
    public static String sku = "KNT15729";


    //Khoi tao browser
    @BeforeMethod
    @Parameters({"browserName"})
    public static void createBrowser(@Optional("Chrome") String browser){

        if (browser.equals("Chrome")) {
            driver = new ChromeDriver();
        }
        if (browser.equals("Firefox")) {
            driver = new FirefoxDriver();
        }
        if (browser.equals("Egde")) {
            driver = new EdgeDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //dang nhap tai khoan
        driver.get(LocatorCMS.cmsURL);
        driver.findElement(By.xpath(LocatorCMS.loginInputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorCMS.loginInputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(LocatorCMS.loginLoginButton)).click();
    }

    //Dong browser
    @AfterMethod
    public static void closeBroser(){
        sleep(2);
        driver.quit();
    }

    //Doi cho chu dong
    public static void sleep(double second){
        try {
            Thread.sleep((long) second*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    //Cac ham hanh dong
    public static void clickElement(String locator){
        driver.findElement(By.xpath(locator)).click();
    }

    public static void sendKey(String locator, String text){
        driver.findElement(By.xpath(locator)).sendKeys(text);
    }

    public static void enter(String locator){
        driver.findElement(By.xpath(locator)).sendKeys(Keys.ENTER);
    }

}
