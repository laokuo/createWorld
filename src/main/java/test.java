import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> studentReflect = Class.forName("Student");
        for (Constructor c :
                studentReflect.getConstructors()) {
            System.out.println(c);
        }
        Method method[]=studentReflect.getMethods();
        for(int i=0;i<method.length;++i) {
            Class<?> returnType = method[i].getReturnType();
            Class<?> para[] = method[i].getParameterTypes();
            int temp = method[i].getModifiers();
            System.out.print(Modifier.toString(temp) + " ");
            System.out.print(returnType.getName() + "  ");
            System.out.print(method[i].getName() + " ");
            if (para.length==0) System.out.println("()");
            for (int j = 0; j < para.length; j++) {
                System.out.print("(");
                if (j!=0) System.out.print(",");
                System.out.print(Modifier.toString(para[j].getModifiers())+" "+para[j].getName()+")");
            }

        }
    }
}
