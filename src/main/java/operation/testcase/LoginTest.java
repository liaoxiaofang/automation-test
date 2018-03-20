package operation.testcase;

import element.operation.LoginElementOperation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.phantomjs.PhantomJSDriver;
//import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by nanjia on 2016/3/10.
 * 登录退出操作，业务层
 */
public class LoginTest {
    WebDriver driver;
    //WebDriver webDriver = null;
    LoginElementOperation loginElementOperation;
    @BeforeClass
    private void openLoginPage(){
        //如果不是安装在默认路径下，要设置浏览器的安装路径
        //System.setProperty("webdriver.firefox.bin", "/usr/lib64/firefox/firefox");
        //System.setProperty("phantomjs.binary.path", "/JENKINS_HOME/phantomjs-2.1.1-linux-x86_64/bin/phantomjs");
        //System.setProperty("phantomjs.binary.path", "D:\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
        driver = new FirefoxDriver();
       //webDriver = WebDriverUtil.createPhantomjsWebDriver("D:/phantomjs-2.1.1-windows/phantomjs-2.1.1-windows/bin/phantomjs.exe");
        //WebDriver driver = new PhantomJSDriver();
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
    @Test //1_02_用户名和密码都为空,登录失败
    public void UsernamePasswordEmptyLoginFail(){
        System.out.println("用例02：用户名和密码都为空");
        //用户名、密码都为空
        loginElementOperation.loginInputBox("", "");
        //鼠标点击登录平台按钮
        loginElementOperation.loginButtonClick();
        //如果用户已登录，要继续登录，点击确定按钮
        loginElementOperation.loginConfirmButton();
        //打印登录失败的提示信息
        loginElementOperation.loginErrorMessage();
    }
    @Test //1_03_用户名为空，密码正确，登录失败
    public void UsernameEmptyLoginFail(){
        System.out.println("用例03：用户名为空，输入系统默认密码@de88888");
        //用户名为空,输入系统默认密码
        loginElementOperation.loginInputBox("", "@de88888");
        //鼠标点击登录平台按钮
        loginElementOperation.loginButtonClick();
        //如果用户已登录，要继续登录，点击确定按钮
        loginElementOperation.loginConfirmButton();
        //打印登录失败的提示信息
        loginElementOperation.loginErrorMessage();
    }
    @Test //1_04_用户名正确，密码为空，登录失败
    public void PasswordEmptyLoginFail(){
        System.out.println("用例04：输入正确的用户名，密码为空");
        //用户名为空,输入系统默认密码
        loginElementOperation.loginInputBox("admin", "");
        //鼠标点击登录平台按钮
        loginElementOperation.loginButtonClick();
        //如果用户已登录，要继续登录，点击确定按钮
        loginElementOperation.loginConfirmButton();
        //打印登录失败的提示信息
        loginElementOperation.loginErrorMessage();
    }
    @Test //1_05_用户正确，密码错误，登录失败
    public void PasswordErrorLoginFail(){
        System.out.println("用例05：输入正确的用户名，错误的密码");
        for (int i=0;i<5;i++){
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                return;
            }
            //用户名为空,输入系统默认密码
            loginElementOperation.loginInputBox("admin", "111111");
            //鼠标点击登录平台按钮
            loginElementOperation.loginButtonClick();
            //如果用户已登录，要继续登录，点击确定按钮
            loginElementOperation.loginConfirmButton();
            //打印登录失败的提示信息
            loginElementOperation.loginErrorMessage();
        }
    }
    @Test  //1_06_错误用户名密码，登录失败
    public void UsernamePasswordErrorLoginFail(){
        System.out.println("用例06：输入错误的用户名，错误的密码");
        //用户名为空,输入系统默认密码
        loginElementOperation.loginInputBox("liaoxiaofang123", "111111");
        //鼠标点击登录平台按钮
        loginElementOperation.loginButtonClick();
        //如果用户已登录，要继续登录，点击确定按钮
        loginElementOperation.loginConfirmButton();
        //打印登录失败的提示信息
        loginElementOperation.loginErrorMessage();
    }
    @AfterClass
    //关闭浏览器
    public void close(){
        driver.quit();
    }
}
