package java2.java2_oop.Unit;


public class Sniper extends Archer{

    public Sniper (String name,int x,int y){
        super(name,x,y,15,15,8,10,12,10,9,32,32,0,"Stand");  
        super.name = name;
    }

    @Override
    public String getInfo() {
        return String.format("Снайпер1    %s",super.getInfo());
    }
}