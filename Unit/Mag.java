package java2.java2_oop.Unit;

public abstract class Mag extends Man {

    int mana;
    float dist;
    
    public Mag(String name, float hp, int maxHp, int minDamage, int maxDamage, int att, int def, int speed, int x,
            int y, int mana, float dist) {
        super(name, hp, maxHp, minDamage, maxDamage, att, def, speed, x, y);
        this.mana = mana;
        this.dist = dist;
    }

    public float getDist(){return dist;}
    
}
