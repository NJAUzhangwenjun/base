package cn.zhanghub.designPattern.factoryPatter.abstractFactory;

/**
 * 类描述：
 *
 * @ClassName TestP
 * @Author 张文军
 * @Date 2021/5/16 4:48
 * @Version 1.0
 */

public class TestP {
    public static void main(String[] args) {
        KFCSetMeal.SetMeal kfcSetMeal = KFCSetMeal.getKFCSetMeal(KFCSetMeal.Type.KFC_PACKAGE);
        System.out.println("kfcSetMeal = " + kfcSetMeal);
    }
}
