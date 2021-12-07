package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import spring.di.entity.Exam;

@Component("console")
public class InLineExamConsole implements ExamConsole {

    @Autowired
    //@Qualifier("exam2")
    private Exam exam;

    public InLineExamConsole() {
    }

    public InLineExamConsole(Exam exam) {
        this.exam = exam;
    }

    @Override
    public void print() {

        if(exam == null){
            System.out.printf("total is %d, avg is %f\n", 0, 0);
        }else{
            System.out.printf("total is %d, avg is %f\n", exam.total(), exam.avg());
        }

    }


    @Override
    public void setExam(Exam exam) {
        this.exam = exam;
    }
}
