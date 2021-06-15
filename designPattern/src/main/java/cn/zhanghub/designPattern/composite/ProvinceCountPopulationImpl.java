package cn.zhanghub.designPattern.composite;

/**
 * 类描述：
 *
 * @ClassName ProvinceCountPopulationImpl
 * @Author 张文军
 * @Date 2021/5/22 4:17
 * @Version 1.0
 */

public class ProvinceCountPopulationImpl implements CountPopulation {
    private Integer provincePopulation;

    public ProvinceCountPopulationImpl(Integer provincePopulation) {
        this.provincePopulation = provincePopulation;
    }

    /**
     * 统计
     *
     * @return 人口
     */
    @Override
    public Integer count() {
        return provincePopulation;
    }
}
