package cn.zhanghub.designPattern.Observer.example1;

import cn.zhanghub.designPattern.Observer.example1.observer.MonsterObserver;
import cn.zhanghub.designPattern.Observer.example1.observer.TrapObserver;
import cn.zhanghub.designPattern.Observer.example1.observer.TreasureObserver;
import cn.zhanghub.designPattern.Observer.example1.subject.Hero;

public class Client {
    public static void main(String[] args) {
        //初始化对象
        Hero hero = new Hero();
        MonsterObserver monster = new MonsterObserver();
        TrapObserver trap = new TrapObserver();
        TreasureObserver treasure = new TreasureObserver();
        //注册观察者
        hero.attachObserver(monster);
        hero.attachObserver(trap);
        hero.attachObserver(treasure);
        //移动事件
        hero.move();
    }
}
