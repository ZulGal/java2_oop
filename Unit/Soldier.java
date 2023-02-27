package java2.java2_oop.Unit;

public abstract class Soldier extends Man {

    int spear, maxSpear;
    float dist;
    
    

    public Soldier(String name, int x, int y, int hp, int maxHp, int minDamage, int maxDamage, int att, int def,
            int speed, int spear, int maxSpear, float dist) {
        super(name, x, y, hp, maxHp, minDamage, maxDamage, att, def, speed);
        this.spear = spear;
        this.maxSpear = maxSpear;
        this.dist = dist;
    }




    public float getDist(){return dist;}
    
}
