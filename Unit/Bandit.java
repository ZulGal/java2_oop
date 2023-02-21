package java2.java2_oop.Unit;

public class Bandit extends Soldier {

    public Bandit (String name){
        super ("",10,10,2,4,8,3,6,0,0,0,0,0);
        super.name = name;
    }

    @Override
    public void step() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String getInfo() {
        return String.format("Я разбойник %s Speed: %d", name, speed);
    }    
 

}
