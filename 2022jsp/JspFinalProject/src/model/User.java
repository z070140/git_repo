package model;

public class User {
    private  String id;
    private String name;
    private String department_id;
    private String role_id;
    private String pwd;

    public User() {
    }

    public User(String id) {
        this.id = id;
    }

    public User(String id, String name, String department_id, String role_id, String pwd) {
        this.id = id;
        this.name = name;
        this.department_id = department_id;
        this.role_id = role_id;
        this.pwd = pwd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(String department_id) {
        this.department_id = department_id;
    }

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
