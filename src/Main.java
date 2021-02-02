import heroes.*;
import heroes.classes.*;
import items.*;
import items.types.ItemEnum;
import items.types.ItemSlotEnum;
import items.types.ItemTypeFactory;

public class Main {

    public static void main(String[] args) {

        // Testing Hero objects
        HeroClassFactory heroClassfactory = new HeroClassFactory();
        Hero myMage = new Hero(heroClassfactory.getHeroClass(HeroEnum.MAGE));
        Hero myRanger = new Hero(heroClassfactory.getHeroClass(HeroEnum.RANGER));
        Hero myWarrior = new Hero(heroClassfactory.getHeroClass(HeroEnum.WARRIOR));

        System.out.println(myMage.provideHeroDetails());
        myMage.addXP(60);
        myMage.addXP(50);
        System.out.println(myMage.provideHeroDetails());
        System.out.println(myRanger.provideHeroDetails());
        System.out.println(myWarrior.provideHeroDetails());

        // Testing Item objects
        ItemTypeFactory itemTypeFactory = new ItemTypeFactory();
        Item myClothArmor = new Item("Cloth Leggings of the Magi",
                ItemSlotEnum.BODY,
                itemTypeFactory.getItemType(ItemEnum.CLOTH_ARMOR));
        System.out.println(myClothArmor.provideItemDetails());
    }
}
