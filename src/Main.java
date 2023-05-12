import com.sun.xml.internal.bind.v2.model.core.NonElement;

import java.util.Random;

public class Main {
    public static Type Normal = new Type("Normal");
    public static Type Fire = new Type("Fire");
    public static Type Water = new Type("Water");
    public static Type Grass = new Type("Grass");
    public static Type Flying = new Type("Flying");
    public static Type Fighting = new Type("Fighting");
    public static Type Poison = new Type("Poison");
    public static Type Electric = new Type("Electric");
    public static Type Ground = new Type("Ground");
    public static Type Rock = new Type("Rock");
    public static Type Psychic = new Type("Psychic");
    public static Type Ice = new Type("Ice");
    public static Type Bug = new Type("Bug");
    public static Type Ghost = new Type("Ghost");
    public static Type Steel = new Type("Steel");
    public static Type Dragon = new Type("Dragon");
    public static Type Dark = new Type("Dark");
    public static Type Fairy = new Type("Fairy");
    public static Type None = new Type();

    public static Move ember = new Move("Ember", 100, 40, 25, Fire,true);
    public static Pokemon charmander = new Pokemon("Charmander", 100, new int[]{15,15,15,15,15,15},39,52,43,60,50,65,new Type[]{Fire},new Move[]{ember});
    public static Pokemon squirtle = new Pokemon("Squirtle", 5, new int[]{15,15,15,15,15,15},44,48,65,50,64,43,new Type[]{Water},new Move[]{});


    public static void main(String[] args) {
        Normal.setWeakness(new Type[]{Fighting});
        Normal.setTypeAdvantage(new Type[]{None});
        Fire.setWeakness(new Type[]{Water,Ground, Rock});
        Fire.setTypeAdvantage(new Type[]{Grass,Ice,Bug,Steel});
        Water.setWeakness(new Type[]{Grass, Electric});
        Water.setTypeAdvantage(new Type[]{Fire,Ground,Rock});
        Grass.setWeakness(new Type[]{Fire,Ice,Poison,Flying,Bug});
        Grass.setTypeAdvantage(new Type[]{Water,Ground,Rock});
        Electric.setWeakness(new Type[]{Ground});
        Electric.setTypeAdvantage(new Type[]{Water,Flying});
        Ice.setWeakness(new Type[]{Fire,Fighting,Rock,Steel});
        Ice.setTypeAdvantage(new Type[]{Grass,Ground,Flying,Dragon});
        Fighting.setWeakness(new Type[]{Psychic,Flying,Fairy});
        Fighting.setTypeAdvantage(new Type[]{Normal,Ice,Rock,Dark,Steel});
        Poison.setWeakness(new Type[]{Ground, Psychic});
        Poison.setTypeAdvantage(new Type[]{Grass,Fairy});
        Ground.setWeakness(new Type[]{Water,Grass,Ice});
        Ground.setTypeAdvantage(new Type[]{Fire,Electric,Poison,Rock,Steel});
        Flying.setWeakness(new Type[]{Electric,Rock,Ice});
        Flying.setTypeAdvantage(new Type[]{Grass,Fighting,Bug});
        Psychic.setWeakness(new Type[]{Bug,Ghost,Dark});
        Psychic.setTypeAdvantage(new Type[]{Fighting,Poison});
        Bug.setWeakness(new Type[]{Flying,Rock,Fire});
        Bug.setTypeAdvantage(new Type[]{Grass,Psychic,Dark});
        Rock.setWeakness(new Type[]{Water,Grass,Fighting,Ground,Steel});
        Rock.setTypeAdvantage(new Type[]{Fire,Ice,Flying,Bug});
        Ghost.setWeakness(new Type[]{Ghost,Dark});
        Ghost.setTypeAdvantage(new Type[]{Psychic, Ghost});
        Dragon.setWeakness(new Type[]{Ice,Dragon,Fairy});
        Dragon.setTypeAdvantage(new Type[]{Dragon});
        Dark.setWeakness(new Type[]{Fighting,Bug,Fairy});
        Dark.setTypeAdvantage(new Type[]{Psychic,Ghost});
        Steel.setWeakness(new Type[]{Fire,Fighting,Ground});
        Steel.setTypeAdvantage(new Type[]{Ice,Rock,Fairy});
        Fairy.setWeakness(new Type[]{Poison,Steel});
        Fairy.setTypeAdvantage(new Type[]{Fighting,Dragon,Dark});

        Type types[] = {Grass,Rock,Ice,Dragon,Dark,Psychic,Bug,Flying,Steel,Fire,Fighting,Ground,Ghost,Poison,Water,Fairy,Electric,Normal};
        for(int i=0;i<18;i++) {
            System.out.println(types[i].getType() + " \nWeaknesses: " + types[i].getWeaknesses() + " \nAdvantages: " + types[i].getTypeAdvantages());
            System.out.println();
        }
        Type effChecker = new Type();
        System.out.println(effChecker.getEffectiveness(new Type[]{Grass},new Type[]{Water}));

        System.out.println("Squirtle HP: "+squirtle.getHp());
        //ember.attack(charmander,squirtle);

        System.out.println("Squirtle HP: "+squirtle.getHp());
        Battle battle = new Battle();
    }
}