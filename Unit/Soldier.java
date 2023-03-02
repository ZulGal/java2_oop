package java2.java2_oop.Unit;

public abstract class Soldier extends Man {

    int spear, maxSpear;
    float dist;

    public Soldier(String name, int x, int y, int hp, int maxHp, int minDamage, int maxDamage, int att, int def,
            int speed, int spear, int maxSpear, float dist,String state) {
        super(name, x, y, hp, maxHp, minDamage, maxDamage, att, def, speed,state);
        this.spear = spear;
        this.maxSpear = maxSpear;
        this.dist = dist;
    }
    @Override
    public String getInfo() {
        return String.format("%s  %6d",super.getInfo(),this.spear);
    }

    public float getDist(){return dist;}
    
}
