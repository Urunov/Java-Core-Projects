package uz.newOOP;

public class Manager {
    //
    public String name;
    private double zarplata;
    double summa = 0.0; // default

    public Manager(String name, double zaraplata){
        this.name = name;
        this.zarplata = zaraplata;
    }

    public void salaryDay(){
        System.out.println("name: " + name + " salary: " + zarplata);
    }

    public double bonusGiveMe(double bonus){

        if (zarplata >100) {
             summa = zarplata + bonus;
        } else{
             summa = zarplata;
        }
        System.out.println(" SUMMA : " + summa);

        return summa;
    }


}
