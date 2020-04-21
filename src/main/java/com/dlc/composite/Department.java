package com.dlc.composite;

//系
public class Department extends OrganizationComponent{
    public Department(String name, String description) {
        super(name, description);
    }
    //因为Department是叶子节点，所以不需要重写add,remove
    protected void print() {
        System.out.println(getName());
    }
}
