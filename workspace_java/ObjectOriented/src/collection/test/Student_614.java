package collection.test;

public class Student_614 {
    //9. Student는 학생에 대한 정보가 들어있는 클래스이다.
    // 해당 클래스는 학생이름, 국어점수, 영어점수, 총점 데이터를 가지고 있다.
    // 각 필드를 선언하고 setter와 getter를 만들어보자.
    // 추가적으로 모든 정보를 출력하는 기능을 toString()메소드를 오버라이딩하여 작성한다.

    private String name;
    private int koScore;
    private int engScore;
    private int totalScore;

    public Student_614(String name, int koScore, int engScore) {
        this.name = name;
        this.koScore = koScore;
        this.engScore = engScore;
        this.totalScore = koScore + engScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKoScore() {
        return koScore;
    }

    public void setKoScore(int koScore) {
        this.koScore = koScore;
    }

    public int getEngScore() {
        return engScore;
    }

    public void setEngScore(int engScore) {
        this.engScore = engScore;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    @Override
    public String toString() {
        return "Student_614{" +
                "name='" + name + '\'' +
                ", koScore=" + koScore +
                ", engScore=" + engScore +
                ", totalScore=" + totalScore +
                '}';
    }
}
