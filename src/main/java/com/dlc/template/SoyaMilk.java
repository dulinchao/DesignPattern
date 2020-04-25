package com.dlc.template;

public abstract class SoyaMilk {
    //模板方法不允许重写
    public final void make() {
        select();
        if (customWantCondiments()) {
            add();
        }
        soak();
        beat();
    }

    private void select() {
        System.out.println("第一步，选择黄豆");
    }

    protected abstract void add();

    private void soak() {
        System.out.println("第三步，浸泡材料");
    }

    private void beat() {
        System.out.println("第四步，打碎");
    }

    //钩子方法
    boolean customWantCondiments() {
        return true;
    }
}
