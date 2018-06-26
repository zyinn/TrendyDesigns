package top.onedream.trendydesigns.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import top.onedream.trendydesigns.service.inter.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by yinan.zhang on 2018/3/27.
 */
@Controller
public class TrendyDesignsController {
    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String fitsRepoAttrController() {
        return "index";
    }

    @RequestMapping("index")
    public String indexController() {
        return "index";
    }

    @RequestMapping("login")
    public String loginController(HttpServletRequest request, HttpServletResponse response) {
//        String name = request.getParameter("name");
//        List<UserModel> allUser = userService.findAllUser();
//        allUser.forEach(user -> {
//            System.out.printf("user-----------------------:" + JSON.toJSONString(user)+name);
//        });
        return "login";
    }

    @RequestMapping("test")
    public String testController() {
        return "test";
    }

    @RequestMapping("chinaMap")
    public String mapController() {
        return "chinaMap";
    }

    @RequestMapping("cat")
    public String catController() {
        return "cat";
    }
}
