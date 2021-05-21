package cn.zhanghub.designPattern.factoryPatter.abstractFactory.factory;

import cn.zhanghub.designPattern.factoryPatter.abstractFactory.product.drinks.Drinks;
import cn.zhanghub.designPattern.factoryPatter.abstractFactory.product.drinks.Sprite;
import cn.zhanghub.designPattern.factoryPatter.abstractFactory.product.hamburger.Hamburger;
import cn.zhanghub.designPattern.factoryPatter.abstractFactory.product.hamburger.SpicyChickenDrumsticks;

/**
 * 类描述：
 *
 * @ClassName SpriteSpicyChickenDrumsticks
 * @Author 张文军
 * @Date 2021/5/16 4:23
 * @Version 1.0
 */

public class SpriteSpicyChickenDrumsticks implements KFCPackage {
    @Override
    public Hamburger productHamburger() {
        return new SpicyChickenDrumsticks();
    }

    @Override
    public Drinks productDrinks() {
        return new Sprite();
    }
}
