package bsoft.lm.service;

import bsoft.lm.bean.ServerInfo;
import bsoft.lm.interfaze.ServerInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author <a>liuming</a>
 * @Description: 服务器信息服务
 * @date 2018年5月24日$ 22:54:41$
 */

@Service
public class ServerService {

    @Autowired
    private ServerInfoRepository serverDao;

    public ServerInfo saveServer(ServerInfo serverInfo){
        return serverDao.saveAndFlush(serverInfo);
    }



}
