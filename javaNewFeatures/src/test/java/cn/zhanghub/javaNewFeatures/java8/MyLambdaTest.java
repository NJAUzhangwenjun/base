package cn.zhanghub.javaNewFeatures.java8;

import org.junit.Test;

import java.util.function.Function;
import java.util.function.Supplier;

import static org.junit.Assert.*;

/**
 * 类描述：
 *
 * @ClassName MyLambdaTest
 * @Description TODO
 * @Author 张文军
 * @Date 2021/4/19 2:48
 * @Version 1.0
 */

public class MyLambdaTest {

    @Test
    public void getValue() {
        int[] arr = {1, 5, 6, 8, 2, 3};
        System.out.println(max(arr, () -> {
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        }));
    }

    public int max(int[] arr, Supplier<Integer> supplier) {
        return supplier.get();
    }

    public String getValue(String s,Function<String, String> function) {
        return function.apply(s);
    }

    @Test
    public void testGetValue() {
        String s = "zhangsan";
        System.out.println(getValue(s, s1 -> s1.toUpperCase()));
    }

    public void toNumSum(int a,int b,Function<Integer,Integer> function) {
        function.apply(a);
    }
}
