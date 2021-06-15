package cn.zhanghub.designPattern.proxy.staticProxy.extendM;

import org.junit.Test;

/**
 * 类描述：
 *
 * @ClassName Client
 * @Author 张文军
 * @Date 2021/5/22 17:34
 * @Version 1.0
 */

public class Client {
    @Test
    public void staticProxyTest() {
        Movable movable = new MovableImpl();
        StaticProxyMovable proxyMovable = new StaticProxyMovable(movable);
        proxyMovable.move();
    }
}
