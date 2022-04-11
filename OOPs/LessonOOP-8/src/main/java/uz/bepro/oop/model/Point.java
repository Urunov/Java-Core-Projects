package uz.bepro.oop.model;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {LessonOOP-8}
 * @Date: {2022/04/09 && 7:14 PM}
 */
public class Point {
    //
    private int x=0;
    private int y=0;

    public int getX() {
        x = x+3;
        return x;
    }

    public void setX(int x) {
        if (x%2==0){
            this.x = x * 2;
        } else{
            this.x = x;
        }
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void printXY(){
        System.out.println("( " + x + ", " + y +" )");
    }
}
