package element.operation;

import method.BasicMethod;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import page.element.LoginPageElement;

/**
 * Created by nanjia on 2016/3/10.
 * 登录退出功能，操作层
 */
public class LoginElementOperation extends BasicMethod{
    public LoginElementOperation(WebDriver driver){
        super(driver);
    }
    /**
     * 封装登录退出操作，涉及到用户名和密码输入
     *
     * @param username 用户名
     * @param password 密码
     */
    //輸入用戶名和密碼
    public void loginInputBox(String username ,String password){
        this.findElement(driver,LoginPageElement.USER_NAME_INPUT_BOX).clear();
        this.findElement(driver,LoginPageElement.USER_NAME_INPUT_BOX).sendKeys(username);
        this.findElement(driver,LoginPageElement.USER_PASSWORD_INPUT_BOX).clear();
        this.findElement(driver,LoginPageElement.USER_PASSWORD_INPUT_BOX).sendKeys(password);
    }
    //鼠标点击登录平台按钮
    public void loginButtonClick(){
        this.findElement(driver,LoginPageElement.LOGIN_BUTTON).click();
    }
    //按Enter键，触发登录平台按钮
    public void loginButtonEnter(){
        this.findElement(driver,LoginPageElement.LOGIN_BUTTON).sendKeys(Keys.ENTER);
    }
    //判断是否有弹出是否继续登录的操作提示框，如果有，点击确定按钮
    public void loginConfirmButton(){
        try {
            this.findElement(driver, LoginPageElement.LOGIN_CONFIRM_BUTTON).click();
            System.out.println("该账户已登录，确定继续登录");
        }catch (Exception e){
            return;
        }
    }
    //点击用户头像图标
    public void logoutPhotoImg(){
        this.findElement(driver,LoginPageElement.LOGOUT_PHOTO_IMG).click();
    }
    //选择系统退出
    public void selectSystemLogout(){
        this.findElements(driver,LoginPageElement.GET_LIST).get(2).click();
        //this.findElement(driver,LoginPageElement.SYSTEM_LOGOUT).click();
    }
    //选择个人设置
    public void selectPersonalSet(){
        this.findElements(driver, LoginPageElement.GET_LIST).get(0).click();
    }
    //
    public void loginErrorMessage(){
        System.out.println(this.findElement(driver, LoginPageElement.LOGIN_ERROR_MESSAGE).getText());
    }








}
