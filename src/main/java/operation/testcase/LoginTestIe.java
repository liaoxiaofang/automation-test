package operation.testcase;

import element.operation.LoginElementOperation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by nanjia on 2018/3/21.
 * 调用IE浏览器
 */
public class LoginTestIe {

    WebDriver driver;
    LoginElementOperation loginElementOperation;
    @BeforeClass
    private void openLoginPage(){
        // 设置系统变量,并设置iedriver的路径为系统属性值
        System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
        // 实例化 InternetExplorerDriver
        driver = new InternetExplorerDriver();
        driver.get("http://192.168.3.162:20380/inno-de-web/#/login");
        driver.manage().window().maximize();
        loginElementOperation = new LoginElementOperation(driver);
    }
    @Test  //1_01_登录、退出系统成功
    public void loginSuccess(){
        System.out.println("用例01：输入正确的用户名和密码");
        //输入正确的用户名、密码
        loginElementOperation.loginInputBox("admin", "@de88888");
        //鼠标点击登录平台按钮
        loginElementOperation.loginButtonClick();
        //如果用户已登录，要继续登录，点击确定按钮
        loginElementOperation.loginConfirmButton();
        //登录成功后，打印页面的title标题
        System.out.println("登录成功的页面title：" + driver.getTitle());
        //点击用户头像
        //loginElementOperation.logoutPhotoImg();
        //下拉列表选项下选择“系统退出”
        // loginElementOperation.selectSystemLogout();
        //设置退出成功的检查点，打印登录页面上，输入框上面的文字“请输入用户名和密码”
        // loginElementOperation.loginErrorMessage();
        // System.out.println("打印出上面这个提示说明系统成功退出到登录页面");
    }
    @AfterClass
    //关闭浏览器
    public void close(){
        driver.quit();
    }

}
