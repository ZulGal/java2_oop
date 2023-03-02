package java2.java2_oop.Unit;

public class Crossbowman extends Archer {

    public Crossbowman(String name, int x, int y, int hp, int maxHp, int minDamage, int maxDamage, int att, int def,
            int speed, int shoots, int maxShoots, float dist,String state) {
        super(name, x, y, hp, maxHp, minDamage, maxDamage, att, def, speed, shoots, maxShoots, dist,state);
    }

    public Crossbowman (String name,int x,int y){
        super(name,x,y,10,10,2,3,6,3,4,16,16,0,"Stand"); 
        super.name = name;
        
    }
    @Override
    public String getInfo() {
        return String.format("Арбалетчик2 %s",super.getInfo());
    }

}
