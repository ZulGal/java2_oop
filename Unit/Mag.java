package java2.java2_oop.Unit;

import java.util.ArrayList;

public abstract class Mag extends Man {

    int mana;
    float dist;
    
    
    public Mag(String name, int x, int y, int hp, int maxHp, int minDamage, int maxDamage, int att, int def,
            int speed, int mana, float dist,String state) {
        super(name, x, y, hp, maxHp, minDamage, maxDamage, att, def, speed,state);
        this.mana = mana;
        this.dist = dist;
    }

    @Override
    public String getInfo() {
        return String.format("%s  %6d",super.getInfo(),this.mana);
    }

    @Override
    public void step(ArrayList<Man> team1, ArrayList<Man> team2) {
        for (Man man: team1){
            if ((man.hp < man.maxHp)&&(man.state != "Die")) {
            man.getDamage(maxDamage);
            break;
            }
        }
        }
    
}
