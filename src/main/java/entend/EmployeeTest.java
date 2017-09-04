package entend;

/**
 * Created by Administrator on 2017\8\31 0031.
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee alice1 = new Employee("ALICE adams",75000,1995,8,27);
        Employee alice2 = alice1;
        Employee alice3 = new Employee("ALICE adams",75000,1995,8,27);
        Employee bob = new Employee("BOB adams",5000,1996,4,1);
        System.out.println("alice1 == alice2"+ (alice1 == alice2));
        System.out.println("alice1 == alice3"+ (alice1 == alice3));
        System.out.println("alice1.equals(alice3)"+ alice1.equals(alice3));
        System.out.println("alice1.equals(bob)"+ alice1.equals(bob));
        Manager m1 = new Manager("ly",80000,1996,12,12);
        Manager m2 = new Manager("ly",80000,1996,12,12);
        m2.setBonus(5000);
        System.out.println("m2.toString()"+m2);
        System.out.println("m1.equals(m2)"+ m1.equals(m2));
        System.out.println("alice1 hashCode"+alice1.hashCode());
        System.out.println("alice3 hashCode"+alice3.hashCode());
        System.out.println("m1 hashCode"+m1.hashCode());
        System.out.println("m2 hashCode"+m2.hashCode());
    }
}
