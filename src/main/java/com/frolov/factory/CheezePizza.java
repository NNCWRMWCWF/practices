package com.frolov.factory;

public class CheezePizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparing cheeze pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking cheeze pizza");

    }

    @Override
    public void cut() {
        System.out.println("Cutting cheeze pizza");

    }

    @Override
    public void box() {
        System.out.println("Boxing cheeze pizza");

    }
}
