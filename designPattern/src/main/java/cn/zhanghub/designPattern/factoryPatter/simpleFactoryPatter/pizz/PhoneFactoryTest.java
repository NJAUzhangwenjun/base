package cn.zhanghub.designPattern.factoryPatter.simpleFactoryPatter.pizz;

/**
 * 类描述：
 *
 * @ClassName PhoneFactoryTest
 * @Author 张文军
 * @Date 2021/5/7 2:43
 * @Version 1.0
 */

public class PhoneFactoryTest {
    public static void main(String[] args) {
        HUAWEI huawei = SimplePhoneFactory.getPhone(HUAWEI.class,"huawei");
        System.out.println("huawei = " + huawei);
        huawei.box();
    }
}
