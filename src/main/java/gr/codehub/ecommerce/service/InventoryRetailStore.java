package gr.codehub.ecommerce.service;

import gr.codehub.ecommerce.model.Product;

import java.util.ArrayList;

/**
 *
 */
public class InventoryRetailStore implements IStore{

    private ArrayList<Product> products = new ArrayList<>();


    @Override
    public void buy(Product product) {
        products.add(product);
    }

    @Override
    public void sell(Product product) {
        products.remove(product);
    }

    @Override
    public double getRevenue() {
        double totalRevenue=0;
        for (Product product : products) {
                totalRevenue = totalRevenue + ( product.getPriceWhenSell() - product.getPriceWhenBuy() );
        }
        return totalRevenue;
    }


    public void getInventory(){
        for (Product product : products) {
            System.out.println("ID: "+product.getId()+ " Artist: "+product.getName() +" Buy Price: "
                    +product.getPriceWhenBuy()+ " Sell Price: " +product.getPriceWhenSell());
        }
    }

    public void reset(){
            products.removeAll(products);
    }

}
