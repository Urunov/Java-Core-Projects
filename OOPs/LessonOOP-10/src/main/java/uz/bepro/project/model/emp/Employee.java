package uz.bepro.project.model.emp;

import org.w3c.dom.ls.LSOutput;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Lesson-10}
 * @Date: {2022/04/11 && 5:45 PM}
 */

// Step-1. Inner class.
//
public class Employee {
    // Inner class
    public int a;
    public static int b;

    public static class Programmer{ // non-static impossible to call.
    }

    public class Designer{
    }
}

class Worker{
    void writer() {
        System.out.println("Worker.");
    }
}
