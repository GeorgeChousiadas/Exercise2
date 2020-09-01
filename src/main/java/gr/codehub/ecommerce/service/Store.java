package gr.codehub.ecommerce.service;

import java.util.ArrayList;
import gr.codehub.ecommerce.model.Product;

/**
 *
 */
public class Store implements IStore{

    private ArrayList<Product> products;

    @Override
    public double getRevenue() {
        return 0;
    }

    @Override
    public void buy(Product product) {
        products.add(product);
    };

    @Override
    public void sell(Product product) {
        products.remove(product);
    }




}


