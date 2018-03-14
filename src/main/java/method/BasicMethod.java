package method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Created by nanjia on 2016/3/10.
 *
 */
public class BasicMethod {
    protected WebDriver driver;
    //构造方法,方法名和类名相同
    public BasicMethod(WebDriver driver) {
        this.driver = driver;
    }


    private boolean waitToDisplayed(WebDriver driver, final By key) {
        boolean waitDisplayed = new WebDriverWait(driver, 10).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.findElement(key).isDisplayed();
            }
        });
        return waitDisplayed;
    }

    protected WebElement findElement(WebDriver driver, By key) {
        WebElement element = null;
        if (this.waitToDisplayed(driver, key)) {
            element = driver.findElement(key);
        }
        return element;
    }

    protected List<WebElement> findElements(WebDriver driver, By key) {
        List<WebElement> element = null;
        if (this.waitToDisplayed(driver, key)) {
            element = driver.findElements(key);
        }
        return element;
    }
}
