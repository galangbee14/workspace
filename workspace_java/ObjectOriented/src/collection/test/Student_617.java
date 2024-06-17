package collection.test;

public class Student_617 {
    private String name;
    private int age;
    private int score;

    public Student_617(String name, int age, int score) {
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student_617{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", score=" + score +
                '}';
    }
}
