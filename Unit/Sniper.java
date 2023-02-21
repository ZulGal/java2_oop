package java2.java2_oop.Unit;

public class Sniper extends Archer{

    public Sniper (String name){
        super("",15,15,8,10,12,10,9,0,0,32,32,0);  
        super.name = name;
    }


    @Override
    public String getInfo() {
        return String.format("Я снайпер %s Speed: %d shots: %d", name, speed, shots);
    }    
}