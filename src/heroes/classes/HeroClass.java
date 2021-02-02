package heroes.classes;

public interface HeroClass {

    public String getHeroClassName();

    public int getInitialHealth();
    public int getInitialStrength();
    public int getInitialDexterity();
    public int getInitialIntelligence();

    public int levelUpHealth(int currentHealth);
    public int levelUpStrength(int currentStrength);
    public int levelUpDexterity(int currentDexterity);
    public int levelUpIntelligence(int currentIntelligence);
}
