package cn.zhanghub.designPattern.factoryPatter.simpleFactoryPatter.pizz;

import java.lang.reflect.InvocationTargetException;

/**
 * 类描述：
 *
 * @ClassName SimplePhoneFactory
 * @Author 张文军
 * @Date 2021/5/7 2:42
 * @Version 1.0
 */

public class SimplePhoneFactory {

    public static HUAWEI getPhone(Class<?> clazz, String phoneName) {
        try {
            try {
                Object instance = clazz.getDeclaredConstructor().newInstance();
                String[] methods = {"setName", "encapsulation", "test", "box"};
                for (int i = 0; i < methods.length; i++) {
                    if (i == 0) {
                        clazz.getMethod(methods[i], String.class).invoke(instance, phoneName);
                    } else {
                        clazz.getMethod(methods[i]).invoke(instance);
                    }
                }
                return (HUAWEI) instance;
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }
}
