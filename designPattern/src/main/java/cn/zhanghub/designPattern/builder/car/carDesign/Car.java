package cn.zhanghub.designPattern.builder.car.carDesign;


import cn.zhanghub.designPattern.builder.car.Builder;
import cn.zhanghub.designPattern.builder.car.SimpleCarBuilder;

/**
 * 类描述：
 *
 * @ClassName Car
 * @Author 张文军
 * @Date 2021/5/18 14:08
 * @Version 1.0
 */

public class Car extends SimpleCarBuilder {
    private Tires tires;
    private Wheel wheel;
    private CarBody carBody;
    private String carName;

    public Car(Tires tires, Wheel wheel, CarBody carBody, String carName) {
        this.tires = tires;
        this.wheel = wheel;
        this.carBody = carBody;
        this.carName = carName;
    }

    public static Builder builder() {
        return new SimpleCarBuilder();
    }

    @Override
    public String toString() {
        return "Car{" +
                "tires=" + tires +
                ", wheel=" + wheel +
                ", carBody=" + carBody +
                ", carName='" + carName + '\'' +
                '}';
    }
}
