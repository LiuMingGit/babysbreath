package bsoft.lm.web;

import bsoft.lm.bean.ServerInfo;
import bsoft.lm.service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author <a>liuming</a>
 * @Description: 服务器信息控制器
 * @date 2018年5月24日$ 22:32:18$
 */
@Controller
@Scope("prototype")
public class ServiceController {


    @Autowired
    private ServerService serverService;

    @RequestMapping(value = "/serviceAdd",method = RequestMethod.POST)
    @ResponseBody
    public String serviceAdd(ServerInfo serverInfo){
        serverService.saveServer(serverInfo);
        return "succeed";
    }
}
