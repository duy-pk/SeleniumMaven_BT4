package com.duypk.addCategory;

import com.duypk.common.BaseTest;
import com.duypk.locator.LocatorCMS;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAddCategory extends BaseTest {

    @Test
    public static void testAddCategory() {

        //Kiem tra dang nhap thanh cong
        Assert.assertTrue(driver.findElement(By.xpath(LocatorCMS.mainMenuProducts)).isDisplayed(),
                "Dang nhap KHONG thanh cong");

        //Chon den Category
        driver.findElement(By.xpath(LocatorCMS.mainMenuProducts)).click();
        driver.findElement(By.xpath(LocatorCMS.mainMenuCategory)).click();
        Assert.assertTrue(driver.findElement(By.xpath(LocatorCMS.categoryHeader)).isDisplayed(),
                "KHONG thay trang Category");

        //Chon den Add new Category
        driver.findElement(By.xpath(LocatorCMS.categoryAddNewcategory)).click();
        Assert.assertTrue(driver.findElement(By.xpath(LocatorCMS.addNewCategoryHeader)).isDisplayed(),
                "KHONG thay trang AddNewCategory");

        //Nhap thong tin new Category
        driver.findElement(By.xpath(LocatorCMS.addNewCategoryInputName)).sendKeys(categoryName);
        driver.findElement(By.xpath(LocatorCMS.addNewCategoryParentDropdown)).click();
        driver.findElement(By.xpath(LocatorCMS.addNewCategoryParentSearch)).sendKeys("Cake");
        driver.findElement(By.xpath(LocatorCMS.addNewCategoryParentSearch)).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath(LocatorCMS.addNewCategoryOrderingNumber)).sendKeys("9999");

        //Chon Image cho Banner
        driver.findElement((By.xpath(LocatorCMS.addNewCategoryBanner))).click();
        driver.findElement(By.xpath(LocatorCMS.bannerPopupSearch)).sendKeys("setBanhtrungthu1");
        driver.findElement(By.xpath(LocatorCMS.bannerPopupSearch)).sendKeys(Keys.ENTER);
        sleep(3);
        driver.findElement(By.xpath(LocatorCMS.bannerPopupSearchItem)).click();
        sleep(1);
        driver.findElement(By.xpath(LocatorCMS.bannerPopupAddFiles)).click();
        sleep(1);

        //Chon Image cho Icon
        driver.findElement((By.xpath(LocatorCMS.addNewCategoryIcon))).click();
        driver.findElement(By.xpath(LocatorCMS.iconPopupSearch)).sendKeys("setBanhtrungthu2");
        driver.findElement(By.xpath(LocatorCMS.iconPopupSearch)).sendKeys(Keys.ENTER);
        sleep(3);
        driver.findElement(By.xpath(LocatorCMS.iconPopupSearchItem)).click();
        sleep(1);
        driver.findElement(By.xpath(LocatorCMS.iconPopupAddFiles)).click();
        sleep(1);

        driver.findElement(By.xpath(LocatorCMS.addNewCategoryMetaTitle)).sendKeys("Banh Kinh Do");
        driver.findElement(By.xpath(LocatorCMS.addNewCategoryMetaDescription)).sendKeys("Banh ngon cho gia dinh than yeu");
        driver.findElement(By.xpath(LocatorCMS.addNewCategoryFilteringAttributesDropdown)).click();
        driver.findElement(By.xpath(LocatorCMS.addNewCategoryFilteringAttributesDropdownSearch)).sendKeys("Size");
        driver.findElement(By.xpath(LocatorCMS.addNewCategoryFilteringAttributesDropdownSearch)).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath(LocatorCMS.addNewCategoryFilteringAttributesDropdown)).click();
        driver.findElement(By.xpath(LocatorCMS.addNewCategorySaveButton)).click();
        sleep(1);

        //Quay lai search trong trang Category
        Assert.assertTrue(driver.findElement(By.xpath(LocatorCMS.categoryHeader)).isDisplayed(),
                "KHONG thay trang Category");
        driver.findElement(By.xpath(LocatorCMS.categorySearchButton)).sendKeys(categoryName);
        driver.findElement(By.xpath(LocatorCMS.categorySearchButton)).sendKeys(Keys.ENTER);
        String itemName = driver.findElement(By.xpath(LocatorCMS.categoryFirstSearchItem)).getText();

        //Kiem tra gia tri item vua add
        Assert.assertEquals(itemName,categoryName,"Add Category failed");
    }
}
