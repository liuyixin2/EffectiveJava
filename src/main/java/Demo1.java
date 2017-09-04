import com.sun.org.apache.xalan.internal.utils.Objects;

/**
 * Created by Administrator on 2017\8\20 0020.
 */
public class Demo1 {

    public static void main(String[] args) {
        String a = new String("字符串");
        String b = new String("字符串");
        System.out.println(a.equals(b));
        //==> true
        System.out.println(a.hashCode() == b.hashCode());//==> true
        System.out.println(a == b);
    }

    private String name;
    private int age;
    //重构
    public Demo1(String name,int age){}
    public Demo1(int age,String name){}
}
