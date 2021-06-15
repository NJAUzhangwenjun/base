package cn.zhanghub.designPattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 类描述：
 *
 * @ClassName CountryCountPopulationImpl
 * @Author 张文军
 * @Date 2021/5/22 4:18
 * @Version 1.0
 */

public class CountryCountPopulationImpl implements CountPopulation {
    private List<ProvinceCountPopulationImpl> provinces = null;

    public CountryCountPopulationImpl() {
        this.provinces = new ArrayList<>();
    }

    public Boolean remove() {
        try {
            provinces.remove(provinces.size() - 1);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public CountryCountPopulationImpl add(ProvinceCountPopulationImpl provinceCountPopulation) {
        this.provinces.add(provinceCountPopulation);
        return this;
    }

    /**
     * 统计
     *
     * @return 人口
     */
    @Override
    public Integer count() {
        Integer count = 0;
        for (ProvinceCountPopulationImpl province : provinces) {
            count += province.count();
        }
        return count;
    }
}
