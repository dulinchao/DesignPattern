package com.dlc.composite;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class OrganizationComponent {
    private String name;
    private String description;
    protected void add(OrganizationComponent organizationComponent){
        //默认实现，因为叶子节点不需要实现这个方法
        throw new UnsupportedOperationException();
    }
    protected void remove(OrganizationComponent organizationComponent){
        //默认实现
        throw new UnsupportedOperationException();
    }
    //做成抽象的
    protected abstract void print();
}
