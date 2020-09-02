package gr.codehub.ecommerce.service;

import gr.codehub.ecommerce.model.Product;

/**
 *  Interface IStore. Interface implementation
 *  consist of related methods with empty bodies
 */
public interface IStore {

    void buy(Product product);
    void sell(Product product);
    double getRevenue();

    void getInventory();
    void reset();


}
