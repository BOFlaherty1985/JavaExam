package designpattern.factory_pattern.model.newyork;

import designpattern.factory_pattern.model.Pizza;

/**
 * NY Meat Pizza Object
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 24/10/2014
 * @project JavaExamProject
 */
public class NYStyleMeatPizza extends Pizza {

    public NYStyleMeatPizza() {
        name = "New York Meat Pizza";
        dough = "Thin Crust";
        sauce = "Tomato Sauce";
    }

    public void cutPizza() {
        System.out.println("Cutting the pizza into square slices");
    }

}
