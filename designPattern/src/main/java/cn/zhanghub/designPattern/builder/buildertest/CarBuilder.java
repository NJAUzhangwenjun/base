package cn.zhanghub.designPattern.builder.buildertest;

import cn.zhanghub.designPattern.builder.car.carDesign.CarBody;
import cn.zhanghub.designPattern.builder.car.carDesign.Tires;
import cn.zhanghub.designPattern.builder.car.carDesign.Wheel;

/**
 * 类描述：
 *
 * @ClassName CarBuilder
 * @Author 张文军
 * @Date 2021/5/18 14:40
 * @Version 1.0
 */
public class CarBuilder {
    private Tires tires;
    private Wheel wheel;
    private CarBody carBody;
    private String carName;

    CarBuilder() {
    }

    public CarBuilder tires(Tires tires) {
        this.tires = tires;
        return this;
    }

    public CarBuilder wheel(Wheel wheel) {
        this.wheel = wheel;
        return this;
    }

    public CarBuilder carBody(CarBody carBody) {
        this.carBody = carBody;
        return this;
    }

    public CarBuilder carName(String carName) {
        this.carName = carName;
        return this;
    }

    public Car build() {
        return new Car(this.tires, this.wheel, this.carBody, this.carName);
    }

    public String toString() {
        return "Car.CarBuilder(tires=" + this.tires + ", wheel=" + this.wheel + ", carBody=" + this.carBody + ", carName=" + this.carName + ")";
    }
}
