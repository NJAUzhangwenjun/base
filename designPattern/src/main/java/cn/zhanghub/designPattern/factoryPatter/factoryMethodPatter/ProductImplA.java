package cn.zhanghub.designPattern.factoryPatter.factoryMethodPatter;

/**
 * 类描述：
 *
 * @ClassName ProductImpl
 * @Author 张文军
 * @Date 2021/5/16 1:57
 * @Version 1.0
 */

public class ProductImplA implements Product {
    @Override
    public void showProduct() {
        System.out.println("ProductImplA.showProduct");
    }
}
