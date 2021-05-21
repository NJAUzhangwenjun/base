package cn.zhanghub.designPattern.builder.house;

/**
 * 类描述：
 *
 * @ClassName TallBuilding
 * @Author 张文军
 * @Date 2021/5/17 21:38
 * @Version 1.0
 */

public class TallBuilding implements House {
    /**
     * 打基础
     */
    @Override
    public void buildBasic() {
        System.out.println("TallBuilding.buildBasic");
    }

    /**
     * 砌墙
     */
    @Override
    public void buildWalls() {
        System.out.println("TallBuilding.buildWalls");
    }

    /**
     * 盖屋顶
     */
    @Override
    public void roofed() {
        System.out.println("TallBuilding.roofed");
    }

    @Override
    public House builder() {
        System.out.println("TallBuilding.builder");
        this.buildBasic();
        this.buildWalls();
        this.roofed();
        return this;
    }
}
