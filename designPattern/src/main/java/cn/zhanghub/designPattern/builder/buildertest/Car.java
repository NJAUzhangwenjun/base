package cn.zhanghub.designPattern.builder.buildertest;


import cn.zhanghub.designPattern.builder.car.carDesign.CarBody;
import cn.zhanghub.designPattern.builder.car.carDesign.Tires;
import cn.zhanghub.designPattern.builder.car.carDesign.Wheel;

/**
 * 类描述：
 *
 * @ClassName Car
 * @Author 张文军
 * @Date 2021/5/18 14:08
 * @Version 1.0
 */
public class Car {
    private Tires tires;
    private Wheel wheel;
    private CarBody carBody;
    private String carName;

    Car(Tires tires, Wheel wheel, CarBody carBody, String carName) {
        this.tires = tires;
        this.wheel = wheel;
        this.carBody = carBody;
        this.carName = carName;
    }

    public static CarBuilder builder() {
        return new CarBuilder();
    }

}
