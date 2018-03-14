package page.element;

import org.openqa.selenium.By;

/**
 * Created by nanjia on 2016/3/16.
 * 项目规划应用下的页面元素
 */
public class ProjectPlanElement {
    //项目新建按钮
    public static By PROJECT_ADD_BUTTON = By.cssSelector("div.main-panel button.btn.btn-default.ember-view");
    //项目名称输入框
    public static By PROJECT_NAME_INPUT_BOX = By.cssSelector("input[name=name]");
    //项目负责人，下拉框
    public static By PROJECT_OWNER_DROPDOWN_BOX = By.cssSelector("ul.tagit");
    //项目负责人，下拉列表下的用户选择（注：未实现）
    public static By PROJECT_OWNER_SELECT_CHECK_BOX = By.tagName("input");
    //新建项目页面，下拉框(主办部门、项目类型、项目模板）
    public static By PROJECT_DROPDOWN_BOX = By.cssSelector("div.btn.btn-default.dropdown-toggle");
    //项目主办部门下拉列表，展开树根目录
    public static By PROJECT_HOSTDEPARTMENT_ZTREEROOT = By.cssSelector("span.root_close");
    //项目主办部门，下拉列表下的选择按钮
    public static By PROJECT_HOSTDEPARTMENT_SELECT_BUTTON = By.cssSelector("a[title='英华达'] span button");
    //项目类型，获取下拉列表的li (专项工作、项目）
    public static By PROJECT_TYPE_LIST = By.cssSelector("div ul.dropdown-menu.width-100.ember-view li");
    //新建项目页面，时间输入框（立项时间、结束时间、期望上线时间、期望上线时间、申请日期、计划开始时间、计划结束时间）
    public static By PROJECT_TIME_INPUT_BOX = By.cssSelector("div.datetimepicker.input-group.date input");
    //项目总工作日输入框
    public static By PROJECT_TOTALWORKTIME_INPUT_BOX = By.cssSelector("input[name=workingTime]");
    //联系电话
    public static By PROJECT_TELEPHONE_INPUT_BOX = By.cssSelector("input[name=phone]");
    //项目模板下拉列表选项选择
    public static  By PROECT_MODAL_LIST_SELECT = By.cssSelector("ul.dropdown-menu.width-100.ember-view ul li");
    //新建项目页面的确定按钮
    public static By PROJECT_ADD_SURE_BUTTON = By.cssSelector("button[type='submit']");

    //在项目列表页面，定位一个项目名称
    public static By PROJECT_NAME_OPEN = By.cssSelector("tbody tr td[title='自动化测试项目']");
    //在项目列表页面，定位编辑修改后的项目名称
    public static By PROJECT_EDIT_NAME = By.cssSelector("td[title='修改自动化测试项目'] a a");
    //打开项目后，顶部的项目名称
    public static By PROJECT_NAME_CLICK = By.cssSelector("div.home-head h3 a");
    //项目编辑按钮
    public static By PROJECT_EDIT_BUTTON = By.cssSelector("div.inline-block.ember-view button");
    //项目编辑页面，项目名称、联系电话、总工作日输入框
    public static By PROJECT_EDIT_TEXT_INPUT_BOX = By.cssSelector("input.width-100.ember-view.ember-text-field");
    //项目编辑页面，时间输入框（申请时间、立项时间、结束时间、预计开始时间、预计结束时间、期望上线时间 ）
    public static By PROJECT_EDIT_TIME_INPUT_BOX = By.cssSelector("div.datetimepicker.input-group.date input");
    //项目编辑页面，下拉框(主办部门、项目类型、项目状态）
    public static By PROJECT_EDIT_DORPDOWN_BOX = By.cssSelector("div.btn.btn-default.dropdown-toggle");
    //项目编辑页面,主办部门下拉列表，展开树根目录
    public static By PROJECT_EDIT_HOSTDEPARTMENT_ZTREEROOT = By.cssSelector("span.root_close");
    //项目编辑页面,主办部门，下拉列表下的选择按钮
    public static By PROJECT_EDIT_HOSTDEPARTMENT_SELECT_BUTTON = By.cssSelector("a[title='广州1'] span button");
    //项目编辑页面，项目负责人下拉框
    public static By PROJECT_EDIT_OWNER_DORPDOWN_BOX = By.cssSelector("ul.tagit");
    //下拉列表，搜索框
    public static By PROJECT_EDIT_OWNER_DORPDOWN_SEARCH_BOX = By.cssSelector("div.search-box input");
    //复选框 (还有问题定位不到复选框）
    public static By PROJECT_EDIT_OWNER_SELECT_BOX = By.cssSelector("li.message-item.ember-view.simple-list-item a label input[type='checkbox']");
    //项目状态，获取下拉列表的li(进行中、已终止、已完成、未开始、已归档）（注：有问题，未实现）
    public static By PROJECT_EDIT_STATUS_LIST = By.cssSelector("ul li a:contains('进行中')");
    //项目编辑页面，项目目标 (注：下面这个还没定位到，输入框有嵌套ifram）
    public static By PROJECT_EDIT_AIM_INPUT_BOX = By.xpath("//form/table[2]/tbody/tr[11]/td[2]");
    //需求综述\项目背景其他信息 (注：未实现，后面补充）
    //项目编辑页面，项目公开性,私有、公有
    public static By PROJECT_EDIT_PUBLICITY = By.cssSelector("span.lbl");
    //项目编辑页面,保存按钮
    public static By PROJECT_EDIT_SAVE_BUTTON = By.cssSelector("button i.fa.fa-check");
    //项目编辑页面,取消按钮
    public static By PROJECT_EDIT_CANCEL_BUTTON = By.cssSelector("button i.fa.fa-ban");
    //详情页面，左上角的返回按钮 (返回按钮，公共调用元素）
    public static By DETAIL_PAGE_RETURN_BUTTON = By.cssSelector("button i.fa.fa-chevron-left");

    //项目查询，文本输入框（按项目名称搜索框、项目名称、项目编号、主办部门、项目负责人）
    public static By PROJECT_SEARCH_TEXT_INPUT_BOX = By.cssSelector("input.form-control.ember-view.ember-text-field");
    //项目查询，高级搜索下的-项目状态下拉框
    public static By PROJECT_SEARCH_STATUS_DROPDOWN_BOX = By.cssSelector("div.btn.btn-default.dropdown-toggle");
    //获取项目状态列表li
    public static By PROJECT_SEARCH_STATUS_LIST_SELECT = By.cssSelector("div.ember-view.dropdown-options ul li" );
    //时间输入框（立项时间、结束时间、期望上线时间）
    public static By PROJECT_SEARCH_TIME_INPUT_BOX = By.cssSelector("div.datetimepicker.input-group.date input");
    //获取项目列表的项目名称(注：用于打印项项目列表名称）
    public static By PROJECT_NAME_LIST = By.xpath("//tbody/tr/td[2]/a");
    //项目列表下的项目名称
    public static By PROJECT_NAME = By.cssSelector("a");

    //选择一条项目（注：由于点击项目名称title那个元素也会直接打开项目，所以暂时只能用get(2)还实现）
    public static By PROJECT_NAMEBAR_CLICK = By.cssSelector("table.pj-table-list tbody tr");
    //项目删除按钮
    public static By PROJECT_DELETE_BUTTON = By.cssSelector("i[title='删除']");
    //删除确认框上的确定按钮
    public static By PROJECT_DELETE_SURE_BUTTON = By.cssSelector("div[style='display: block;'] button.btn.btn-primary.confirm");


    //左侧菜单栏，获取菜单列表li （项目首页、主页、任务、阶段、资产、团阶、IT估算）
    public static By STAGE_MENU_LIST = By.cssSelector("div.main-panel aside ul li");
    //阶段新建按钮
    public static By STAGE_ADD_BUTTON = By.cssSelector("button[title='新建阶段']");
    //阶段编号
    public static By STAGE_NUMBER_INPUT_BOX = By.cssSelector("input[name='code']");
    //阶段名称
    public static By STAGE_NAME_INPUT_BOX = By.cssSelector("input[name='name']");
    //阶段负责人，下拉框  （阶段编辑页面、新建工作项，也调用此元素）
    public static By STAGE_OWNER_DROPDOWN_BOX = By.cssSelector("div.btn.btn-default.dropdown-toggle");
    //阶段负责人，下拉列表的人员li （阶段编辑页面、新建工作项，也调用此元素）
    public static By STAGE_OWNER_LIST = By.cssSelector("ul.dropdown-menu.width-100.ember-view li");
    //时间输入框，阶段预计开始时间、预计结束时间、实际开始时间、实际结束时间
    public static By STAGE_TIME_INPUT_BOX = By.cssSelector("div.datetimepicker.input-group.date input");
    //阶段结束时间(注：功能上该字段已去掉）
    //public static By STAGE_ENDTIME_INPUT_BOX = By.cssSelector("div[data-test='input-wrapper-for-end-time'] input");
    //阶段里程碑设置,是  (注：是 定位不到）
    public static By STAGE_MILEPOST_YES = By.xpath("//form/div[1]/div[4]/div[1]/div/div/label[1]/span");
    //阶段里程碑设置,否 (注：否 定位不到）
    public static By STAGE_MILEPOST_NO = By.xpath("//form/div[1]/div[4]/div[1]/div/div/label[2]/span");
    //阶段目标文本输入框
    public static By STAGE_TARGET_TEXTAREA = By.cssSelector("textarea[name='target']");
    //新建阶段，确认按钮
    public static By STAGE_ADD_SURE_BUTTON = By.cssSelector("button[type='submit']");
    //阶段页面，定位新建成功的阶段名称 （第一条记录）
    public static By STAGE_NAME = By.xpath("//table/tbody/tr[1]/td[3]/a");
    //阶段页面，阶段列表
    public static By STAGE_NAME_LIST = By.cssSelector("table.table.table-list tbody tr");
    //阶段列表，阶段名称
    public static By STAGE_NAME_LIST_A = By.cssSelector("td a");
    //阶段详情页面，编辑按钮
    public static By STAGE_EDIT_BUTTON = By.cssSelector("div.panel-body button");
    //阶段编辑页面，阶段名称输入框
    public static By STAGE_EDIT_NAME_INPUT_BOX = By.xpath("//form/table[1]/tbody/tr[2]/td[2]//input");
    //阶段编辑页面,实际完成时间、预计开始时间、预计结束时间、实际开始时间、实际完成时间输入框
    public static By STAGE_EDIT_TIME_INPUT_BOX = By.cssSelector("div.datetimepicker.input-group.date input");
    //单选框(里程碑是、否；阶段状态未开始、进行中、已完成）
    public static By STAGE_EDIT_RADIOBUTTON = By.cssSelector("label.inline span");
    //阶段编辑页面，目标
    public static By STAGE_EDIT_TARGET_TEXTAREA = By.cssSelector("textarea.ember-text-area");
    //阶段编辑页面，保存按钮
    public static By STAGE_EDIT_SAVE_BUTTON = By.cssSelector("button i.fa.fa-check");

    //阶段查询，按名称搜索输入框；高级搜索下的-输入框（名称、编号、负责人）
    public static By STAGE_TEXT_INPUT_BOX = By.cssSelector("input.form-control.ember-view.ember-text-field");
    //阶段查询,高级搜索下的-下拉框(里程碑、状态）
    public static By STAGE_ADVANCE_DROPDOWN_BOX = By.cssSelector("div.btn.btn-default.dropdown-toggle");
    //获取里程碑选择列表li (是、否）
    public static By STAGE_ADVANCE_MILEPOST_SELECT_LIST = By.cssSelector("div.ember-view.dropdown-options ul li");
    //获取状态选择列表li(进行中、已完成、未开始） (注：定位有问题，未实现）
    public static By STAGE_ADVANCE_STATUS_SELECT_LIST = By.cssSelector("div.ember-view.dropdown-options ul li");
    //阶段查询,高级搜索下的-时间输入框(预计开始时间、预计结束时间、实际完成时间）
    public static By STAGE_ADVANCE_TIME_INPUT_BOX = By.cssSelector("div.datetimepicker.input-group.date input");
    //阶段查询,高级搜索下的-查询按钮  (高级搜索，都调用这个元素）
    public static By ADVANCE_SEARCH_BUTTON = By.cssSelector("div.advance-search-btns button.btn.btn-primary.btn-search");
    //阶段查询,高级搜索下的-清空按钮
    public static By STAGE_ADVANCE_CLEAR_BUTTON = By.cssSelector("div.advance-search.show div.advance-search-btns button.btn.btn-default");

    //阶段列表，选中第一条记录
    public static By STAGE_SELECTED = By.xpath("//tbody/tr[1]/td[3]");
    //阶段列表，勾选第一条记录，勾选复选框 （注：复选框定位有问题，未实现）
    public static By STAGE_CHECK_BOX = By.xpath("//tbody/tr[1]/td[1]/div/input");
    //阶段批量删除按钮
    public static By STAGE_LARGE_DELETE_BUTTON = By.cssSelector("button[title='删除']");
    //阶段单个删除按钮
    public static By STAGE_SINGLE_DELETE_BUTTON = By.cssSelector("a[title='删除'] i.fa.fa-trash-o.light-grey");
    //阶段删除确认框，确定按钮
    public static By STAGE_DELETE_SURE_BUTTON = By.cssSelector("div[style='display: block;'] button.btn.btn-primary.confirm");

    //新增任务按钮
    public static By WORKITEM_ADD_BUTTON = By.cssSelector("button i.fa.fa-plus.light-grey");
    //任务编号
    public static By WORKITEM_CODE_INPUT_BOX = By.cssSelector("input[name='code']");
    //任务名称
    public static By WORKITEM_NAME_INPUT_BOX = By.cssSelector("input[name='name']");
    //任务，下拉框(负责人、优先级）
    public static By WORKITEM_DROPDOWN_BOX = By.cssSelector("div.btn.btn-default.dropdown-toggle");
    //任务，获取优先下拉列表li (紧急、高、一般、低）(注：优先级定位有问题，未实现）
    public static By WORKITEM_LEVEL_SELECT_LIST = By.cssSelector("div.ember-view.dropdown-options ul li");
    //任务，时间输入框（预计开始时间、预计结束时间、实际开始时间、实妹结束时间）
    public static By WORKITEM_TIME_INPUT_BOX = By.cssSelector("div.datetimepicker.input-group.date input");
    //任务描述
    public static By WORKITEM_DESCRIPTION_TEXT_BOX = By.cssSelector("textarea[name='description']");
    //新建工作项，确认按钮
    public static By WORKITEM_ADD_SURE_BUTTON = By.cssSelector("button[type='submit']");
    //定位第一条工作项名称
    public static By WORKITEM_NAME = By.cssSelector("td.work-item-name a");

    //工作项编辑页面，编辑按钮
    public static By WORKITEM_EDIT_BUTTON = By.cssSelector("i[title='编辑']");
    //工作项编辑页面,所属阶段下拉框
    public static By WORKITEM_EDIT_STAGE_DROPDOWN_BOX = By.cssSelector("ul.tagit");
    //获取所属阶段下拉列表li（注：由于下拉框无法自动缩回去，导致后面的优先级、负责人下拉框都会有问题，因此这个暂不实现）
    public static By WORKITEM_EDIT_STAGE_LIST_SELECT = By.cssSelector("div.ember-view.dropdown-options.dropdown-options-multiple ul li");
    //工作项编辑页面,修改工作项名称
    public static By WORKITEM_EDIT_NAME_INPUT_BOX = By.cssSelector("input.width-100.ember-view.ember-text-field");
    //下拉框控件元素 （优先级、负责人）
    public static By WORKITEM_EDIT_DROPDOWN_BOX = By.cssSelector("div.btn.btn-default.dropdown-toggle");
    //获取优先级，下拉列表li
    public static By WORKITEM_EDIT_LEVEL_LIST_SELECT = By.cssSelector("ul.dropdown-menu.width-100.ember-view li");
    //获取负责人，下拉列表li （注：由于一个页面有多个下拉框列表，只能定位到第一个开的列表元素，因为这个未能定位到）
    public static By WORKITEM_EDIT_OWNER_LIST_SELECT = By.cssSelector("ul.dropdown-menu.width-100.ember-view li");
    //工作项编辑页面,时间输入框（预计开始时间、预计结束时间、实际开始时间、实际结束时间）
    public static By WORKITEM_EDIT_TIME_INPUT_BOX = By.cssSelector("div.datetimepicker.input-group.date input");
    //工作项编辑页面，修改状态-未开始\进行中\已完成
    public static By WORKITEM_EDIT_STATUS = By.cssSelector("label.inline span");
    //工作项编辑页面，修改工作项描述
    public static By WORKITEM_EDIT_DESCRIPTION_TEXT_BOX = By.cssSelector("textarea.ember-text-area");
    //工作项编辑页面，保存按钮
    public static By WORKITEM_EDIT_SAVE_BUTTON = By.cssSelector("i.fa.fa-check");

    //工作项查询，按名称搜索输入框
    public static By WORKITEM_SEARCH_NAME_INPUT_BOX = By.cssSelector("div.search-box input");
    //工作项查询，高级搜索下的-工作项名称、工作项编码、负责人名称、创建人名称输入框
    public static By WORKITEM_ADVANCE_SEARCH_TEXT_INPUT_BOX = By.cssSelector("input.form-control.ember-view.ember-text-field");
    //工作项查询，工作项状态下拉框
    public static By WORKITEM_ADVANCE_SEARCH_STATUS_DROPDOWN_BOX = By.cssSelector("div.panel-body.elastic-body div.btn.btn-default.dropdown-toggle");
    //获取下拉列表li(未完成、未开始、进行中、已完成）
    public static By WORKITEM_ADVANCE_SEARCH_STATUS_LIST_SELECT = By.cssSelector("div.ember-view.dropdown-options ul li");
    //工作项查询，高级搜索下的-开始时间、结束时间输入框
    public static By WORKITEM_ADVANCE_SEARCH_TIME_INPUT_BOX = By.cssSelector("div.datetimepicker.input-group.date input");
    //工作项列表
    public static By WORKITEM_NAME_LIST = By.cssSelector("table.table.table-list.work-item-list tbody tr");


    //在工作项列表，选择一条工作项，定位名称那栏
    public static By WORKITEM_CLICK_NAMECOLUMN = By.cssSelector("td.work-item-name");
    //工作项删除按钮
    public static By WORKITEM_DELETE_BUTTON = By.cssSelector("i.fa.fa-trash-o.list-icon");
    //在弹出的删除确认框，确定按钮
    public static By WORKITEM_DELETE_SURE_BUTTON = By.cssSelector("div[style='display: block;'] button.btn.btn-primary.confirm");

    //任务新建按钮
    public static By TASK_ADD_BUTTON = By.cssSelector("div.btn-success.create-task");
    //任务名称
    public static By TASK_NAME_INPUT_BOX = By.cssSelector("input[name='name']");
    //优先级、指派人的下拉框
    public static By TASK_LEVEL_ASSIGN_DROPDOWN_BOX = By.cssSelector("div.btn.btn-default.dropdown-toggle");
    //获取下拉列表li (注：由于有多个列表框，第二个指派人定位不到）
    public static By TASK_LEVEL_ASSIGN_LIST_SELECT = By.cssSelector("div.ember-view.dropdown-options ul li");
    //预计时间
    public static By TASK_EXPECTTIME_INPUT_BOX = By.cssSelector("input[name='planExecuteTime']");
    //截止日期
    public static By TASK_ENDTIME_INPUT_BOX = By.cssSelector("div.datetimepicker.input-group.date input");
    //描述
    public static By TASK_DESCRIPTION_TEXTAREA_BOX = By.cssSelector("textarea[name='description']");
    //新建任务，确认按钮
    public static By TASK_ADD_SURE_BUTTON = By.cssSelector("button[type='submit']");

    //定位任务名称
    public static By TASK_NAME = By.cssSelector("td.task-name a");
    //任务编辑页面，点击编辑按钮
    public static By TASK_EDIT_BUTTON = By.cssSelector("i.fa.fa-pencil");
    //任务编辑页面，下拉框（所属工作项、优先级、指派人、任务状态）
    public static By TASK_EDIT_DROPDOWN_BOX = By.cssSelector("div.btn.btn-default.dropdown-toggle");
    //获取下拉列表li
    public static By TASK_EDIT_DROPDOWN_LIST = By.cssSelector("ul.dropdown-menu.width-100.ember-view li");
    //任务编辑页面，修改任务名称、预计时间、已耗时
    public static By TASK_EDIT_TEXT_INPUT_BOX = By.cssSelector("input.width-100.ember-view.ember-text-field");
    //任务编辑页面，修改截止时间
    public static By TASK_EDIT_ENDTIME_INPUT_BOX = By.cssSelector("div.datetimepicker.input-group.date input");
    //任务编辑页面，修改描述内容
    public static By TASK_EDIT_DESCRIPTION_TEXTAREA_BOX = By.cssSelector("textarea.ember-text-area");
    //任务编辑页面，保存按钮
    public static By TASK_EDIT_SAVE_BUTTON = By.cssSelector("i.fa.fa-check");

    //在任务列表，选择一条记录，定位名称那一栏
    public static By TASK_CLICK_NAMECOLUMN = By.cssSelector("td.task-name");
    //任务删除按钮
    public static By TASK_DELETE_BUTTON = By.cssSelector("a[title='删除'] i.fa.fa-trash-o");
    //删除确认框，确定按钮
    public static By TASK_DELETE_SURE_BUTTON = By.cssSelector("div[style='display: block;'] button.btn.btn-primary.confirm");

    //团队，添加分组按钮
    public static By TEAM_GROUP_ADD_BUTTON = By.cssSelector("div.pm-add-btn button.btn.btn-primary");
    //分组名称输入框
    public static By TEAM_GROUP_NAME_INPUT_BOX = By.cssSelector("input.pm-focus-input-edit");
    //分组名称保存按钮
    public static By TEAM_GROUP_NAME_SAVE_BUTTON = By.cssSelector("div.pm-edit-i i.fa.fa-check");
    //定位新建分组那一栏
    public static By TEAM_GROUP_CLICK_NAMECOLUMN = By.cssSelector("li.list-group-item.ember-view");
    //定位分组名称
    public static By TEAM_GROUP_NAME = By.cssSelector("div.pm-li-fixed span");
    //分组名称编辑按钮
    public static By TEAM_GROUP_NAME_EDIT_BUTTON = By.cssSelector("i.fa.fa-pencil");
    //分组删除按钮
    public static By TEAM_GROUP_DELETE_BUTTON = By.cssSelector("div.list-group-item-toolbar-secondary i.fa.fa-trash-o");
    //删除确认框，确定按钮
    public static By TEAM_GROUP_DELETE_SURE_BUTTON = By.cssSelector("div[style='display: block;'] button.btn.btn-primary.confirm");

    //新增成员按钮
    public static By TEAM_MEMBER_ADD_BUTTON = By.cssSelector("button[title='新增成员']");
    //复选框 (注：复选框定位有问题，未实现）
    public static By TEAM_MEMBER_CHECK_BOX = By.tagName("input");
    //团队成员选择框
    public static By TEAM_MEMBER_SELECT_MODAL = By.cssSelector("div.modal-body.pm-modal-body");
    //定位input标签
    public static By TEAM_MEMBER_MODAL_CHECKBOX = By.tagName("input");

    //添加项目成员选择框，确定按钮
    public static By TEAM_MEMBER_SELECT_SURE_BUTTON = By.cssSelector("div.ember-view.modal.fade.in button.btn.btn-primary");

    //团队列表，搜索输入框
    public static By TEAM_MEMBER_SEARCH_INPUT_BOX = By.cssSelector("div.search-bar.advance-search-container input");

    //团队列表，选择一条记录
    public static By TEAM_MEMBER_SELECT = By.cssSelector("tbody.pm-table tr");
    //团队列表，单项删除按钮
    public static By TEAM_MEMBER_SINGLE_DELETE_BUTTON = By.cssSelector("i.fa.fa-trash-o.pm-trash-o");
    //团队列表，批量删除按钮
    public static By TEAM_MEMBER_LOT_DELETE_BUTTON = By.cssSelector("button[title='删除成员']");
    //删除确认框，确定按钮
    public static By TEAM_MEMBER_DELETE_SURE_BUTTON = By.cssSelector("div[style='display: block;'] button.btn.btn-primary.confirm");
    //删除确认框，取消按钮
    public static By TEAM_MEMBER_DELETE_CANCEL_BUTTON = By.cssSelector("div[style='display: block;'] button.btn.btn-default.cancel");
    //团队成员列表
    public static By TEAM_MEMER_LIST = By.cssSelector("tbody.pm-table tr");
    ////团队成员列表名称
    public static By TEAM_MEMER_NAME = By.cssSelector("div.pm-name-right-60");




































}
