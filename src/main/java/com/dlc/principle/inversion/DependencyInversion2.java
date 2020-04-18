package com.dlc.principle.inversion;

public class DependencyInversion2 {
    public static void main(String[] args) {
        Person2 person = new Person2(new Email2());
        person.receive();
    }
}

interface IReceiver{
    String getInfo();
}
class Email2 implements IReceiver{
    public String getInfo(){
        return "电子邮件信息：hello";
    }
}

class Person2{
    IReceiver iReceiver;
    public void receive(){
        System.out.println(iReceiver.getInfo());
    }

    public Person2(IReceiver iReceiver) {
        this.iReceiver = iReceiver;
    }
}