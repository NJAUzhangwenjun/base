package cn.zhanghub.designPattern.builder.car;

import cn.zhanghub.designPattern.builder.car.carDesign.Car;
import cn.zhanghub.designPattern.builder.car.carDesign.CarBody;
import cn.zhanghub.designPattern.builder.car.carDesign.Tires;
import cn.zhanghub.designPattern.builder.car.carDesign.Wheel;

/**
 * 类描述：
 *
 * @ClassName Builder
 * @Author 张文军
 * @Date 2021/5/18 14:08
 * @Version 1.0
 */

public interface Builder {
    Builder buildTires(Tires tires);
    Builder buildCarBody(CarBody carBody);
    Builder buildWheel(Wheel wheel);
    Car build(String name);
}
