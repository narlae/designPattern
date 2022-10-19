package StrategyPattern.Character;

import StrategyPattern.Behavior.Weapon.BowAndArrowBehavior;

public class Queen extends Character {
    public Queen() {
        weapon = new BowAndArrowBehavior();
    }

    @Override
    public void fight() {
        weapon.useWeapon();
    }
}
