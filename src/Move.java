import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Move {
    private String moveName;
    private int Accuracy;
    private int Damage;
    private int pp;
    private int ppMax;
    private Type moveType;
    private boolean spAtk;
    Move(String name, int acc, int dmg, int ppM, Type type, boolean spCheck){
        moveName = name;
        Accuracy = acc;
        Damage = dmg;
        pp = ppM;
        ppMax = ppM;
        moveType = type;
        spAtk = spCheck;
    }
    public void attack(Pokemon thisPokemon, Pokemon enemyPokemon){
        Type check = new  Type();
        Random rand = new Random();
        int hitChance = rand.nextInt(100);
        double critChance = rand.nextDouble() * 100;
        double baseValueAtk;
        if (spAtk){
            baseValueAtk = (double)thisPokemon.getBaseSpecialAttack()/enemyPokemon.getBaseSpecialDefense();
        }else{
            baseValueAtk = (double)thisPokemon.getBaseAttack()/enemyPokemon.getBaseDefense();
        }
        //System.out.println(spAtk);
        float STAB = 1;
        double effectiveness = check.getEffectiveness(thisPokemon.getTypes(), enemyPokemon.getTypes());
        int critMultiplier = 1;
        double dmgDealt = 0;
        double randomMultiplier = ThreadLocalRandom.current().nextDouble(0.85, 1);
        if (hitChance<=Accuracy){

            if(Arrays.asList(thisPokemon.getTypes()).contains(moveType)){
                STAB = 1.5f;
            }

            if(critChance<=6.25){
                critMultiplier = 2;
            }
            dmgDealt = ((double)Damage*STAB*effectiveness*critMultiplier*randomMultiplier*((double)(2*thisPokemon.getLevel()+10)/250)*baseValueAtk);
        }
        enemyPokemon.setHp((int)Math.round(enemyPokemon.getHp()-dmgDealt));
    }
}
