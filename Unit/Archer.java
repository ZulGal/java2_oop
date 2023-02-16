package java2.java2_oop.Unit;

public abstract class Archer extends Man{
 
    int shots, maxShots;
    float dist;
    String name;

    public Archer(float hp, int maxHp, int damage, int att, int def, int shots, int maxShots, float dist, String name) {
        super(hp, maxHp, damage, att, def);
        this.shots = shots;
        this.maxShots = maxShots;
        this.dist = dist;
        this.name = name;       
    }
    public float getDist(){return dist;}
}    

