import org.jspecify.annotations.Nullable;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.time.Duration;



// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();



            driver.get("https://www.facebook.com/");

            WebDriver newtab = driver.switchTo().newWindow(WindowType.TAB);

            newtab.get("https://www.facebook.com/help/568137493302217");

            WebDriverWait wait = new WebDriverWait(newtab, Duration.ofSeconds(10));


            String original = driver.getWindowHandle();
            String otratab = newtab.getWindowHandle();

            Thread.sleep(10000);

            driver.switchTo().window(original);
        } catch (InterruptedException e){
            throw new RuntimeException(e);

        }
    }

}
