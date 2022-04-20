package uz.bepro.atm.model.uzbek;

import uz.bepro.atm.model.Card;
import uz.bepro.atm.model.ServiceATM;
import uz.bepro.atm.model.ServiceatmImplement;

import java.util.Scanner;

public class UzbekchaLogics {

    static Card card = new Card("Uzcard", "8600 1309 2341 1212", "Sherjonov Jahongir", "0909", 2000000, true);
    static Card card1 = new Card("Humo", "9860 1234 4555 9012", "Aminov Abror", "0919", 100000, true);
    static Card card2 = new Card("Visa", "1921 1010 5544 9013", "Ozodov Doniyor", "0309", 1000, true);
    static Card card3 = new Card("Master  Card", "7654 9090 1214 9014", "Mirziyoyev Shuhrat", "1909", 1400, true);
    static Card card4 = new Card("Union Pay", "9077 1234 2321 9015", "Asqarov Abbos", "4309", 43000, true);

    public static Card[] cards = {card, card1, card2, card3, card4}; // massive db

    ServiceATM service = new ServiceatmImplement();
    public  void Logicsinfo() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Plastik nomerni kiriting: ");
            Card insertedCard = getCard(scanner.nextLine());
            if (insertedCard != null) {

                if(service.checkPin(insertedCard)){

                        System.out.println("----------------------");
                        System.out.println("1. Karta hisobini ko'rish.");
                        System.out.println("----------------------");
                        System.out.println("2. Naqt pul yechish.");
                        System.out.println("----------------------");
                        System.out.println("3. Karta hisobini to'ldirish.");
                        System.out.println("----------------------");
                        System.out.println("4. Valyuta ayriboshlash.");
                        System.out.println("----------------------");
                        System.out.println("5. SMS habarnoma.");
                        System.out.println("----------------------");
                        System.out.println("6. Karta pinkodini o'zgartirish.");
                        System.out.println("----------------------");
                   
                    switch (scanner.nextInt()){
                        case 1 : {
                            service.balance(insertedCard);
                            break;
                        }
                        case 2 : {
                            service.withdraw(insertedCard);
                            break;
                        }
                        case 3 : {
                            service.replenishaccount(insertedCard);
                            break;
                        }
                        case 4 : {
                            service.currencyexchange(insertedCard);
                            break;
                        }
                        case 5 : {
                            service.message(insertedCard);
                        }
                        case 6 : {
                            service.changePin(insertedCard);
                            break;
                        }
                    }

                }else System.out.println("Parolni yaxshilab yoz...");
            }else System.out.println("Iltimos kartangizni kiritng!");

        }
    }

    public static Card getCard(String id) {
        for (Card card : cards) {
                if (card.getId().equals(id)) {
                    if (card.isState()) {
                        return card;
                    } else {
                        System.out.println("Karta ishlamayapdi!!!");
                        return null;
                    }
                }
            }
//        System.out.println("Bunday plastik karta mavjud emas!!!");
        return null;
    }
}
