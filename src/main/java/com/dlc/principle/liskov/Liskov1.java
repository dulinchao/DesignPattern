package com.dlc.principle.liskov;

public class Liskov1 {
}
class Base{

}
class A extends Base{
    public int func1(int a,int b){
        return a-b;
    }
}
class B extends Base{
    //如果还想使用A中的方法，那就使用组合关系
    A a = new A();
    public int func1(int num1,int num2){
        return num1+num2;
    }
    //使用A中的func1
    public int func3(int num1,int num2){
        return a.func1(num1,num2);
    }
}