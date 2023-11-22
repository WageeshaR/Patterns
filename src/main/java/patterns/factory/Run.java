package patterns.factory;

import patterns.factory.store.ChicagoStylePizzaStore;
import patterns.factory.store.NYStylePizzaStore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Run {
    public static void main(String[] args) throws IOException {
        PizzaStore pizzaStore;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Which store are you ordering from?");
        String line = reader.readLine();
        StoreType storeType = StoreType.valueOf(line.toUpperCase());
        if (storeType == StoreType.NY) {
            pizzaStore = new NYStylePizzaStore();
        } else {
            pizzaStore = new ChicagoStylePizzaStore();
        }
        System.out.println("Which pizza type you want to order?");
        String pizzaType = reader.readLine();
        pizzaStore.orderPizza(pizzaType);
    }
}
