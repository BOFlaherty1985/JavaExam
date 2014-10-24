package designpattern.factory_pattern.model.chicargo;

import designpattern.factory_pattern.model.Pizza;

/**
 * Chicago Cheese Pizza Object
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 24/10/2014
 * @project JavaExamProject
 */
public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        this.name = "Chicago Cheese Pizza";
        this.dough = "Stuff Crust";
        this.sauce = "Tomato & Basil Sauce";
    }

}
