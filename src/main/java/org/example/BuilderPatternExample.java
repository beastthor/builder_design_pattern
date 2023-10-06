package org.example;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class BuilderPatternExample {
   public static void main(String[] args){

       Waiter waiter = new Waiter();

       //Create Margherita pizza

       PizzaBuilder margheritaBuilder = new MargheritaPizzaBuilder();
      waiter.setPizzaBuilder(margheritaBuilder);
      waiter.constructPizza();
      Pizza margheritaPizza = waiter.getPizza();
        margheritaPizza.describePizza();

        //Create spicy pizza
        PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();
        waiter.setPizzaBuilder(spicyPizzaBuilder);
        waiter.constructPizza();
        Pizza spicyPizza = waiter.getPizza();
        spicyPizza.describePizza();

   }
}