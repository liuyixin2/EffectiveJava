package entend;

/**
 * Created by Administrator on 2017\8\31 0031.
 */
public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, int year, int money, int day) {
        super(name, salary, year, money, day);
        this.bonus = 0;
    }
    public double getSalary(){
        double baseSalary = super.getSalary();
        return baseSalary += bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Manager manager = (Manager) o;

        return Double.compare(manager.bonus, bonus) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(bonus);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "bonus=" + bonus +
                '}';
    }
}
