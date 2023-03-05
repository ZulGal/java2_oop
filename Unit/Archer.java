package java2.java2_oop.Unit;

import java.util.ArrayList;

public abstract class Archer extends Man{
 
    int shoots, maxShoots;
    float dist;

    public Archer(String name, int x, int y, float hp, int maxHp, int minDamage, int maxDamage, int att, int def,
            int speed, int shoots, int maxShoots, float dist,String state) {
        super(name, x, y, hp, maxHp, minDamage, maxDamage, att, def, speed,state);
        this.shoots = shoots;
        this.maxShoots = maxShoots;
        this.dist = dist;
    }

    @Override
    public void step(ArrayList<Man> team1, ArrayList<Man> team2) {
        if (state.equals("Die") || shoots == 0) return;
        int target = findNearest(team2);
        float damage = (team2.get(target).def - att > 0) ? minDamage : (team2.get(target).def - att < 0) ? maxDamage : (maxDamage+minDamage)/2;
        team2.get(target).getDamage(damage);

        for (int i = 0; i < team1.size(); i++) {
            if (team1.get(i).getInfo().split(" ")[0].equals("Фермер") && team1.get(i).state.equals("Stand")) {
                team1.get(i).state = "Busy";
                return;
            }
        }
        shoots--;
    }
       
    @Override
    public String getInfo() {
        return String.format("%s  %6d",super.getInfo(),this.shoots);
    }

    public void setShoots(int shoots) {
        this.shoots = shoots;
    }
  
}    

