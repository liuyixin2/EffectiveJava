package Compare;

/**
 * Created by Administrator on 2017\9\4 0004.
 */
public class Student1 {
    private String name;
    private int age;
    private float score;

    public Student1(String name, int age, float score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public float getScore() {
        return score;
    }
    public void setScore(float score) {
        this.score = score;
    }

    public String toString()
    {
        return name+"\t\t"+age+"\t\t"+score;
    }
}
