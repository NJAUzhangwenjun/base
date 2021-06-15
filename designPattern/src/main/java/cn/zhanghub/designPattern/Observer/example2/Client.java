package cn.zhanghub.designPattern.Observer.example2;

import java.util.Observer;

public class Client {
    public static void main(String[] args) {
        OilFutures oil = new OilFutures();
        Observer bull = new Bull(); //多方
        Observer bear = new Bear(); //空方
        oil.addObserver(bull);
        oil.addObserver(bear);
        oil.setPrice(10F);
        oil.setPrice(-8F);
    }
}
