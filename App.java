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
        
        driver.get("https://test.sharebus.co/");
    }

    public void navigateToLoginPage() {
        By driver;
       
        WebElement signInButton = driver.findElement((SearchContext) By.linkText("Sign in"));
        signInButton.click();
    }

    public void login(String email, String password) {
        By driver;
        
        WebElement emailField = driver.findElement((SearchContext) By.id("email"));
        emailField.sendKeys(email);

        WebElement passwordField = driver.findElement((SearchContext) By.id("password"));
        passwordField.sendKeys(password);

      
        WebElement loginButton = driver.findElement((SearchContext) By.xpath("//button[contains(text(),'Login')]"));
        loginButton.click();
    }

    public void selectUser(String user) {
        By driver;
       
        WebElement userDropdown = driver.findElement((SearchContext) By.xpath("//div[@class='dropdown toggle_dropdown']"));
        userDropdown.click();

       
        WebElement userOption = driver.findElement((SearchContext) By.xpath("//a[contains(text(),'" + user + "')]"));
        userOption.click();
    }

    public void clickSetUpShareBus() {
        By driver;
       
        WebElement setUpShareBusButton = driver.findElement((SearchContext) By.xpath("//button[contains(text(),'Set Up a ShareBus')]"));
        setUpShareBusButton.click();
    }

    public void insertTripDetails(String from, String to) {
        By driver;
       
        WebElement fromField = driver.findElement((SearchContext) By.id("from"));
        fromField.sendKeys(from);

        WebElement toField = driver.findElement((SearchContext) By.id("to"));
        toField.sendKeys(to);

        
        WebElement continueButton = driver.findElement((SearchContext) By.xpath("//button[contains(text(),'Continue')]"));
        continueButton.click();
    }

    public void clickMembershipYes() {
        By driver;
        
        WebElement yesButton = driver.findElement((SearchContext) By.xpath("//button[contains(text(),'Yes')]"));
        yesButton.click();
    }

    public void selectClub(String club) {
        By driver;
        
        WebElement clubOption = driver.findElement(By.xpath("//select[@id='club']//option[text()='" + club + "']"));
        clubOption.click();
    }

    public void clickMembershipContinue() {
        By driver;
        
        WebElement continueButton = driver.findElement(By.xpath("//button[contains(text(),'Continue')]"));
        continueButton.click();
    }

    public void clickNoForTicket() {
        By driver;
        
        WebElement noButton = driver.findElement((SearchContext) By.xpath("//button[contains(text(),'No')]"));
        noButton.click();
    }

    public void clickNoForTicketDiscounts() {
        By driver;
       
        WebElement noButton = driver.findElement((SearchContext) By.xpath("//button[contains(text(),'No')]"));
        noButton.click();
    }

    public void clickCreateShareBus() {
        By driver;
       
        WebElement createShareBusButton = driver.findElement((SearchContext) By.xpath("//button[contains(text(),'Create ShareBus')]"));
        createShareBusButton.click();
    }

    public void clickPublish() {
        By driver;
       
        WebElement publishButton = driver.findElement((SearchContext) By.xpath("//button[contains(text(),'Publish')]"));
        publishButton.click();
    }

    public void insertDataOnRequiredFields() {
        
    }

    public void clickReviewAndPublish() {
        By driver;
      
        WebElement reviewPublishButton = driver.findElement((SearchContext) By.xpath("//button[contains(text(),'Review and publish')]"));
        reviewPublishButton.click();
    }

    public void clickMyBuses() {
        By driver;
       
        WebElement myBusesLink = driver.findElement((SearchContext) By.xpath("//a[contains(text(),'My Busses')]"));
        myBusesLink.click();
    }

    public boolean isNewTripDisplayed() {
       
        return true;
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
