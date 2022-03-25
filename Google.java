import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Google {
    public static void main(String[] arg) {
        String actualResult = "education";
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mosta\\OneDrive\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://play.google.com/store/apps ");

String ExpectedResult = "Education";
       WebElement a= driver.findElement(By.xpath("//*[@id=\"action-dropdown-parent-Categories\"]"));

        a.click();



       WebElement edu= driver.findElement(By.xpath("//*[@id=\"action-dropdown-children-Categories\"]/div/ul/li[1]/ul/li[11]/a"));
       edu.click();
       WebElement compare = driver.findElement(By.xpath("//*[@id=\"action-dropdown-parent-Education\"]/span[1]"));
        Assert.assertEquals(actualResult, compare);







    }
}
