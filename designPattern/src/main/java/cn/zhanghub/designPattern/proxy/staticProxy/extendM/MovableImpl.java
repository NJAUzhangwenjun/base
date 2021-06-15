package cn.zhanghub.designPattern.proxy.staticProxy.extendM;

import java.util.concurrent.ThreadLocalRandom;

/**
 * 类描述：
 *
 * @ClassName MovableImpl
 * @Author 张文军
 * @Date 2021/5/22 17:29
 * @Version 1.0
 */

public class MovableImpl implements Movable {
    @Override
    public void move() {
        try {
            System.out.println("MovableImpl.move");
            ThreadLocalRandom random = ThreadLocalRandom.current();
            Thread.sleep(random.nextLong(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
