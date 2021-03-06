package Clone;

/**
 * Created by Administrator on 2017\9\4 0004.
 */
public class Husband implements Cloneable {
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

    public Husband(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {//myeclipse自动生成的
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }
    //仅仅调用了超类的clone()
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {//myeclipse自动生成的
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Husband other = (Husband) obj;
        if (id != other.id)
            return false;
        return true;
    }

    /**
     * 浅拷贝
     * @param args
     * @throws CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        Wife wife = new Wife(1,"jin");
        Husband husband = new Husband(1);
        Husband husband2 = null;
        husband.setWife(wife);
        husband2 = (Husband) husband.clone();
        System.out.println("husband class same="+(husband.getClass()==husband2.getClass()));//true类全名
        System.out.println("husband object same="+(husband==husband2));//false地址不一样
        System.out.println("husband object equals="+(husband.equals(husband)));//true在equals中的id比较
        //说明是同一个对象
        System.out.println("wife class same="+(husband.getWife().getClass()==husband2.getWife().getClass()));//true包含的类名相同
        System.out.println("wife object same="+(husband.getWife()==husband2.getWife()));//true地址一样说明引用的是同一个地址
        System.out.println("wife object equals="+(husband.getWife().equals(husband.getWife())));//true在equals中的name比较
    }
}