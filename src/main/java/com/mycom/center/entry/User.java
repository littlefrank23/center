package com.mycom.center.entry;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName: User
 * @Desscription: TODO
 * @Author: Teng
 * @Date: 2019/9/23 15:21
 **/
@Entity
@Table(name = "user")
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer id;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "password")
    private String password;
    @Column(name = "super_admin")
    private Integer superAdmin;
    @Column(name = "insert_time")
    private Date insertTime;
    @Column(name = "update_time")
    private Date updateTime;
    @Column(name = "opt_name")
    private String optName;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", superAdmin=" + superAdmin +
                ", insertTime=" + insertTime +
                ", updateTime=" + updateTime +
                ", optName='" + optName + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getSuperAdmin() {
        return superAdmin;
    }

    public void setSuperAdmin(Integer superAdmin) {
        this.superAdmin = superAdmin;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getOptName() {
        return optName;
    }

    public void setOptName(String optName) {
        this.optName = optName;
    }
}
