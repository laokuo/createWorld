package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo1 {
    private int a;
    private int b;

    public void add(int a, int b) {
        System.out.println(a+b);
    }
    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException {
        Class<?> demo1 = null;
        Class<?> demo2 = null;
        Class<?> demo3 = null;
        demo1 =  demo1.forName("reflect.Demo1");
        demo2 = new Demo1().getClass();
        demo3 = Demo1.class;
        System.out.println("类名为："+demo1.getName());
        System.out.println("类名为："+demo2.getName());
        System.out.println("类名为："+demo3.getName());
    }
}
