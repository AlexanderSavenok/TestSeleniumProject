import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Alexandor on 23.07.2015.
 */
public class OnlinerTest {

    @Test
    public void OneTest() {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.onliner.by");
        WebElement element = driver.findElement(By.cssSelector("#weather-informer > a > i"));
        element.click();
        String title = driver.getTitle();
        driver.close();
    }
}
