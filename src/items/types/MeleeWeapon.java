package items.types;

public class MeleeWeapon implements WeaponType,ItemType {
    @Override
    public int getBaseDamage() {
        return 15;
    }

    @Override
    public int levelUpDamage(int currentDamage) {
        return currentDamage+2;
    }

    @Override
    public ItemEnum getItemEnum() {
        return ItemEnum.MELEE_WEAPON;
    }

    @Override
    public String getItemTypeName() {
        return "Melee Weapon";
    }
}
