package cn.zhanghub.designPattern.factoryPatter.abstractFactory.factory;

import cn.zhanghub.designPattern.factoryPatter.abstractFactory.product.drinks.Drinks;
import cn.zhanghub.designPattern.factoryPatter.abstractFactory.product.hamburger.Hamburger;

/**
 * 类描述：
 *
 * @ClassName KFCPackage
 * @Author 张文军
 * @Date 2021/5/16 4:07
 * @Version 1.0
 */

public interface KFCPackage {
    Hamburger productHamburger();

    Drinks productDrinks();
}
