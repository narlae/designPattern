package Behavior.Weapon;

public class KnifeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("나이프를 휘두릅니다.");
    }
}
