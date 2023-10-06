package org.example;

public class SpicyPizzaBuilder extends PizzaBuilder{
    public void buildDough(){
        pizza.setDough("Thick crust");
    }

    public void buildSauce(){
        pizza.setSauce("Spicy tomato sauce");

    }

    public void buildTopping(){
        pizza.setTopping("Pepperoni and jalapenos");
    }
}
