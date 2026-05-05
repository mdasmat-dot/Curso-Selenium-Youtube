import org.jspecify.annotations.Nullable;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
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

        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml5_draganddrop");

        //cambiar al iframe
        driver.switchTo().frame("iframeResult");

        WebElement drag = driver.findElement(By.id("img1"));
        WebElement div1 = driver.findElement(By.id("div1"));

        // Realizar el drag and drop
        Actions actions = new Actions(driver);
        actions.dragAndDrop(drag, div1).perform();



    }

}
