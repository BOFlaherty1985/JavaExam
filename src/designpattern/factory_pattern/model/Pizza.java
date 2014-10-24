package designpattern.factory_pattern.model;

import java.util.ArrayList;

/**
 * Pizza Object
 *
 * @author Benjamin O'Flaherty
 * @date Created on: 24/10/2014
 * @project JavaExamProject
 */
public abstract class Pizza {

    public String name;
    public String dough;
    public String sauce;

    ArrayList toppings = new ArrayList();

    public void preparePizza() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding " + sauce + " sauce ...");
        System.out.println("Adding toppings...");
    }

    public void bakePizza() {
        System.out.println("Baking Pizza for 25 minutes");
    }

    public void cutPizza() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void boxPizza() {
        System.out.println("Place pizza in the box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public ArrayList getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList toppings) {
        this.toppings = toppings;
    }

}
