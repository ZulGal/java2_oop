package java2.java2_oop.Unit;

public abstract class Mag extends Man {

    int mana, maxMana;
    float dist;
    String name;

    public Mag(float hp, int maxHp, int damage, int att, int def, int mana, int maxMana, float dist) {
        super(hp, maxHp, damage, att, def);
        this.mana = mana;
        this.maxMana = maxMana;
        this.dist = dist;
    }
    public float getDist(){return dist;}
    
}
