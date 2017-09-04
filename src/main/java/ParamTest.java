/**
 * Created by Administrator on 2017\8\26 0026.
 */
public class ParamTest {
    public static void main(String[] args) {

        System.out.println("testint parcent");
        double parcent = 10;
        System.out.println("before parcent:"+parcent);
        tripleValue(parcent);
        System.out.println("after parcent:"+parcent);
        System.out.println("==================================");
        Emploee boss = new Emploee("boss", 5900);
        System.out.println("boss before:" + boss.getSalary());
        tripleSalary(boss);
        System.out.println("boss after:" + boss.getSalary());
        System.out.println("==================================");
        Emploee a = new Emploee("alice",7000);
        Emploee b = new Emploee("bob",6000);
        System.out.println("before a :"+a.getName() +"b:"+b.getName());
        swap(a,b);
        System.out.println("after a :"+a.getName() +"b:"+b.getName());
    }

    public static void tripleValue(double x) {
        x = 3 * x;
        System.out.println("tripleValue parcent:" + x);
    }

    public static void tripleSalary(Emploee e) {
        e.raiseSalay(200);
        System.out.println("Salary :" + e.getSalary());
    }

    public static void swap(Emploee x, Emploee y) {
        Emploee temp = x;
        x = y;
        y = temp;
        System.out.println("x:" + x.getName());
        System.out.println("y:" + y.getName());
    }
}
