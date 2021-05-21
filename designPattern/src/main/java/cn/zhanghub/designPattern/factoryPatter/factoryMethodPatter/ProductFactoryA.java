package cn.zhanghub.designPattern.factoryPatter.factoryMethodPatter;

/**
 * 类描述：
 *
 * @ClassName AbstractFactoryImpl
 * @Author 张文军
 * @Date 2021/5/16 1:57
 * @Version 1.0
 */

public class ProductFactoryA implements AbstractFactory {
    @Override
    public Product getProduct() {
        System.out.println("ProductFactoryA.getProduct");
        return new ProductImplA();
    }
}
