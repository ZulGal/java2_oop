package java2.java2_oop.Unit;

public class Magician extends Mag {
    


    public Magician(String name, float hp, int maxHp, int minDamage, int maxDamage, int att, int def, int speed, int x,
            int y, int mana, float dist) {
        super(name, hp, maxHp, minDamage, maxDamage, att, def, speed, x, y, mana, dist);
    }

    public Magician (String name){
        super("",30,30,-5,-5,17,12,9,0,0,1,0);
        super.name = name;
    }    

@Override
public String getInfo(){
    return String.format("Я колдун %s Speed: %d", name, speed);
}
    
}
