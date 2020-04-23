package com.dlc.proxy.staticproxy;

public class TeacherDaoProxy implements ITeacherDao {
    private ITeacherDao target; //被代理的对象

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    public void teach() {
        System.out.println("代理开始");
        target.teach();
        System.out.println("代理结束");
    }
}
