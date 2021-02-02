package items.types;

public interface ArmorType {

    public int getBaseBonusHealth();
    public int getBaseBonusStrength();
    public int getBaseBonusDexterity();
    public int getBaseBonusIntelligence();

    public int levelUpBonusHealth(int currentBonusHealth);
    public int levelUpBonusStrength(int currentBonusStrength);
    public int levelUpBonusDexterity(int currentBonusDexterity);
    public int levelUpBonusIntelligence(int currentBonusIntelligence);
}
