package java2.java2_oop.Unit;

public abstract class Soldier extends Man {

    int spear, maxSpear;
    float dist;
    String name;

    public Soldier(float hp, int maxHp, int damage, int att, int def,int spear,int maxSpear,float dist) {
        super(hp, maxHp, damage, att, def);
        this.spear = spear;
        this.maxSpear = maxSpear;
        this.dist = dist;
    }
    public float getDist(){return dist;}
    
}
