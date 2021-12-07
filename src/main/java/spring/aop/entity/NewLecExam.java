package spring.aop.entity;

import org.springframework.stereotype.Component;

@Component
public class NewLecExam implements Exam {

    private int kor;
    private int eng;
    private int math;
    private int com;

    public NewLecExam() {
    }

    @Override
    public String toString() {
        return "NewLecExam{" +
                "kor=" + kor +
                ", eng=" + eng +
                ", math=" + math +
                ", com=" + com +
                '}';
    }

    public NewLecExam(int kor, int eng, int math, int com) {
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.com = com;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getCom() {
        return com;
    }

    public void setCom(int com) {
        this.com = com;
    }

    @Override
    public int total() {
        return kor+eng+math+com;
    }

    @Override
    public float avg() {
        float result = total() /4.0f;
        return  result;
    }
}
