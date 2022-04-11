package uz.bepro.school;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {lessonOOPs}
 * @Date: {2022/03/28 && 3:52 PM}
 */
public class Pen {
    //
    String inkColor;
    double inkLevel;
    boolean isOpen; // true - open false - close
    double consumption; // zatrat pasta

    public Pen(String inkColor) {
        this.inkColor = inkColor;
    }

    public Pen(String inkColor, double inkLevel) {
        this.inkColor = inkColor;
        this.inkLevel = inkLevel;
    }

    public Pen(String inkColor, double inkLevel, boolean isOpen) {
        this.inkColor = inkColor;
        this.inkLevel = inkLevel;
        this.isOpen = isOpen;
    }

    public Pen(String inkColor, double inkLevel, boolean isOpen, double consumption) {
        this.inkColor = inkColor;
        this.inkLevel = inkLevel;
        this.isOpen = isOpen;
        this.consumption = consumption;
    }

    void clickButton(){

//        button = button == true ? false : true;
//
//        if (button ==true){
//            button = false;
//        } else {
//            button = true;
//        }
        isOpen=!isOpen;
    }

    void changeInk(double inkLevel, String color){

        this.inkLevel = inkLevel;
        this.inkColor = color;
        System.out.println("==== We must change ink pen=====");

    }
    void write(String str) {
        if (isOpen){
            if (inkLevel > 0){
                    double inkConsumption; //
                    for (int i = 0; i < str.length(); i++) {
                    inkConsumption = inkConsumptionPerChar(str.charAt(i));
                    if (inkLevel >=inkConsumption) {
                        System.out.print(str.charAt(i));
                        inkLevel-=inkConsumption;
                    } else{

                        System.out.println(" \n Pasta tugadi to'grisi.");
                        return;
                    }
                }
            } else{
                System.out.println("Pasta qolmagan. ");
            }
        } else{
            System.out.println("is not open yet~!");
        }
    }

    public double inkConsumptionPerChar(char let){

        if (Character.isLowerCase(let))
            return consumption;

        if (Character.isUpperCase(let))
            return 2 * consumption;

        if (let ==' ')
            return 0;

        return consumption / 2;
    }


    @Override
    public String toString() {
        return "Pen{" +
                "inkColor='" + inkColor + '\'' +
                ", inkLevel=" + inkLevel +
                ", isOpen=" + isOpen +
                ", consumption=" + consumption +
                '}';
    }
}
