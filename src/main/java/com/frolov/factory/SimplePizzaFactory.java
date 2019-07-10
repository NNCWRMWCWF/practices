package com.frolov.factory;

public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if (type.equals("cheeze")){
            pizza = new CheezePizza();
        } else if (type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")){
            pizza = new ClamPizza();
        }
        return pizza;
    }
}
