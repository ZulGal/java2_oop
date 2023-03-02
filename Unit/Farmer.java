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
            int speed, int delivery, float dist,String state) {
        super(name, x, y, hp, maxHp, minDamage, maxDamage, att, def, speed,state);
        this.delivery = delivery;
        this.dist = dist;
    }

    public Farmer (String name, int x,int y){
        super(name,x,y,1,1,1,1,1,1,3,"Stand");
        super.name = name;
        
    }

    @Override
    public void step(ArrayList<Man> team1, ArrayList<Man> team2) {
        if (!state.equals("Die")) this.state = "Stand";
        
    }
    @Override
    public String getInfo() {
        return String.format("Фермер      %s     %3d",super.getInfo(),0);
    }                                    
    public float getDist(){return dist;}
}        

