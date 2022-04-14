package uz.bepro.project.model.functional;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Lesson-10}
 * @Date: {2022/04/11 && 6:11 PM}
 */
@FunctionalInterface
public interface Display {

    // only 1 abstract method.
    public abstract void swich();
   // void block(); // public abstract

    default void methodA(){
        System.out.println("A... method");
    }
    default void methodB(){
        System.out.println("B... method");
    }
}

/*
Functional Interface:
1. Single abstract method(SAM)
2. Default method ga ega bo'lishi mn
3. static method ga ega bo'lishi mn
4. public static final variable ga ega  bolishi mn
5. @FunctionalInterface annnotatisiyasi bn belgilab qo'yiladi.
* */