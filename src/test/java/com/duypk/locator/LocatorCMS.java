package com.duypk.locator;

import com.duypk.common.BaseTest;

public class LocatorCMS {

    public static String cmsURL = "https://cms.anhtester.com/login";

    //Login Page
    public static String loginHeader = "//h1[normalize-space()='Welcome to Active eCommerce CMS']";
    public static String loginInputEmail = "//input[@id='email']";
    public static String loginInputPassword = "//input[@id='password']";
    public static String loginRememberCheckbox = "//span[@class='aiz-square-check']";
    public static String loginRememberCheckboxText = "//span[normalize-space()='Remember Me']";
    public static String loginForgotPasswordButton = "//a[normalize-space()='Forgot password ?']";
    public static String loginLoginButton = "//button[normalize-space()='Login']";

    //Main Page
    public static String mainSearchButton = "//input[@id='menu-search']";
    public static String mainMenuProducts = "//span[normalize-space()='Products']";
    public static String mainMenuAddNewProduct = "//span[normalize-space()='Add New Product']";
    public static String mainMenuAllProducts = "//span[normalize-space()='All products']";
    public static String mainMenuDigitalProducts = "//span[normalize-space()='Digital Products']";
    public static String mainMenuCategory = "//span[normalize-space()='Category']";
    public static String mainMenuProductReview = "//span[normalize-space()='Product Reviews']";
    public static String mainMenuUploadFiles = "//span[normalize-space()='Uploaded Files']";
    public static String mainMenuCustomers = "//span[normalize-space()='Customers']";
    public static String mainMenuCustomerList = "//span[normalize-space()='Customer list']";
    public static String mainPageButton = "//img[@alt='Active eCommerce CMS']";

    //Category Page
    public static String categoryHeader = "//h1[normalize-space()='All categories']";
    public static String categoryAddNewcategory = "//span[normalize-space()='Add New category']";
    public static String categorySearchButton = "//div[@class='card']//input[@id='search']";
    public static String categoryFirstSearchItem = "//td[@class='footable-first-visible']";

    //Add New Category Page
    public static String addNewCategoryHeader = "//h5[normalize-space()='Category Information']";
    public static String addNewCategoryInputName = "//input[@id='name']";
    public static String addNewCategoryParentDropdown = "//label[normalize-space()='Parent Category']/following-sibling::div//button[@type='button']";
    public static String addNewCategoryParentSearch = "//div[@class='dropdown-menu show']//input[@aria-label='Search']";
    public static String addNewCategoryOrderingNumber = "//input[@id='order_level']";
    public static String addNewCategoryTypeDropdown = "//label[normalize-space()='Type']/following-sibling::div//button[@type='button']";
    public static String addNewCategoryTypePhysical = "//span[normalize-space()='Physical']";
    public static String addNewCategoryTypeDigital = "//span[normalize-space()='Digital']";
    public static String addNewCategoryBanner = "//div[@class='card-body']//form//label[contains(.,'Banner')]/following-sibling::div//div[normalize-space()='Choose File']";
        //Banner Popup
        public static String bannerPopupSearch = "//div[@id='aiz-select-file']//input[@type='text']";
        public static String bannerPopupSearchItem = "//div[@class='card-file-thumb']";
        public static String bannerPopupAddFiles = "//button[normalize-space()='Add Files']";
    public static String addNewCategoryIcon = "//div[@class='card-body']//form//label[contains(.,'Icon')]/following-sibling::div//div[normalize-space()='Choose File']";
        //Icon Popup
        public static String iconPopupSearch = "//div[@id='aiz-select-file']//input[@type='text']";
        public static String iconPopupSearchItem = "//div[@class='card-file-thumb']";
        public static String iconPopupAddFiles = "//button[normalize-space()='Add Files']";
    public static String addNewCategoryMetaTitle = "//input[@name='meta_title']";
    public static String addNewCategoryMetaDescription = "//textarea[@name='meta_description']";
    public static String addNewCategoryFilteringAttributesDropdown = "//label[normalize-space()='Filtering Attributes']/following-sibling::div//button";
    public static String addNewCategoryFilteringAttributesDropdownSearch ="//label[normalize-space()='Filtering Attributes']/following-sibling::div//input[@type='search']";
    public static String addNewCategorySaveButton = "//div[@class='card']//button[normalize-space()='Save']";

    //Add New Product
    public static String addNewProductHeader = "//h5[normalize-space()='Add New Product']";
    public static String addNewProductProductName = "//input[@placeholder='Product Name']";
    public static String addNewProductCategoryDropdown = "//div[@id='category']//button[@data-id='category_id']";
    public static String addNewProductCategorySearch = "//div[@id='category']//input[@type='search']";
    public static String addNewProductBrandDropdown = "//div[@id='brand']//button[@data-id='brand_id']";
    public static String addNewProductBrandSearch = "//div[@id='brand']//input[@type='search']";
    public static String addNewProductUnit = "//input[@placeholder='Unit (e.g. KG, Pc etc)']";
    public static String addNewProductWeight = "//label[contains(text(),'Weight')]/following-sibling::div//input[@type='number']";
    public static String addNewProductMinimumPerchase = "//label[contains(text(),'Minimum Purchase Qty')]/following-sibling::div//input[@type='number']";
    public static String addNewProductTags = "//label[contains(text(),'Tags')]/following-sibling::div//tags";
    public static String addNewProductGalleryImages = "//label[contains(text(),'Gallery Images')]/following-sibling::div//div[@data-type='image']";
        //GalleryImages Popup
        public static String GalleryImagesPopupSearch = "//div[@id='aiz-select-file']//input[@type='text']";
        public static String GalleryImagesPopupSearchItem = "//div[@class='card-file-thumb']";
        public static String GalleryImagesPopupAddFiles = "//button[normalize-space()='Add Files']";

    public static String addNewProductThumbnailImages = "//label[contains(text(),'Thumbnail Image ')]/following-sibling::div//div[@data-type='image']";
        //GalleryImages Popup
        public static String ThumbnailImagesPopupSearch = "//div[@id='aiz-select-file']//input[@type='text']";
        public static String ThumbnailImagesPopupSearchItem = "//div[@class='card-file-thumb']";
        public static String ThumbnailImagesPopupAddFiles = "//button[normalize-space()='Add Files']";

    public static String addNewProductVideoProvider = "//label[normalize-space()='Video Provider']/following-sibling::div//button[@type='button']";
        //VideoProviderOption
        public static String videoProviderOptionYoutube = "//a[@id='bs-select-3-0']";
        public static String videoProviderOptionDailymotion = "//a[@id='bs-select-3-0']";
        public static String videoProviderOptionVimeo = "//a[@id='bs-select-3-0']";

    public static String addNewProductVideoLink = "//label[normalize-space()='Video Link']/following-sibling::div//input[@type='text']";
    public static String addNewProductColorActive = "//div[@class='col-md-1']//span";
    public static String addNewProductColorsDropdown = "//button[contains(@data-id,'colors')]";
    public static String addNewProductColorsSearch = "//div[@class='dropdown-menu show']//input[@aria-label='Search']";
    public static String addNewProductAttributesDropdown = "//button[contains(@data-id,'choice_attributes')]";
    public static String addNewProductAttributesSearch = "//div[@class='dropdown-menu show']//input[@aria-label='Search']";
        //SelectedAttributes
        public static String selectedAttributesSize = "//input[@value='Size']/parent::div/following-sibling::div";
        public static String selectedAttributesFabric = "//input[@value='Fabric']/parent::div/following-sibling::div";

    public static String addNewProductUnitPrice = "//input[@placeholder='Unit price']";
    public static String addNewProductDiscountDate = "//input[@placeholder='Select Date']";
    public static String addNewProductDiscountValue = "//input[@placeholder='Discount']";
    public static String addNewProductDiscountUnit = "//input[@placeholder='Discount']/parent::div/following-sibling::div//button";
        //DiscountUnit Option
        public static String discountUnitFlat = "//a[@id='bs-select-6-0']";
        public static String discountUnitPercent = "//a[@id='bs-select-6-1']";

    public static String addNewProductQuantity = "//input[@placeholder='Quantity']";
    public static String addNewProductSKU = "//input[@placeholder='SKU']";
    public static String addNewProductExternalLink = "//input[@placeholder='External link']";
    public static String addNewProductExternalLinkButtonText = "//input[@placeholder='External link button text']";
    public static String addNewProductDescription = "//div[@class='note-editing-area']";
    public static String addNewProductPDFSpecification = "//label[normalize-space()='PDF Specification']/following-sibling::div";
        //PDFSpecification Popup
        public static String PDFSpecificationPopupSearch = "//div[@id='aiz-select-file']//input[@type='text']";
        public static String PDFSpecificationPopupSearchItem = "//div[@class='card-file-thumb']";
        public static String PDFSpecificationPopupAddFiles = "//button[normalize-space()='Add Files']";

    public static String addNewProductMetaTitle = "//input[@placeholder='Meta Title']";
    public static String addNewProductMeteDescription = "//textarea[@name='meta_description']";
    public static String addNewProductMetaImage = "//label[normalize-space()='Meta Image']/following-sibling::div";
        //MetaImage Popup
        public static String MetaImagePopupSearch = "//div[@id='aiz-select-file']//input[@type='text']";
        public static String MetaImagePopupSearchItem = "//div[@class='card-file-thumb']";
        public static String MetaImagePopupAddFiles = "//button[normalize-space()='Add Files']";

    public static String addNewProductSaveUnpublish = "//button[normalize-space()='Save & Unpublish']";
    public static String addNewProductSavePublish = "//button[normalize-space()='Save & Publish']";

}
