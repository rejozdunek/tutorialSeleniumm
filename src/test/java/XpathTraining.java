import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class XpathTraining {

    @Test
    public void XpathTrainings() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.pl");
        //driver.switchTo().frame(1);
        //Thread.sleep(1000);
        WebElement agreeButton = driver.findElement(By.xpath("//div[contains(text(),'Zgadzam się')]"));
        agreeButton.click();
        //driver.switchTo().defaultContent();

        By firstElement = By.xpath("//button[@id='vc3jof']"); // znajduje przycisk o danej wartości id
        driver.findElement(firstElement);

        By secondElement = By.xpath("//img/preceding::*");  // znajduje wszystkie elementy występujące przed obrazkiem
        driver.findElement(secondElement);

        By thirdElement = By.xpath("//a[@class='pHiOh']");
        driver.findElement(thirdElement);

        By fourthElement = By.xpath("//div[contains(@id,'j')]");
        driver.findElement(fourthElement);









    }
}
