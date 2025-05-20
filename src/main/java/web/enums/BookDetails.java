package web.enums;

public enum BookDetails {
	//* book details
    BOOK_NAME("BookName"),PREMIUM_EDITION("Premium"),BASIC_EDITION("Basic"),
    BOOK_PREMIUM_PRICE("PremiumPrice"),BOOK_BASIC_PRICE("BasicPrice"),
    BOOK_WISHLISTED("Wishlisted"),BOOK_CARTED("Carted"),
    BOOK_PAGENO("BookPage"), BOOK_UPGRADE("BookUpgrade") , BOOK_UPGRADE_AMOUNT("BookUpgradeAmount"),
    BOOK_DESC("BookDesc") , BOOK_GRADE("BookGrade") , BOOK_SUBJECT("BookSubject"),

    //* book reader
    PAGES("Pages"),RESOURCES("Resources"),MY_ACTIVITIES("My Activities"),TOOLS("Tools"),

    //* coupon types
    LOCKED("Locked"), UNLOCKED("Unlocked"),AVAILABLE("Available"),OPEN("Open"),

    //* ways to earn navcoins

    REDEEM_ACCESS_CODE("RedeemAccessCode"), SEVEN_DAYS_STREAK("7DaysStreak"),UPGRADE_TO_PREMIUM("UpgradeToPremium"),
    COMPLETE_READING_BOOK("CompleteReadingBook"),VIEW_1_RESOURCES("ViewResource"),BUY_PREMIUM("BuyPremium"),BUY_BASIC("BuyBasic"),
    VIEW_ALL_RESOURCES("ViewAllResource") , MY_WALLET("MyWallet"), EARN_NAVCOINS("EarnNavCoins"),
    SPEND_NAVCOINS("SpendNavCoins"),MY_REWARDS("MyRewards"),TRANSACTIONS_HISTORY("TransactionHistory"),

    //* Books Data
    PDF_Book("ATBook"), EPUB_Book("Mathematics-D [I] - X") , VALID_SEARCH("Preface"), INVALID_SEARCH("qwerty");

    //* variable
    private String bookData ;

    BookDetails(String bookData) {
        this.bookData = bookData;
    }
    public String getBookDataValue(){return bookData;}
}
