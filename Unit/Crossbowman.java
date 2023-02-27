package java2.java2_oop.Unit;

import java.util.ArrayList;

public class Crossbowman extends Archer {

    

    public Crossbowman(String name, int x, int y, int hp, int maxHp, int minDamage, int maxDamage, int att, int def,
            int speed, int shoots, int maxShoots, float dist) {
        super(name, x, y, hp, maxHp, minDamage, maxDamage, att, def, speed, shoots, maxShoots, dist);
    }

    public Crossbowman (String name,int x,int y){
        super(name,x,y,10,10,2,3,6,3,4,16,16,0); 
        super.name = name;
        
    }

@Override
public void step(ArrayList<Man> team1, ArrayList<Man> team2) {
    // TODO Auto-generated method stub
    super.step(team1, team2);
}

@Override
public String getInfo() {
    return String.format("Арбалетчик %d            %d           %d          %d          %d      %1f     %d      %d      %d",minDamage,maxDamage, att,def, speed,hp, shoots,coords.x,coords.y);
}

}
