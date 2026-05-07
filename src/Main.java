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
import org.jspecify.annotations.Nullable;
import org.openqa.selenium. *;
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

                Actions actions = new Actions(driver);

                driver.get("https://www.facebook.com");

                WebElement loginButtom = wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//div[@role='button' and @aria-label='Iniciar sesión']"))));

                loginButtom.click();

                WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
                WebElement errorMessage = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[href*='login/identify']")));

                //validar la visibilidad
                System.out.println("Mensaje de error is visible: " + errorMessage.isDisplayed());

                //validar color del mensaje
                String color = errorMessage.getCssValue("color");
                System.out.println("Color del mensaje de error: " + color);

                // validar el tamaño del mensaje
                Dimension size = errorMessage.getSize();
                System.out.println("Ancho del mensaje de error" + size.getWidth());


            }
        }