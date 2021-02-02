package items.types;

public class MagicWeapon implements WeaponType,ItemType {
    @Override
    public int getBaseDamage() {
        return 25;
    }

    @Override
    public int levelUpDamage(int currentDamage) {
        return currentDamage+2;
    }

    @Override
    public ItemEnum getItemEnum() {
        return ItemEnum.MAGIC_WEAPON;
    }

    @Override
    public String getItemTypeName() {
        return "Magic Weapon";
    }
}
