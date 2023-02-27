package java2.java2_oop.Unit;

import java.util.ArrayList;

public class Spearman extends Soldier{

    
    public Spearman(String name, int x,int y){
        super(name,x,y,10,10,1,3,4,5,4,0,0,0); 
        super.name = name;
    }


    @Override
    public void step(ArrayList<Man> team1, ArrayList<Man> team2) {
        // TODO Auto-generated method stub
    }

    @Override
    public String getInfo() {
        return String.format("Копейщик   %d            %d           %d          %d          %d      %1f      %d      %d      %d",minDamage,maxDamage, att,def, speed,hp, 0,coords.x,coords.y);
    }       
}
