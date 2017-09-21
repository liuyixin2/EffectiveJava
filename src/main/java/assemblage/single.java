package assemblage;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017\9\12 0012.
 * List
 * Collection
 * Iterable
 * ArrayList中remove注意可以使用Integer传参，删除的是值，使用int传参删除的是索引对应的值。
 */
public class single {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("aaaa");
        list.add("bbbb");
        List<String> subList=list.subList(0, 1);
        list.removeAll(subList);
        for (String s:list) {
            System.out.println(s);
        }
    }
}
