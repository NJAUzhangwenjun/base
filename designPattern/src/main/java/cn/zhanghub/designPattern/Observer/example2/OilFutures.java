package cn.zhanghub.designPattern.Observer.example2;

import java.util.Observable;

/**
 * 类描述：
 *
 * @ClassName OilFutures
 * @Author 张文军
 * @Date 2021/6/15 22:34
 * @Version 1.0
 */

public class OilFutures extends Observable {
    private Float price;

    public Float getPrice() {
        return price;
    }

    /*原油期货变动*/
    public void setPrice(Float price) {
        super.setChanged();  //设置内部标志位，注明数据发生变化
        super.notifyObservers(price);    //通知观察者价格改变了
        this.price = price;
    }
}
