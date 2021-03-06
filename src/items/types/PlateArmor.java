package items.types;

public class PlateArmor implements ArmorType, ItemType {
    @Override
    public int getBaseBonusHealth() {
        return 30;
    }

    @Override
    public int getBaseBonusStrength() {
        return 3;
    }

    @Override
    public int getBaseBonusDexterity() {
        return 1;
    }

    @Override
    public int getBaseBonusIntelligence() {
        return 0;
    }

    @Override
    public int levelUpBonusHealth(int currentBonusHealth) {
        return currentBonusHealth+12;
    }

    @Override
    public int levelUpBonusStrength(int currentBonusStrength) {
        return currentBonusStrength+2;
    }

    @Override
    public int levelUpBonusDexterity(int currentBonusDexterity) {
        return currentBonusDexterity+1;
    }

    @Override
    public int levelUpBonusIntelligence(int currentBonusIntelligence) {
        return currentBonusIntelligence+0;
    }

    @Override
    public ItemEnum getItemEnum() {
        return ItemEnum.PLATE_ARMOR;
    }

    @Override
    public String getItemTypeName() {
        return "Plate Armor";
    }
}
