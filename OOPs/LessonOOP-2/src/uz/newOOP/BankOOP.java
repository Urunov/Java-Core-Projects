package uz.newOOP;

public class BankOOP {  // class

    /**
     *  Access Modifier: Dostup modifikatsiya.

      O'zgaruvchilar. Variables, Premenniy.
        - private  -- Secure (Mahfiy) -- High (Visokiy)
        - protected -- secure (mahfiy) -- Middle (serdniy)
        - default -- poumalchaniya --- Low Secure
        - public --- publichniy --- dostuniy.
     * */
     public String name;
     private String account;
     private int CVV;
     protected String holder;
     String address; // default;

     public BankOOP(String name, String account, String holder, int CVV){ // constructor
         this.name = name;
         this.account = account;
         this.holder = holder;
         this.CVV = CVV;
     }

     public BankOOP(String  name, String address){
         this.name = name;
         this.address = address;
     }

    public void giveMeInformation(){ // method
         //
        System.out.println("Bank Name: " + name + " Account name: " + account + " holder: " + holder + "  CVV: " + CVV);
    }

    public void prostoyInformatsiya(){
         //
        System.out.println("Bank Name: " + name + " address: " + address);
    }
}