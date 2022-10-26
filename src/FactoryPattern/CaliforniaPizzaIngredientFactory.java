package FactoryPattern;

import FactoryPattern.Ingredient.*;
import FactoryPattern.Ingredient.veggies.Galic;
import FactoryPattern.Ingredient.veggies.Mushroom;
import FactoryPattern.Ingredient.veggies.Onion;
import FactoryPattern.Ingredient.veggies.RedPepper;

public class CaliforniaPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new VeryThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new BruschettaSauce();
    }

    @Override
    public Cheese createCheese() {
        return new GoatCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Galic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
