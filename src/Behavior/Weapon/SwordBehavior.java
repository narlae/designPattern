package Behavior.Weapon;

public class SwordBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("검을 휘두릅니다.");
    }
}
