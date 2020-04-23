package com.dlc.flyweight;

public class Cilent {
    public static void main(String[] args) {
        WebSiteFactory webSiteFactory = new WebSiteFactory();
        WebSite webSite1 = webSiteFactory.getWebSiteCategory("新闻");
        webSite1.use(new User("小王"));
        WebSite webSite2 = webSiteFactory.getWebSiteCategory("新闻");
        webSite1.use(new User("小赵"));
        WebSite webSite3 = webSiteFactory.getWebSiteCategory("博客");
        webSite1.use(new User("小陈"));
        WebSite webSite4 = webSiteFactory.getWebSiteCategory("博客");
        webSite1.use(new User("小王"));
        System.out.println(webSiteFactory.getWebSiteCount());
    }
}
