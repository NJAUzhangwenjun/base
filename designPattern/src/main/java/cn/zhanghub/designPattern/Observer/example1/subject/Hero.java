package cn.zhanghub.designPattern.Observer.example1.subject;

/**
 * 具体被观察者
 */
public class Hero extends Subject{
    public void move(){
        System.out.println("主角向前移动");
        notifyObservers();
    }
}
