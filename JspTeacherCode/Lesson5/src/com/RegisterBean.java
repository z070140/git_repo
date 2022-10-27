package com;

/**
 * 用户注册
 */

public class RegisterBean {
    //成员变量，不能算属性
    private String userName;//用户名
    private String gender;//性别
    private int age;//年龄
    private String[] hobbies;//爱好
    private boolean married;//是否已婚
//    // RegisterBean id值 = new RegisterBean();
//    public RegisterBean(){}
//    public RegisterBean(String xxx){}
    //设置属性
    public void setUserName(String userName){
        this.userName = userName;
    }
    //获得属性
    public String getUserName(){
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

    private void print(){
        System.out.println(this);
    }
}
