package uz.bepro.atm.model;

import uz.bepro.atm.model.uzbek.UzbekchaLogics;

import java.util.Scanner;

public class ServiceatmImplement implements ServiceATM {

    static int num;

//    public  void Logics() {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Qaysi til siz uchun qulay?");
//        System.out.println("1.O'zbekcha");
//        System.out.println("2.English");
//        System.out.println("3.Ruski");
//
//        switch (num = scanner.nextInt()){
//            case 1 : {
//                UzbekchaLogics uzbek = new UzbekchaLogics();
//                uzbek.Logicsinfo();
//                    break;
//            }
////            case 2 : {
////                English english = new English();
////                english.LogicsEnglish();
////                break;
////            }
////            case 3 : {
////                Ruski ruski = new Ruski();
////                ruski.LogicsRuski();
////                break;
////            }
//            default:
//                System.out.println("Kechirasiz | sorry | извине ");
//        }
//    }
    Scanner scanner = new Scanner(System.in);
    @Override
    public void changePin(Card card) {
        String password;
        System.out.println("Hozirgi parolingizni yozing.");
        password = scanner.nextLine();
        if(card.getPin().equals(password)){
            System.out.println("Yangi parolingzini yozing");
            card.setPin(scanner.nextLine());
            System.out.println("");
            System.out.println("");
            System.out.println("Omadli yakunlandi. Parolingiz o'zgartirildi.");
        }else System.out.println("Hozirgi parolingiz xato!!!");

    }

    @Override
    public void balance(Card card) {
        System.out.println("Sizning kartangiz hisobida : " + card.getBalance());
    }

    @Override
    public void withdraw(Card card) {
        System.out.println("1. 50 000 ");
        System.out.println("----------------------");
        System.out.println("2. 100 000 ");
        System.out.println("----------------------");
        System.out.println("3. 150 000 ");
        System.out.println("----------------------");
        System.out.println("4. 200 000 ");
        System.out.println("----------------------");
        System.out.println("5. Boshqa summa kiritish");
        double money;
        switch (scanner.nextInt()){
            case 1 : {
                money = (50000 + 50000 * 0.01);
                if(card.getBalance() >= money){
                    System.out.println("       ==========Chek:========");
                    System.out.println("Pulingizni oling : 50 000 sum");
                    System.out.println("1 ta 50 000 talik chiqazadi.");
                    System.out.println("Hisobingizda " + (card.getBalance() - money) + " so'm mablag' qoldi.");
                    System.out.println("Xizmat haqqi" + (50000 * 0.01));
                }else System.out.println("Hisobingizda mablag' yetarli emas.!");
                break;
            }
            case 2 : {
                money = (100000 + 100000 * 0.01);
                if(card.getBalance() >= money){
                    System.out.println("       ==========Chek:========");
                    System.out.println("Pulingizni oling : 100 000 sum");
                    System.out.println("1 ta 100 000 talik chiqazadi.");
                    System.out.println("Hisobingizda " + (card.getBalance() - money) + " so'm mablag' qoldi.");
                    System.out.println("Xizmat haqqi" + (100000 * 0.01));
                }else System.out.println("Hisobingizda mablag' yetarli emas.!");
                break;
            }
            case 3 : {
                money = (150000 + 150000 * 0.01);
                if(card.getBalance() >= money){
                    System.out.println("       ==========Chek:========");
                    System.out.println("Pulingizni oling : 150 000 sum");
                    System.out.println("1 ta 50 000 talik 1 ta 100 000 talik chiqazadi.");
                    System.out.println("Hisobingizda " + (card.getBalance() - money) + " so'm mablag' qoldi.");
                    System.out.println("Xizmat haqqi" + (150000 * 0.01));
                }else System.out.println("Hisobingizda mablag' yetarli emas.!");
                break;
            }
            case 4 : {
                money = (200000 + 200000 * 0.01);
                if(card.getBalance() >= money){
                    System.out.println("       ==========Chek:========");
                    System.out.println("Pulingizni oling : 200 000 sum");
                    System.out.println("2 ta 100 000 talik chiqazadi.");
                    System.out.println("Hisobingizda " + (card.getBalance() - money) + " so'm mablag' qoldi.");
                    System.out.println("Xizmat haqqi" + (20000 * 0.01));
                }else System.out.println("Hisobingizda mablag' yetarli emas.!");
                break;
            }
            case 5 : {
                out:
                System.out.println("Summani kiriting : ");
                money = scanner.nextDouble();
                double sum1=money,sum2,sum3,sum4,sum5;
                if(money >= 10000) {
                    if(money % 5000 == 0){
                    double moneySum = (money + money * 0.01);
                    if (card.getBalance() >= moneySum) {
                        int count100 = 0;
                        while (sum1 >= 100000) {
                            sum1 -= 100000;
                            count100++;
                        }
                        int count50 = 0;
                        sum2 = money - count100 * 100000;
                        while (sum2 >= 50000) {
//                        sum2 = ((money - count100 * 100000) / 5);
                            sum2 -= 50000;
                            count50++;
                        }
                        int count20 = 0;
                        sum3 = money - count100 * 100000 - count50 * 50000;
                        while (sum3 >= 20000) {
//                        sum3 = (money - count100 * 100000 - count50 * 50000) / 2;
                            sum3 -= 20000;
                            count20++;
                        }
                        int count10 = 0;
                        sum4 = (money - count100 * 100000 - count50 * 50000 - 20000 * count20);
                        while (sum4 >= 10000) {
//                        sum4 = (money - count100 * 100000 - count50 * 50000 - count20 * 20000) / 1;
                            sum4 -= 10000;
                            count10++;
                        }
                        int count5 = 0;
                        sum5 = (money - count100 * 100000 - count50 * 50000 - 20000 * count20 - count10 * 10000);
                        while (sum5 >= 5000) {
                          sum5 -= 5000;
                            count5++;
                        }
                        System.out.println("       ==========Chek:========");
                        System.out.println("Pulingizni oling : " + money + " sum.");
                        System.out.println(count100 + " ta 100 000 talik chiqazadi.");
                        System.out.println(count50 + " ta 50 000 talik chiqazadi.");
                        System.out.println(count20 + " ta 20 000 talik chiqazadi.");
                        System.out.println(count10 + " ta 10 000 talik chiqazadi.");
                        System.out.println(count5 + " ta 5 000 talik chiqazadi.");
                        System.out.println("Hisobingizda " + (card.getBalance() - moneySum) + " so'm mablag' qoldi.");
                        System.out.println("Xizmat haqqi" + (money * 0.01));
                    } else {
                        System.out.println("Hisobingizda mablag' yetarli emas.!");
                    }
                        System.out.println("================================");
                }
                    else {
                        System.out.println("Bu bankomatda faqat 5.000  10.000  20.000  50.000  100.000 talik beradi 1.000  2.000 talik mayda pul yo'q!!!");
                    }
                    System.out.println("==================================");
                }
                else {
                    System.out.println("Minimal summa 10 000 so'm.");
                }
                break;
            }

        }
    }

    @Override
    public void tocount(Card card) {

    }

    @Override
    public boolean checkPin(Card card) {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 3; i++) {
            System.out.println("Parolingizni kiriting.");
            String pin = scanner.nextLine();
            if (pin.equals(card.getPin())) {
                return true;
            } else {
                System.out.println("Parolingiz xato!!!");
                if (i == 2) {

                    return false;
                }
            }
        }
        card.setState(false);
        return false;
    }

    @Override
    public boolean replenishaccount(Card card) {
        double moneySum = card.getBalance();
        boolean shart = true;
        while (shart) {
            System.out.println("Naqt pulinigizni kiriting.");
            double money = scanner.nextDouble();
            moneySum += money;
            System.out.println("Hisobingizda : " + (moneySum));
            System.out.println("1. Pul kiritshni davom etish ->");
            System.out.println("2. Pulni plastik kartaga tashlash.");
            switch (scanner.nextInt()){
                case 1 : {
                    break;
                }
                case 2 : {
                    shart = false;
                    break;
                }
            }
        }
        card.setState(false);
        return false;
    }

    @Override
    public void currencyexchange(Card card) {
        double money;
        System.out.println("=====================");
        System.out.println("-=Hozirda kurs SOTIB OLISH: 1 USD -> 11 260,00 sum.    SOTISH: 11 300.00=-");
        System.out.println("");
        System.out.println("1. UZS -> USD");
        System.out.println("2. USD -> UZS");
        switch (scanner.nextInt()){
            case 1 : {
                System.out.println("Summani kiriting.");
                money = scanner.nextDouble();
                if(card.getBalance() >= (money+money * 0.01)){
                    System.out.println("Mavjud bo'lgan valyuta : " + (money / 11300) + " $");
                    System.out.println("Kartangizda qolgan mablag' : " + (card.getBalance() - (money + money*0.01)));
                }else System.out.println("Kartangizda mablag' yetarli emas.");
                break;
            }
            case 2 : {
                System.out.println("Kartangizdagi valyuta USD bo'lsagina ishlaydi!");
                System.out.println("USDni kiriting.");
                money = scanner.nextDouble();
                if(card.getBalance() < 10000) {
                    if (card.getBalance() >= (money + money * 0.01)) {
                        System.out.println("Mavjud bo'lgan summa : " + (money * 11300) + " SUM");
                        System.out.println("Kartangizda qolgan mablag' : " + (card.getBalance() - (money + money * 0.01)));
                    } else System.out.println("Kartangizda yetarli USD yo'q.");
                }else System.out.println("Kartangiz balansi USD emas!");
                break;
            }
        }

    }

    @Override
    public void message(Card card) {
        System.out.println("Telefon raqamingizni kiriting.");
        System.out.print("+998 ");
        int tel = scanner.nextInt();

    }
}
