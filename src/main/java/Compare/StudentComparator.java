package Compare;

import java.util.Comparator;

/**
 * Created by Administrator on 2017\9\4 0004.
 */
public class StudentComparator implements Comparator<Student1> {
    public int compare(Student1 o1, Student1 o2) {
        // TODO Auto-generated method stub
        if(o1.getScore()>o2.getScore())
            return -1;//从高到底
        else if(o1.getScore()<o2.getScore())
            return 1;
        else{
            if(o1.getAge()>o2.getAge())
                return 1;
            else if(o1.getAge()<o2.getAge())
                return -1;
            else
                return 0;
        }
    }
}

