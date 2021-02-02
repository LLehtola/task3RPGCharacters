package heroes.classes;

public class WarriorClass implements HeroClass{

    @Override
    public String getHeroClassName() {
        return "Warrior";
    }

    @Override
    public int getInitialHealth() {
        return 150;
    }

    @Override
    public int getInitialStrength() {
        return 10;
    }

    @Override
    public int getInitialDexterity() {
        return 3;
    }

    @Override
    public int getInitialIntelligence() {
        return 1;
    }

    @Override
    public int levelUpHealth(int currentHealth) {
        return currentHealth+30;
    }

    @Override
    public int levelUpStrength(int currentStrength) {
        return currentStrength+5;
    }

    @Override
    public int levelUpDexterity(int currentDexterity) {
        return currentDexterity+2;
    }

    @Override
    public int levelUpIntelligence(int currentIntelligence) {
        return currentIntelligence+1;
    }
}
