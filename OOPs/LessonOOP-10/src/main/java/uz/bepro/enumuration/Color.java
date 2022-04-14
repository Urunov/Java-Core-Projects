package uz.bepro.enumuration;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Lesson-10}
 * @Date: {2022/04/12 && 5:43 PM}
 */
public enum Color {
    RED,
    YELLOW,
    GREEN,
    BROWN;

    private Color(){
        System.out.println("Constructor called for: " + this.toString());
    }

    public void colorInfo(){
        System.out.println("Universal color ");
    }
}
