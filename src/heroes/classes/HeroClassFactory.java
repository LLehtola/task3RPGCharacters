package heroes.classes;

public class HeroClassFactory {

    public HeroClass getHeroClass(HeroEnum heroEnum){
        if(heroEnum==HeroEnum.MAGE){
            return new MageClass();
        }else if(heroEnum==HeroEnum.RANGER){
            return new RangerClass();
        }else if(heroEnum==HeroEnum.WARRIOR){
            return new WarriorClass();
        }else{
            return null;
        }
    }
}
