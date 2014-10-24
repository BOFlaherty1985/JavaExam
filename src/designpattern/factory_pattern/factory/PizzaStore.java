package designpattern.factory_pattern.factory;

import designpattern.factory_pattern.model.Pizza;

/**
 * Pizza Store
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 24/10/2014
 * @project JavaExamProject
 */
public abstract class PizzaStore {

    /* A factory class decouples the creation of Pizza objects. The user calls the factory method instead of
       using the 'new' keyword to create the object directly.

      * The factory pattern decouples the calling class from the target class, which result in less coupled and highly
        cohesive code.
      * A factory class can have many clients, therefore by encapsulating the object creation code into one class if
        we have to make any modifications, we only need to change one class.
      * We can use the factory pattern where we have to create an object of any one of the sub-classes depending on the
        data provided.
      * Objects in the factory pattern do not need to know how they're created.
      * The factory pattern allows us to leave open the option that in the future there may be new ways to create the
        concrete product (object), in this case, Pizza.

    */

    public Pizza orderPizza(String type) {

        Pizza pizza = createPizza(type);
        pizza.preparePizza();
        pizza.bakePizza();
        pizza.cutPizza();
        pizza.boxPizza();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);

}
