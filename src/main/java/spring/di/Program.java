package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.di.ui.ExamConsole;

public class Program {
    public static void main(String [] args){
        //ApplicationContext context = new ClassPathXmlApplicationContext("setting.xml");

        ApplicationContext context = new AnnotationConfigApplicationContext(NewLecDIConfig.class);

        //ExamConsole console = (ExamConsole) context.getBean("console");

        //Exam exam = context.getBean(Exam.class);
       //System.out.println(exam.toString());

        ExamConsole console = (ExamConsole) context.getBean("console");
        console.print();

        /*List<Exam> exams = (List<Exam>)context.getBean("exams");

        for(Exam e : exams){
            System.out.println(e);
        }*/
    }
 }

