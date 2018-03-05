package com.we.weblog.controller.admin;

import com.vue.adminlte4j.model.Menu;
import com.vue.adminlte4j.model.UIModel;
import com.vue.adminlte4j.web.springmvc.ApiAdminController;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AdminBlogApiController extends ApiAdminController {

    @Override
    public void addBaseMenus(UIModel uiModel) {
        List<Menu> tempMenus = (List<Menu>)uiModel.get("menu_items");
        //把开发配置放到最后
        Menu conifgMenu = tempMenus.get(0);

        List<Menu> menus = new ArrayList<>();

        Menu menu1 = new Menu("2147483647", "仪表盘", "/admin/index.html", "fa fa-dashboard", 1);
        Menu menu2 = new Menu("2147483647", "新随笔", "/admin/add_blog.html", "fa fa-edit", 2);
        Menu menu3 = new Menu("2147483647", "博客管理", "/admin/show.html", "fa fa-edit", 3);


        Menu menu4 = new Menu("2147483647", "评论管理", "/admin/comments.html", "fa fa-weixin", 4);
        Menu menu5 = new Menu("2147483647", "页面管理", "/admin/pages.html", "fa fa-pagelines", 5);
        Menu menu6 = new Menu("2147483647", "分类标签", "/admin/category.html", "fa fa-tags", 6);



        Menu menu7 = new Menu("2147483647", "主题设置", "/admin/scheme.html", "fa fa-laptop", 7);
        Menu menu8 = new Menu("2147483647", "系统设置", "/admin/system.html", "fa fa-cog", 8);
        Menu menu9 = new Menu("2147483647", "退出登录", "/logout.html", "fa fa-sign-out", 9);

        menus.add(menu1);
        menus.add(menu2);
        menus.add(menu3);
        menus.add(menu4);
        menus.add(menu5);
        menus.add(menu6);
        menus.add(menu7);
        menus.add(menu8);
        menus.add(menu9);
        menus.add(conifgMenu);


        uiModel.menu(menus);
    }

}