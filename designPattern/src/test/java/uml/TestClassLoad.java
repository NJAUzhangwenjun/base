package uml;

import java.lang.reflect.Method;

public class TestClassLoad {

    public static void main(String[] args) throws Exception {
        Class<?> clz = Class.forName("cn.zhanghub.designPattern.factoryPatter.simpleFactoryPatter.pizz.GreekPizza");
//        Class<?> clz = GreekPizza.class;
        Object o = clz.newInstance();
        Method m = clz.getMethod("prepare");
        for (int i = 0; i < 16; i++) {
            m.invoke(o);
        }
    }
}
