import java.net.MalformedURLException;
import java.net.URL;

public class Pokemon {
    // instance variables
    private String name;
    private int level;
    private int[] ivs;
    private int baseHP;
    private int baseAttack;
    private int baseDefense;
    private int baseSpecialAttack;
    private int baseSpecialDefense;
    private int baseSpeed;
    private String[] abilities;
    private Type[] types;
    private Move[] moves;
    private int hp;
    private Status currentStatus;
    private URL imageURL;


    public Pokemon(String name, int level, int[] ivs, int baseHP, int baseAttack, int baseDefense, int baseSpecialAttack, int baseSpecialDefense, int baseSpeed, Type[] types, Move[] moves, String url) throws MalformedURLException {
        this.name = name;
        this.level = level;
        this.ivs = ivs;
        this.baseHP = baseHP;
        this.baseAttack = baseAttack;
        this.baseDefense = baseDefense;
        this.baseSpecialAttack = baseSpecialAttack;
        this.baseSpecialDefense = baseSpecialDefense;
        this.baseSpeed = baseSpeed;
        this.types = types;
        this.moves = moves;
        this.hp = baseHP;
        this.imageURL = new URL(url);
    }

    public Pokemon(Pokemon clone){
        this.name = clone.name;
        this.level = clone.level;
        this.ivs = clone.ivs;
        this.baseHP = clone.baseHP;
        this.baseAttack = clone.baseAttack;
        this.baseDefense = clone.baseDefense;
        this.baseSpecialAttack = clone.baseSpecialAttack;
        this.baseSpecialDefense = clone.baseSpecialDefense;
        this.baseSpeed = clone.baseSpeed;
        this.types = clone.types;
        this.moves = clone.moves;
        this.hp = clone.baseHP;
        this.imageURL = clone.imageURL;
    }
    // methods
    public void attack(String move) {
        System.out.println(this.name + " uses " + move + "!");
    }

    public void takeDamage(int damage) {
        System.out.println(this.name + " takes " + damage + " damage!");
    }

    public void levelUp() {
        this.level++;
        System.out.println(this.name + " leveled up to level " + this.level + "!");
    }

    // getters and setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int[] getIvs() {
        return this.ivs;
    }

    public void setIvs(int[] ivs) {
        this.ivs = ivs;
    }

    public int getBaseHP() {
        return this.baseHP;
    }

    public void setBaseHP(int baseHP) {
        this.baseHP = baseHP;
    }

    public int getBaseAttack() {
        return this.baseAttack;
    }

    public void setBaseAttack(int baseAttack) {
        this.baseAttack = baseAttack;
    }

    public int getBaseDefense() {
        return this.baseDefense;
    }

    public void setBaseDefense(int baseDefense) {
        this.baseDefense = baseDefense;
    }

    public int getBaseSpecialAttack() {
        return this.baseSpecialAttack;
    }

    public void setBaseSpecialAttack(int baseSpecialAttack) {
        this.baseSpecialAttack = baseSpecialAttack;
    }

    public int getBaseSpecialDefense() {
        return this.baseSpecialDefense;
    }

    public void setBaseSpecialDefense(int baseSpecialDefense) {
        this.baseSpecialDefense = baseSpecialDefense;
    }

    public int getBaseSpeed() {
        return this.baseSpeed;
    }

    public void setBaseSpeed(int baseSpeed) {
        this.baseSpeed = baseSpeed;
    }

    public String[] getAbilities() {
        return this.abilities;
    }

    public void setAbilities(String[] abilities) {
        this.abilities = abilities;
    }

    public Type[] getTypes() {
        return this.types;
    }

    public void setTypes(Type[] types) {
        this.types = types;
    }

    public Move[] getMoves() {
        return this.moves;
    }

    public void setMoves(Move[] moves) {
        this.moves = moves;
    }

    public int getHp(){return hp;}

    public void setHp(int newHp){hp = newHp;}
}
