package cn.zhanghub.designPattern.factoryPatter.abstractFactory.factory;

import cn.zhanghub.designPattern.factoryPatter.abstractFactory.product.drinks.Drinks;
import cn.zhanghub.designPattern.factoryPatter.abstractFactory.product.drinks.MilkTea;
import cn.zhanghub.designPattern.factoryPatter.abstractFactory.product.hamburger.BigMac;
import cn.zhanghub.designPattern.factoryPatter.abstractFactory.product.hamburger.Hamburger;

/**
 * 类描述：
 *
 * @ClassName MilkTeaBigMac
 * @Author 张文军
 * @Date 2021/5/16 4:16
 * @Version 1.0
 */

public class MilkTeaBigMac implements KFCPackage {
    @Override
    public Hamburger productHamburger() {
        return new BigMac();
    }

    @Override
    public Drinks productDrinks() {
        return new MilkTea();
    }
}
