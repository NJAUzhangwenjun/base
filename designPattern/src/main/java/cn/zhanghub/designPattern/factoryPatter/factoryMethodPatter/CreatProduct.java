package cn.zhanghub.designPattern.factoryPatter.factoryMethodPatter;

/**
 * 类描述：
 *
 * @ClassName FactoryTest
 * @Author 张文军
 * @Date 2021/5/16 2:04
 * @Version 1.0
 */

public class CreatProduct extends ProductTypes{
    /**
     * 创建产品
     * @param factory
     * @return
     */
    public static Product creat(AbstractFactory factory) {
        System.out.println("CreatProduct.creat");
        System.out.println("factory = " + factory);
        return factory.getProduct();
    }

    /*差评列表*//*
    static class ProductTypes extends cn.zhanghub.designPattern.factoryPatter.factoryMethodPatter.ProductTypes {
    }*/
}
