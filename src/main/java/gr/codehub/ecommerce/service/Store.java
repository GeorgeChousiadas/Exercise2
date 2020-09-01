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

 /////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    @Override
    public void getInventory(){
        for (Product product : products) {
            System.out.println("ID: " + product.getId() + " Artist: " + product.getName() + " Buy Price: "
                    + product.getPriceWhenBuy() + " Sell Price: " + product.getPriceWhenSell());
        }
    }

    @Override
    public void reset() {
        products.removeAll(products);
        }



}


