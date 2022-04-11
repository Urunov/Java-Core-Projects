package uz.newOOP;

public class GlavniyOffice {
    public static void main(String[] args) {

        BankOOP tbc = new BankOOP("TBC", "8600456712340987", "Ozod", 123 ); // Object
        tbc.giveMeInformation();

        BankOOP anor = new BankOOP("Anor","Tashkent, Uzbekistan");
        anor.giveMeInformation();
        anor.prostoyInformatsiya();

        BankOOP turonBank = new BankOOP("Turon Bank in Tashkent", "Tashkent");
        turonBank.prostoyInformatsiya();

        System.out.println("----------------------------");

        Manager manager = new Manager("Adham Allabayev", 300.34);
        manager.salaryDay();
        System.out.println("-------------------------------");
        manager.bonusGiveMe(120.1);

        Manager manager1 = new Manager("DaminBek", 230.12);
        manager1.salaryDay();
        manager1.bonusGiveMe(43.2);

        Manager manager2 = new Manager("Orifjon", 230.12);
        manager2.salaryDay();
        manager2.bonusGiveMe(33.6);

        Manager manager3 = new Manager("Ozod", 231.1);
        manager3.salaryDay();
        manager3.bonusGiveMe(5.4);

        manager2.bonusGiveMe(50.1);

        Manager bratishka = new Manager("Bratishka", 90.2);
        bratishka.salaryDay();
        bratishka.bonusGiveMe(5.4);
    }
}
