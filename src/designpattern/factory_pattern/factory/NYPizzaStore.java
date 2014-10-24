package designpattern.factory_pattern.factory;

import designpattern.factory_pattern.model.Pizza;
import designpattern.factory_pattern.model.newyork.NYStyleCheesePizza;
import designpattern.factory_pattern.model.newyork.NYStyleMeatPizza;

/**
 * New York Pizza Store
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 24/10/2014
 * @project JavaExamProject
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {

        Pizza pizza;

        if(type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        } else  {
            pizza = new NYStyleMeatPizza();
        }

        return pizza;
    }
}
