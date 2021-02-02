package items.types;

import heroes.classes.*;

public class ItemTypeFactory {

    public ItemType getItemType(ItemEnum itemEnum){
        if(itemEnum==ItemEnum.MELEE_WEAPON){
            return new MeleeWeapon();
        }else if(itemEnum==ItemEnum.RANGED_WEAPON){
            return new RangedWeapon();
        }else if(itemEnum==ItemEnum.MAGIC_WEAPON){
            return new MagicWeapon();
        }else if(itemEnum==ItemEnum.CLOTH_ARMOR){
            return new ClothArmor();
        }else if(itemEnum==ItemEnum.LEATHER_ARMOR){
            return new LeatherArmor();
        }else if(itemEnum==ItemEnum.PLATE_ARMOR){
            return new PlateArmor();
        }else{
            return null;
        }
    }
}
