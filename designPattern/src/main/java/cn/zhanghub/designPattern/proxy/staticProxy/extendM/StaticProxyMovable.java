package cn.zhanghub.designPattern.proxy.staticProxy.extendM;

/**
 * 类描述：
 *
 * @ClassName StaticProxyMovable
 * @Author 张文军
 * @Date 2021/5/22 17:35
 * @Version 1.0
 */

public class StaticProxyMovable implements Movable{

    private Movable movable = null;

    public StaticProxyMovable(Movable movable) {
        this.movable = movable;
    }

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        movable.move();
        System.out.println("StaticProxyMovable.move");
        System.out.println("wast time is = " + (System.currentTimeMillis() - start));
    }
}
