package top.onedream.trendydesigns.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yinan.zhang on 2018/3/27.
 */
@Controller
public class TrendyDesignsController {
    @RequestMapping("/")
    public String fitsRepoAttrController() {
        return "index";
    }
    @RequestMapping("index")
    public String indexController() {
        return "index";
    }
}
