package java2.java2_oop.Unit;

public abstract class Soldier extends Man {

    int spear, maxSpear;
    float dist;

    public Soldier(String name, float hp, int maxHp, int minDamage, int maxDamage, int att, int def, int speed, int x,
            int y, int spear, int maxSpear, float dist) {
        super(name, hp, maxHp, minDamage, maxDamage, att, def, speed, x, y);
        this.spear = spear;
        this.maxSpear = maxSpear;
        this.dist = dist;
    }

    public float getDist(){return dist;}
    
}
