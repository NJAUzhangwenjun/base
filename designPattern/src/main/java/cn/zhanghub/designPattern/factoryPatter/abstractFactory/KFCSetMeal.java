package cn.zhanghub.designPattern.factoryPatter.abstractFactory;

import cn.zhanghub.designPattern.factoryPatter.abstractFactory.factory.KFCPackage;
import cn.zhanghub.designPattern.factoryPatter.abstractFactory.factory.MilkTeaBigMac;
import cn.zhanghub.designPattern.factoryPatter.abstractFactory.factory.SpriteSpicyChickenDrumsticks;
import cn.zhanghub.designPattern.factoryPatter.abstractFactory.product.drinks.Drinks;
import cn.zhanghub.designPattern.factoryPatter.abstractFactory.product.hamburger.Hamburger;

/**
 * 类描述：
 *
 * @ClassName KFCSetMeal
 * @Author 张文军
 * @Date 2021/5/16 4:25
 * @Version 1.0
 */

public class KFCSetMeal {

    public static class Type {
        public static final KFCPackage KFC_PACKAGE = new MilkTeaBigMac();
        public static final KFCPackage SPRITE_SPICY_CHICKEN_DRUMSTICKS = new SpriteSpicyChickenDrumsticks();
    }

    public static class SetMeal {
        private Hamburger hamburger;
        private Drinks drinks;

        public SetMeal(Hamburger hamburger, Drinks drinks) {
            this.hamburger = hamburger;
            this.drinks = drinks;
        }

        @Override
        public String toString() {
            return "SetMeal{" +
                    "hamburger=" + hamburger +
                    ", drinks=" + drinks +
                    '}';
        }
    }

    public static SetMeal getKFCSetMeal(KFCPackage type) {
        return new SetMeal(type.productHamburger(), type.productDrinks());
    }

}
