package designpattern.factory_pattern.model.newyork;

import designpattern.factory_pattern.model.Pizza;

/**
 * NY Cheese Pizza Object
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 24/10/2014
 * @project JavaExamProject
 */
public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        this.name = "New York Cheese Pizza";
        this.dough = "Stuff Crust";
        this.sauce = "Tomato & Basil Sauce";
    }

    public void cutPizza() {
        System.out.println("Cutting the pizza into square slices");
    }

}
