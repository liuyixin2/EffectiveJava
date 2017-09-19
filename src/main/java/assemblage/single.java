package assemblage;

<<<<<<< Updated upstream
import java.util.List;

/**
 * Created by Administrator on 2017\9\12 0012.
 * List
 * Collection
 * Iterable
 */
public class single {
    public static void main(String[] args) {

=======
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017-09-13.
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
>>>>>>> Stashed changes
    }
}
