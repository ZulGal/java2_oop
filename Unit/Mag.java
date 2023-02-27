package java2.java2_oop.Unit;

public abstract class Mag extends Man {

    int mana;
    float dist;
    
    
    public Mag(String name, int x, int y, int hp, int maxHp, int minDamage, int maxDamage, int att, int def,
            int speed, int mana, float dist) {
        super(name, x, y, hp, maxHp, minDamage, maxDamage, att, def, speed);
        this.mana = mana;
        this.dist = dist;
    }




    public float getDist(){return dist;}
    
}
