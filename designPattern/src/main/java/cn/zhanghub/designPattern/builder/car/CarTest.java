package cn.zhanghub.designPattern.builder.car;

import cn.zhanghub.designPattern.builder.car.carDesign.Car;
import cn.zhanghub.designPattern.builder.car.carDesign.CarBody;
import cn.zhanghub.designPattern.builder.car.carDesign.Tires;
import cn.zhanghub.designPattern.builder.car.carDesign.Wheel;
import org.junit.Test;

/**
 * 类描述：
 *
 * @ClassName CarTest
 * @Author 张文军
 * @Date 2021/5/18 14:21
 * @Version 1.0
 */

public class CarTest {
    @Test
    public void carTest() {
        Car car = new SimpleCarBuilder()
                .buildCarBody(new CarBody("车身"))
                .buildTires(new Tires("车胎"))
                .buildWheel(new Wheel("车轮"))
                .build("比亚迪");
    }
}
