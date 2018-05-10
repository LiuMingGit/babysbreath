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
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "文件路径")
    private String path;
}
