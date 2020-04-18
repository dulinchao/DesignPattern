package com.dlc.prototype.deep;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProtoType deepProtoType = new DeepProtoType();
        deepProtoType.setName("肖恩");
        deepProtoType.setDeepCloneableTarget(new DeepCloneableTarget("小羊","绵羊"));
        //方式一完成深拷贝
        DeepProtoType clone = (DeepProtoType) deepProtoType.clone();
        System.out.println(clone);
        System.out.println(deepProtoType.getDeepCloneableTarget()==clone.getDeepCloneableTarget());
        //方式二
        DeepProtoType clone2 = (DeepProtoType) deepProtoType.deepClone();
        System.out.println(clone2);
        System.out.println(deepProtoType.getDeepCloneableTarget()==clone2.getDeepCloneableTarget());
    }
}
