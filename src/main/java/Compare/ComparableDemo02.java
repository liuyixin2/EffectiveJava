package Compare;

/**
 * Created by Administrator on 2017\9\4 0004.
 */
public class ComparableDemo02 {
    /**
     * @param args
     * Comparator
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Student1 stu[]={new Student1("zhangsan",20,90.0f),
                new Student1("lisi",22,90.0f),
                new Student1("wangwu",20,99.0f),
                new Student1("sunliu",22,100.0f)};
        java.util.Arrays.sort(stu,new StudentComparator());
        for(Student1 s:stu)
        {
            System.out.println(s);
        }
    }
}
