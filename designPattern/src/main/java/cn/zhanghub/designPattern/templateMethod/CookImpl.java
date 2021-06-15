package cn.zhanghub.designPattern.templateMethod;

/**
 * 类描述：
 *
 * @ClassName CookImpl
 * @Author 张文军
 * @Date 2021/5/23 19:04
 * @Version 1.0
 */

public class CookImpl extends AbstractCook {
    /**
     * 准备菜料
     */
    @Override
    public String prepareTheIngredients() {
        System.out.println("CookImpl.prepareTheIngredients：准备青椒菜料！");
        return "青椒";
    }
}
