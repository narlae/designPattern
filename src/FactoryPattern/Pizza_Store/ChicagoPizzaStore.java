package FactoryPattern.Pizza_Store;

import FactoryPattern.Pizza;
import FactoryPattern.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (item.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        }else return null;
    }
}
