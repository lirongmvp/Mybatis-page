package com.example.pagedemo.pojo;

/**
 * @author lirong
 * @create 2017/12/19
 * @since 1.0.0
 */
public class Student {

    private Long stuId;
    private String stuName;
    private Integer age;

    public Student(String stuName, Integer age) {
        this.stuName = stuName;
        this.age = age;
    }

    public Long getStuId() {

        return stuId;
    }

    public void setStuId(Long stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", age=" + age +
                '}';
    }
}
