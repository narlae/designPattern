package StrategyPattern.Character;

import StrategyPattern.Behavior.Weapon.AxeBehavior;

public class Troll extends Character{

    public Troll() {
        weapon = new AxeBehavior();
    }

    @Override
    public void fight() {
        weapon.useWeapon();

    }
}