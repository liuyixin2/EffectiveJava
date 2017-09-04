package Compare;

/**
 * Created by Administrator on 2017\9\4 0004.
 */
public class ComparableDemo01 {
    /**
     * @param args
     * 测试Comparable
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Student stu[]={new Student("zhangsan",20,90.0f),
                new Student("lisi",22,90.0f),
                new Student("wangwu",20,99.0f),
                new Student("sunliu",22,100.0f)};
        java.util.Arrays.sort(stu);
        for(Student s:stu)
        {
            System.out.println(s);
        }
    }
}
