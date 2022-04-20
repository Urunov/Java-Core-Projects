package uz.bepro.atm;

import uz.bepro.atm.model.ServiceatmImplement;
import uz.bepro.atm.model.uzbek.UzbekchaLogics;


public class Main {


    public static void main(String[] args) {
        PhysicalCard();

    }


    public static void PhysicalCard() {
        UzbekchaLogics uzbekchaLogics = new UzbekchaLogics();
        uzbekchaLogics.Logicsinfo();
    }


}