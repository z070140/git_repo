package cn.edu.hziee;

public class Student {
    // 成员变量，并不是属性
    private String name;
    private boolean sex;
    private int age;


    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }


    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
