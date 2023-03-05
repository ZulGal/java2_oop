package java2.java2_oop.Unit;

import java.util.ArrayList;

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
    public void step(ArrayList<Man> team1, ArrayList<Man> team2) {
        if (state.equals("Die")) return; 
        int target = findNearest(team2);


        if (coords.isLeft(team2.get(target).coords)) coords.x-- ;
        if (coords.isUp(team2.get(target).coords)) coords.y++; 
        
        }
        
    @Override
    public String getInfo() {
        return String.format("%s  %6d",super.getInfo(),this.spear);
    }

    public float getDist(){return dist;}
    
}
