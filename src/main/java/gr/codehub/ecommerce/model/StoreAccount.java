package gr.codehub.ecommerce.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 * This is a account for stores
 */
public class StoreAccount extends Account{

    private String storeName;
    private String accountCategory;


/*
    //constructor
    public StoreAccount(){
    }

    //constructor for the fields
    public StoreAccount(String storeName, String accountCategory) {
        this.storeName = storeName;
        this.accountCategory = accountCategory;
    }
*/
    //constructor
    public StoreAccount(String owner, double balance, int numberOfTransactions, String storeName, String accountCategory) {
        super(owner, balance, numberOfTransactions);
        this.storeName = storeName;
        this.accountCategory = accountCategory;
    }



    public void changeCategory(){
        String basic;
        String mid;
        String extra;
        String premium;


    }









}
