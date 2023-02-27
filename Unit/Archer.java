package java2.java2_oop.Unit;

import java.util.ArrayList;

public abstract class Archer extends Man{
 
    int shoots, maxShoots;
    float dist;

    public Archer(String name, int x, int y, float hp, int maxHp, int minDamage, int maxDamage, int att, int def,
            int speed, int shoots, int maxShoots, float dist) {
        super(name, x, y, hp, maxHp, minDamage, maxDamage, att, def, speed);
        this.shoots = shoots;
        this.maxShoots = maxShoots;
        this.dist = dist;
    }


    @Override
    public void step(ArrayList<Man> team1, ArrayList<Man> team2) {
        if (this.shoots>=1){
            int index = super.findNearest(team2);
            if (team2.get(index).def - this.att >0){
                team2.get(index).hp = team2.get(index).hp - this.maxDamage;
            }

        }else { if (shoots ==1){}}
            
        

        

        // super.step(team1, team2);
    }


    public void setShoots(int shoots) {
        this.shoots = shoots;
    }

    




    // @Override
    // public void step(ArrayList<Man> team1, ArrayList<Man> team2) {
    //     // team2.get(0).coords.x= 3; 
    // }



    // @Override
    // public String getInfo() {
    //     return String.format("Я %s Att: %d Def: %d Speed: %d Hp: %f  Shoots:  %d x: %d y: %d", name, att,def,speed,hp, shoots,coords.x,coords.y);
    // }    
  
}    

