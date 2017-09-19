/**
 * Created by Administrator on 2017\8\26 0026.
 */
public class Emploee {
    {
        System.out.println("代码块");
    }
    static {
        System.out.println("静态代码块");
    }
    private String name;
    private double salary;

    public Emploee() {
    }

    public Emploee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalay(double byPercent) {
        double rasie = salary + byPercent / 100;
        salary += rasie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Emploee emploee = (Emploee) o;

        if (Double.compare(emploee.salary, salary) != 0) return false;
        return name != null ? name.equals(emploee.name) : emploee.name == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
