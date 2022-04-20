package uz.bepro.innerClass;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {LessonOOP-11}
 * @Date: {2022/04/16 && 9:18 PM}
 */
public class MainPolly {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.salary = 100;

        System.out.println(employee.salary);

        Worker worker = new Worker();
        Employee.Progmmer progmmer = new Employee.Progmmer();
        System.out.println(progmmer);

        Employee.Accounter accounter = new Employee.Accounter();

       // Employee.Designer ds = new Employee.Designer();


        // IMPOSSIBLE to use public class in the same class.


        Employee.Designer ds = new Employee.Designer();

    }
}
