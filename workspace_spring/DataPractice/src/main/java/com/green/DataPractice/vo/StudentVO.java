package com.green.DataPractice.vo;

public class StudentVO {
    private String stuName;

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    @Override
    public String toString() {
        return "StudentVO{" +
                "stuName='" + stuName + '\'' +
                '}';
    }
}
