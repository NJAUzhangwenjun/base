package cn.zhanghub.designPattern.factoryPatter.factoryMethodPatter;

/**
 * 类描述：
 *
 * @ClassName ProductTypes
 * @Author 张文军
 * @Date 2021/5/16 2:46
 * @Version 1.0
 */

public class ProductTypes {
    public static final AbstractFactory productFactoryA = new ProductFactoryA();
    public static final AbstractFactory productFactoryB = new ProductFactoryB();
}
