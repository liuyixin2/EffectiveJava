package Clone;

/**
 * Created by Administrator on 2017\9\4 0004.
 */
public class Husband1 implements Cloneable {
    private int id;
    private Wife wife;

    public Wife getWife() {
        return wife;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Husband1(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {//myeclipse自动生成的
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    /**
     * 注意不仅调用了父类的clone()
     * 还调用了起引用的对象的clone()，如果多个则层层克隆。
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Husband1 husband1 = (Husband1) super.clone();
        husband1.wife = (Wife) husband1.getWife().clone();
        return husband1;
    }

    @Override
    public boolean equals(Object obj) {//myeclipse自动生成的
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Husband1 other = (Husband1) obj;
        if (id != other.id)
            return false;
        return true;
    }

    /**
     * @param args
     * @throws CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        Wife wife = new Wife(1,"jin");
        Husband husband = new Husband(1);
        Husband husband2 = null;
        husband.setWife(wife);
        husband2 = (Husband) husband.clone();
        System.out.println("husband class same="+(husband.getClass()==husband2.getClass()));//true
        System.out.println("husband object same="+(husband==husband2));//false
        System.out.println("husband object equals="+(husband.equals(husband)));//true
        System.out.println("wife class same="+(husband.getWife().getClass()==husband2.getWife().getClass()));//true
        System.out.println("wife object same="+(husband.getWife()==husband2.getWife()));//false
        System.out.println("wife object equals="+(husband.getWife().equals(husband.getWife())));//true
    }
}
