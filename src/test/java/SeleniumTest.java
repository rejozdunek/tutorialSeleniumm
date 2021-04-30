import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class SeleniumTest {

    @Test
    public void openGooglePage(){
        WebDriver driver = getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        //przechodzimy do okna z plikami cookie
        driver.switchTo().frame(0);
        // znalezienie przycisku
        WebElement agreeButton = driver.findElement(By.xpath("//span[contains(text(),'Zgadzam')]"));
        //klikniecie przycisku
        agreeButton.click();

    }
    public WebDriver getDriver(String browser) {
        switch (browser) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver","C:\\Users\\rejoz\\Downloads\\chromedriver_win32\\chromedriver.exe");
                return new ChromeDriver();
            case "firefox":
                System.setProperty("webserver.gecko.driver","C:\\Users\\rejoz\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
                return new FirefoxDriver();
            case "explorer":
                System.setProperty("webdriver.ie.driver","C:\\Users\\rejoz\\Downloads\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
                return new InternetExplorerDriver();
            default:
                throw new IllegalArgumentException("Invalid browser name");

        }

    }

}
