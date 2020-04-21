package com.dlc.composite;

import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        //从大到小创建对象
        //学校
        OrganizationComponent university = new University("清华大学", "中国顶级大学");
        //学院
        OrganizationComponent computerCollege = new College("计算机学院","计算机");
        OrganizationComponent informationCollege = new College("信息工程学院","信息工程");
        //在学院中添加专业
        computerCollege.add(new Department("软件工程","软件"));
        computerCollege.add(new Department("网络工程","网络"));
        computerCollege.add(new Department("计算机科学与技术","计科"));
        informationCollege.add(new Department("通信工程","通信"));
        informationCollege.add(new Department("信息工程","信息"));
        //在学校中添加学院
        university.add(computerCollege);
        university.add(informationCollege);

        university.print();
        Map<String,String> map = new HashMap<String, String>();
    }
}
