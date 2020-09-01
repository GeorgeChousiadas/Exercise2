package gr.codehub.ecommerce.model;

/**
 * Plain Old Java Object (POJO) class Product
 * No lombok use, constructors, setters &
 * getters by default
 */
public class Product {
    private int id;
    private String name;
    private double priceWhenBuy;
    private double priceWhenSell;

    //constructor
    public Product(int id,String name, double priceWhenBuy, double priceWhenSell) {
        this.id = id;
        this.priceWhenBuy = priceWhenBuy;
        this.priceWhenSell = priceWhenSell;
    }


    public int getId() {
        return id;
    }

    public double getPriceWhenBuy() {
        return priceWhenBuy;
    }

    public double getPriceWhenSell() {
        return priceWhenSell;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPriceWhenBuy(double priceWhenBuy) {
        this.priceWhenBuy = priceWhenBuy;
    }

    public void setPriceWhenSell(double priceWhenSell) {
        this.priceWhenSell = priceWhenSell;
    }
}
