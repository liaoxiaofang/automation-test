package operation.testcase;

import element.operation.LoginElementOperation;
import element.operation.ProjectPlanElementOperation;
import element.operation.PublicElementOperation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

/**
 * Created by nanjia on 2016/3/16.
 * 业务层，项目规划：项目、阶段、工作项、任务、团队---新建、修改、查询、删除
 */
public class ProjectPlanTest {
    WebDriver driver;
    LoginElementOperation loginElementOperation;
    PublicElementOperation publicElementOperation;
    ProjectPlanElementOperation projectPlanElementOperation;
    @BeforeClass
    public void loginSystem(){
        driver = new FirefoxDriver();
        driver.get("http://192.168.3.162:20380/inno-de-web/#/login");
        driver.manage().window().maximize();
        loginElementOperation = new LoginElementOperation(driver);
        publicElementOperation = new PublicElementOperation(driver);
        projectPlanElementOperation = new ProjectPlanElementOperation(driver);
        //输入正确的用户名、密码
        loginElementOperation.loginInputBox("liaoxiaofang", "888888");
        //鼠标点击登录平台按钮
        loginElementOperation.loginButtonClick();
        //如果用户已登录，要继续登录，点击确定按钮
        loginElementOperation.loginConfirmButton();
        //点击应用切换按钮
        publicElementOperation.appSwitchButton();
        //点击项目规划应用
        publicElementOperation.projectPlanApp();
    }
    @Test  //2_01_项目新建
    public void projectAdd(){
        //新建项目，点击新建按钮
        projectPlanElementOperation.projectAddButton();
        //输入项目名称
        projectPlanElementOperation.projectNameInput("自动化测试项目");
        //项目负责人(注：定位有问题，会点击到外层遮罩，未实现）
        //projectPlanElementOperation.projectOwnerSelect();
        //选择主办部门
        projectPlanElementOperation.projectHostDepartmentSelect();
        //选择项目类型--专项工作
        projectPlanElementOperation.projcetTypeSelect();
        //输入立项时间、结束时间、期望上线时间、申请日期、计划开始时间、计划结束时间
        projectPlanElementOperation.projectInputSetupTime("2018-04-17","2018-04-17","2017-12-17","2016-04-17","2017-04-17","2018-04-17");
        //输入总工作日
        projectPlanElementOperation.projectInputTotalWorkTime("365");
        //联系电话
        projectPlanElementOperation.projectTelephoneInput("12345678900");
        //项目模板（注:一个页面多个下拉列表，第二个无法定位到，未实现）
        //projectPlanElementOperation.projectModel();
        //项目目标、需求综述、项目背景、其它信息（注：未实现）
        //项目公开性（注：未实现）
        //点击确定按钮
        projectPlanElementOperation.projectAddSureButton();
        //打印新建成功的项目名称
        projectPlanElementOperation.projectNamePrint();
    }
    @Test  //2_02_项目基本信息编辑
    public void projectEdit(){
        //点击该项目名称，打开该项目
        projectPlanElementOperation.projectNameOpen();
        //打开项目后，点击页面顶部的项目名称,打开项目详情页面
        projectPlanElementOperation.projectNameClick();
        //点击编辑按钮
        projectPlanElementOperation.projectEditButton();
        //修改输入项目名称
        projectPlanElementOperation.projectNameEdit("修改自动化测试项目");
        //修改输入申请时间、立项时间、结束时间、预计开始时间、预计结束时间、期望上线时间
        projectPlanElementOperation.projectApplytimeEdit("2016-05-19","2018-04-01","2018-12-02","2018-04-01","2018-12-02","2018-04-01");
        //修改主办部门
        projectPlanElementOperation.projectHostDepartmentEdit();
        //修改项目负责人（注：暂未实现）
        //projectPlanElementOperation.projectOwnerEdit("林小阳");
        //修改联系电话
        projectPlanElementOperation.projectTelephoneEdit("15205013103");
        //修改总工作日
        projectPlanElementOperation.projectTotalworktimeEdit("355");
        //修改项目类型
        projectPlanElementOperation.projectTypeEdit();
        //修改项目状态（注：未实现）
        //projectPlanElementOperation.projectStatusEdit();
        //修改项目公开性
        projectPlanElementOperation.projectPublicityEdit();
        //修改项目，点击保存
        projectPlanElementOperation.projectSaveButton();
        //项目查看详情页面，点击返回按钮
        projectPlanElementOperation.detailPageReturnButton();
        //点击左侧菜单，项目首页
        projectPlanElementOperation.projectMenu();
        //打印修改成功的项目名称
        projectPlanElementOperation.projectEditNamePrint();
    }

    @Test  //2_03_项目查询
    public void projectSearch(){
        //输入要搜索的项目名称，并按Enter键
        projectPlanElementOperation.projectSearchNameInput("自动化");
        //点击搜索框后面清除按钮X
        publicElementOperation.searchCloseButton();
        //高级搜索下的条件组合查询 (注：期望上线时间，查询条件有bug，此处未输入值）
        projectPlanElementOperation.projectAdvanceSearch("测试","CX","广州","廖小芳","2016-03-24 至 2018-05-30","2016-03-24 至 2018-12-30","");
        //打印出查询结果
        projectPlanElementOperation.projectListPrint();
    }

    @Test  //2_04_阶段新建
    public void stageAdd(){
        System.out.println("用例2_04：阶段新建");
        //点击目项修改后的名称，打开项目
        projectPlanElementOperation.projectEditNameOpen();
        //点击左侧菜单，阶段
        projectPlanElementOperation.stageMenu();
        //点击新建阶段按钮
        projectPlanElementOperation.stageAddButton();
        //输入阶段编号
        projectPlanElementOperation.stageNumberInput("stagecode");
        //输入阶段名称
        projectPlanElementOperation.stageNameInput("自动化测试阶段");
        //选择阶段负责人
        projectPlanElementOperation.stageOwnerSelect();
        //输入阶段预计开始时间和预计结束时间
        projectPlanElementOperation.stageExpectStartEndTimeInput("2016-04-20", "2016-04-23");
        //输入阶段实际开始时间和实际结束时间
        projectPlanElementOperation.stageActualStartEndTimeInput("2016-4-21","2016-04-25");
        //选择是否里程碑,默认“否”，这边点边“是”(注：用click，点不到）
        //projectPlanElementOperation.stageMilepostSelect();
        //输入阶段目标
        projectPlanElementOperation.stageTargetInput("阶段目标内容");
        //新建阶段页面，点击确认按钮
        projectPlanElementOperation.stageAddSureButton();
        //打印新建成功的阶段
        projectPlanElementOperation.stageAddNamePrint();
    }
    @Test  //2_05_阶段基本信息编辑
    public void stageEdit(){
        System.out.println("用例2_05：阶段基本信息编辑");
        //点击左侧菜单，项目首页
        //projectPlanElementOperation.projectMenu();
        //点击目项修改后的名称，打开项目
        projectPlanElementOperation.projectEditNameOpen();
        //点击左侧菜单，阶段
        projectPlanElementOperation.stageMenu();
        //在阶段列表页面，选择第一条阶段记录，点击阶段名称
        projectPlanElementOperation.stageNameClick();
        //点击编辑按钮
        projectPlanElementOperation.stageEditButton();
        //修改阶段名称
        projectPlanElementOperation.stageEditNameInput("修改自动化测阶段");
        //修改阶段负责人,选择第1个
        projectPlanElementOperation.stageEditOwnerSelect();
        //修改阶段实际完成时间、预计开始时间、预计结束时间、实际开始时间、实际结束时间
        projectPlanElementOperation.stageEditStartEndTimeInput("2016-05-29","2016-05-20", "2016-05-23","2016-05-22","2016-05-26");
        //修改阶段里程碑，改为 是
        projectPlanElementOperation.stageEditMilepostYes();
        //修改阶段状态，改为 进行中
        projectPlanElementOperation.stageEditStatusOngoing();
        //修改阶段目标内容
        projectPlanElementOperation.stageEditTargetIput("修改阶段目标内容");
        //在编辑阶段信息页面，点击保存按钮
        projectPlanElementOperation.stageEditSaveButto();
        //在阶段详情页面，点击返回按钮
        projectPlanElementOperation.detailPageReturnButton();
        //打印修改后的阶段名称
        projectPlanElementOperation.stageEditNamePrint();
    }
    @Test //2_06_阶段查询
    public void stageSearch(){
        System.out.println("用例2_06：阶段查询");
        //点击左侧菜单，项目首页
        //projectPlanElementOperation.projectMenu();
        //点击目项修改后的名称，打开项目
        projectPlanElementOperation.projectEditNameOpen();
        //点击左侧菜单，阶段
        projectPlanElementOperation.stageMenu();
        //在按名称搜索的框内，输入阶段名称,并按Enter进行搜索
        projectPlanElementOperation.stageSearchName("修改自动化");
        //清除输入内容，点输入框后面的X按钮
        publicElementOperation.searchCloseButton();
        //高级搜索下的条件组合查询
        projectPlanElementOperation.stageAdvanceSearch("自动化", "stage", "廖小芳", "2016-05-19 至 2016-05-21", "2016-05-22 至 2016-05-25", "2016-05-22 至 2016-05-30");
        try{
            Thread.sleep(2000);
        }catch(Exception e){
            return;
        }
        //打印查询结果
        projectPlanElementOperation.stageListPrint();
    }

    @Test //2_07_任务新建
    public void workItemAdd(){
        System.out.println("用例2_07：任务新建");
        //点击目项修改后的名称，打开项目
        projectPlanElementOperation.projectEditNameOpen();
        //点击左侧菜单，任务
        projectPlanElementOperation.taskMenu();
        //点击新建工作项按钮
        projectPlanElementOperation.workItemAddButton();
        //输入编号
        projectPlanElementOperation.workItemCodeInput("workitmecod001");
        //输入任务名称
        projectPlanElementOperation.workItemNameInput("自动化测试任务");
        //负责人选择
        projectPlanElementOperation.workItemOwnerSelect();
        //优先级选择
        //projectPlanElementOperation.workItemLevelSelect();
        //输入开始时间和结束时间
        projectPlanElementOperation.workItemStartEndTimeInput("2016-04-22", "2016-04-29","2016-04-23","2016-04-30");
        //输入任务描述
        projectPlanElementOperation.workItemDescriptionInput("任务描述内容");
        //点击确定按钮
        projectPlanElementOperation.workItemAddSureButton();
        //打印新建成功的任务名称
        projectPlanElementOperation.workItemAddNamePrint();
    }
    @Test //2_08_任务编辑
    public void workItemEdit(){
        System.out.println("用例2_08：任务基本信息编辑");
        //点击目项修改后的名称，打开项目
        projectPlanElementOperation.projectEditNameOpen();
        //点击左侧菜单，任务
        projectPlanElementOperation.taskMenu();
        //点击工作项名称，打开查看详情页面
        projectPlanElementOperation.workItemNameOpen();
        //点击编辑按钮
        projectPlanElementOperation.workItemEditButton();
        //修改所属阶段
        //projectPlanElementOperation.workItemEditStage();
        //修改工作项名称
        projectPlanElementOperation.workItemEditName("修改自动化测试任务");
        //修改优先级
        projectPlanElementOperation.workItemEditLevel();
        //修改负责人
        //projectPlanElementOperation.workItemEditOwner();
        //修改预计开始时间和预计结束时间
        projectPlanElementOperation.workItemEditStartEndTime("2016-04-23", "2016-04-30");
        //修改实际开始时间和实际结束时间
        projectPlanElementOperation.workItemEditActualStartEndTime("2016-04-24","2016-05-02");
        //修改状态
        projectPlanElementOperation.workItemEditStatus();
        //修改工作项描述
        projectPlanElementOperation.workItemEditDescription("修改任务描述内容");
        //点击保存按钮
        projectPlanElementOperation.workItemEditSaveButton();
        //在工作项详情页面，点击返回按钮
        projectPlanElementOperation.detailPageReturnButton();
        //打印修改成功的工作项名称
        projectPlanElementOperation.workItemEditNamePrint();
    }
    @Test  //2_09_任务查询
    public void workItemSearch(){
        //点击目项修改后的名称，打开项目
        //projectPlanElementOperation.projectEditNameOpen();
        //点击左侧菜单，任务
        //projectPlanElementOperation.taskMenu();
        //输入工作项名称，按Enter键，进行查询
        projectPlanElementOperation.workItemSearchName("自动化");
        //清除输入内容，点输入框后面的X按钮
        publicElementOperation.searchCloseButton();
        //高级搜索组合查询
        projectPlanElementOperation.workItemAdvanceSearch("修改","work","廖小芳","廖小芳","2016-03-23 至 2016-04-25","2016-03-22 至 2016-04-30");
        try{
            Thread.sleep(2000);
        }catch(Exception e){
            return;
        }
        //打印工作项查询结果
        projectPlanElementOperation.workItemListPrint();
    }

    @Test  //2_10_子任务新建
    public void taskAdd(){
        //点击目项修改后的名称，打开项目
        //projectPlanElementOperation.projectEditNameOpen();
        //点击左侧菜单，任务
        //projectPlanElementOperation.taskMenu();
        //选择一条工作项，点击名称那一栏
        projectPlanElementOperation.workItemClickNameColumn();
        //点击新建任务按钮
        projectPlanElementOperation.taskAddButton();
        //输入任务名称
        projectPlanElementOperation.taskNameInput("自动化测试子任务");
        //选择优先级
        projectPlanElementOperation.taskLevelSelect();
        //输入预计时间
        projectPlanElementOperation.taskExpectTimeInput("2");
        //输入截止日期
        projectPlanElementOperation.taskEndtimeInput("2016-04-27");
        //选择指派人
        //projectPlanElementOperation.taskAssignSelect();
        //输入描述内容
        projectPlanElementOperation.taskDescriptionInput("子任务描述内容");
        //点击确认按钮
        projectPlanElementOperation.taskAddSureButton();
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            return;
        }
        //打印新建成功的任务名称
        projectPlanElementOperation.taskAddNamePrint();
    }
    @Test //2_11_子任务编辑
    public void taskEdit(){
        //点击目项修改后的名称，打开项目
        //projectPlanElementOperation.projectEditNameOpen();
        //点击左侧菜单，任务
        //projectPlanElementOperation.taskMenu();
        //选择一条工作项，点击名称那一栏
        //projectPlanElementOperation.workItemClickNameColumn();
        //点击任务名称，打开详情页面
        projectPlanElementOperation.taskNameOpen();
        //点击编辑按针
        projectPlanElementOperation.taskEditButton();
        //修改所属工作项
        //projectPlanElementOperation.taskEditOwnerWorkItem();
        //修改任务名称
        projectPlanElementOperation.taskEditNameInput("修改自动化测试子任务");
        //修改优先级
        projectPlanElementOperation.taskEditLevel();
        //修改预计时间
        projectPlanElementOperation.taskEditExpecttimeInput("3");
        //修改已耗时
        projectPlanElementOperation.taskEditTasktimeInput("1");
        //修改截止日期
        projectPlanElementOperation.taskEditEndtimeInput("2016-04-30");
        //修改指派人
        //projectPlanElementOperation.taskEditAssign();
        //修改描述内容
        projectPlanElementOperation.taskEditDescription("修改子任务描述内容");
        //修改任务状态
        //projectPlanElementOperation.taskEditStatus();
        //点击保存按钮
        projectPlanElementOperation.taskEditSaveButton();
        //在任务详情页面，点击返回按钮
        projectPlanElementOperation.detailPageReturnButton();
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            return;
        }
        //打印修改后的任务名称
        projectPlanElementOperation.taskEditNamePrint();
    }
    @Test //2_12_子任务删除
    public void taskDelete(){
        //点击目项修改后的名称，打开项目
        //projectPlanElementOperation.projectEditNameOpen();
        //点击左侧菜单，任务
        //projectPlanElementOperation.taskMenu();
        //选择一条工作项，点击名称那一栏
        projectPlanElementOperation.workItemClickNameColumn();
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            return;
        }
        //选择一条任务，点击名称那一栏
        projectPlanElementOperation.taskClickNameColumn();
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            return;
        }
        //点击删除按钮
        projectPlanElementOperation.taskDeleteButton();
        //弹出的删除确认框，点击确定按钮
        projectPlanElementOperation.taskDeleteSureButton();
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            return;
        }
        //打印任务名称，如果不存在输出提示
        projectPlanElementOperation.taskNamePrint();
    }
    @Test //2_13_任务删除
    public void workItemDelete(){
        //点击目项修改后的名称，打开项目
        //projectPlanElementOperation.projectEditNameOpen();
        //点击左侧菜单，任务
        //projectPlanElementOperation.taskMenu();
        //选择一条工作项，点击名称那一栏
        projectPlanElementOperation.workItemClickNameColumn();
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            return;
        }
        //点击删除按钮
        projectPlanElementOperation.workItemDeleteButton();
        //删除确认框，点击确定按钮
        projectPlanElementOperation.workItemDeleteSureButton();
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            return;
        }
        //打印工作项名称，如果不存在给出提示
        projectPlanElementOperation.workItemNamePrint();
    }
    @Test  //2_14_团队分组添加编辑删除
    public void teamGroupAddEditDelete(){
        //点击目项修改后的名称，打开项目
        //projectPlanElementOperation.projectEditNameOpen();
        //点击左侧菜单，团队
        projectPlanElementOperation.teamMenu();
        //添加分组
        projectPlanElementOperation.teamGroupAdd("自动化团队分组");
        //编辑分组名称
        projectPlanElementOperation.teamGroupNameEdit("修改自动化团队分组");
        //删除分组
        projectPlanElementOperation.teamGroupDelete();
    }
    @Test //2_15_团队成员添加
    public void teamMemberAssign(){
        //点击目项修改后的名称，打开项目
        //projectPlanElementOperation.projectEditNameOpen();
        //点击左侧菜单，团队
        //projectPlanElementOperation.teamMenu();
        //点击新增成员按钮
        projectPlanElementOperation.teamMemberAddButton();
        //弹出团队成员选择框，搜索成员姓名，在搜索结果中，点击复选框选择第一条记录
        projectPlanElementOperation.teamMemberModalSelect("陈");
        //点击确定按钮
        projectPlanElementOperation.teamMemberSelectSureButton();

    }
    @Test //2_16_团队成员搜索
    public void teamMemberSearch(){
        //点击目项修改后的名称，打开项目
        //projectPlanElementOperation.projectEditNameOpen();
        //点击左侧菜单，团队
        //projectPlanElementOperation.teamMenu();
        //搜索框输入成员姓名
        projectPlanElementOperation.teamMemberSearchInput("廖小芳");
        //搜索框输入部门或机构
        projectPlanElementOperation.teamMemberSearchInput("英华达");
        //清除输入内容，点输入框后面的X按钮
        publicElementOperation.searchCloseButton();
        //打印团队成员列表下的成员姓名
        projectPlanElementOperation.teamMemberListPrint();
    }
    @Test //2_17_团队成员删除
    public void teamMemberDelete(){
        //点击目项修改后的名称，打开项目
        //projectPlanElementOperation.projectEditNameOpen();
        //点击左侧菜单，团队
        //projectPlanElementOperation.teamMenu();
        //选择第二条成员，点击单项删除按钮
        projectPlanElementOperation.teamMemberSingleDelete();
        //弹出删除确认框，点击确定按钮
        projectPlanElementOperation.teamMemberDeleteSureButton();
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            return;
        }
        //在从列表中，点击复选框勾选记录
        projectPlanElementOperation.teamMemberSelect();
        //点击批量删除按钮
        projectPlanElementOperation.teamMeamberLotDeleteButton();
        //弹出删除确认框，点击确定按钮
        projectPlanElementOperation.teamMemberDeleteSureButton();
        //弹出删除确认框，点击取消按钮
        //projectPlanElementOperation.teamMemberDeleteCancelButton();
    }

    @Test  //2_18_阶段删除
    public void  stageDelete(){
        //点击目项修改后的名称，打开项目
        //projectPlanElementOperation.projectEditNameOpen();
        //点击左侧菜单，阶段
        projectPlanElementOperation.stageMenu();
        //批量删除 (定位不到复选框，未实现）
        //projectPlanElementOperation.stageLargeDelete();
        //单项删除
        projectPlanElementOperation.stageSingleDelete();
        //弹出删除确认框，点击确定按钮
        projectPlanElementOperation.stageSureDeteButton();
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            return;
        }
        //打印阶段名称，如果不存在给出提示
        projectPlanElementOperation.stageNamePrint();
    }
    @Test //2_19_项目删除
    public void projectDelete(){
        //点击左侧菜单，项目首页
        projectPlanElementOperation.projectMenu();
        //选择一条记录，并点击删除按钮
        projectPlanElementOperation.projectSelectDelete();
        //弹出的删除确认框，点击确定按钮
        projectPlanElementOperation.projectDeleteSureBtton();
        //打印出项目列表项目名称
        projectPlanElementOperation.projectListPrint();
    }
    //@AfterClass
    //关闭浏览器
    /*public void close(){
        driver.quit();
    }*/







}
