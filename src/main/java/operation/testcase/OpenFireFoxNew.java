package operation.testcase;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/**
 * Created by nanjia on 2018/3/29.
 *
 */
public class OpenFireFoxNew {
    public static void main(String[] args) {

        //System.setProperty("webdriver.firefox.marionette", ".\\Tools\\geckodriver.exe");

        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");

        FirefoxDriver driver = new FirefoxDriver();

        driver.get("www.baidu.com");
        driver.manage().window().maximize();

        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)

                .withTimeout(60, TimeUnit.SECONDS)

                .pollingEvery(2, TimeUnit.SECONDS)

                .ignoring(NoSuchElementException.class);

        WebElement ele1 = wait.until(new Function<WebDriver, WebElement>() {

            public WebElement apply(WebDriver driver) {

                return driver.findElement(By.id("xxxxxxx"));

            }

        });
    }
}
