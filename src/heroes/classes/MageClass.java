package heroes.classes;

public class MageClass implements HeroClass{

    @Override
    public String getHeroClassName() {
        return "Mage";
    }

    @Override
    public int getInitialHealth() {
        return 100;
    }

    @Override
    public int getInitialStrength() {
        return 2;
    }

    @Override
    public int getInitialDexterity() {
        return 3;
    }

    @Override
    public int getInitialIntelligence() {
        return 10;
    }

    @Override
    public int levelUpHealth(int currentHealth) {
        return currentHealth+15;
    }

    @Override
    public int levelUpStrength(int currentStrength) {
        return currentStrength+1;
    }

    @Override
    public int levelUpDexterity(int currentDexterity) {
        return currentDexterity+2;
    }

    @Override
    public int levelUpIntelligence(int currentIntelligence) {
        return currentIntelligence+5;
    }
}
