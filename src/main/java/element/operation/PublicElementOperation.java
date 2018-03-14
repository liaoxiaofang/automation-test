package element.operation;

import method.BasicMethod;
import org.openqa.selenium.WebDriver;
import page.element.PublicPageElement;

/**
 * Created by nanjia on 2016/3/16.
 * 公共模块，操作层
 */
public class PublicElementOperation extends BasicMethod {
    public PublicElementOperation (WebDriver driver){
        super(driver);
    }
    //点击应用切换按钮
    public void appSwitchButton(){
        this.findElement(driver, PublicPageElement.APP_SWITCH).click();
    }
    //点击项目规划
    public void projectPlanApp(){
        this.findElements(driver,PublicPageElement.APP_LIST).get(3).click();
    }
    //在按名称搜索框，输入名称后，点击后面的清除按钮X
    public void searchCloseButton(){
        this.findElement(driver, PublicPageElement.CLOSE_BUTTON).click();
    }

}
