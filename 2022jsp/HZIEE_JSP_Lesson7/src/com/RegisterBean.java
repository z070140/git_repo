package com;

//用户注册
public class RegisterBean {
    //成员变量，不能算属性
    private String userName;
    private String gender;
    private int age;
    private String[] hobbies;
    private boolean married;

//    public RegisterBean() {
//
//    }
//
//    public RegisterBean(String userName, String gender, int age, String[] hobbies, boolean married) {
//        this.userName = userName;
//        this.gender = gender;
//        this.age = age;
//        this.hobbies = hobbies;
//        this.married = married;
//    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    private void print() {
        System.out.println(this);
    }
}
