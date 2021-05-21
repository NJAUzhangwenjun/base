package cn.zhanghub.designPattern.factoryPatter.factoryMethodPatter;

import org.junit.Test;

/**
 * 类描述：
 *
 * @ClassName Test
 * @Author 张文军
 * @Date 2021/5/16 2:30
 * @Version 1.0
 */

public class TestFactory {
    @Test
    public void test() {
        Product product = CreatProduct.creat(CreatProduct.productFactoryA);
        product.showProduct();
    }
}
