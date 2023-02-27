package java2.java2_oop.Unit;

import java.util.ArrayList;

public class Monk extends Mag {

    
    public Monk (String name, int x, int y){
        super(name,x,y,30,30,-4,-4,12,7,9,1,0);
        super.name = name;
    }  
    @Override
    public void step(ArrayList<Man> team1, ArrayList<Man> team2) {
        // TODO Auto-generated method stub
    }

    @Override
    public String getInfo(){
        return String.format("Монах     %d           %d          %d          %d          %d      %1f      %d      %d      %d",minDamage,maxDamage, att,def, speed,hp, mana,coords.x,coords.y);
    }
    
}
