package com.dlc.composite;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent{
    //存放的是Department
    List<OrganizationComponent> organizationComponentList = new ArrayList<OrganizationComponent>();
    //输出此University包含的学院
    protected void print() {
        System.out.println("-------"+getName()+"---------");
        for (OrganizationComponent organizationComponent : organizationComponentList) {
            organizationComponent.print();
        }
    }

    public College(String name, String description) {
        super(name, description);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponentList.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponentList.remove(organizationComponent);
    }
}
