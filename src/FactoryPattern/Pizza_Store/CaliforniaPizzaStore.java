package FactoryPattern.Pizza_Store;

import FactoryPattern.*;

public class CaliforniaPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new CaliforniaPizzaIngredientFactory();

        if (item.equals("cheese")) {

            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("캘리포니아 스타일 치즈 피자");

        } else if (item.equals("veggie")) {

            pizza = new VeggePIzza(ingredientFactory);
            pizza.setName("캘리포니아 스타일 야채 피자");

        } else if (item.equals("clam")) {

            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("캘리포니아 스타일 조개 피자");

        } else if (item.equals("pepperoni")) {

            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("캘리포니아 스타일 페페로니 피자");
        }
        return pizza;
    }
}
