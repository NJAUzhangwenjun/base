package cn.zhanghub.designPattern.builder.car.carDesign;

/**
 * 类描述：
 *
 * @ClassName Tires
 * @Author 张文军
 * @Date 2021/5/18 14:11
 * @Version 1.0
 */

public class Tires{
    private String name;

    public Tires(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tires{" +
                "name='" + name + '\'' +
                '}';
    }
}
