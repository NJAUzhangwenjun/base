package cn.zhanghub.designPattern.builder.house;

/**
 * 类描述：
 *
 * @ClassName OrdinaryHouse
 * @Author 张文军
 * @Date 2021/5/17 21:37
 * @Version 1.0
 */

public class OrdinaryHouse implements House {
    /**
     * 打基础
     */
    @Override
    public void buildBasic() {
        System.out.println("OrdinaryHouse.buildBasic");
    }

    /**
     * 砌墙
     */
    @Override
    public void buildWalls() {
        System.out.println("OrdinaryHouse.buildWalls");
    }

    /**
     * 盖屋顶
     */
    @Override
    public void roofed() {
        System.out.println("OrdinaryHouse.roofed");
    }

    @Override
    public House builder() {
        System.out.println("OrdinaryHouse.builder");
        this.buildBasic();
        this.buildWalls();
        this.roofed();
        return this;
    }
}
