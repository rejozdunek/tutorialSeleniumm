import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class XpathTest {

    @Test
    public void findElements() {
        WebDriverManager.iedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        //clickOnMe
        By buttonId = By.xpath("//button[@id='clickOnMe']");
        WebElement clickOnMeButton = driver.findElement(buttonId);

        //fname
        By firstName = By.xpath("//input[@name='fname']");
        WebElement firstNameFrame = driver.findElement(firstName);

        //topSecret
        By paraHidden = By.xpath("//p[@class='topSecret']");
        driver.findElement(paraHidden);

        By inputLocator = By.xpath("//input");
        WebElement input = driver.findElement(inputLocator);
        input.sendKeys("Pierwszy");
        List<WebElement> inputs = driver.findElements(inputLocator);
        System.out.println(inputs.size());

        By linkText = By.xpath("//a[text()='Visit W3Schools.com!']");
        WebElement schoolLink = driver.findElement(linkText);

        By partialLink = By.xpath("//a[contains(text(),'Visit')]");
        WebElement schoolPartial = driver.findElement(partialLink);

        By allXpath = By.xpath("//*");
        driver.findElement(allXpath);

        By secondElement = By.xpath("(//input)[2]");
        driver.findElement(secondElement);

        By lastElement = By.xpath("(//input)[last()]");
        driver.findElement(lastElement);

        By elementWithAttribute = By.xpath("//*[@name]");
        driver.findElement(elementWithAttribute);


        By fullPatch = By.xpath("/html/body/div/ul");
        driver.findElement(fullPatch);

        By shortPath = By.xpath("//ul");
        driver.findElement(shortPath);

        By attrEq = By.xpath("//button[@id='clickOnMe']");
        By attrNotEq = By.xpath("//*[@id!='clickOnMe']");
        By attrCont = By.xpath("//*[contains(@name,'ame')]");
        By startsWith = By.xpath("//*[starts-with(@name, 'user')]");
        By endsWith = By.xpath("//*[substring(@name,string-length(@name)-string-length('ame')+1)='ame']");

        driver.findElement(attrEq);
        driver.findElement(attrNotEq);
        driver.findElement(attrCont);
        driver.findElement(startsWith);
        driver.findElement(endsWith);

        By child = By.xpath("//div/child::ul");
        By desc = By.xpath("//div/descendant::ul"); // zstępni idziemy w dół - szukamy dzieci wnuków
        By parent = By.xpath("//div/../..");
        By asc = By.xpath("//div/ancestor::*");    // idziemy do góry - rodzice, dziadkowie
        By foll = By.xpath("//img/following::*");
        By follSib = By.xpath("//img/following-sibling::*");
        By prec = By.xpath("//img/preceding::*");   // elementy wszystkie które występują przed np. obrazkiem
        By precSib = By.xpath("//img/preceding-sibling::*"); // wszystkie elementy, które występują przed tagiem np. obrazkiem jednak na tym samym poziomie w strukturze

        driver.findElement(child);
        driver.findElement(desc);
        driver.findElement(parent);
        driver.findElement(asc);
        driver.findElement(foll);
        driver.findElement(follSib);
        driver.findElement(prec);
        driver.findElement(precSib);

        By divsAndLinks = By.xpath("//a | //div");
        By andOp = By.xpath("//input[@name='fname' and @id='fname']");
        By orOp = By.xpath("//input[@name='fname' or @id='fnam']");

        driver.findElement(divsAndLinks);
        driver.findElement(andOp);
        driver.findElement(orOp);



    }
}
