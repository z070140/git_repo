package cn.edu.hziee.model;

public class Login {
    private  String userName;
    private  String pwd;

    public Login(String userName, String pwd) {
        this.userName = userName;
        this.pwd = pwd;
    }

    public Login() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
