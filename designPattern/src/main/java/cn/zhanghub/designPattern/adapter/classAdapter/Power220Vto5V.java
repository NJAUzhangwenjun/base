package cn.zhanghub.designPattern.adapter.classAdapter;

/**
 * 类描述：
 *
 * @ClassName Power220Vto5V
 * @Author 张文军
 * @Date 2021/5/19 16:44
 * @Version 1.0
 */

public class Power220Vto5V implements Power5V {
    private Power220V power220V = null;

    public Power220Vto5V(Power220V power220V) {
        this.power220V = power220V;
    }

    @Override
    public void p5V() {
        System.out.println("Power220Vto5V.p5V");
        power220V.p220V();
    }
}
