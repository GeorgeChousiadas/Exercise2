package gr.codehub.ecommerce.store;

import gr.codehub.ecommerce.service.IStore;
import gr.codehub.ecommerce.service.Tester;
import gr.codehub.ecommerce.model.Product;

import gr.codehub.ecommerce.service.InventoryRetailStore;
import gr.codehub.ecommerce.service.SimpleRetailStore;

public class Main {
        public static void main(String[] args) {

            //create an object of Tester type
            Tester test = new Tester();
            //On this object use the testerMethod
            test.testerMethod();


            Product x1 = new Product(1, "Painting Picasso. Guernica", 100, 1000);
            Product x2 = new Product(2, "Painting Tsarouxis . Naftis A", 200, 2000);
            Product x4 = new Product(3, "Chair. Luis XV", 100, 1000);

            IStore simple = new SimpleRetailStore();
            simple.buy(x1);
            simple.buy (x4);
            simple.sell (x1);
            System.out.println(simple.getRevenue());


            IStore invStore = new InventoryRetailStore();
            invStore.buy(x1);
            invStore.buy(x4);
            invStore.sell(x1);
            System.out.println(invStore.getRevenue());
            invStore.sell(x2);
            //System.out.println(invStore.getRevenue());
            invStore.getInventory();

        }
}
