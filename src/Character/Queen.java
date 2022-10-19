package Character;

import Behavior.Weapon.BowAndArrowBehavior;
import Behavior.Weapon.WeaponBehavior;

public class Queen extends Character {
    public Queen() {
        weapon = new BowAndArrowBehavior();
    }

    @Override
    public void fight() {
        weapon.useWeapon();
    }
}
