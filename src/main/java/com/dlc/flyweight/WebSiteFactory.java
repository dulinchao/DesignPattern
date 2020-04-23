package com.dlc.flyweight;

import java.util.HashMap;

public class WebSiteFactory {
    //集合，充当池的作用
    private HashMap<String,ConcreteWebSite> pool = new HashMap<String, ConcreteWebSite>();
    //根据网站类型，返回一个网站
    public WebSite getWebSiteCategory(String type){
        if(!pool.containsKey(type)){
            pool.put(type,new ConcreteWebSite(type));
        }
        return pool.get(type);
    }
    public int getWebSiteCount(){
        return pool.size();
    }
}
