package page.element;

import org.openqa.selenium.By;

/**
 * Created by nanjia on 2016/3/10.
 * 登录退出操作，页面元素层
 */
public class LoginPageElement {
    //用户名输入框
    public static By USER_NAME_INPUT_BOX = By.cssSelector("input[type='text']");
    //密码输入框
    public static By USER_PASSWORD_INPUT_BOX = By.cssSelector("input[type='password']");
    //登录平台按钮
    public static By LOGIN_BUTTON = By.cssSelector("input[type='submit']");
    //同一账号重复登录，操作提示确认框，确定按钮
    public static By LOGIN_CONFIRM_BUTTON = By.xpath("//div[2]/div/div[3]/button[2]");
    //同一账号重复登录，操作提示确认框，取消按钮
    public static By LOGIN_CANCEL_BUTTON = By.xpath("//div[2]/div/div[3]/button[1]");
    //登录失败的提示信息
    public static By LOGIN_ERROR_MESSAGE = By.cssSelector("form div div.de-login-error");
    //用户头像图标按钮
    public static By LOGOUT_PHOTO_IMG = By.cssSelector("li a img.nav-user-photo");
    //获取下拉列表的li (个人设置、系统退出）
    public static By GET_LIST = By.cssSelector("ul.nav.navbar-nav.navbar-right ul li");
    //系统退出 （注：下面这句是用xpath直接定位“系统退出”选项
    //public static By SYSTEM_LOGOUT = By.xpath("//nav/div/ul/li[1]/ul/li[3]/a");
}
