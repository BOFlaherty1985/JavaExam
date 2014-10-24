package designpattern.factory_pattern.client;

import designpattern.factory_pattern.factory.ChicagoPizzaStore;
import designpattern.factory_pattern.factory.NYPizzaStore;
import designpattern.factory_pattern.factory.PizzaStore;

/**
 * Order Pizza Client
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 24/10/2014
 * @project JavaExamProject
 */
public class PizzaClient {

    private static PizzaStore nyPizzaStore = new NYPizzaStore();
    private static PizzaStore chiPizzaStore = new ChicagoPizzaStore();

    public static void main(String[] args) {

        nyPizzaStore.orderPizza("cheese");
        chiPizzaStore.orderPizza("meat");

    }

}
