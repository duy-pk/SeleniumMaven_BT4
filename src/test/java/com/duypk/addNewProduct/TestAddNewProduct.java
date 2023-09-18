package com.duypk.addNewProduct;

import com.duypk.common.BaseTest;
import com.duypk.locator.LocatorCMS;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAddNewProduct extends BaseTest {

    @Test
    public void TestAddNewProduct(){

        //Kiem tra dang nhap thanh cong
        Assert.assertTrue(driver.findElement(By.xpath(LocatorCMS.mainMenuProducts)).isDisplayed(),
                "Dang nhap KHONG thanh cong");

        //chuyen trang add New Product
        clickElement(LocatorCMS.mainMenuProducts);
        clickElement(LocatorCMS.mainMenuAddNewProduct);
        Assert.assertEquals(driver.findElement(By.xpath(LocatorCMS.addNewProductHeader)).getText(),
                "Add New Product","KHONG phai trang add New Product");

        //Nhap thong tin New Product
        //Product Information
        sendKey(LocatorCMS.addNewProductProductName,productName);
        clickElement(LocatorCMS.addNewProductCategoryDropdown);
        sendKey(LocatorCMS.addNewProductCategorySearch,categoryName);
        enter(LocatorCMS.addNewProductCategorySearch);

        clickElement(LocatorCMS.addNewProductBrandDropdown);
        sendKey(LocatorCMS.addNewProductBrandSearch,brand);
        enter(LocatorCMS.addNewProductBrandSearch);

        sendKey(LocatorCMS.addNewProductUnit,unit);
        sendKey(LocatorCMS.addNewProductWeight,weight);
        sendKey(LocatorCMS.addNewProductMinimumPerchase,minimumPerchase);
        sendKey(LocatorCMS.addNewProductTags,tags);

        //Product Images
        clickElement(LocatorCMS.addNewProductGalleryImages);
        sendKey(LocatorCMS.GalleryImagesPopupSearch,galleryImageName);
        enter(LocatorCMS.GalleryImagesPopupSearch);
        sleep(4);
        clickElement(LocatorCMS.GalleryImagesPopupSearchItem);
        clickElement(LocatorCMS.GalleryImagesPopupAddFiles);
        sleep(2);

        clickElement(LocatorCMS.addNewProductThumbnailImages);
        sendKey(LocatorCMS.ThumbnailImagesPopupSearch,thumbnailImageName);
        enter(LocatorCMS.ThumbnailImagesPopupSearch);
        sleep(4);
        clickElement(LocatorCMS.ThumbnailImagesPopupSearchItem);
        clickElement(LocatorCMS.ThumbnailImagesPopupAddFiles);
        sleep(2);

        //Product Videos
        clickElement(LocatorCMS.addNewProductVideoProvider);
        clickElement(LocatorCMS.videoProviderOptionYoutube);
        sendKey(LocatorCMS.addNewProductVideoLink,videoLink);

        //Product Variation
        clickElement(LocatorCMS.addNewProductColorActive);
        clickElement(LocatorCMS.addNewProductColorsDropdown);
        sendKey(LocatorCMS.addNewProductColorsSearch,color1);
        sleep(1);
        enter(LocatorCMS.addNewProductColorsSearch);

        Actions action = new Actions(driver);
        action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
        sleep(1);
        action.keyDown(Keys.DELETE).keyUp(Keys.DELETE).build().perform();
        sleep(1);

        sendKey(LocatorCMS.addNewProductColorsSearch,color2);
        sleep(1);
        enter(LocatorCMS.addNewProductColorsSearch);
        clickElement(LocatorCMS.addNewProductColorsDropdown);
        sleep(1);

        Assert.assertEquals(driver.findElement(By.xpath(LocatorCMS.addNewProductColorsDropdown)).getText(),
                "2 items selected","Lua chon Color KHONG du so luong");

        clickElement(LocatorCMS.addNewProductAttributesDropdown);
        sendKey(LocatorCMS.addNewProductAttributesSearch,attributes);
        enter(LocatorCMS.addNewProductAttributesSearch);
        clickElement(LocatorCMS.addNewProductAttributesDropdown);

        //Product price + stock
        sendKey(LocatorCMS.addNewProductUnitPrice,unitprice);
        sendKey(LocatorCMS.addNewProductDiscountDate,discountDateRange);
        clickElement(LocatorCMS.addNewProductUnitPrice);
        sendKey(LocatorCMS.addNewProductDiscountValue,discount);
        clickElement(LocatorCMS.addNewProductDiscountUnit);
        clickElement(LocatorCMS.discountUnitPercent);


        //Product Description



        //PDF Specification



        //SEO Meta Tags



        clickElement(LocatorCMS.addNewProductSavePublish);
        sleep(2);
    }
}
