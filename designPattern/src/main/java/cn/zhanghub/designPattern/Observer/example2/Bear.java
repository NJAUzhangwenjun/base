package cn.zhanghub.designPattern.Observer.example2;

import java.util.Observable;
import java.util.Observer;

/**
 * 类描述：
 *
 * @ClassName Bear
 * @Author 张文军
 * @Date 2021/6/15 22:43
 * @Version 1.0
 */

//具体观察者类：空方
class Bear implements Observer {

    /**
     * This method is called whenever the observed object is changed. An
     * application calls an <tt>Observable</tt> object's
     * <code>notifyObservers</code> method to have all the object's
     * observers notified of the change.
     *
     * @param o   the observable object.
     * @param arg an argument passed to the <code>notifyObservers</code>
     */
    @Override
    public void update(Observable o, Object arg) {
        Float price = ((Float) arg).floatValue();
        if (price > 0) {
            System.out.println("油价上涨" + price + "元，空方伤心了！");
        } else {
            System.out.println("油价下跌" + (-price) + "元，空方高兴了！");
        }
    }
}
