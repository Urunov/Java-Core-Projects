package uz.bepro.oop.model;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {LessonOOP-8}
 * @Date: {2022/04/09 && 7:57 PM}
 */
public class Student {
    //
    public String name;
    public String lastName;
    public String groupNumber;

    String [] subjects = {"Math", "Physic", "IT", "Coding", "Algorithm" };

    public String [] subject = new String[5];

    public void printSubjects(){
        System.out.print("[");
        for(String fan: subjects) {
            System.out.print(" "+ fan +", ");
        }
        System.out.println(" ]");
    }

    public void printSubject(){
//        for (String nauka : subject) {
//            System.out.print(" " +nauka);
//        }
        for (String nauka : subject) {
            System.out.print("  " + nauka);
        }
    }
}
