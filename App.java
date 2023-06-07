import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\selenium project\\Automation\\src\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        Thread.sleep(1000);
        driver.quit();
    }
    public void visitShareBus() {
        WebDriver driver;
        // Visit the given URL
        driver.get("https://test.sharebus.co/");
    }

    public void navigateToLoginPage() {
        By driver;
        // Find and click the "Sign in" button
        WebElement signInButton = driver.findElement((SearchContext) By.linkText("Sign in"));
        signInButton.click();
    }

    public void login(String email, String password) {
        By driver;
        // Find the email and password fields and enter the provided credentials
        WebElement emailField = driver.findElement((SearchContext) By.id("email"));
        emailField.sendKeys(email);

        WebElement passwordField = driver.findElement((SearchContext) By.id("password"));
        passwordField.sendKeys(password);

        // Find and click the login button
        WebElement loginButton = driver.findElement((SearchContext) By.xpath("//button[contains(text(),'Login')]"));
        loginButton.click();
    }

    public void selectUser(String user) {
        By driver;
        // Find and click the user dropdown menu
        WebElement userDropdown = driver.findElement((SearchContext) By.xpath("//div[@class='dropdown toggle_dropdown']"));
        userDropdown.click();

        // Find and select the specified user from the options
        WebElement userOption = driver.findElement((SearchContext) By.xpath("//a[contains(text(),'" + user + "')]"));
        userOption.click();
    }

    public void clickSetUpShareBus() {
        By driver;
        // Find and click the "Set Up a ShareBus" button
        WebElement setUpShareBusButton = driver.findElement((SearchContext) By.xpath("//button[contains(text(),'Set Up a ShareBus')]"));
        setUpShareBusButton.click();
    }

    public void insertTripDetails(String from, String to) {
        By driver;
        // Find the "From" and "To" fields and enter the provided location addresses
        WebElement fromField = driver.findElement((SearchContext) By.id("from"));
        fromField.sendKeys(from);

        WebElement toField = driver.findElement((SearchContext) By.id("to"));
        toField.sendKeys(to);

        // Find and click the "Continue" button
        WebElement continueButton = driver.findElement((SearchContext) By.xpath("//button[contains(text(),'Continue')]"));
        continueButton.click();
    }

    public void clickMembershipYes() {
        By driver;
        // Find and click the "Yes" button on the membership page
        WebElement yesButton = driver.findElement((SearchContext) By.xpath("//button[contains(text(),'Yes')]"));
        yesButton.click();
    }

    public void selectClub(String club) {
        By driver;
        // Find and select the specified club from the options
        WebElement clubOption = driver.findElement(By.xpath("//select[@id='club']//option[text()='" + club + "']"));
        clubOption.click();
    }

    public void clickMembershipContinue() {
        By driver;
        // Find and click the "Continue" button on the membership page
        WebElement continueButton = driver.findElement(By.xpath("//button[contains(text(),'Continue')]"));
        continueButton.click();
    }

    public void clickNoForTicket() {
        By driver;
        // Find and click the "No" button for needing a ticket
        WebElement noButton = driver.findElement((SearchContext) By.xpath("//button[contains(text(),'No')]"));
        noButton.click();
    }

    public void clickNoForTicketDiscounts() {
        By driver;
        // Find and click the "No" button for activating ticket discounts
        WebElement noButton = driver.findElement((SearchContext) By.xpath("//button[contains(text(),'No')]"));
        noButton.click();
    }

    public void clickCreateShareBus() {
        By driver;
        // Find and click the "Create ShareBus" button
        WebElement createShareBusButton = driver.findElement((SearchContext) By.xpath("//button[contains(text(),'Create ShareBus')]"));
        createShareBusButton.click();
    }

    public void clickPublish() {
        By driver;
        // Find and click the "Publish" button
        WebElement publishButton = driver.findElement((SearchContext) By.xpath("//button[contains(text(),'Publish')]"));
        publishButton.click();
    }

    public void insertDataOnRequiredFields() {
        // Insert data on the required fields for the trip
        // You can write code here to find and interact with the necessary elements
    }

    public void clickReviewAndPublish() {
        By driver;
        // Find and click the "Review and publish" button
        WebElement reviewPublishButton = driver.findElement((SearchContext) By.xpath("//button[contains(text(),'Review and publish')]"));
        reviewPublishButton.click();
    }

    public void clickMyBuses() {
        By driver;
        // Find and click the "My Busses" link in the navbar
        WebElement myBusesLink = driver.findElement((SearchContext) By.xpath("//a[contains(text(),'My Busses')]"));
        myBusesLink.click();
    }

    public boolean isNewTripDisplayed() {
        // Check if the new trip is displayed on the "My Busses" page
        // You can write code here to find and verify the presence of the new trip element
        return true; // Placeholder value, update accordingly
    }

    public static void main(String[] args) {
        App app = new App();
        app.visitShareBus();
        app.navigateToLoginPage();
        app.login("brainstation23@yopmail.com", "Pass@1234");
        app.selectUser("Sharelead");
        app.clickSetUpShareBus();
        app.insertTripDetails("Oslo, Norway", "Kolbotn, Norway");
        app.clickMembershipYes();
        app.selectClub("NTNUI");
        app.clickMembershipContinue();
        app.clickNoForTicket();
        app.clickNoForTicketDiscounts();
        app.clickCreateShareBus();
        app.clickPublish();
        app.insertDataOnRequiredFields();
        app.clickReviewAndPublish();
        app.clickPublish();
        app.clickMyBuses();

        boolean isTripDisplayed = app.isNewTripDisplayed();
        if (isTripDisplayed) {
            System.out.println("New Trip is displayed on the My Busses page.");
        } else {
            System.out.println("New Trip is not displayed on the My Busses page.");
        }
    }
}