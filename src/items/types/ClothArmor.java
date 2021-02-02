package items.types;

public class ClothArmor implements ArmorType, ItemType {

    @Override
    public int getBaseBonusHealth() {
        return 10;
    }

    @Override
    public int getBaseBonusStrength() {
        return 0;
    }

    @Override
    public int getBaseBonusDexterity() {
        return 1;
    }

    @Override
    public int getBaseBonusIntelligence() {
        return 3;
    }

    @Override
    public int levelUpBonusHealth(int currentBonusHealth) {
        return currentBonusHealth+5;
    }

    @Override
    public int levelUpBonusStrength(int currentBonusStrength) {
        return currentBonusStrength+0;
    }

    @Override
    public int levelUpBonusDexterity(int currentBonusDexterity) {
        return currentBonusDexterity+1;
    }

    @Override
    public int levelUpBonusIntelligence(int currentBonusIntelligence) {
        return currentBonusIntelligence+2;
    }

    @Override
    public ItemEnum getItemEnum() {
        return ItemEnum.CLOTH_ARMOR;
    }

    @Override
    public String getItemTypeName() {
        return "Cloth Armor";
    }
}
