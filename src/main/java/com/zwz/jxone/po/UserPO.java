package com.zwz.jxone.po;

import java.io.Serializable;

public class UserPO implements Serializable {
    private Integer uId;
    private String userName;
    private String password;
    private String email;
    private Integer age;
    private char sex;
    private char tel;
    private String addr;

    public UserPO(Integer uId, String userName, String password, String email, Integer age, char sex, char tel, String addr) {
        this.uId = uId;
        this.userName = userName;
        this.password= password;
        this.email = email;
        this.age = age;
        this.sex = sex;
        this.tel = tel;
        this.addr = addr;
    }
    public UserPO(){}

    @Override
    public String toString() {
        return "UserPO{" +
                "uId=" + uId +
                ", userName='" + userName + '\'' +
                ", password=" + password +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", tel=" + tel +
                ", addr='" + addr + '\'' +
                '}';
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public char getTel() {
        return tel;
    }

    public void setTel(char tel) {
        this.tel = tel;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
