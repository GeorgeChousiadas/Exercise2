package gr.codehub.ecommerce.service;

import gr.codehub.ecommerce.model.Product;

import java.util.ArrayList;

/**
 * InventoryRetailStore create an ArrayList
 * with the name product to keep an inventory
 */
public class InventoryRetailStore implements IStore{

    //create a list products, to hold the inventory
    private ArrayList<Product> products = new ArrayList<>();

    @Override
    public void buy(Product product) { products.add(product); }

    @Override
    public void sell(Product product) {
        products.remove(product);
    }

    @Override
    public double getRevenue() {
        double totalRevenue=0;

        for (Product product : products){
            totalRevenue = totalRevenue + ( product.getPriceWhenSell() - product.getPriceWhenBuy() );
        }
        return totalRevenue;
    }

    @Override
    public void getInventory(){
        for (Product product : products) {
            System.out.println("ID: "+product.getId()+ " Artist: "+product.getName() +" Buy Price: "
                    +product.getPriceWhenBuy()+ " Sell Price: " +product.getPriceWhenSell());
        }
    }

    @Override
    public void reset(){
            products.removeAll(products);
    }

}
