package page.element;

import org.openqa.selenium.By;

/**
 * Created by nanjia on 2016/3/16.
 * 公共模块的页面元素
 */
public class PublicPageElement {
    //应用切换按钮
    public static By APP_SWITCH = By.cssSelector("span i.fa.fa-bars.fa-stack-1x.fa-inverse");
    //获取各个应用的li
    public static By APP_LIST = By.cssSelector("ul.dropdown-menu.navbar-apps li");
    //清除按钮X(所有的搜索框，清除X按钮都调用该元素）
    public static By CLOSE_BUTTON = By.cssSelector("button.close");
    //高级搜索展开按钮
    public static By ADVANCE_SEARCH_SHOWN_BUTTON = By.cssSelector("button.btn.btn-icon");
}
