package bsoft.lm.bean;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "BBT_ServerInfo")
public class ServerInfo {
    @Id
    @SequenceGenerator(name = "SEQ_ServerInfo", sequenceName = "SEQ_ServerInfo",initialValue = 1,allocationSize = 100)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ServerInfo")
    private Integer id;

    //ip地址
    @Column(name = "ip")
    private String ip;

    //服务器别名
    @Column(name = "serverName")
    private String serverName;

    //用户名
    @Column(name = "userName")
    private String userName;

    //密码
    @Column(name = "passWord")
    private String passWord;

    @OneToMany(targetEntity = Paths.class)
    @JoinColumn(name = "serverId")
    private List<Paths> paths;
}
