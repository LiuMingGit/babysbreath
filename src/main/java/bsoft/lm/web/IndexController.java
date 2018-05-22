package bsoft.lm.web;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author <a>liuming</a>
 * @Description: 起始页控制器
 * @date 2018-5-21$ 22:10:01$
 */
@Controller
@Scope("prototype")
public class IndexController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/{page}")
    public String page(@PathVariable String page){
        return page;
    }
}
