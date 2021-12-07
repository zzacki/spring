package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import spring.di.entity.Exam;
import spring.di.ui.ExamConsole;

@Component
public class GridExamConsole implements ExamConsole {

    @Autowired
    private Exam exam;

    public GridExamConsole() {
        System.out.println("constructor");
    }

    public GridExamConsole(Exam exam) {
        System.out.println("overloaded constructor");
        this.exam = exam;
    }

    @Override
    public void print() {
        System.out.printf("------------------------------");
        System.out.printf("total                     avg \n");
        System.out.printf("%3d                       %3.2f\n", exam.total(), exam.avg());
        System.out.printf("------------------------------");
    }


    @Override
    public void setExam(Exam exam) {
        System.out.println("setExam");
        this.exam = exam;
    }
}
