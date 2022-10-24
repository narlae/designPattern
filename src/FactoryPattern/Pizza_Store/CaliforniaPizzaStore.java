package FactoryPattern.Pizza_Store;

import FactoryPattern.Pizza;
import FactoryPattern.PizzaStore;

public class CaliforniaPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new CaliforniaStyleCheesePizza();
        } else if (item.equals("clam")) {
            return new CaliforniaStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new CaliforniaStylePepperoniPIzza();
        }else return null;
    }
}
