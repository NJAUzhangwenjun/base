package cn.zhanghub.designPattern.templateMethod;

/**
 * 类描述：
 *
 * @ClassName AbstractCook
 * @Author 张文军
 * @Date 2021/5/23 18:57
 * @Version 1.0
 */

public abstract class AbstractCook {

    /**
     * 准备菜料
     */
    public abstract String prepareTheIngredients();

    /**
     * 炒菜
     */
    public String stirFry(String name) {
        System.out.println("AbstractCook.stirFry:炒菜"+name);
        return name;
    }

    /**
     * 出锅
     */
    public void outOfThePot(String name) {
        System.out.println("AbstractCook.outOfThePot：出锅"+name);
    }


    /**
     * 炒菜
     */
    public void cook() {
        String s = prepareTheIngredients();
        String s1 = stirFry(s);
        outOfThePot(s1);
    }
}
