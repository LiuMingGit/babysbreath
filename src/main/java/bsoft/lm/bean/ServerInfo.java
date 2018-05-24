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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public List<Paths> getPaths() {
        return paths;
    }

    public void setPaths(List<Paths> paths) {
        this.paths = paths;
    }

    @Override
    public String toString() {
        return "ServerInfo{" +
                "id=" + id +
                ", ip='" + ip + '\'' +
                ", serverName='" + serverName + '\'' +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", paths=" + paths +
                '}';
    }
}
