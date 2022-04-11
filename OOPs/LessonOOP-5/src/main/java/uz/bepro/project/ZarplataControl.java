package uz.bepro.project;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {Lessons}
 * @Date: {2022/04/03 && 12:03 AM}
 */
public class ZarplataControl {
    //
    private double zarplata;
    private double stependiya;
    private double pensiya;

    double sum = zarplata * 0.8;

    Integer auto = 5;


    public double getZarplata() {
        System.out.println("This month : ");
        return zarplata;
    }

    public void setZarplata(double zarplata) {
        this.zarplata = zarplata;
    }

    public double getStependiya() {
        return stependiya;
    }

    public void setStependiya(double stependiya) {
        this.stependiya = stependiya;
    }

    public double getPensiya() {
        return pensiya;
    }

    public void setPensiya(double pensiya) {
        this.pensiya = pensiya;
    }


    public void zarplataLogic(double zarplata){
        // Logic
        System.out.println(" This month you can spend:  " + zarplata * 0.8);
        System.out.println(" Your budget is : " + zarplata * 0.2);
    }



    public void transportLogic(double sum ){

    }

    public void strelkaLogic(double sum){

    }

    public void petaniya(double sum){

        System.out.println(" Zavtrak : " );


    }


    @Override // Format
    public String toString() {
        return "ZarplataControl{" +
                "zarplata=" + zarplata +
                ", stependiya=" + stependiya +
                ", pensiya=" + pensiya +
                '}';
    }
}
