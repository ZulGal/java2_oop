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
        System.out.println(String.format("target: %d", target));
        int friend = findNearest(team1);  
        System.out.println(String.format("friend: %d", friend));

        if (coords.closeRange(team2.get(target).coords)){
            float damage = (team2.get(target).def - att > 0) ? minDamage : (team2.get(target).def - att < 0) ? maxDamage : (maxDamage+minDamage)/2;
            team2.get(target).getDamage(damage);
        }
        else{
            if (coords.isUp(team2.get(target).coords)){
                if (coords.freeUp(team1.get(friend).coords)){
                    if (coords.noInkrementBorderY(coords)) coords.y++;
                    else return;
                }
                else{
                    if (coords.freeLeft(team1.get(friend).coords)){
                        if (coords.isLeft(team2.get(target).coords)){
                            if (coords.noDekrementBorderX(coords)) coords.x--;
                            else return;    
                        }   
                    }
                    else if(coords.freeRight(team1.get(friend).coords)){
                        if (!coords.isLeft(team2.get(target).coords)){
                            if (coords.noInkrementBorderX(coords)) coords.x++;
                            else return;    
                        }
                    }
                    return;
                }
            }
            else if (coords.freeDown(team1.get(friend).coords)){
                if (coords.noDekrementBorderY(coords)) coords.y--;
                else return;      
            } 
            else if (coords.freeLeft(team1.get(friend).coords)){
                if (coords.isLeft(team2.get(target).coords)){
                    if (coords.noDekrementBorderX(coords)) coords.x--;
                    else return;    
                }   
            }
                else if(coords.freeRight(team1.get(friend).coords)){
                    if (!coords.isLeft(team2.get(target).coords)){
                        if (coords.noInkrementBorderX(coords)) coords.x++;
                        else return;    
                    }
                return;

                } 
        }
    }
        
    @Override
    public String getInfo() {
        return String.format("%s  %6d",super.getInfo(),this.spear);
    }

    
}
