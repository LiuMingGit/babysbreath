package bsoft.lm.bean;


import javax.persistence.*;

/**
 * @Description: 文件路径
 * @author <a>liuming</a>
 * @date 2018年5月11日01:34:05$ $ 
 */

@Entity
@Table(name = "BBT_Paths")
public class Paths {

    @Id
    @SequenceGenerator(name = "SEQ_Paths", sequenceName = "SEQ_Paths",initialValue = 1,allocationSize = 100)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_Paths")
    private Integer id;

    //文件路径
    @Column(name = "path")
    private String path;

    @ManyToOne(targetEntity = ServerInfo.class)
    @JoinColumn(name = "serverId")
    private ServerInfo serverInfo;
}
