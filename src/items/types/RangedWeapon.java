package items.types;

public class RangedWeapon implements WeaponType, ItemType {
    @Override
    public int getBaseDamage() {
        return 5;
    }

    @Override
    public int levelUpDamage(int currentDamage) {
        return currentDamage+3;
    }

    @Override
    public ItemEnum getItemEnum() {
        return ItemEnum.RANGED_WEAPON;
    }

    @Override
    public String getItemTypeName() {
        return "Ranged Weapon";
    }
}
