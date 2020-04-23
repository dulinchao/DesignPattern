package com.dlc.flyweight;

public class ConcreteWebSite extends WebSite {
    private String type = ""; //网站发布的类型
    public ConcreteWebSite(String type) {
        this.type = type;
    }
    public void use(User user) {
        System.out.println("网站的发布形式为："+type+" "+user.getName()+"在使用");
    }
}
