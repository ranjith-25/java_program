/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;
abstract class GenralBank{
    
    abstract double getSavingInterestRate();
    abstract double getFixedDepositInterestRate();
}
class ICICIBank extends GenralBank{
    
    double getSavingInterestRate(){
        return 4;
    }
    double getFixedDepositInterestRate(){
        return 8.5;
    }
}
class KotMBank extends GenralBank{
    
    double getSavingInterestRate(){
        return 6;
    }
    double getFixedDepositInterestRate(){
        return 9;
    }
}
public class Banking {

    public static void main(String[] args) {
        ICICIBank i = new ICICIBank();
        KotMBank k = new KotMBank();
        GenralBank gk =new KotMBank();
        GenralBank gi =new ICICIBank();
        System.out.println("ICICI Bank");
        System.out.println("Saving Interest Rate: "+i.getSavingInterestRate()+"%");
        System.out.println("Fixed Deposit Interest Rate: "+i.getFixedDepositInterestRate()+"%");
        System.out.println("Kotak Mahendhara Bank");
        System.out.println("Saving Interest Rate: "+k.getSavingInterestRate()+"%");
        System.out.println("Fixed Deposit Interest Rate: "+k.getFixedDepositInterestRate()+"%");
        System.out.println("General Bank in ICICI");
        System.out.println("Saving Interest Rate: "+gi.getSavingInterestRate()+"%");
        System.out.println("Fixed Deposit Interest Rate: "+gi.getFixedDepositInterestRate()+"%");
        System.out.println("General Bank using KotMBank");
        System.out.println("Saving Interest Rate: "+gk.getSavingInterestRate()+"%");
        System.out.println("Fixed Deposit Interest Rate: "+gk.getFixedDepositInterestRate()+"%");
    }
    
}
