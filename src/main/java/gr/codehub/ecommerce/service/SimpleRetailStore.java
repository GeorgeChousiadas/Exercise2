package gr.codehub.ecommerce.service;

import gr.codehub.ecommerce.model.Product;

import java.util.ArrayList;

/**
 * SimpleRetailStore implements the interface and
 * now the bodies of the methods provided
 * This Store do not keep an inventory
 */
public class SimpleRetailStore implements IStore {

    private double  totalBuyBalance; //total balance of the paints when by
    private  double totalSellBalance;//total balance of the paints when sell

    @Override
    public void buy(Product product) {
        totalBuyBalance += product.getPriceWhenBuy();
    };

    @Override
    public void sell(Product product) {
        totalSellBalance += product.getPriceWhenSell();
    }

    @Override
    public double getRevenue() {
        return totalSellBalance - totalBuyBalance;
    }

    //empty method which implemented in InventoryRetailStore
    @Override
    public void getInventory(){
    }

    //empty method which implemented in InventoryRetailStore
    @Override
    public void reset(){
    }

}