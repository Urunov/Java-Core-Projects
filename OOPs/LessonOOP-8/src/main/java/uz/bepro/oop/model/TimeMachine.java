package uz.bepro.oop.model;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {LessonOOP-8}
 * @Date: {2022/04/09 && 8:17 PM}
 */
public class TimeMachine {
    //
    public int hour;
    public int minut;
    public int second;

    // step-1: method
//    public String showTime(){
//        return (
//                (hour<10? "0" + hour: hour )
//                + ":"
//                + (minut<10? "0" + minut: minut )
//                + ":"
//                +(second<10? "0" + second: second )
//
//            );
//    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour>=0 && hour<24) {
            this.hour = hour;
        }
    }

    public int getMinut() {
        return minut;
    }

    public void setMinut(int minut) {
        if (minut>=0 && minut<60) {
            this.minut = minut;
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if(second>=0 && second<60) {
            this.second = second;
        }
    }

    @Override
    public String toString() {
        return (
                (hour<10? "0" + hour: hour )
                + ":"
                + (minut<10? "0" + minut: minut )
                + ":"
                +(second<10? "0" + second: second )
            );
    }
}
