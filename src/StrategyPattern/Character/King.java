package StrategyPattern.Character;

import StrategyPattern.Behavior.Weapon.KnifeBehavior;

public class King extends Character{

    public King() {
        weapon = new KnifeBehavior();
    }

    @Override
    public void fight() {
        weapon.useWeapon();
    }
}
