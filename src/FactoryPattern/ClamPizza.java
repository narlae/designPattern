package FactoryPattern;

public class ClamPizza extends Pizza {
    PizzaIngredientFactory ingredientfactory;

    public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.ingredientfactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("준비중: "+ name);
        dough = ingredientfactory.createDough();
        sauce = ingredientfactory.createSauce();
        cheese = ingredientfactory.createCheese();
        clam = ingredientfactory.createClam();
    }
}
