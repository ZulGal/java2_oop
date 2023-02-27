package java2.java2_oop.Unit;

public class Bandit extends Soldier {
    

    public Bandit(String name, int x,int y){
        super(name,x,y,10,10,2,4,8,3,6,0,0,0); 
        super.name = name;
    }

    @Override
    public String getInfo() {
        return String.format("Разбойник  %d            %d           %d           %d         %d      %1f      %d      %d      %d",minDamage,maxDamage, att,def, speed,hp, 0,coords.x,coords.y);
    }    

}
