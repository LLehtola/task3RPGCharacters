package heroes;
import heroes.classes.*;
import items.*;
import items.types.ItemSlotEnum;

public class Hero {

    private int health;
    private int strength;
    private int dexterity;
    private int intelligence;

    private int level;
    private int xpToNextLevel;
    private int currentXP;

    private HeroClass heroClass;

    private Item weaponSlotItem =null;
    private Item headSlotItem =null;
    private Item bodySlotItem =null;
    private Item legsSlotItem =null;

    public Hero(HeroClass heroClass) {
        this.heroClass = heroClass;
        this.health = heroClass.getInitialHealth();
        this.strength = heroClass.getInitialStrength();
        this.dexterity = heroClass.getInitialDexterity();
        this.intelligence = heroClass.getInitialIntelligence();
        this.level=1;
        this.xpToNextLevel=100;
        this.currentXP=0;
        weaponSlotItem = null;
        headSlotItem = null;
        bodySlotItem = null;
        legsSlotItem = null;
    }

    public String provideHeroDetails(){
        return this.heroClass.getHeroClassName()+" details:\n"+
                "HP: "+this.health+"\n"+
                "Str: "+this.strength+"\n"+
                "Dex: "+this.dexterity+"\n"+
                "Int: "+this.intelligence+"\n"+
                "Lvl: "+this.level+"\n"+
                "XP to next: "+(this.xpToNextLevel-this.currentXP);
    }

    // NOTE: assume XP points never increase in one go
    // by more than what is required for one level change
    public void addXP(int additionalXP){
        this.currentXP+=additionalXP;
        if(this.currentXP>this.xpToNextLevel) {
            levelUp();
        }
    }

    private void levelUp(){
        this.health = this.heroClass.levelUpHealth(this.health);
        this.strength = this.heroClass.levelUpStrength(this.strength);
        this.dexterity = this.heroClass.levelUpDexterity(this.dexterity);
        this.intelligence = this.heroClass.levelUpIntelligence(this.intelligence);
        this.level+=1;
        this.currentXP-=this.xpToNextLevel; // reduces current XP by the amount required for level change
        this.xpToNextLevel*=1.1; // increases experience required for next level by 10%
    }

    public void addWeaponSlotItem(Item weaponSlotItem){
        if(this.weaponSlotItem==null){
            this.weaponSlotItem=weaponSlotItem;
            this.weaponSlotItem.setItemSlot(ItemSlotEnum.WEAPON);
        }else{
            System.out.println("You replaced a previous item in weapon slot");
            this.weaponSlotItem=weaponSlotItem;
            this.weaponSlotItem.setItemSlot(ItemSlotEnum.WEAPON);
        }
    }

    public void addHeadSlotItem(Item headSlotItem){
        if(this.headSlotItem==null){
            this.headSlotItem=headSlotItem;
            this.headSlotItem.setItemSlot(ItemSlotEnum.HEAD);
        }else{
            System.out.println("You replaced a previous item in headslot");
            this.headSlotItem=headSlotItem;
            this.headSlotItem.setItemSlot(ItemSlotEnum.HEAD);
        }
    }

    public void addBodySlotItem(Item bodySlotItem){
        if(this.bodySlotItem==null){
            this.bodySlotItem=bodySlotItem;
            this.bodySlotItem.setItemSlot(ItemSlotEnum.BODY);
        }else{
            System.out.println("You replaced a previous item in body slot");
            this.bodySlotItem=bodySlotItem;
            this.bodySlotItem.setItemSlot(ItemSlotEnum.BODY);
        }
    }

    public void addLegsSlotItem(Item legsSlotItem){
        if(this.legsSlotItem==null){
            this.legsSlotItem=legsSlotItem;
            this.legsSlotItem.setItemSlot(ItemSlotEnum.LEGS);
        }else{
            System.out.println("You replaced a previous item in legs slot");
            this.legsSlotItem=legsSlotItem;
            this.legsSlotItem.setItemSlot(ItemSlotEnum.LEGS);
        }
    }
}
