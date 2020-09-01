package gr.codehub.ecommerce.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 * This is an account for people
 * They can withdraw main from their accounts
 * or the can deposit money in their accounts
 * So there are two methods: withdraw/deposit
 */
public class Account {

    //fields of the class Account
    private String owner;
    private double balance;
    private int numberOfTransactions;

    //withdraw method
    public void withdraw(double withdrawAmount){
        this.numberOfTransactions++;
        if(withdrawAmount>0) {
            if (this.balance - withdrawAmount > 0) {
                this.balance -= withdrawAmount;

            }else{
                System.out.println("Error, Insufficient Funds!!!");
                System.out.println("");
            }
        }
        else{
            System.out.println("Error");
            System.out.println("");
        }
    }

    //deposit method
    public void deposit(double depositAmount) {
        this.numberOfTransactions++;
        if (depositAmount>0) {
            this.balance += depositAmount;
        }
        else{
            System.out.println("Error!");
            System.out.println("");
        }
    }
}
