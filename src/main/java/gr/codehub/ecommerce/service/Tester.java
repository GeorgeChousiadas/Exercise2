package gr.codehub.ecommerce.service;

import java.util.Scanner;
import gr.codehub.ecommerce.model.Account;
import gr.codehub.ecommerce.model.StoreAccount;

/**
 *
 */
public class Tester {

    //constructor
    public Tester() {
    }

    public void testerMethod() {

        Account acc = new Account();
        Account acc1 = new Account();
        Account acc2 = new Account();


        acc.setOwner("Papadoupoulos");
        acc.setBalance(30.00);
        acc.setNumberOfTransactions(3);

        acc1.setOwner("Doukas");
        acc1.setBalance(200.00);
        acc1.setNumberOfTransactions(15);

        acc2.setOwner("Kontopoulou");
        acc2.setBalance(500.00);
        acc2.setNumberOfTransactions(2);


        System.out.println("Owner:" +acc.getOwner()+ " // Euros:" +acc.getBalance() + " // Trans:" + acc.getNumberOfTransactions());
        System.out.println("Owner:" +acc1.getOwner()+ " // Euros:" +acc1.getBalance() + " // Trans:" + acc1.getNumberOfTransactions());
        System.out.println("Owner:" +acc2.getOwner()+ " // Euros:" +acc2.getBalance() + " // Trans:" + acc2.getNumberOfTransactions());
        System.out.println(" ");

        acc.withdraw(50);
        acc.deposit(500);

        System.out.println("Owner:" +acc.getOwner()+ " || Euros:" +acc.getBalance() + " || Trans:" + acc.getNumberOfTransactions());
        System.out.println(" ");

        acc2.withdraw( acc1.getBalance() );

        System.out.println("Owner:" +acc.getOwner()+ " || Euros:" +acc.getBalance() + " || Trans:" + acc.getNumberOfTransactions());
        System.out.println("Owner:" +acc1.getOwner()+ " || Euros:" +acc1.getBalance() + " || Trans:" + acc1.getNumberOfTransactions());
        System.out.println("Owner:" +acc2.getOwner()+ " || Euros:" +acc2.getBalance() + " || Trans:" + acc2.getNumberOfTransactions());
        System.out.println(" ");


        StoreAccount storeacc = new StoreAccount();





    }

}
