package cn.zhanghub.designPattern.builder.house;

import org.junit.Test;

/**
 * 类描述：
 *
 * @ClassName Client
 * @Author 张文军
 * @Date 2021/5/17 21:48
 * @Version 1.0
 */


public class Client {
    @Test
    public void HouseTest() {
        House builder = new OrdinaryHouse().builder();
        House builder1 = new TallBuilding().builder();

    }
}
