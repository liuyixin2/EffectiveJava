import java.util.*;

/**
 * Created by Administrator on 2017\8\26 0026.
 */
public class testStatic {
    public static void main(String[] args) {
        Emploee a = new Emploee("ly",100);
        Emploee c = a;
        Emploee b = new Emploee("ly",100);
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(b.toString());
        System.out.println(a == c);
        System.out.println(a.getClass());
    }
}
