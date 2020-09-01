package gr.codehub.ecommerce.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 * This is a account for stores. This subclass inherits from
 * Account class it's 3 fields and it's methods (withdraw/deposit)
 * also, but also has 2 new fields and 1 new method
 */
public class StoreAccount extends Account{

    private String storeName;
    private String accountCategory;

    //constructor for the fields
    public StoreAccount(String owner, double balance, int numberOfTransactions, String storeName, String accountCategory) {
        super(owner, balance, numberOfTransactions);
        this.storeName = storeName;
        this.accountCategory = accountCategory;
    }

    public void changeCategory(String category) {

        if (category == "basic" || category == "mid" || category == "extra" || category == "premium") {
            this.accountCategory = category;
        }
        else{
            System.out.println("The category has to be: basic/mid/extra/premium");
        }
    }
}
