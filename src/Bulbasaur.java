public class Bulbasaur extends Pokemon {
    private int hp;
    private int attack;
    private int defense;
    private int specialAttack;
    private int specialDefense;
    private int speed;

    public Bulbasaur(String name, int level, int[] ivs, String[] abilities, Type[] types, Move[] moves) {
        super(name, level, ivs, 45, 49, 49, 65, 65, 45, types, moves);

        double ivHp = (double) ivs[0];
        double ivAtk = (double) ivs[1];
        double ivDef = (double) ivs[2];
        double ivSpAtk = (double) ivs[3];
        double ivSpDef = (double) ivs[4];
        double ivSpeed = (double) ivs[5];

        this.hp = (int) (((2 * this.getBaseHP() + ivHp) * level) / 100) + level + 10;
        this.attack = (int) (((2 * this.getBaseAttack() + ivAtk) * level) / 100) + 5;
        this.defense = (int) (((2 * this.getBaseDefense() + ivDef) * level) / 100) + 5;
        this.specialAttack = (int) (((2 * this.getBaseSpecialAttack() + ivSpAtk) * level) / 100) + 5;
        this.specialDefense = (int) (((2 * this.getBaseSpecialDefense() + ivSpDef) * level) / 100) + 5;
        this.speed = (int) (((2 * this.getBaseSpeed() + ivSpeed) * level) / 100) + 5;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpecialAttack() {
        return specialAttack;
    }

    public void setSpecialAttack(int specialAttack) {
        this.specialAttack = specialAttack;
    }

    public int getSpecialDefense() {
        return specialDefense;
    }

    public void setSpecialDefense(int specialDefense) {
        this.specialDefense = specialDefense;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
