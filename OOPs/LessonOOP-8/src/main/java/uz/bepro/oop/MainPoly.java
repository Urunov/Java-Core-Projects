package uz.bepro.oop;

import uz.bepro.oop.model.*;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {LessonOOP-8}
 * @Date: {2022/04/09 && 7:18 PM}
 */
public class MainPoly {

    public static void main(String[] args) {
       pointer();
       traingleDraw();
       maxValue();
       outDate();
       studentInfo();
       studentInfo1();
       timeMachine();
       userInfo();
    }

    public static void pointer(){
        Point point = new Point();
        point.setX(4);
        point.setY(54);
        point.setX(100);
        point.printXY();

        System.out.println(point.getX());
    }
    public static void traingleDraw(){
        Triangle triangle = new Triangle();
        triangle.katet1 = 3;
        triangle.katet2 = 5;
        triangle.perimeter();
        triangle.area();

    }
    public static void maxValue(){
        MyClasss myClasss = new MyClasss();
        myClasss.firstAttribute = 5;
        myClasss.secondAttribute =10;
        myClasss.aboutAttribute();
        myClasss.sumAttribute();
        myClasss.maxAttribute();
    }
    public static void outDate(){
        YearDate yearDate = new YearDate();
        yearDate.day = 5;
        yearDate.month =9;
        yearDate.year = 2022;
        yearDate.printDate();
    }
    public static void studentInfo(){
        Student student  = new Student();
        student.name = "Ozod";
        student.lastName = "Jacksonov";
        student.groupNumber = "032";
        student.printSubjects();

    }
    public static void studentInfo1(){
        Student student = new Student();
        student.subject[0] = "Java";
        student.subject[1] =" C++";
        student.subject[2] = "Golang";
        student.subject[3] = "Object-C";
        student.subject[4] = "Prolog";

        student.printSubject();
    }
    public static void timeMachine(){
        TimeMachine timeMachine = new TimeMachine();
        timeMachine.hour = 4;
        timeMachine.minut = 23;
        timeMachine.second = 32;
        System.out.println();
       // System.out.println(timeMachine.showTime());
        System.out.println(timeMachine);
    }
    public static void userInfo(){
        User user = new User();
        user.password ="32";
        user.userName="lolo";
        user.email = "ozod@mail.ru";
        user.changePassword();
    }
}
