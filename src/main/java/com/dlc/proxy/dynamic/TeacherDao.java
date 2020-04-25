package com.dlc.proxy.dynamic;

import com.dlc.proxy.dynamic.ITeacherDao;

public class TeacherDao implements ITeacherDao {

    public void teach() {
        System.out.println("老师正在上课");
    }
}
