package java2.java2_oop.Unit;

import java.util.ArrayList;

public class Farmer extends Man{
    int delivery;
    float dist;
    
    
    // public Farmer(String name, int x, int y, float hp, int maxHp, int minDamage, int maxDamage, int att, int def,
    //         int speed, int delivery, float dist) {
    //     super(name, x, y, hp, maxHp, minDamage, maxDamage, att, def, speed);
    //     this.delivery = delivery;
    //     this.dist = dist;
    // }

    public Farmer(String name, int x, int y, float hp, int maxHp, int minDamage, int maxDamage, int att, int def,
            int speed, int delivery, float dist) {
        super(name, x, y, hp, maxHp, minDamage, maxDamage, att, def, speed);
        // this.delivery = delivery;
        // this.dist = dist;
    }

    public Farmer (String name, int x,int y){
        super(name,x,y,1,1,1,1,1,1,3);
        super.name = name;
        
    }

    @Override
    public void step(ArrayList<Man> team1, ArrayList<Man> team2) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public String getInfo() {
        return String.format("Фермер     %d            %d           %d          %d          %d       %1f      %d      %d      %d",minDamage,maxDamage, att,def, speed,hp, 0,coords.x,coords.y);
    }
    public float getDist(){return dist;}
}        

