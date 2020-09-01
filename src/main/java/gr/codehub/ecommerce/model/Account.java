package gr.codehub.ecommerce.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


/**
 *
 */
public class Account {
    //fields of the class Account
    private String owner;
    private double balance;
    private int numberOfTransactions;

    /*
    //empty constructor
    public Account(){
    }

    //constructor for the fields
    public Account(String owner, double balance, int numberOfTransactions) {
        this.owner = owner;
        this.balance = balance;
        this.numberOfTransactions = numberOfTransactions;
    }
*/
    //withdraw method
    public double withdraw(double withdrawAmount){
        this.numberOfTransactions++;
        if(withdrawAmount>0) {
            if (this.balance - withdrawAmount > 0) {
                this.balance -= withdrawAmount;
                return balance;
            }else{
                System.out.println("Error, Insufficient Funds!!!");
            }
        }
        else{
            System.out.println("Error");
        }

        return -1;
    }


    //deposit method
    public double deposit(double depositAmount) {
        this.numberOfTransactions++;
        if (depositAmount>0) {
            this.balance += depositAmount;
            return balance;
        }
        System.out.println("Error!");
        return -1;
    }





}
