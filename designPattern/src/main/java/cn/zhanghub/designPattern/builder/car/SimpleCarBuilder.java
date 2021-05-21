package cn.zhanghub.designPattern.builder.car;

import cn.zhanghub.designPattern.builder.car.carDesign.Car;
import cn.zhanghub.designPattern.builder.car.carDesign.CarBody;
import cn.zhanghub.designPattern.builder.car.carDesign.Tires;
import cn.zhanghub.designPattern.builder.car.carDesign.Wheel;

/**
 * 类描述：
 *
 * @ClassName SimpleCarBuilder
 * @Author 张文军
 * @Date 2021/5/18 14:17
 * @Version 1.0
 */

public class SimpleCarBuilder implements Builder {
    private Tires tires;
    private Wheel wheel;
    private CarBody carBody;
    private String carName;

    @Override
    public Builder buildTires(Tires tires) {
        this.tires = tires;
        return this;
    }

    @Override
    public Builder buildCarBody(CarBody carBody) {
        this.carBody = carBody;
        return this;
    }

    @Override
    public Builder buildWheel(Wheel wheel) {
        this.wheel = wheel;
        return this;
    }

    @Override
    public Car build(String name) {
        this.carName = name;
        return new Car(tires,wheel,carBody,carName);
    }
}
