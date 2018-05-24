package bsoft.lm.interfaze;

import bsoft.lm.bean.ServerInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author <a>liuming</a>
 * @Description: 服务器信息JPA接口
 * @date 2018年5月24日$ 22:56:19$
 */
@Repository
public interface ServerInfoRepository extends JpaRepository<ServerInfo,Long>{
}
