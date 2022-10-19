package StrategyPattern.Character;

import StrategyPattern.Behavior.Weapon.SwordBehavior;

public class Knight extends Character{

    public Knight() {
        weapon = new SwordBehavior();
    }

    @Override
    public void fight() {
        weapon.useWeapon();
    }
}
