package DecoratorPattern.Caffe.Condiment;

import DecoratorPattern.Caffe.Beverage;
import DecoratorPattern.Caffe.CondimentDecorator;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 휘핑크림";
    }
}
