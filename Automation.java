import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Automation {
    public static void main(String[] arg) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mosta\\OneDrive\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com/ncr");
        String actualResult = "Selenium WebDriver";
        String ExpectedResult = "Selenium WebDriver";

        WebElement e = driver.findElement(By.xpath("//input[@name='q']"));

        e.sendKeys("Selenium WebDriver");
        e.sendKeys(Keys.ENTER);

        WebElement q = driver.findElement(By.className("wDYxhc"));
        String firstResult = q.getText();
        Assert.assertEquals(actualResult ,ExpectedResult);



        System.out.println(true);
    }
}
