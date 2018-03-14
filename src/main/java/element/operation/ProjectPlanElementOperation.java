package element.operation;

import method.BasicMethod;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page.element.ProjectPlanElement;
import page.element.PublicPageElement;

import java.util.List;

/**
 * Created by nanjia on 2016/3/16.
 * 项目规划模块下的操作层
 */
public class ProjectPlanElementOperation extends BasicMethod{
    public ProjectPlanElementOperation (WebDriver driver){
        super(driver);
    }
    //点击新建项目按钮
    public void projectAddButton(){
        this.findElement(driver, ProjectPlanElement.PROJECT_ADD_BUTTON).click();
    }
    /**
     * 封装新建项目操作，涉及到项目名称输入
     * @param projectname 项目名称
     *
     */
    //輸入项目名称
    public void projectNameInput(String projectname){
        this.findElement(driver,ProjectPlanElement.PROJECT_NAME_INPUT_BOX).clear();
        this.findElement(driver,ProjectPlanElement.PROJECT_NAME_INPUT_BOX).sendKeys(projectname);
    }
    //项目负责人选择
    public void projectOwnerSelect(){
        //点击负责人下拉框
        this.findElement(driver,ProjectPlanElement.PROJECT_OWNER_DROPDOWN_BOX).click();
        //定位下拉列表，type为checkbox的input标签
        List<WebElement> owner = this.findElements(driver,ProjectPlanElement.PROJECT_OWNER_SELECT_CHECK_BOX);
        for (WebElement project : owner) {
            if(project.getAttribute("type").equals("checkbox")){
                    //System.out.println(project.getTagName());
                    project.click();
            }
        }
    }
    //选择主办部门
    public void projectHostDepartmentSelect(){
        //点击主办部门下拉框
        this.findElements(driver,ProjectPlanElement.PROJECT_DROPDOWN_BOX).get(0).click();
        //点击英华达前面的向下展开按导，展开根目录
        this.findElement(driver, ProjectPlanElement.PROJECT_HOSTDEPARTMENT_ZTREEROOT).click();
        //在下拉列表中，点击选择按钮
        this.findElement(driver,ProjectPlanElement.PROJECT_HOSTDEPARTMENT_SELECT_BUTTON).click();
    }
    //选择项目类型
    public void projcetTypeSelect(){
        //点击项目类型下拉框
        this.findElements(driver,ProjectPlanElement.PROJECT_DROPDOWN_BOX).get(1).click();
        //在下拉列表中，选择专项工作
        this.findElements(driver,ProjectPlanElement.PROJECT_TYPE_LIST).get(0).click();
        //选择项目
        //this.findElements(driver,ProjectPlanElement.PROJECT_TYPE_LIST).get(1).click();
    }
    /**
     * 封装新建项目操作，涉及到项目的立项时间、结束时间、期望上线时间、申请日期、计划开始时间、计划结束时间的输入
     * @param setuptime 立项时间
     * @param endtime 立项时间
     * @param expecttime 期望上线时间
     * @param applytime 申请日期
     * @param planstarttime 计划开始时间
     * @param planendtime 计划结束时间
     */
    public void projectInputSetupTime(String setuptime,String endtime,String expecttime,String applytime,String planstarttime,String planendtime){
        List<WebElement> projecttime = this.findElements(driver, ProjectPlanElement.PROJECT_TIME_INPUT_BOX);
        //输入立项时间
        projecttime.get(0).clear();
        projecttime.get(0).sendKeys(setuptime);
        //输入结束时间
        projecttime.get(1).clear();
        projecttime.get(1).sendKeys(endtime);
        //输入期望上线时间
        projecttime.get(2).clear();
        projecttime.get(2).sendKeys(expecttime);
        //输入申请日期
        projecttime.get(3).clear();
        projecttime.get(3).sendKeys(applytime);
        //输入计划开始时间
        projecttime.get(4).clear();
        projecttime.get(4).sendKeys(planstarttime);
        //输入计划结束时间
        projecttime.get(5).clear();
        projecttime.get(5).sendKeys(planendtime);
    }
    /**
     * 封装新建项目操作，涉及到项目的总工作日
     * @param totalworktime 总工作日
     */
    //输入总工作日
    public void projectInputTotalWorkTime(String totalworktime){
        this.findElement(driver, ProjectPlanElement.PROJECT_TOTALWORKTIME_INPUT_BOX).clear();
        this.findElement(driver,ProjectPlanElement.PROJECT_TOTALWORKTIME_INPUT_BOX).sendKeys(totalworktime);
    }
    /**
     * 封装新建项目操作，涉及到项目联系电话输入
     * @param telephone 联系电话
     */
    //输入联系电话
    public void projectTelephoneInput(String telephone){
        this.findElement(driver,ProjectPlanElement.PROJECT_TELEPHONE_INPUT_BOX).clear();
        this.findElement(driver,ProjectPlanElement.PROJECT_TELEPHONE_INPUT_BOX).sendKeys(telephone);
    }
    //选择项目模板
    public void projectModel(){
        //点击项目模板下拉框
        this.findElements(driver,ProjectPlanElement.PROJECT_DROPDOWN_BOX).get(2).click();
        //选择模板
        this.findElement(driver,ProjectPlanElement.PROECT_MODAL_LIST_SELECT).click();

    }

    //新建项目页面，点击确定按钮
    public void projectAddSureButton(){
        this.findElement(driver,ProjectPlanElement.PROJECT_ADD_SURE_BUTTON).click();
    }

    //打印新建成功的项目
    public void projectNamePrint(){
        //打印出所选择的项目名称
        try {
            System.out.println("项目新建成功：" + this.findElement(driver, ProjectPlanElement.PROJECT_NAME_OPEN).getText());
        }
        catch (Exception e){
            System.out.println("项目没新建成功");
        }
    }
    //打印修改后的项目名称
    public void projectEditNamePrint(){
        //打印出所选择的项目名称
        try {
            System.out.println("项目修改成功：" + this.findElement(driver, ProjectPlanElement.PROJECT_EDIT_NAME).getText());
        }
        catch (Exception e){
            System.out.println("项目没有修改成功");
        }

    }
    //点击该项目名称，打开项目
    public void projectNameOpen(){
        //点击该项目名称，打开项目
       this.findElement(driver, ProjectPlanElement.PROJECT_NAME_OPEN).click();
    }
    //点击该项目修改后的名称，打开项目
    public void projectEditNameOpen(){
        this.findElement(driver, ProjectPlanElement.PROJECT_EDIT_NAME).click();
    }

    //打开项目后，点击页面顶部的项目名称
    public void projectNameClick(){
        //点击项目名称
        this.findElement(driver,ProjectPlanElement.PROJECT_NAME_CLICK).click();
    }
    //在项目详情页面，点击编辑按钮
    public void projectEditButton(){
        //点击编辑按钮
        this.findElement(driver,ProjectPlanElement.PROJECT_EDIT_BUTTON).click();
    }

    /**
     * 封装编辑项目操作，涉及到项目名称输入
     * @param projecteditname 项目名称
     */
    //编辑修改项目名称
    public void projectNameEdit(String projecteditname){
        this.findElements(driver,ProjectPlanElement.PROJECT_EDIT_TEXT_INPUT_BOX).get(0).clear();
        this.findElements(driver,ProjectPlanElement.PROJECT_EDIT_TEXT_INPUT_BOX).get(0).sendKeys(projecteditname);
    }
    /**
     * 封装编辑项目操作，涉及到项目申请时间输入
     * @param projecteditapplytime 申请时间
     * @param projecteditsetuptime 立项时间
     * @param projecteditendtime 结束时间
     * @param projecteditexpectstarttime 预计开始时间
     * @param projecteditexpectendttime 预计结束时间
     * @param projecteditexpectuplinettime 期望上线时间
     */
    //编辑修改申请时间
    public void projectApplytimeEdit(String projecteditapplytime,String projecteditsetuptime,String projecteditendtime,String projecteditexpectstarttime,String projecteditexpectendttime,String projecteditexpectuplinettime){
        List<WebElement> time = this.findElements(driver, ProjectPlanElement.PROJECT_EDIT_TIME_INPUT_BOX);
        time.get(0).clear();
        time.get(1).clear();
        time.get(2).clear();
        time.get(3).clear();
        time.get(4).clear();
        time.get(5).clear();
        time.get(0).sendKeys(projecteditapplytime);
        //修改立项时间
        time.get(1).sendKeys(projecteditsetuptime);
        //修改结束时间
        time.get(2).sendKeys(projecteditendtime);
        //修改预计开始时间和预计结束时间
        time.get(3).sendKeys(projecteditexpectstarttime);
        time.get(4).sendKeys(projecteditexpectendttime);
        //输入期望上线时间
        time.get(5).sendKeys(projecteditexpectuplinettime);
    }
    //编辑修改主办部门
    public void projectHostDepartmentEdit(){
        //点击主办部门，下拉框
        this.findElements(driver,ProjectPlanElement.PROJECT_EDIT_DORPDOWN_BOX).get(0).click();
        //点击根目录，展开下拉列表
        this.findElement(driver,ProjectPlanElement.PROJECT_EDIT_HOSTDEPARTMENT_ZTREEROOT).click();
        //选择一个部门，点击选择按钮
        this.findElement(driver,ProjectPlanElement.PROJECT_EDIT_HOSTDEPARTMENT_SELECT_BUTTON).click();
    }
    //编辑修改项目负责人
    public void projectOwnerEdit(String projecteditownername){
        //点击下拉框
        this.findElement(driver, ProjectPlanElement.PROJECT_EDIT_OWNER_DORPDOWN_BOX).click();
        /**
         * 封装编辑项目操作，涉及到项目负责人搜索
         * @param projecteditownername 负责人名称
         */
        //点击搜索框，输入搜索内容
        this.findElement(driver,ProjectPlanElement.PROJECT_EDIT_OWNER_DORPDOWN_SEARCH_BOX).clear();
        this.findElement(driver,ProjectPlanElement.PROJECT_EDIT_OWNER_DORPDOWN_SEARCH_BOX).sendKeys(projecteditownername);
        //按Enter键,进行搜索
        this.findElement(driver,ProjectPlanElement.PROJECT_EDIT_OWNER_DORPDOWN_SEARCH_BOX).sendKeys(Keys.ENTER);
        //点击复选框，勾选搜索结果
       // System.out.println(this.findElement(driver, ProjectPlanElement.PROJECT_EDIT_OWNER_SELECT_BOX).getText());
        //定位下拉列表，type为checkbox的input标签
        List<WebElement> owner = this.findElements(driver,ProjectPlanElement.PROJECT_OWNER_SELECT_CHECK_BOX);
        for (WebElement project : owner) {
            if(project.getAttribute("type").equals("checkbox")){
                //System.out.println(project.getTagName());
                project.click();
            }
        }
    }
    /**
     * 封装编辑项目操作，涉及到项目联系电话输入
     * @param projectedittelephone 联系电话
     */
    //编辑修改联系电话
    public void projectTelephoneEdit(String projectedittelephone){
        this.findElements(driver,ProjectPlanElement.PROJECT_EDIT_TEXT_INPUT_BOX).get(1).clear();
        this.findElements(driver,ProjectPlanElement.PROJECT_EDIT_TEXT_INPUT_BOX).get(1).sendKeys(projectedittelephone);
    }
    /**
     * 封装编辑项目操作，涉及到项目总工作日输入
     * @param projecteditotalworktime 总工作日
     */
    //编辑修改总工作日
    public void projectTotalworktimeEdit(String projecteditotalworktime){
        this.findElements(driver,ProjectPlanElement.PROJECT_EDIT_TEXT_INPUT_BOX).get(2).clear();
        this.findElements(driver,ProjectPlanElement.PROJECT_EDIT_TEXT_INPUT_BOX).get(2).sendKeys(projecteditotalworktime);
    }
    //编辑修改项目类型
    public void projectTypeEdit(){
        this.findElements(driver,ProjectPlanElement.PROJECT_EDIT_DORPDOWN_BOX).get(1).click();
        //下拉列表，选择项目
        this.findElements(driver,ProjectPlanElement.PROJECT_TYPE_LIST).get(1).click();
    }
    //编辑修改项目状态
    public void projectStatusEdit(){
        this.findElements(driver,ProjectPlanElement.PROJECT_EDIT_DORPDOWN_BOX).get(2).click();
        //下拉列表，选择 进行中
        //this.findElements(driver,ProjectPlanElement.PROJECT_EDIT_STATUS_LIST).get(0).click();
        this.findElement(driver,ProjectPlanElement.PROJECT_EDIT_STATUS_LIST).click();
        //下拉列表，选择 已终止
        //this.findElements(driver,ProjectPlanElement.PROJECT_EDIT_STATUS_LIST).get(1).click();
        //下拉列表，选择 已完成
        //this.findElements(driver,ProjectPlanElement.PROJECT_EDIT_STATUS_LIST).get(2).click();
        //下拉列表，选择 未开始
        //this.findElements(driver,ProjectPlanElement.PROJECT_EDIT_STATUS_LIST).get(3).click();
        //下拉列表，选择 已归档
        //this.findElements(driver,ProjectPlanElement.PROJECT_EDIT_STATUS_LIST).get(4).click();
    }
    //编辑项目公开性
    public void projectPublicityEdit(){
        //点击选择 公有
        this.findElements(driver,ProjectPlanElement.PROJECT_EDIT_PUBLICITY).get(1).click();
    }
    //编辑项目页面，点击保存按钮
    public void projectSaveButton(){
        this.findElement(driver, ProjectPlanElement.PROJECT_EDIT_SAVE_BUTTON).click();
    }
    //点击左侧菜单,项目首页
    public void projectMenu(){
        this.findElements(driver,ProjectPlanElement.STAGE_MENU_LIST).get(0).click();
    }

    /**
     * 封装项目查询操作，涉及到项目名称的输入
     * @param projectnamesearch 项目名称
     */
    //项目搜索输入框
    public void projectSearchNameInput(String projectnamesearch){
        this.findElements(driver,ProjectPlanElement.PROJECT_SEARCH_TEXT_INPUT_BOX).get(0).clear();
        this.findElements(driver,ProjectPlanElement.PROJECT_SEARCH_TEXT_INPUT_BOX).get(0).sendKeys(projectnamesearch);
        //按Enter键
        this.findElements(driver, ProjectPlanElement.PROJECT_SEARCH_TEXT_INPUT_BOX).get(0).sendKeys(Keys.ENTER);
    }
    /**
     * 封装项目高级搜索操作，涉及到项目名称的输入
     * @param projectnameadvance 项目名称
     * @param projectcodeadvance 项目编号
     * @param projecthostdepartmentadvance 项目主办部门
     * @param projectowneradvance 项目负责人
     * @param projectsetuptimeadvance 立项时间
     * @param projectendtimeadvance 结束时间
     * @param projectexpecttimeadvance 期望上线时间
     */
    //项目查询，高级搜索
    public void projectAdvanceSearch(String projectnameadvance,String projectcodeadvance,String projecthostdepartmentadvance,String projectowneradvance,String projectsetuptimeadvance,String projectendtimeadvance,String projectexpecttimeadvance){
        //点击高级搜索按钮
        this.findElement(driver, PublicPageElement.ADVANCE_SEARCH_SHOWN_BUTTON).click();

        List<WebElement> text = this.findElements(driver, ProjectPlanElement.PROJECT_SEARCH_TEXT_INPUT_BOX);
        //输入项目名称
        text.get(1).clear();
        text.get(1).sendKeys(projectnameadvance);
        //输入项目编号
        text.get(2).clear();
        text.get(2).sendKeys(projectcodeadvance);
        //输入项目主办部门
        text.get(3).clear();
        text.get(3).sendKeys(projecthostdepartmentadvance);
        //输入项目负责人
        text.get(4).clear();
        text.get(4).sendKeys(projectowneradvance);
        //项目状态，点击下拉框
        this.findElement(driver, ProjectPlanElement.PROJECT_SEARCH_STATUS_DROPDOWN_BOX).click();
        //在显示的下拉列表里，选择状态,未开始
        this.findElements(driver,ProjectPlanElement.PROJECT_SEARCH_STATUS_LIST_SELECT).get(3).click();
        List<WebElement> time = this.findElements(driver, ProjectPlanElement.PROJECT_SEARCH_TIME_INPUT_BOX);
        time.get(0).clear();
        //输入立项时间
        time.get(0).sendKeys(projectsetuptimeadvance);
        time.get(1).click();
        time.get(1).clear();
        //输入结束时间
        time.get(1).sendKeys(projectendtimeadvance);
        time.get(2).click();
        time.get(2).clear();
        //输入期望上线时间
        time.get(2).sendKeys(projectexpecttimeadvance);
        //该步骤是为了缩回时间控件
        text.get(4).click();
        //点击查询按钮
        this.findElement(driver, ProjectPlanElement.ADVANCE_SEARCH_BUTTON).click();
    }
    //打印项目列表下，所显示的项目名称
    public void projectListPrint() {
        List<WebElement> name = this.findElements(driver, ProjectPlanElement.PROJECT_NAME_LIST);
        for (WebElement project : name) {
            String projectname = project.findElement(ProjectPlanElement.PROJECT_NAME).getText();
            try {
                System.out.println("项目列表所显示的项目：" + projectname);
            } catch (Exception e) {
                System.out.println("项目列表显示为空，没有数据");
            }
        }
    }
    //打印团队成员列表下，所显示的成员姓名
    public void teamMemberListPrint(){
        List<WebElement> name = this.findElements(driver,ProjectPlanElement.TEAM_MEMER_LIST);
        for (WebElement member : name) {
            String membername = member.findElement(ProjectPlanElement.TEAM_MEMER_NAME).getText();
            try {
                System.out.println("团队成员列表的成员：" + membername);
            } catch (Exception e) {
                System.out.println("团队成员列表显示为空，没有数据");
            }
        }

    }
    //打印阶段列表下，所显示的阶段名称
    public void stageListPrint(){
        List<WebElement> name2 = this.findElements(driver,ProjectPlanElement.STAGE_NAME_LIST);
        for (WebElement stage : name2) {
            String stagename = stage.findElements(ProjectPlanElement.STAGE_NAME_LIST_A).get(1).getText();
            try {
                System.out.println("查询到的阶段名称：" + stagename);
            } catch (Exception e) {
                System.out.println("阶段列表显示为空，没有数据");
            }
        }
    }
    //打印工作项列表下，所显示的工作项名称
    public void workItemListPrint(){
        List<WebElement> name3 = this.findElements(driver,ProjectPlanElement.WORKITEM_NAME_LIST);
        for (WebElement workitme : name3) {
            String workitmename = workitme.findElement(ProjectPlanElement.WORKITEM_NAME).getText();
            try {
                System.out.println("工作项查询结果：" + workitmename);
            } catch (Exception e) {
                System.out.println("工作项列表显示为空，没有数据");
            }
        }

    }


    //项目删除
    public void projectSelectDelete(){
        //选择一条项目
       List<WebElement> project = this.findElements(driver, ProjectPlanElement.PROJECT_NAMEBAR_CLICK);
        project.get(0).click();
        //点击删除按钮
        project.get(0).findElement(ProjectPlanElement.PROJECT_DELETE_BUTTON).click();
    }
    //项目删除，再弹出消息确认框上，点击确定按钮
    public void projectDeleteSureBtton(){
        this.findElement(driver, ProjectPlanElement.PROJECT_DELETE_SURE_BUTTON).click();
    }

    //点击左侧菜单,阶段
    public void stageMenu(){
        this.findElements(driver,ProjectPlanElement.STAGE_MENU_LIST).get(3).click();
    }
    //点击新建阶段按钮
    public void stageAddButton(){
        this.findElement(driver, ProjectPlanElement.STAGE_ADD_BUTTON).click();
    }
    /**
     * 封装新建阶段操作，涉及到阶段编号的输入
     * @param stagenumber 阶段编号
     */
    //输入阶段编号
    public void stageNumberInput(String stagenumber){
        this.findElement(driver,ProjectPlanElement.STAGE_NUMBER_INPUT_BOX).clear();
        this.findElement(driver, ProjectPlanElement.STAGE_NUMBER_INPUT_BOX).sendKeys(stagenumber);
    }
    /**
     * 封装新建阶段操作，涉及到阶段名称的输入
     * @param stagename 阶段名称
     */
    //输入阶段名称
    public void stageNameInput(String stagename){
        this.findElement(driver,ProjectPlanElement.STAGE_NAME_INPUT_BOX).clear();
        this.findElement(driver, ProjectPlanElement.STAGE_NAME_INPUT_BOX).sendKeys(stagename);
    }
    //负责人选择
    public void stageOwnerSelect(){
        //点击负责人下拉列表框
        this.findElement(driver,ProjectPlanElement.STAGE_OWNER_DROPDOWN_BOX).click();
        //选择下拉列表的第一个选项
        this.findElements(driver,ProjectPlanElement.STAGE_OWNER_LIST).get(0).click();
    }
    /**
     * 封装新建阶段操作，涉及到阶段预计开始时间和预计结束时间的输入
     * @param stagestarttime 预计开始时间
     * @param stageendtime 预计结束时间
     */
    //输入阶段预计开始时间和预计结束时间
    public void stageExpectStartEndTimeInput(String stagestarttime,String stageendtime){
        //输入预计开始时间
        List<WebElement> stagetime = this.findElements(driver, ProjectPlanElement.STAGE_TIME_INPUT_BOX);
        stagetime.get(0).clear();
        stagetime.get(0).sendKeys(stagestarttime);
        //输入预计结束时间
        stagetime.get(1).clear();
        stagetime.get(1).sendKeys(stageendtime);
    }
    //输入阶段实际开始时间和实际结束时间
    public void stageActualStartEndTimeInput(String stageactualstarttime,String stageactualendtime){
        //输入预计开始时间
        List<WebElement> stagetime = this.findElements(driver, ProjectPlanElement.STAGE_TIME_INPUT_BOX);
        stagetime.get(2).clear();
        stagetime.get(2).sendKeys(stageactualstarttime);
        //输入预计结束时间
        stagetime.get(3).clear();
        stagetime.get(3).sendKeys(stageactualendtime);
    }
    //选择是否里程碑
   /* public void stageMilepostSelect(){
        //选择是
        //this.findElement(driver,ProjectPlanElement.STAGE_MILEPOST_YES_RADIO).click();
        System.out.println(this.findElement(driver, ProjectPlanElement.STAGE_MILEPOST_YES_RADIO).getText());
        //this.findElement(driver,ProjectPlanElement.STAGE_MILEPOST_YES_RADIO).isSelected();
    }*/
    /**
     * 封装新建阶段操作，涉及到阶段目标的输入
     * @param stagetarget 目标
     */
    //输入阶段目内容
    public void stageTargetInput(String stagetarget){
        this.findElement(driver,ProjectPlanElement.STAGE_TARGET_TEXTAREA).clear();
        this.findElement(driver,ProjectPlanElement.STAGE_TARGET_TEXTAREA).sendKeys(stagetarget);
    }
    //新建阶段页面，点击确认按钮
    public void stageAddSureButton(){
        this.findElement(driver,ProjectPlanElement.STAGE_ADD_SURE_BUTTON).click();
    }

    //打印新建成功的阶段名称
    public void stageAddNamePrint(){
        try {
            System.out.println("阶段新建成功，阶段名称：" + this.findElement(driver, ProjectPlanElement.STAGE_NAME).getText());
        }
        catch (Exception e){
            System.out.println("阶段没有新建成功");
        }

    }
    //打印阶段名称
    public void stageEditNamePrint(){
        try {
            System.out.println("阶段修改成功，阶段名称：" + this.findElement(driver, ProjectPlanElement.STAGE_NAME).getText());
        }
        catch (Exception e){
            System.out.println("阶段没有修改成功");
        }

    }
    //打印阶段名称
    public void stageNamePrint(){
        try {
            System.out.println(this.findElement(driver, ProjectPlanElement.STAGE_NAME).getText());
        }
        catch (Exception e){
            System.out.println("该阶段不存在，已被删除");
        }

    }
    //点击阶段名称（阶段页面第一条记录）
    public void stageNameClick(){
        this.findElement(driver,ProjectPlanElement.STAGE_NAME).click();
    }
    //阶段查看详情页面，点击编辑按钮
    public void stageEditButton(){
        this.findElement(driver,ProjectPlanElement.STAGE_EDIT_BUTTON).click();
    }
    /**
     * 封装编辑阶段操作，涉及到阶段名称的修改输入
     * @param stagenameedit 阶段名称
     */
    //修改阶段名称
    public void stageEditNameInput(String stagenameedit){
        this.findElement(driver,ProjectPlanElement.STAGE_EDIT_NAME_INPUT_BOX).clear();
        this.findElement(driver, ProjectPlanElement.STAGE_EDIT_NAME_INPUT_BOX).sendKeys(stagenameedit);
    }
    //修改负责人选择
    public void stageEditOwnerSelect(){
        this.findElement(driver,ProjectPlanElement.STAGE_OWNER_DROPDOWN_BOX).click();
        //选择下拉列表的第2个选项
        this.findElements(driver,ProjectPlanElement.STAGE_OWNER_LIST).get(0).click();
    }
    /**
     * 封装编辑阶段操作，涉及到阶段实际完成时间、预计开始时间、预计结束时间、实际开始时间、实际结束时间的修改输入
     * @param stageactualfinishtimeedit 实际完成时间
     * @param stagestarttimeedit 预计开始时间
     * @param stageendtimeedit 预计结束时间
     * @param stageactualstarttimeedit 实际开始时间
     * @param stageactualendtimeedit 实际结束时间
     *
     */
    //修改阶段开始时间和结束时间
    public void stageEditStartEndTimeInput(String stageactualfinishtimeedit,String stagestarttimeedit,String stageendtimeedit,String stageactualstarttimeedit,String stageactualendtimeedit ){
        //清空实际完成时间
        this.findElements(driver,ProjectPlanElement.STAGE_EDIT_TIME_INPUT_BOX).get(0).clear();
        //清空预计开始时间
        this.findElements(driver,ProjectPlanElement.STAGE_EDIT_TIME_INPUT_BOX).get(1).clear();
        //清空预计结束时间
        this.findElements(driver,ProjectPlanElement.STAGE_EDIT_TIME_INPUT_BOX).get(2).clear();
        //清空实际开始时间
        this.findElements(driver,ProjectPlanElement.STAGE_EDIT_TIME_INPUT_BOX).get(3).clear();
        //清空实际结束时间
        this.findElements(driver,ProjectPlanElement.STAGE_EDIT_TIME_INPUT_BOX).get(4).clear();
        //输入实际完成时间
        this.findElements(driver,ProjectPlanElement.STAGE_EDIT_TIME_INPUT_BOX).get(0).sendKeys(stageactualfinishtimeedit);
        //输入预计开始时间
        this.findElements(driver,ProjectPlanElement.STAGE_EDIT_TIME_INPUT_BOX).get(1).sendKeys(stagestarttimeedit);
        //输入预计结束时间
        this.findElements(driver,ProjectPlanElement.STAGE_EDIT_TIME_INPUT_BOX).get(2).sendKeys(stageendtimeedit);
        //输入实际开始时间
        this.findElements(driver,ProjectPlanElement.STAGE_EDIT_TIME_INPUT_BOX).get(3).sendKeys(stageactualstarttimeedit);
        //输入实际结束时间
        this.findElements(driver,ProjectPlanElement.STAGE_EDIT_TIME_INPUT_BOX).get(4).sendKeys(stageactualendtimeedit);
    }

    //修改阶段的是否里程碑，点击是
    public void stageEditMilepostYes(){
        this.findElements(driver, ProjectPlanElement.STAGE_EDIT_RADIOBUTTON).get(0).click();
    }
    //修改阶段状态，改为进行中
    public void stageEditStatusOngoing(){
        this.findElements(driver, ProjectPlanElement.STAGE_EDIT_RADIOBUTTON).get(2).click();
    }
    /**
     * 封装编辑阶段操作，涉及到阶段目标的修改输入
     * @param stagetargetedit 目标
     */
    //修改阶段目标内容
    public void stageEditTargetIput(String stagetargetedit){
        this.findElement(driver,ProjectPlanElement.STAGE_EDIT_TARGET_TEXTAREA).clear();
        this.findElement(driver, ProjectPlanElement.STAGE_EDIT_TARGET_TEXTAREA).sendKeys(stagetargetedit);
    }
    //编辑阶段信息，点击保存按钮
    public void stageEditSaveButto(){
        this.findElement(driver,ProjectPlanElement.STAGE_EDIT_SAVE_BUTTON).click();
    }
    //详情页面，返回按钮  (项目、阶段都调用这个）
    public void detailPageReturnButton(){
        this.findElement(driver,ProjectPlanElement.DETAIL_PAGE_RETURN_BUTTON).click();
    }
    /**
     * 封装阶段查询操作，涉及到按阶段名称搜索
     * @param stagenamesearch 阶段名称
     */
    //阶段查询，按名称搜索输入框，输入阶段名称
    public void stageSearchName(String stagenamesearch){
        this.findElements(driver,ProjectPlanElement.STAGE_TEXT_INPUT_BOX).get(0).clear();
        this.findElements(driver,ProjectPlanElement.STAGE_TEXT_INPUT_BOX).get(0).sendKeys(stagenamesearch);
        //按Enter键,进行搜索
        this.findElements(driver,ProjectPlanElement.STAGE_TEXT_INPUT_BOX).get(0).sendKeys(Keys.ENTER);
    }
    //阶段查询，高级搜索
    public void stageAdvanceSearch(String stagenameadvancesearch,String stagenumberadvancesearch,String stageowneradvancesearch,String stagestarttimeadvancesearch,String stageendtimeadvancesearch,String stageactualcompletetimeadvancesearch  ){
        //点击高级搜索按钮
        this.findElement(driver,PublicPageElement.ADVANCE_SEARCH_SHOWN_BUTTON).click();
        /**
         * 封装阶段查询操作，涉及到按阶段名称搜索
         * @param stagenameadvancesearch 阶段名称
         */
        //名称输入框，输入名称
        this.findElements(driver,ProjectPlanElement.STAGE_TEXT_INPUT_BOX).get(1).clear();
        this.findElements(driver,ProjectPlanElement.STAGE_TEXT_INPUT_BOX).get(1).sendKeys(stagenameadvancesearch);
        /**
         * 封装阶段查询操作，涉及到按阶段编号搜索
         * @param stagenumberadvancesearch 阶段编号
         */
        //编号输入框，输入编号
        this.findElements(driver,ProjectPlanElement.STAGE_TEXT_INPUT_BOX).get(2).clear();
        this.findElements(driver,ProjectPlanElement.STAGE_TEXT_INPUT_BOX).get(2).sendKeys(stagenumberadvancesearch);
        /**
         * 封装阶段查询操作，涉及到按阶段负责人搜索
         * @param stageowneradvancesearch 阶段负责人
         */
        //负责人输入框，输入负责人
        this.findElements(driver,ProjectPlanElement.STAGE_TEXT_INPUT_BOX).get(3).clear();
        this.findElements(driver,ProjectPlanElement.STAGE_TEXT_INPUT_BOX).get(3).sendKeys(stageowneradvancesearch);
        //点击里程碑下拉框
        this.findElements(driver, ProjectPlanElement.STAGE_ADVANCE_DROPDOWN_BOX).get(0).click();
        //选择是否里程碑，是
        this.findElements(driver,ProjectPlanElement.STAGE_ADVANCE_MILEPOST_SELECT_LIST).get(0).click();
        //点击状态下拉框
        //this.findElements(driver, ProjectPlanElement.STAGE_ADVANCE_DROPDOWN_BOX).get(1).click();
        //选择状态，进行中   （注：定位不到）
        //this.findElements(driver,ProjectPlanElement.STAGE_ADVANCE_STATUS_SELECT_LIST).get(2).click();
        /**
         * 封装阶段查询操作，涉及到按阶段开始时间搜索
         * @param stagestarttimeadvancesearch 开始时间
         * @param stageendtimeadvancesearch 结束时间
         * @param stageactualcompletetimeadvancesearch 实际完成时间
         */
        //开始时间输入框，输入预计开始时间
        this.findElements(driver,ProjectPlanElement.STAGE_ADVANCE_TIME_INPUT_BOX).get(0).clear();
        this.findElements(driver,ProjectPlanElement.STAGE_ADVANCE_TIME_INPUT_BOX).get(0).sendKeys(stagestarttimeadvancesearch);
        //结束时间输入框，输入预计结束时间
        this.findElements(driver,ProjectPlanElement.STAGE_ADVANCE_TIME_INPUT_BOX).get(1).click();
        this.findElements(driver,ProjectPlanElement.STAGE_ADVANCE_TIME_INPUT_BOX).get(1).clear();
        this.findElements(driver,ProjectPlanElement.STAGE_ADVANCE_TIME_INPUT_BOX).get(1).sendKeys(stageendtimeadvancesearch);
        //实际完成时间输入框，输入实际完成时间
        this.findElements(driver,ProjectPlanElement.STAGE_ADVANCE_TIME_INPUT_BOX).get(2).click();
        this.findElements(driver,ProjectPlanElement.STAGE_ADVANCE_TIME_INPUT_BOX).get(2).clear();
        this.findElements(driver,ProjectPlanElement.STAGE_ADVANCE_TIME_INPUT_BOX).get(2).sendKeys(stageactualcompletetimeadvancesearch);
        try{
            Thread.sleep(2000);
        }catch(Exception e){
            return;
        }
        //下面click是为缩回实际完成时间的时间空件
        this.findElements(driver,ProjectPlanElement.STAGE_TEXT_INPUT_BOX).get(1).click();
        //点击查询按钮
        this.findElement(driver,ProjectPlanElement.ADVANCE_SEARCH_BUTTON).click();

        //this.findElement(driver,ProjectPlanElement.ADVANCE_SEARCH_BUTTON).click();
    }
    //勾选一条阶段，点击批量删除按钮
    public void stageLargeDelete(){
        this.findElement(driver,ProjectPlanElement.STAGE_CHECK_BOX).click();
        this.findElement(driver,ProjectPlanElement.STAGE_LARGE_DELETE_BUTTON).click();
    }
    //选择一条阶段，点击删除按钮（单项删除）
    public void stageSingleDelete(){
        this.findElement(driver,ProjectPlanElement.STAGE_SELECTED).click();
        this.findElement(driver,ProjectPlanElement.STAGE_SINGLE_DELETE_BUTTON).click();
    }
    //阶段删除确认框，点击确定按钮
    public void stageSureDeteButton(){
        this.findElement(driver, ProjectPlanElement.STAGE_DELETE_SURE_BUTTON).click();
    }

    //点击左侧菜单,任务
    public void taskMenu(){
        this.findElements(driver,ProjectPlanElement.STAGE_MENU_LIST).get(2).click();
    }
    //点击左侧菜单,任务
    public void homepageMenu(){
        this.findElements(driver,ProjectPlanElement.STAGE_MENU_LIST).get(1).click();
    }
    //点击新建工作项按钮
    public void workItemAddButton(){
        this.findElement(driver, ProjectPlanElement.WORKITEM_ADD_BUTTON).click();
    }
    /**
    * 封装工作项新建操作，涉及到工作项编号的输入
    * @param workitemcode 工作项编号
    */
    //输入工作项编号
    public void workItemCodeInput(String workitemcode){
        this.findElement(driver,ProjectPlanElement.WORKITEM_CODE_INPUT_BOX).clear();
        this.findElement(driver, ProjectPlanElement.WORKITEM_CODE_INPUT_BOX).sendKeys(workitemcode);
    }
    /**
    * 封装工作项新建操作，涉及到工作项名称的输入
    * @param workitemname 工作项名称
    */
    //输入工作项名称
    public void workItemNameInput(String workitemname){
        this.findElement(driver,ProjectPlanElement.WORKITEM_NAME_INPUT_BOX).clear();
        this.findElement(driver, ProjectPlanElement.WORKITEM_NAME_INPUT_BOX).sendKeys(workitemname);
    }
    //工作项，负责人选择
    public void workItemOwnerSelect(){
        //点击负责人下拉框
        this.findElements(driver,ProjectPlanElement.WORKITEM_DROPDOWN_BOX).get(0).click();
        //选择下拉列表的第1个选项
        this.findElements(driver,ProjectPlanElement.STAGE_OWNER_LIST).get(0).click();

    }
    //工作项，优先级选择
    public void workItemLevelSelect(){
        //点击优先级下拉框
        this.findElements(driver,ProjectPlanElement.WORKITEM_DROPDOWN_BOX).get(1).click();
        //选择下拉列表的第1个选项，紧急
        this.findElements(driver,ProjectPlanElement.WORKITEM_LEVEL_SELECT_LIST).get(0).click();
    }
    /**
    * 封装工作项新建操作，涉及到预计开始时间和预计结束时间的输入
    * @param  workitestarttime 预计开始时间
    * @param  workiteendtime   预计结束时间
     * @param workitemactualstarttime 实际开始时间
     * @param workitemactualendtime 实际结束时间
    */
    //输入预计开始时间和预计结束时间
    public void workItemStartEndTimeInput(String workitestarttime,String workiteendtime,String workitemactualstarttime,String workitemactualendtime){
        //输入预计开始时间
        this.findElements(driver,ProjectPlanElement.WORKITEM_TIME_INPUT_BOX).get(0).clear();
        this.findElements(driver,ProjectPlanElement.WORKITEM_TIME_INPUT_BOX).get(0).sendKeys(workitestarttime);
        //输入预计结束时间
        this.findElements(driver,ProjectPlanElement.WORKITEM_TIME_INPUT_BOX).get(1).clear();
        this.findElements(driver,ProjectPlanElement.WORKITEM_TIME_INPUT_BOX).get(1).sendKeys(workiteendtime);
        //输入实际开始时间
        this.findElements(driver,ProjectPlanElement.WORKITEM_TIME_INPUT_BOX).get(2).clear();
        this.findElements(driver, ProjectPlanElement.WORKITEM_TIME_INPUT_BOX).get(2).sendKeys(workitemactualstarttime);
        //输入实际结束时间
        this.findElements(driver,ProjectPlanElement.WORKITEM_TIME_INPUT_BOX).get(3).clear();
        this.findElements(driver, ProjectPlanElement.WORKITEM_TIME_INPUT_BOX).get(3).sendKeys(workitemactualendtime);
    }
    /* 封装工作项新建操作，涉及到工作项描述的输入
    * @param workitemdescription 工作项描述
    */
    //输入工作项描述内容
    public void workItemDescriptionInput(String workitemdescription){
        this.findElement(driver, ProjectPlanElement.WORKITEM_DESCRIPTION_TEXT_BOX).clear();
        this.findElement(driver, ProjectPlanElement.WORKITEM_DESCRIPTION_TEXT_BOX).sendKeys(workitemdescription);
    }
    //点击确认按钮，新建工作项
    public void workItemAddSureButton(){
        this.findElement(driver,ProjectPlanElement.WORKITEM_ADD_SURE_BUTTON).click();
    }
    //打印新建成功的工作项名称（第一条记录）
    public void workItemAddNamePrint(){
        try{
            System.out.println("任务新建成功，任务名称："+ this.findElement(driver, ProjectPlanElement.WORKITEM_NAME).getText());
        }
        catch (Exception e){
            System.out.println("任务没新建成功");
        }

    }
    //打印修改成功的工作项名称（第一条记录）
    public void workItemEditNamePrint(){
        try{
            System.out.println("任务修改成功，任务名称：" + this.findElement(driver, ProjectPlanElement.WORKITEM_NAME).getText());
        }
        catch (Exception e){
            System.out.println("任务没修改成功");
        }
    }
    //打印工作项名称（第一条记录）
    public void workItemNamePrint(){
        try{
            System.out.println( this.findElement(driver, ProjectPlanElement.WORKITEM_NAME).getText());
        }
        catch (Exception e){
            System.out.println("该工作项不存在，已被删除");
        }
    }

    //点击第一条工作项名称，打开工作项详情页面
    public void workItemNameOpen(){
        this.findElement(driver, ProjectPlanElement.WORKITEM_NAME).click();
    }
    //点击编辑按钮
    public void workItemEditButton(){
        this.findElement(driver,ProjectPlanElement.WORKITEM_EDIT_BUTTON).click();
    }
    //修改所属阶段
    public void workItemEditStage(){
        //点击所属阶段下拉框
        this.findElement(driver,ProjectPlanElement.WORKITEM_EDIT_STAGE_DROPDOWN_BOX).click();
        //在显示的列表里选择第二项阶段
        //this.findElement(driver,ProjectPlanElement.WORKITEM_EDIT_STAGE_LIST_SELECT).click();
        //在显示的列表里选择第三项阶段
        this.findElements(driver,ProjectPlanElement.WORKITEM_EDIT_STAGE_LIST_SELECT).get(2).click();
        //点击页面空白处，缩回所属阶段下拉框
        //this.findElement(driver, ProjectPlanElement.WORKITEM_EDIT_BLANK_SPACE).click();
    }
    /**
    * 封装工作项编辑操作，涉及到工作项名称的修改
    * @param workitemeditname 工作项名称
    */
    //修改工作项名称
    public void workItemEditName(String workitemeditname){
        //this.findElement(driver,ProjectPlanElement.WORKITEM_EDIT_NAME_INPUT_BOX).click();
        this.findElement(driver, ProjectPlanElement.WORKITEM_EDIT_NAME_INPUT_BOX).clear();
        this.findElement(driver, ProjectPlanElement.WORKITEM_EDIT_NAME_INPUT_BOX).sendKeys(workitemeditname);
    }
    //修改工作项优先级
    public void workItemEditLevel(){
        //点击优先级下拉框
        List<WebElement> el = this.findElements(driver, ProjectPlanElement.WORKITEM_EDIT_DROPDOWN_BOX);
        el.get(0).click();
        //下拉列表中选择优先级
        List<WebElement> e2 = this.findElements(driver,ProjectPlanElement.WORKITEM_EDIT_LEVEL_LIST_SELECT);
        //选择列表第一项，紧急
        e2.get(0).click();
    }
    //修改负责人
    public void workItemEditOwner(){
        //点击负责人下拉框
        List<WebElement> e4 = this.findElements(driver, ProjectPlanElement.WORKITEM_EDIT_DROPDOWN_BOX);
        e4.get(1).click();
        //下拉列表中选择负责人
        List<WebElement> e3 = this.findElements(driver,ProjectPlanElement.WORKITEM_EDIT_OWNER_LIST_SELECT);
        //判断是否显示
        e3.get(0).isDisplayed();
        //选择列表第一项，
        e3.get(0).click();
    }
    /**
     * 封装工作项编辑操作，涉及到工作项预计开始时间和预计结束时间的修改
     * @param workitemeditstarttime 预计开始时间
     * @param workitemeditendtime 预计结束时间
     */
    //修改预计开始时间和预计结束时间
    public void workItemEditStartEndTime(String workitemeditstarttime,String workitemeditendtime ){
        this.findElements(driver,ProjectPlanElement.WORKITEM_EDIT_TIME_INPUT_BOX).get(0).clear();
        this.findElements(driver,ProjectPlanElement.WORKITEM_EDIT_TIME_INPUT_BOX).get(1).clear();
        this.findElements(driver,ProjectPlanElement.WORKITEM_EDIT_TIME_INPUT_BOX).get(0).sendKeys(workitemeditstarttime);
        this.findElements(driver,ProjectPlanElement.WORKITEM_EDIT_TIME_INPUT_BOX).get(1).sendKeys(workitemeditendtime);
    }
    /**
     * 封装工作项编辑操作，涉及到工作项实际开始时间和实际结束时间的修改
     * @param workitemeditactualstarttime 实际开始时间
     * @param workitemeditactualendtime 实际结束时间
     */
    //修改实际开始时间和实际结束时间
    public void workItemEditActualStartEndTime(String workitemeditactualstarttime,String workitemeditactualendtime ){
        this.findElements(driver,ProjectPlanElement.WORKITEM_EDIT_TIME_INPUT_BOX).get(2).clear();
        this.findElements(driver,ProjectPlanElement.WORKITEM_EDIT_TIME_INPUT_BOX).get(3).clear();
        this.findElements(driver,ProjectPlanElement.WORKITEM_EDIT_TIME_INPUT_BOX).get(2).sendKeys(workitemeditactualstarttime);
        this.findElements(driver,ProjectPlanElement.WORKITEM_EDIT_TIME_INPUT_BOX).get(3).sendKeys(workitemeditactualendtime);
    }
    //修改工作项状态
    public void workItemEditStatus(){
        //将未开始，改为进行中
        this.findElements(driver, ProjectPlanElement.WORKITEM_EDIT_STATUS).get(1).click();
    }
    /**
     * 封装工作项编辑操作，涉及到工作项描述的修改
     * @param workitemeditdescription 工作项描述
     */
    //修改工作项描述内容
    public void workItemEditDescription(String workitemeditdescription){
        this.findElement(driver,ProjectPlanElement.WORKITEM_EDIT_DESCRIPTION_TEXT_BOX).clear();
        this.findElement(driver, ProjectPlanElement.WORKITEM_EDIT_DESCRIPTION_TEXT_BOX).sendKeys(workitemeditdescription);
    }
    //编辑工作项，点击保存按钮
    public void workItemEditSaveButton(){
        this.findElement(driver, ProjectPlanElement.WORKITEM_EDIT_SAVE_BUTTON).click();
    }
    /**
     * 封装工作项查询操作，涉及到按工作项名称搜索
     * @param workitemnamesearch 工作项名称
     */
    //工作项查询，按工作项名称进行搜索
    public void workItemSearchName(String workitemnamesearch){
        this.findElement(driver,ProjectPlanElement.WORKITEM_SEARCH_NAME_INPUT_BOX).clear();
        //输入工作项名称
        this.findElement(driver, ProjectPlanElement.WORKITEM_SEARCH_NAME_INPUT_BOX).sendKeys(workitemnamesearch);
        //按Enter键,进行搜索
        this.findElement(driver, ProjectPlanElement.WORKITEM_SEARCH_NAME_INPUT_BOX).sendKeys(Keys.ENTER);
    }
    //工作项查询，高级搜索
    public void workItemAdvanceSearch(String workitemname,String workitemcode,String workitemowner,String workitemcreator,String workitemstarttime,String workitemendtiem){
        //点击高级搜索展开按钮
        this.findElement(driver, PublicPageElement.ADVANCE_SEARCH_SHOWN_BUTTON).click();
        /**
         * 封装工作项查询操作，涉及到按工作项名称、工作项编码、负责人名称、创建人名称、开始时间、结束时间搜索
         * @param workitemname 工作项名称
         * @param workitemcode 工作项编码
         * @param workitemowner 负责人名称
         * @param workitemcreator 创建人名称
         * @param workitemstarttime 开始时间
         * @param workitemendtime 结束时间
         */
        //输入工作项名称
        this.findElements(driver,ProjectPlanElement.WORKITEM_ADVANCE_SEARCH_TEXT_INPUT_BOX).get(1).clear();
        this.findElements(driver,ProjectPlanElement.WORKITEM_ADVANCE_SEARCH_TEXT_INPUT_BOX).get(1).sendKeys(workitemname);
        //输入工作项编号
        this.findElements(driver,ProjectPlanElement.WORKITEM_ADVANCE_SEARCH_TEXT_INPUT_BOX).get(2).clear();
        this.findElements(driver, ProjectPlanElement.WORKITEM_ADVANCE_SEARCH_TEXT_INPUT_BOX).get(2).sendKeys(workitemcode);
        //输入负责人名称
        List<WebElement> owner = this.findElements(driver,ProjectPlanElement.WORKITEM_ADVANCE_SEARCH_TEXT_INPUT_BOX);
        owner.get(3).clear();
        owner.get(3).sendKeys(workitemowner);
        //输入创建人名称
        List<WebElement> creator = this.findElements(driver, ProjectPlanElement.WORKITEM_ADVANCE_SEARCH_TEXT_INPUT_BOX);
        creator.get(4).clear();
        creator.get(4).sendKeys(workitemcreator);
        //选择工作项状态
        this.findElement(driver,ProjectPlanElement.WORKITEM_ADVANCE_SEARCH_STATUS_DROPDOWN_BOX).click();
        this.findElements(driver,ProjectPlanElement.WORKITEM_ADVANCE_SEARCH_STATUS_LIST_SELECT).get(0).click();
        //输入开始时间
        this.findElements(driver,ProjectPlanElement.WORKITEM_ADVANCE_SEARCH_TIME_INPUT_BOX).get(0).clear();
        this.findElements(driver,ProjectPlanElement.WORKITEM_ADVANCE_SEARCH_TIME_INPUT_BOX).get(0).sendKeys(workitemstarttime);
        //输入结束时间
        this.findElements(driver,ProjectPlanElement.WORKITEM_ADVANCE_SEARCH_TIME_INPUT_BOX).get(1).click();
        this.findElements(driver,ProjectPlanElement.WORKITEM_ADVANCE_SEARCH_TIME_INPUT_BOX).get(1).clear();
        this.findElements(driver,ProjectPlanElement.WORKITEM_ADVANCE_SEARCH_TIME_INPUT_BOX).get(1).sendKeys(workitemendtiem);
        //点击查询按钮
        this.findElement(driver,ProjectPlanElement.ADVANCE_SEARCH_BUTTON).click();
    }
    //工作项列表，选择一条记录，点击名称那一栏
    public void workItemClickNameColumn(){
        //点击第一条工作项，名称那一栏
        this.findElements(driver,ProjectPlanElement.WORKITEM_CLICK_NAMECOLUMN).get(0).click();

    }
    //工作项删除，点击删除按钮
    public void workItemDeleteButton(){
        //再次点击工作项名称那一栏，为了使删除的按钮显示
        this.findElements(driver,ProjectPlanElement.WORKITEM_CLICK_NAMECOLUMN).get(0).click();
        //点击删除按钮
        this.findElements(driver,ProjectPlanElement.WORKITEM_DELETE_BUTTON).get(0).click();
    }
    //删除确认框，点击确定按钮
    public void workItemDeleteSureButton(){
        this.findElement(driver, ProjectPlanElement.WORKITEM_DELETE_SURE_BUTTON).click();
    }

    //点击新建任务按钮
    public void taskAddButton(){
        this.findElement(driver, ProjectPlanElement.TASK_ADD_BUTTON).click();
    }
    /**
     * 封装任务新建操作，涉及到任务名称的输入
     * @param taskname 任务名称
     */
    //输入任务名称
    public void taskNameInput(String taskname){
        this.findElement(driver, ProjectPlanElement.TASK_NAME_INPUT_BOX).clear();
        this.findElement(driver, ProjectPlanElement.TASK_NAME_INPUT_BOX).sendKeys(taskname);
    }
    //选择优先级
    public void taskLevelSelect(){
        //点击优先级下拉框
        this.findElements(driver,ProjectPlanElement.TASK_LEVEL_ASSIGN_DROPDOWN_BOX).get(0).click();
        //下拉列表选择优先级
        this.findElements(driver,ProjectPlanElement.TASK_LEVEL_ASSIGN_LIST_SELECT).get(0).click();
    }
    /**
     * 封装任务新建操作，涉及到预计时间的输入
     * @param taskexpecttime 预计时间
     */
    //输入预计时间
    public void taskExpectTimeInput(String taskexpecttime){
        this.findElement(driver, ProjectPlanElement.TASK_EXPECTTIME_INPUT_BOX).clear();
        this.findElement(driver, ProjectPlanElement.TASK_EXPECTTIME_INPUT_BOX).sendKeys(taskexpecttime);
    }
    /**
     * 封装任务新建操作，涉及到截止日期的输入
     * @param taskendtime 截止日期
     */
    //输入截止日期
    public void taskEndtimeInput(String taskendtime){
        this.findElement(driver, ProjectPlanElement.TASK_ENDTIME_INPUT_BOX).clear();
        this.findElement(driver, ProjectPlanElement.TASK_ENDTIME_INPUT_BOX).sendKeys(taskendtime);
    }
    //选择指派人
    public void taskAssignSelect(){
        //点击指派人下拉框
        this.findElements(driver,ProjectPlanElement.TASK_LEVEL_ASSIGN_DROPDOWN_BOX).get(1).click();
        //下拉列表选择指派人
        this.findElements(driver,ProjectPlanElement.TASK_LEVEL_ASSIGN_LIST_SELECT).get(0).click();
    }
    /**
     * 封装任务新建操作，涉及到描述的输入
     * @param taskdescription 描述
     */
    //输入任务描述内容
    public void taskDescriptionInput(String taskdescription){
        this.findElement(driver, ProjectPlanElement.TASK_DESCRIPTION_TEXTAREA_BOX).clear();
        this.findElement(driver, ProjectPlanElement.TASK_DESCRIPTION_TEXTAREA_BOX).sendKeys(taskdescription);
    }
    //新建任务，点击确认按钮
    public void taskAddSureButton(){
        this.findElement(driver, ProjectPlanElement.TASK_ADD_SURE_BUTTON).click();
    }
    //打印新建成功的任务名称（第一条）
    public void taskAddNamePrint(){
        try{
            System.out.println("任务新建成功："+ this.findElement(driver, ProjectPlanElement.TASK_NAME).getText());
        }
        catch (Exception e){
            System.out.println("任务新建失败");
        }
    }
    //打印修改成功的任务名称（第一条）
    public void taskEditNamePrint(){
        try{
            System.out.println("任务修改成功：" + this.findElement(driver, ProjectPlanElement.TASK_NAME).getText());
        }
        catch (Exception e){
            System.out.println("任务修改失败");
        }
    }
    //打印第一条任务名称
    public void taskNamePrint(){
        try{
            System.out.println(this.findElement(driver, ProjectPlanElement.TASK_NAME).getText());
        }
        catch (Exception e){
            System.out.println("该任务不存在,已被删除");
        }
    }
    //打开任务详情页面
    public void taskNameOpen(){
        this.findElement(driver, ProjectPlanElement.TASK_NAME).click();
    }
    //点击任务编辑按钮
    public void taskEditButton(){
        this.findElement(driver, ProjectPlanElement.TASK_EDIT_BUTTON).click();
    }
    //修改所属工作项
    public void taskEditOwnerWorkItem(){
        this.findElements(driver,ProjectPlanElement.TASK_EDIT_DROPDOWN_BOX).get(0).click();
        this.findElements(driver,ProjectPlanElement.TASK_EDIT_DROPDOWN_LIST).get(0).click();
    }
    /**
     * 封装任务编辑操作，涉及到任务名称的输入
     * @param taskeditname 任务名称
     */
    //修改任务名称
    public void taskEditNameInput(String taskeditname){
        this.findElements(driver, ProjectPlanElement.TASK_EDIT_TEXT_INPUT_BOX).get(0).clear();
        this.findElements(driver, ProjectPlanElement.TASK_EDIT_TEXT_INPUT_BOX).get(0).sendKeys(taskeditname);
    }

    //修改优先级
    public void taskEditLevel(){
        this.findElements(driver,ProjectPlanElement.TASK_EDIT_DROPDOWN_BOX).get(1).click();
        this.findElements(driver,ProjectPlanElement.TASK_EDIT_DROPDOWN_LIST).get(1).click();
    }

    /**
     * 封装任务编辑操作，涉及到任务预计时间的输入
     * @param taskeditexpecttime 预计时间
     */
    //修改预计时间
    public void taskEditExpecttimeInput(String taskeditexpecttime){
        this.findElements(driver, ProjectPlanElement.TASK_EDIT_TEXT_INPUT_BOX).get(1).clear();
        this.findElements(driver, ProjectPlanElement.TASK_EDIT_TEXT_INPUT_BOX).get(1).sendKeys(taskeditexpecttime);
    }

    /**
     * 封装任务编辑操作，涉及到任务已耗时的输入
     * @param taskedittasktime 已耗时
     */
    //修改已耗时
    public void taskEditTasktimeInput(String taskedittasktime){
        this.findElements(driver, ProjectPlanElement.TASK_EDIT_TEXT_INPUT_BOX).get(2).clear();
        this.findElements(driver, ProjectPlanElement.TASK_EDIT_TEXT_INPUT_BOX).get(2).sendKeys(taskedittasktime);
    }
    /**
     * 封装任务编辑操作，涉及到任务截止日期的输入
     * @param taskeditendtime 截止日期
     */
    //修改截止日期
    public void taskEditEndtimeInput(String taskeditendtime){
        this.findElement(driver, ProjectPlanElement.TASK_EDIT_ENDTIME_INPUT_BOX).clear();
        this.findElement(driver, ProjectPlanElement.TASK_EDIT_ENDTIME_INPUT_BOX).sendKeys(taskeditendtime);
    }
    //修改指派人
    public void taskEditAssign(){
        this.findElements(driver,ProjectPlanElement.TASK_EDIT_DROPDOWN_BOX).get(2).click();
        this.findElements(driver,ProjectPlanElement.TASK_EDIT_DROPDOWN_LIST).get(0).click();
    }
    /**
     * 封装任务编辑操作，涉及到任务描述的输入
     * @param taskeditdescription 描述
     */
    //修改描述内容
    public void taskEditDescription(String taskeditdescription ){
        this.findElement(driver, ProjectPlanElement.TASK_EDIT_DESCRIPTION_TEXTAREA_BOX).clear();
        this.findElement(driver, ProjectPlanElement.TASK_EDIT_DESCRIPTION_TEXTAREA_BOX).sendKeys(taskeditdescription);
    }
    //修改任务状态
    public void taskEditStatus(){
        this.findElements(driver,ProjectPlanElement.TASK_EDIT_DROPDOWN_BOX).get(3).click();
        this.findElements(driver,ProjectPlanElement.TASK_EDIT_DROPDOWN_LIST).get(0).click();
    }
    //点击任务编辑页面的保存按钮
    public void taskEditSaveButton(){
        this.findElement(driver, ProjectPlanElement.TASK_EDIT_SAVE_BUTTON).click();
    }
    //在任务列表，选择一条记录，点击名称那一栏
    public void taskClickNameColumn(){
        this.findElements(driver,ProjectPlanElement.TASK_CLICK_NAMECOLUMN).get(0).click();
    }
    //点击任务删除按钮
    public void taskDeleteButton(){
        this.findElements(driver,ProjectPlanElement.TASK_DELETE_BUTTON).get(0).click();
    }
    //弹出的删除确认框，点击确定按钮
    public void taskDeleteSureButton(){
        this.findElement(driver, ProjectPlanElement.TASK_DELETE_SURE_BUTTON).click();
    }

    //点击左侧菜单,团队
    public void teamMenu(){
        this.findElements(driver,ProjectPlanElement.STAGE_MENU_LIST).get(5).click();
    }
    //团队分组的添加
    public void teamGroupAdd(String teamgroupname){
        //点击添加分组按钮
        this.findElement(driver, ProjectPlanElement.TEAM_GROUP_ADD_BUTTON).click();
        /**
         * 封装团队分组添加操作，涉及到分组名称的输入
         * @param teamgroupname 分组名称
         */
        //定位分组名称输入框，输入分组名称
        this.findElement(driver,ProjectPlanElement.TEAM_GROUP_NAME_INPUT_BOX).clear();
        this.findElement(driver, ProjectPlanElement.TEAM_GROUP_NAME_INPUT_BOX).sendKeys(teamgroupname);
        //点击保存按钮
        this.findElement(driver, ProjectPlanElement.TEAM_GROUP_NAME_SAVE_BUTTON).click();
        //打印新建成功的分组名称
        try{
            System.out.println("团队分组添加成功" + this.findElements(driver, ProjectPlanElement.TEAM_GROUP_NAME).get(0).getText());
        }
        catch (Exception e){
            System.out.println("该团队分组不存在");
        }
    }
    //团队分组名称编辑
    public void teamGroupNameEdit(String teamgroupeditname){
        //先选中第二个分组，使编辑按钮显示
        List<WebElement> group = this.findElements(driver, ProjectPlanElement.TEAM_GROUP_CLICK_NAMECOLUMN);
        group.get(1).click();
        //点击编辑按钮
        group.get(1).findElement(ProjectPlanElement.TEAM_GROUP_NAME_EDIT_BUTTON).click();
        /**
         * 封装团队分组编辑操作，涉及到分组名称的修改
         * @param teamgroupeditname 分组名称
         */
        //再次定位分组名称输入框，修改分组名称
        this.findElement(driver,ProjectPlanElement.TEAM_GROUP_NAME_INPUT_BOX).clear();
        this.findElement(driver, ProjectPlanElement.TEAM_GROUP_NAME_INPUT_BOX).sendKeys(teamgroupeditname);
        //再次点击保存按钮
        this.findElement(driver,ProjectPlanElement.TEAM_GROUP_NAME_SAVE_BUTTON).click();
        //打印修改后的分组名称
        try{
            System.out.println("团队分组修改成功" + this.findElements(driver, ProjectPlanElement.TEAM_GROUP_NAME).get(0).getText());
        }
        catch (Exception e){
            System.out.println("该团队分组不存在");
        }
    }
    //团队分组删除
    public void teamGroupDelete(){
        //先选中第二个分组，使删除按钮显示
        List<WebElement> group = this.findElements(driver, ProjectPlanElement.TEAM_GROUP_CLICK_NAMECOLUMN);
        group.get(1).click();
        //点击删除按钮
        group.get(1).findElement(ProjectPlanElement.TEAM_GROUP_DELETE_BUTTON).click();
        //在弹出删除确认框，点击确定按钮
        this.findElement(driver,ProjectPlanElement.TEAM_GROUP_DELETE_SURE_BUTTON).click();
        //打印分组名称，如果不存在给出提示
        try{
            System.out.println("团队分组删除成功"+ this.findElements(driver, ProjectPlanElement.TEAM_GROUP_NAME).get(0).getText());
        }
        catch (Exception e){
            System.out.println("该团队分组不存在，已被删除");
        }
    }
    //团队，点击新增成员按钮
    public void teamMemberAddButton(){
        this.findElement(driver,ProjectPlanElement.TEAM_MEMBER_ADD_BUTTON).click();
    }
    //在弹出的模态框内，搜索成员姓名，点击复选框勾选第一条记录
    public void teamMemberModalSelect(String selectmembername){
        WebElement a = this.findElement(driver, ProjectPlanElement.TEAM_MEMBER_SELECT_MODAL);
        /**
         * 封装团队成员添加操作，涉及到成员姓名搜索
         * @param selectmembername 成员姓名
         */
        //输入成员姓名
        a.findElements(ProjectPlanElement.TEAM_MEMBER_MODAL_CHECKBOX).get(1).sendKeys(selectmembername);
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            return;
        }
        //勾选全部选复选框
        a.findElements(ProjectPlanElement.TEAM_MEMBER_MODAL_CHECKBOX).get(0).click();
        //勾选单条记录,列表中第一条记录
        //a.findElements(ProjectPlanElement.TEAM_MEMBER_MODAL_CHECKBOX).get(2).click();
    }

    //在弹出的模态框内，点击确定按钮
    public void teamMemberSelectSureButton(){
        this.findElement(driver, ProjectPlanElement.TEAM_MEMBER_SELECT_SURE_BUTTON).click();
    }

    /**
     * 封装团队成员查询操作，涉及到按成员姓名、部门、机构搜索
     * @param teammember 关键字
     */
    //团队列表，成员搜索输入框
    public void teamMemberSearchInput(String teammember){
        this.findElement(driver, ProjectPlanElement.TEAM_MEMBER_SEARCH_INPUT_BOX).clear();
        this.findElement(driver, ProjectPlanElement.TEAM_MEMBER_SEARCH_INPUT_BOX).sendKeys(teammember);

    }
    //团队列表，选择一条记录，点击删除按钮。进行单项删除
    public void teamMemberSingleDelete(){
        //选择一条成员,选择第二条
        List<WebElement> member = this.findElements(driver, ProjectPlanElement.TEAM_MEMBER_SELECT);
        member.get(1).click();
        //点击删除按钮
        member.get(1).findElement(ProjectPlanElement.TEAM_MEMBER_SINGLE_DELETE_BUTTON).click();
    }
    //在团队列表，点击复选框
    public void teamMemberSelect(){
        List<WebElement> inputbox = this.findElements(driver, ProjectPlanElement.TEAM_MEMBER_CHECK_BOX);
        /**
         * 封装团队成员成员查询，涉及到成员姓名搜索
         * @param membername 成员姓名
         */
        /*在搜索框输入成员姓名（注：此处不进行成员搜索，否则由于无法保存证下面的步骤可以正常执行；
        原因：如果列表没有加载全部成员的话，没有显示出来的成员，应会占用一个input，但是无法click到，就会报错*/
        //inputbox.get(0).sendKeys(membername);
        //用以下方法时，会将团队列表中全部成员都勾选起来
       /*for (WebElement input : inputbox) {
            if(input.getAttribute("type").equals("checkbox")){
                System.out.println(input.getTagName());
                input.click();
            }
        }*/

        //勾选单条记录,勾选团队成员列表中的第二、三条记录
        inputbox.get(2).click();
        inputbox.get(3).click();

    }
    //团队成员删除，点击批量删除按钮
    public void teamMeamberLotDeleteButton(){
        this.findElement(driver,ProjectPlanElement.TEAM_MEMBER_LOT_DELETE_BUTTON).click();
    }
    //弹出的删除确认框，点击确定按钮
    public void teamMemberDeleteSureButton(){
        this.findElement(driver,ProjectPlanElement.TEAM_MEMBER_DELETE_SURE_BUTTON).click();
    }
    //在弹出的删除确认框，点击取消按钮
    public void teamMemberDeleteCancelButton(){
        this.findElement(driver, ProjectPlanElement.TEAM_MEMBER_DELETE_CANCEL_BUTTON).click();
    }













}
