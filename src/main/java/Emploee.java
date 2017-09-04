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
}
