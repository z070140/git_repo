package cn.edu.hziee.model;

public class User {
    private  String userName;
    private  String  pwd;

    public User() {
    }

    public User(String userName, String pwd) {
        this.userName = userName;
        this.pwd = pwd;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
