package java2.java2_oop.Unit;

public class Bandit extends Soldier {

    public Bandit (String name){
        super (70f,70,17,4,3,18,18,2);
        super.name = name;
    }

    @Override
    public void step() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String getInfo() {
        // TODO Auto-generated method stub
        return "Я разбойник "+ name;
    }    
 

}
