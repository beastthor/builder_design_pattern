package org.example;

public class MargheritaPizzaBuilder extends PizzaBuilder{
    public void buildDough(){
        pizza.setDough("Thin crust");
    }

    public void buildSauce(){
        pizza.setSauce("Tomato sauce");

    }

    public void buildTopping(){
        pizza.setTopping("Mozzarella cheese");
    }
}
