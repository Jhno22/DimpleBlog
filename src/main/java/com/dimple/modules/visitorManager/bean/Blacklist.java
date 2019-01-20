package com.dimple.modules.visitorManager.bean;

import lombok.Data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

/**
 * @ClassName: Blacklist
 * @Description:
 * @Auther: Dimple
 * @Date: 2019/1/19 23:29
 * @Version: 1.0
 */
@Entity
@Data
@Table(name = "blacklist", schema = "dimple_blog")
public class Blacklist implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String ip;
    private Date createTime;
    private Integer count;

}
