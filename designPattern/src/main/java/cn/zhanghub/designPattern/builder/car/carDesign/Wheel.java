package cn.zhanghub.designPattern.builder.car.carDesign;

/**
 * 类描述：
 *
 * @ClassName Wheel
 * @Author 张文军
 * @Date 2021/5/18 14:11
 * @Version 1.0
 */

public class Wheel{
    private String name;

    public Wheel(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "name='" + name + '\'' +
                '}';
    }
}
