package cn.zhanghub.designPattern.composite;

import org.junit.Test;

/**
 * 类描述：
 *
 * @ClassName Client
 * @Author 张文军
 * @Date 2021/5/22 4:25
 * @Version 1.0
 */

public class Client {
    @Test
    public void CompositeTest() {
        ProvinceCountPopulationImpl gansu = new ProvinceCountPopulationImpl(123000);
        ProvinceCountPopulationImpl jiangsu = new ProvinceCountPopulationImpl(23400);
        ProvinceCountPopulationImpl shanghai = new ProvinceCountPopulationImpl(456565);
        CountryCountPopulationImpl china = new CountryCountPopulationImpl();
        Integer count = china
                .add(gansu)
                .add(jiangsu)
                .add(shanghai)
                .count();
        System.out.println("count = " + count);
    }
}
