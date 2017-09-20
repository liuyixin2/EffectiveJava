package assemblage;


import java.util.ArrayList;

/**
 * Created by Administrator on 2017\9\12 0012.
 * List
 * Collection
 * Iterable
 * ArrayList中remove注意可以使用Integer传参，删除的是值，使用int传参删除的是索引对应的值。
 */
public class single {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(2);
        arrayList.add(1);
        arrayList.remove(1);//注意的是int是基本对象，底层使用是否是对象进行判断。
        arrayList.remove(new Integer(1));//为包装类型，是对象。
        System.out.println(arrayList);
    }
}
