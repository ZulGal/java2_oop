package java2.java2_oop.Unit;

public class Farmer extends Man{
    
    int delivery;
    float dist;


    public Farmer(String name, float hp, int maxHp, int minDamage, int maxDamage, int att, int def, int speed, int x,
            int y, int delivery, float dist) {
        super(name, hp, maxHp, minDamage, maxDamage, att, def, speed, x, y);
        this.delivery = delivery;
        this.dist = dist;
    }

    public Farmer (String name){
        super("",1,1,1,1,1,1,3,0,0);
        this.name = name;
    }

    @Override
    public void step() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public String getInfo() {
        return String.format("Я фермер %s Speed: %d", name, speed);
    }
    
    public float getDist(){return dist;}
}        

