package java2.java2_oop.Unit;

public abstract class Archer extends Man{
 
    int shots, maxShots;
    float dist;

    
    public Archer(String name, float hp, int maxHp, int damageMin, int damageMax, int att, int def, int speed, int x, int y,
            int shots, int maxShots, float dist) {
        super(name, hp, maxHp, damageMin, damageMax, att, def, speed, x, y);
        this.shots = shots;
        this.maxShots = maxShots;
        this.dist = dist;
    }
@Override
public void step() {
    if (this.shots>0) this.shots = this.shots -1;
    }
    public float getDist(){return dist;}
  
}    

