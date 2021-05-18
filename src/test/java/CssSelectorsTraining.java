import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelectorsTraining {

    @Test

    public void selectorTraining() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.pl");

        By selector1 = By.cssSelector("#L2AGLb > div");
        driver.findElement(selector1);

        By selector2 = By.cssSelector(".gb_Hd");
        driver.findElement(selector2);

        By selector3 = By.cssSelector("#hplogo");
        driver.findElement(selector3);

        By selector4 = By.cssSelector("body");
        driver.findElement(selector4);


    }
}
