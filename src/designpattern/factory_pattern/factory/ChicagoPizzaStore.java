package designpattern.factory_pattern.factory;

import designpattern.factory_pattern.model.Pizza;
import designpattern.factory_pattern.model.chicargo.ChicagoStyleCheesePizza;
import designpattern.factory_pattern.model.chicargo.ChicagoStyleMeatPizza;

/**
 * Chicago Pizza Store
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 24/10/2014
 * @project JavaExamProject
 */
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {

        Pizza pizza;

        if(type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        } else  {
            pizza = new ChicagoStyleMeatPizza();
        }

        return pizza;
    }

}
