package gr.codehub.ecommerce.service;

import gr.codehub.ecommerce.model.Product;

/**
 *
 */
public class SimpleRetailStore implements IStore {

    private double  totalBuyBalance;
    private  double totalSellBalance;

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

    ////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////
    @Override
    public void getInventory(){
    }

    @Override
    public void reset(){
    }

}
