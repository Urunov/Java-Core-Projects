package uz.bepro.atm.model;

import java.util.Scanner;

public class ServiceatmImplement implements ServiceATM {

    static int num;

    Scanner scanner = new Scanner(System.in);
    @Override
    public void changePin(Card card) {
        String password;
        System.out.println("Enter your current password : ");
        password = scanner.nextLine();
        if(card.getPin().equals(password)){
            System.out.println("Enter your new password");
            card.setPin(scanner.nextLine());
            System.out.println("");
            System.out.println("");
            System.out.println("Successfully completed. Your password has been changed.");
        }else System.out.println("Your current password is incorrect!!!");

    }

    @Override
    public void balance(Card card) {
        System.out.println("In your card account : " + card.getBalance());
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
        System.out.println("5. Enter another amount");
        double money;
        switch (scanner.nextInt()){
            case 1 : {
                money = (50000 + 50000 * 0.01);
                if(card.getBalance() >= money){
                    System.out.println("       ==========Chek:========");
                    System.out.println("Take your money : 50 000 sum");
                    System.out.println("1 50,000 come out.");
                    System.out.println("In your account " + (card.getBalance() - money) + " soums left.");
                    System.out.println("Service fee " + (50000 * 0.01));
                }else System.out.println("There is not enough money in your account.!");
                break;
            }
            case 2 : {
                money = (100000 + 100000 * 0.01);
                if(card.getBalance() >= money){
                    System.out.println("       ==========Chek:========");
                    System.out.println("Take your money : 100 000 sum");
                    System.out.println("1 100,000 come out.");
                    System.out.println("In your account  " + (card.getBalance() - money) + " soums left.");
                    System.out.println("Service fee " + (100000 * 0.01));
                }else System.out.println("There is not enough money in your account.!");
                break;
            }
            case 3 : {
                money = (150000 + 150000 * 0.01);
                if(card.getBalance() >= money){
                    System.out.println("       ==========Chek:========");
                    System.out.println("Take your money : 150 000 sum");
                    System.out.println("1 50,000 comes out 2 100,000 comes out.");
                    System.out.println("In your account " + (card.getBalance() - money) + " soums left.");
                    System.out.println("Service fee " + (150000 * 0.01));
                }else System.out.println("There is not enough money in your account.!");
                break;
            }
            case 4 : {
                money = (200000 + 200000 * 0.01);
                if(card.getBalance() >= money){
                    System.out.println("       ==========Chek:========");
                    System.out.println("Take your account : 200 000 sum");
                    System.out.println("2 100,000 comes out.");
                    System.out.println("In your account " + (card.getBalance() - money) + " soums left.");
                    System.out.println("Service fee " + (20000 * 0.01));
                }else System.out.println("There is not enough money in your account.!");
                break;
            }
            case 5 : {
                out:
                System.out.println("Enter the amount : ");
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
                        System.out.println("Take your money : " + money + " sum.");
                        System.out.println(count100 + " 100,000 will be issued.");
                        System.out.println(count50 + " 50,000 will be issued.");
                        System.out.println(count20 + " 20,000 will be issued.");
                        System.out.println(count10 + " 10,000 will be issued.");
                        System.out.println(count5 + " 5,000 will be issued.");
                        System.out.println("In your account " + (card.getBalance() - moneySum) + " soums left.");
                        System.out.println("Service fee " + (money * 0.01));
                    } else {
                        System.out.println("There is not enough money in your account.!");
                    }
                        System.out.println("================================");
                }
                    else {
                        System.out.println("This ATM can only withdraw 5 000 10 000 10 000 20 000 50 000 soms 1 000 2 000 sums cannot be withdrawn!!!");
                    }
                    System.out.println("==================================");
                }
                else {
                    System.out.println("The minimum amount is 10,000 soums.");
               
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
        boolean check = false;
        for(int i = 0; i < 3; i++) {
            System.out.println("Enter your password.");
            String pin = scanner.nextLine();
            if (pin.equals(card.getPin())) {
                check = true;
                return check;
            } else {
                System.err.println("Your password is incorrect!!!");
                if (i == 2) {
                    card.setState(false);
                    check = false;
                    return check;
                }
            }
        }
        return check;
    }

    @Override
    public boolean replenishaccount(Card card) {
        double moneySum = card.getBalance();
        boolean shart = true;
        while (shart) {
            System.out.println("Enter your cash.");
            double money = scanner.nextDouble();
            moneySum += money;
            System.out.println("In your account : " + (moneySum));
            System.out.println("1. Continue to deposit money ->");
            System.out.println("2. Throw money on a plastic card.");
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
        System.out.println("-=BUY : 1 USD -> 11 260,00 sum.    SALE : 11 300.00=-");
        System.out.println("");
        System.out.println("1. UZS -> USD");
        System.out.println("2. USD -> UZS");
        switch (scanner.nextInt()){
            case 1 : {
                System.out.println("Enter the amount.");
                money = scanner.nextDouble();
                if(card.getBalance() >= (money+money * 0.01)){
                    System.out.println("Current currency : " + (money / 11300) + " $");
                    System.out.println("Balance on your card : " + (card.getBalance() - (money + money*0.01)));
                }else System.out.println("Not enough money on your card.");
                break;
            }
            case 2 : {
                System.out.println("It only works if the currency on your card is USD!");
                System.out.println("Enter USD.");
                money = scanner.nextDouble();
                if(card.getBalance() < 10000) {
                    if (card.getBalance() >= (money + money * 0.01)) {
                        System.out.println("The amount available : " + (money * 11300) + " SUM");
                        System.out.println("The amount left on your card : " + (card.getBalance() - (money + money * 0.01)));
                    } else System.out.println("You don’t have enough USD on your card.");
                }else System.out.println("Your card balance is not USD!");
                break;
            }
        }

    }

    @Override
    public void message(Card card) {
        System.out.println("Enter your phone number.");
        System.out.print("+998 ");
        int tel = scanner.nextInt();

    }
}
