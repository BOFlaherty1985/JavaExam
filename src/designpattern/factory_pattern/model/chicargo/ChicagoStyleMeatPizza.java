package designpattern.factory_pattern.model.chicargo;

import designpattern.factory_pattern.model.Pizza;

/**
 * Chicago Meat Pizza Object
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 24/10/2014
 * @project JavaExamProject
 */
public class ChicagoStyleMeatPizza extends Pizza {

    public ChicagoStyleMeatPizza() {
        name = "Chicago Meat Pizza";
        dough = "Thin Crust";
        sauce = "Tomato Sauce";
    }

}
