package cn.zhanghub.designPattern.proxy.dynamicProxy;

import cn.zhanghub.designPattern.proxy.staticProxy.extendM.Movable;
import cn.zhanghub.designPattern.proxy.staticProxy.extendM.MovableImpl;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 类描述：
 *
 * 
 *
 * @ClassName DProxy
 * @Author 张文军
 * @Date 2021/5/22 18:33
 * @Version 1.0
 */

public class DProxy {
    @Test
    public void dynamicProxy() {
        System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles", "true");
        Movable m = new MovableImpl();
        Movable finalM = m;
        InvocationHandler h = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("DProxy.invoke before");
                Object o = method.invoke(finalM, args);
                System.out.println("DProxy.invoke after");
                return o;
            }
        };
        m = (Movable) Proxy.newProxyInstance(m.getClass().getClassLoader(), m.getClass().getInterfaces(), h);
        m.move();
    }
}
