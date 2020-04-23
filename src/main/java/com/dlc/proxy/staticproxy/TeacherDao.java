package com.dlc.proxy.staticproxy;

public class TeacherDao implements ITeacherDao {

    public void teach() {
        System.out.println("老师正在上课");
    }
}
