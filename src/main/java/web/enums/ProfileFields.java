package web.enums;

public enum ProfileFields {

	//* Profile Fields
    USER_NAME("UserName"), FIRST_NAME("FirstName"), LAST_NAME("LastName"),FULL_NAME("FullName"), EMAIL("Email"),  
    PHONE_NUMBER("PhoneNumber"), STATE("State"), CITY("City"), BOARD("Board"), MEDIUM("Medium"), GRADE("Grade"), SCHOOL_NAME("SchoolName"),
    
    //* Home Page Features
    HOME("home"),LOGOUT("Logout"), PROFILE("Profile"),REDEEM_ACCESS_CODE("RedeemAccessCode"),
    MY_BOOKS("MyBooks"),MY_ORDERS("MyOrders"),MY_WISHLIST("MyWishlist"), MY_CART("MyCart"), MY_WALLET("myWallet"),
    CONTACT_US("ContactUs"), NOTIFICATION_SETTINGS("NotificationSettings"), CHANGE_LANGUAGE("ChangeLanguage"),DELETE("delete");

    private String profileFieldName;

    ProfileFields(String profileFieldName) {
        this.profileFieldName = profileFieldName;
    }
    public String getProfileFieldName(){return profileFieldName ;}
}
