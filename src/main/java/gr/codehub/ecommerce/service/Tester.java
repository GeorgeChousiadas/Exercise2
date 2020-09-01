package gr.codehub.ecommerce.service;

import java.util.Scanner;
import gr.codehub.ecommerce.model.Account;
import gr.codehub.ecommerce.model.StoreAccount;

/**
 * Tester is the class in which i have implemented testerMethod.
 * This method tests all the methods of the parent class Account
 * (withdraw/deposit) and the one and only method of the child class
 * StoreAccount  (changeCategory)
 */
public class Tester {

    //constructor
    public Tester() {
    }

    public void testerMethod() {


////////////////////////////////////////////////////////////////////////
///////////////   these are accounts for people   //////////////////////
////////////////////////////////////////////////////////////////////////

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

/*
        System.out.println("Owner:" +acc.getOwner()+ " , Euros:" +acc.getBalance() + " , Trans:" + acc.getNumberOfTransactions());
        System.out.println("Owner:" +acc1.getOwner()+ " , Euros:" +acc1.getBalance() + " , Trans:" + acc1.getNumberOfTransactions());
        System.out.println("Owner:" +acc2.getOwner()+ " , Euros:" +acc2.getBalance() + " , Trans:" + acc2.getNumberOfTransactions());
        System.out.println(" ");

        acc.withdraw(50);
        acc.deposit(500);

        System.out.println("Owner:" +acc.getOwner()+ " , Euros:" +acc.getBalance() + " , Trans:" + acc.getNumberOfTransactions());
        System.out.println(" ");

        acc2.withdraw( acc1.getBalance() );

        System.out.println("Owner:" +acc.getOwner()+ " , Euros:" +acc.getBalance() + " , Trans:" + acc.getNumberOfTransactions());
        System.out.println("Owner:" +acc1.getOwner()+ " , Euros:" +acc1.getBalance() + " , Trans:" + acc1.getNumberOfTransactions());
        System.out.println("Owner:" +acc2.getOwner()+ " , Euros:" +acc2.getBalance() + " , Trans:" + acc2.getNumberOfTransactions());
        System.out.println(" ");


////////////////////////////////////////////////////////////////////////
///////////////   these are accounts for stores   //////////////////////
////////////////////////////////////////////////////////////////////////

        StoreAccount storeacc1 = new StoreAccount();
        StoreAccount storeacc2 = new StoreAccount();
        StoreAccount storeacc3 = new StoreAccount();



        storeacc1.setStoreName("MASOUTIS");
        storeacc1.setOwner("Diamantis Masoutis");
        storeacc1.setBalance(800000);
        storeacc1.setNumberOfTransactions(150);
        storeacc1.setAccountCategory("extra");


        storeacc2.setStoreName("AB BASILOPOULOS");
        storeacc2.setOwner("Kostas Vasilopoulos");
        storeacc2.setBalance(1000000);
        storeacc2.setNumberOfTransactions(380);
        storeacc2.setAccountCategory("premium");

        storeacc3.setStoreName("JUMBO");
        storeacc3.setOwner("Dimitris Avgerinos");
        storeacc3.setBalance(2000000);
        storeacc3.setNumberOfTransactions(1200);
        storeacc3.setAccountCategory("premium");


        System.out.println("Store name:" +storeacc1.getStoreName()+
                ", Owner:" +storeacc1.getOwner()+ " , Euros:" +storeacc1.getBalance() +
                " , Number of Trans:" +storeacc1.getNumberOfTransactions()+ " , Account Category:" +storeacc1.getAccountCategory());


        storeacc1.withdraw(9000000);
        System.out.println("Store name:" +storeacc1.getStoreName()+
                ", Owner:" +storeacc1.getOwner()+ " , Euros:" +storeacc1.getBalance() +
                " , Number of Trans:" +storeacc1.getNumberOfTransactions()+ " , Account Category:" +storeacc1.getAccountCategory());

        storeacc1.changeCategory("prime");
        storeacc1.changeCategory("premium");

        System.out.println("Store name:" +storeacc1.getStoreName()+
                ", Owner:" +storeacc1.getOwner()+ " , Euros:" +storeacc1.getBalance() +
                " , Number of Trans:" +storeacc1.getNumberOfTransactions()+ " , Account Category:" +storeacc1.getAccountCategory());
*/


    }
}
