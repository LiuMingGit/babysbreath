package bsoft.lm.bean;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "BBT_ServerInfo")
public class ServerInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "ip地址")
    private String ip;

    @Column(name = "用户名")
    private String userName;

    @Column(name = "密码")
    private String passWord;

    @OneToMany(targetEntity = Paths.class)
    private List<Paths> paths;
}
