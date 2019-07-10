package com.frolov.decorator;

public class Espresso extends Beverage{
    public Espresso() {
        description = "Espress";
    }

    public double cost() {
        return 1.99;
    }
}
