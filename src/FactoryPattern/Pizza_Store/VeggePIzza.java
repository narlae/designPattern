package FactoryPattern.Pizza_Store;

import FactoryPattern.Pizza;
import FactoryPattern.PizzaIngredientFactory;

public class VeggePIzza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public VeggePIzza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }


    @Override
    public void prepare() {
        System.out.println("준비중 : " + name);

        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggies();
    }
}
