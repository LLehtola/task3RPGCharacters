package items.types;

public class LeatherArmor implements ArmorType,ItemType {
    @Override
    public int getBaseBonusHealth() {
        return 20;
    }

    @Override
    public int getBaseBonusStrength() {
        return 1;
    }

    @Override
    public int getBaseBonusDexterity() {
        return 3;
    }

    @Override
    public int getBaseBonusIntelligence() {
        return 0;
    }

    @Override
    public int levelUpBonusHealth(int currentBonusHealth) {
        return currentBonusHealth+8;
    }

    @Override
    public int levelUpBonusStrength(int currentBonusStrength) {
        return currentBonusStrength+1;
    }

    @Override
    public int levelUpBonusDexterity(int currentBonusDexterity) {
        return currentBonusDexterity+2;
    }

    @Override
    public int levelUpBonusIntelligence(int currentBonusIntelligence) {
        return currentBonusIntelligence+0;
    }

    @Override
    public ItemEnum getItemEnum() {
        return ItemEnum.LEATHER_ARMOR;
    }

    @Override
    public String getItemTypeName() {
        return "Leather Armor";
    }
}
