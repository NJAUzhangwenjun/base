package cn.zhanghub.javaNewFeatures.java8;

import org.junit.Test;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * 类描述：Java 内置四大函数式核心接口
 *  - Consumer<T> : 消费型接口  接受一个输入参数，无返回结果
 *      void accept(T t);
 *
 *  - Supplier<T> 供给型接口  无参数，返回一个结果
 *      T get()
 *
 *  - Function<T,R> : 函数型接口  接受一个输入参数，返回一个结果
 *      R apply(T t);
 *
 *  - Predicate<T> : 判断(断言)型  接受一个输入参数，返回一个布尔值结果。
 *      Boolean test(T t);
 *
 * @ClassName LambdaTest
 * @Author 张文军
 * @Date 2021/4/19 3:26
 * @Version 1.0
 */

public class LambdaTest {
    @Test
    public void consumerTest() {
        consumerMoney(123.10, (money) -> {
            System.out.println("消费类：" + money + " 元；");
        });
    }

    /**
     * 消费型接口
     *
     * @param v
     * @param o
     */
    private void consumerMoney(double v, Consumer o) {
        o.accept(v);
    }

    /**
     * 供给型接口
     *
     * @param supplier
     * @return
     */
    private Double SupplierMoney(Supplier<Double> supplier) {
        return supplier.get();
    }


    @Test
    public void supplierTest() {
        System.out.println("这个月工资发了 " + SupplierMoney(() -> new Random(1).nextDouble() * 1000) + " 元；");
    }

    @Test
    public void predicateTest() {
        System.out.println("这个月的工资" + (predicateRemainingMoney(121.0, (money) -> new Random(1).nextDouble() * 1000 - money >= 0) ? "够花了；" : "不够花；"));
    }


    private boolean predicateRemainingMoney(Double money, Predicate<Double> predicate) {
        return predicate.test(money);
    }



}
