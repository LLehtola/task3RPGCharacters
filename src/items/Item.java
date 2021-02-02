package items;

import items.types.*;

public class Item {

    private String itemName;

    private int bonusHealth;
    private int bonusStrength;
    private int bonusDexterity;
    private int bonusIntelligence;

    private int attackDamage;

    private int itemLevel;

    private ItemType itemType;
    private ArmorOrWeapon armorOrWeapon;

    private ItemSlotEnum itemSlot;

    public Item(String itemName, ItemSlotEnum itemSlotEnum, ItemType itemType) {
        this.itemName = itemName;
        this.itemLevel = 1;
        this.itemType = itemType;
        this.itemSlot = itemSlotEnum;
        updateItemAttributes();
    }

    private void updateItemAttributes(){
        if(this.itemType.getItemEnum()==ItemEnum.CLOTH_ARMOR){
            this.bonusHealth = ((ClothArmor) this.itemType).getBaseBonusHealth();
            this.bonusStrength = ((ClothArmor) this.itemType).getBaseBonusStrength();
            this.bonusDexterity = ((ClothArmor) this.itemType).getBaseBonusDexterity();
            this.bonusIntelligence = ((ClothArmor) this.itemType).getBaseBonusIntelligence();
            this.armorOrWeapon=ArmorOrWeapon.ARMOR;
        }else if(this.itemType.getItemEnum()==ItemEnum.LEATHER_ARMOR){
            this.bonusHealth = ((LeatherArmor) this.itemType).getBaseBonusHealth();
            this.bonusStrength = ((LeatherArmor) this.itemType).getBaseBonusStrength();
            this.bonusDexterity = ((LeatherArmor) this.itemType).getBaseBonusDexterity();
            this.bonusIntelligence = ((LeatherArmor) this.itemType).getBaseBonusIntelligence();
            this.armorOrWeapon=ArmorOrWeapon.ARMOR;
        }else if(this.itemType.getItemEnum()==ItemEnum.PLATE_ARMOR){
            this.bonusHealth = ((PlateArmor) this.itemType).getBaseBonusHealth();
            this.bonusStrength = ((PlateArmor) this.itemType).getBaseBonusStrength();
            this.bonusDexterity = ((PlateArmor) this.itemType).getBaseBonusDexterity();
            this.bonusIntelligence = ((PlateArmor) this.itemType).getBaseBonusIntelligence();
            this.armorOrWeapon=ArmorOrWeapon.ARMOR;
        }else if(this.itemType.getItemEnum()==ItemEnum.MAGIC_WEAPON){
            this.attackDamage = ((MagicWeapon) this.itemType).getBaseDamage();
            this.armorOrWeapon=ArmorOrWeapon.WEAPON;
        }else if(this.itemType.getItemEnum()==ItemEnum.MELEE_WEAPON){
            this.attackDamage = ((MeleeWeapon) this.itemType).getBaseDamage();
            this.armorOrWeapon=ArmorOrWeapon.WEAPON;
        }else if(this.itemType.getItemEnum()==ItemEnum.RANGED_WEAPON){
            this.attackDamage = ((RangedWeapon) this.itemType).getBaseDamage();
            this.armorOrWeapon=ArmorOrWeapon.WEAPON;
        }
    }

    public String provideItemDetails(){
        if(armorOrWeapon==ArmorOrWeapon.ARMOR) {
            return "Item stats for: " + this.itemName + "\n" +
                    "Armor type: " + this.itemType.getItemTypeName() + "\n" +
                    "Slot: " + this.itemSlot.toString() + "\n" +
                    "Armor level: " + this.itemLevel + "\n" +
                    "Bonus HP: " + this.bonusHealth + "\n" +
                    "Bonus Str: " + this.bonusStrength + "\n" +
                    "Bonus Dex: " + this.bonusDexterity + "\n" +
                    "Bonus Int: " + this.bonusIntelligence;
        }else if(armorOrWeapon==ArmorOrWeapon.WEAPON){
            return "Item stats for: " + this.itemName + "\n" +
                    "Weapon type: " + this.itemType.getItemTypeName() + "\n" +
                    "Weapon level: " + this.itemLevel + "\n" +
                    "Damage: " + this.attackDamage;
        }else{
            return "ERROR";
        }
    }

    public ItemSlotEnum getItemSlot() {
        return itemSlot;
    }

    public void setItemSlot(ItemSlotEnum itemSlot) {
        this.itemSlot = itemSlot;
    }

}
