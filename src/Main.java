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

        // configurar espera explicita
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        driver.get("https://www.facebook.com");

        //WebElement emailCss = driver.findElement(By.cssSelector("input[id='_R_64mkqsr9pb6amH1_']"));
        WebElement emailCss = driver.findElement(By.cssSelector("div>input[id='_R_64mkqsr9pb6amH1_']"));
        emailCss.sendKeys("hola@gmail.com");



    }
}
