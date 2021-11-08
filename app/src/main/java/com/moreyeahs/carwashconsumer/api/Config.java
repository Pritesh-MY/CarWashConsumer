package com.moreyeahs.carwashconsumer.api;


public interface Config {
    /**
     * API NAMES
     */
    String LOGIN = "api/Vendor/Signup";
    String GET_OTP = "api/OTP/GetotpVendor";
    String GETOTPFORGETPASSWORD = "/api/OTP/forgotpasswordotp";
    String PUT_NEW_PASSWORD = "api/Vendor/PutVendorPassword";
    String REGISTER_BY_MOBILE = "/api/Account/VendorRegistration";
    String GET_CITY_ID = "api/ZipCode/GetCityByZipcode";
    String VerifyOtp = "/api/OTP/OtpVerificationforVendor";
    String EDIT_ITEM = "api/ItemMasterAssociation/EditVendorItemprice";
    String CHANGE_ORDER_STATUS = "api/OrderMastersNew/UpdateOrderStatus";
    String DISPATCH_ORDER = "api/OrderMastersNew/OrderDispatch";
    String GET_CITY = "/api/City/GetActiveCity";
    String GET_ALL_CATEGORIES = "api/BaseCategory/GetAllBaseCategory";
    String PRODUCT_STATUS = "api/itemMasterNew/UpdateItemStatus";
    String GET_PRODUCT_ITEMS_LIST_FILTER = "api/itemMasterNew/GetItemByCategory";
    String UPDATE_SHOP_DETAILS = "api/Vendor/UpdateShopProfile";
    String ADD_ITEM = "/api/itemMasterNew/AddbyVendor";
    String UPDATE_ITEM = "api/ItemMasterAssociation/EditVendorItem";
    String UPDATE_PROFILE = "api/Vendor/UpdateVendorProfile";
    String UPLOAD_IMAGE = "api/upload/UploadFileAll";
    String UPDATE_BANK_INFO = "api/Vendor/UpdateBankInfo";
    String HOME_STATS = "/api/Vendor/GetVendorHomeData";
    String ITEM_DETAILS = "/api/NewItemRequest/GetItemRequestByVendorID";
    String ORDER_BY_STATUS = "api/OrderMastersNew/GetOrderListByStatusKey";
    String GET_ADDED_ITEMS_CATEGORIES_LIST = "api/Category/getCategoryWithItem";
    String GET_PRODUCT_ITEMS_LIST = "api/ItemMasterAssociation/GetsubcateProductCentralfromPickExistingList";
    String GET_MONTH_LIST = "api/OrderMaster/GetMonthlySalesByVendorID";
    String GET_VENDOR_TYPE = "/api/Vendor/GetEnumbykey";
    String GET_VENDOR_BASE_CATEGORY = "api/BaseCategory/GetBaseCategorybyVen";
    String GET_SUB_CATEGORY = "api/Category/GetCategoryByBasecateId";
    String GETTAXGROUP = "/api/TaxMaster/GetTaxMasterbyVen";
    String GET_TODAY_SALE = "api/OrderMastersNew/getOdrderStatement";
    String SEND_MAIL = "/api/POS/SendEmail";
    String SEND_INVOICE_POS = "api/POS/GetPOSCusOrderBill";
    String GET_ACTIVE_ITEM_BY_ID = "api/itemMasterNew/getItemDetails";
    String GET_VENDOR_STATUS = "api/Vendor/GetVendorstatus";
    String SEARCH_TODAY_ORDER = "api/POS/GetTodaysalesbySearch";
    String GET_SEARCHED_ITEM = "api/ItemMasterAssociation/GetSearchsubcateProductCentralfromPickExistingList";
    String GET_SEARCHED_ITEM_MASTER = "api/ItemMasterAssociation/GetbyVendoridItemV1";
    String GETBANKDETAILS= "/api/Vendor/GetBankdetailsByVendor";
    String GET_TOKEN= "/token";
    String GET_EPAY_MERCHANT_IDS = "/api/Vendor/getMerchantId";
}

