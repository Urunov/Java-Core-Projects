package uz.bepro.project;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Lessons}
 * @Date: {2022/04/06 && 3:28 PM}
 */
public class Recursiya {
    public static void main(String [] args){

           head(10);
           tail(3);
    }

     static void head(int x) {

            if (x<0){
                return;
            } else{
                head(x-1);
                System.out.println(x);
            }
    }

    static void tail(int y){
        if (y<0){
            return;
        } else{
            System.out.println(y);
            tail(y-1);
        }
    }
}