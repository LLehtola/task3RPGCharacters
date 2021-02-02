package heroes.classes;

public class RangerClass implements HeroClass{

    @Override
    public String getHeroClassName() {
        return "Ranger";
    }

    @Override
    public int getInitialHealth() {
        return 120;
    }

    @Override
    public int getInitialStrength() {
        return 5;
    }

    @Override
    public int getInitialDexterity() {
        return 10;
    }

    @Override
    public int getInitialIntelligence() {
        return 2;
    }

    @Override
    public int levelUpHealth(int currentHealth) {
        return currentHealth+20;
    }

    @Override
    public int levelUpStrength(int currentStrength) {
        return currentStrength+2;
    }

    @Override
    public int levelUpDexterity(int currentDexterity) {
        return currentDexterity+5;
    }

    @Override
    public int levelUpIntelligence(int currentIntelligence) {
        return currentIntelligence+1;
    }
}
