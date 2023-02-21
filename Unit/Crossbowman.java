package java2.java2_oop.Unit;


public class Crossbowman extends Archer {


public Crossbowman(String name, float hp, int maxHp, int damageMin, int damageMax, int att, int def, int speed,
            int x, int y, int shots, int maxShots, float dist) {
        super(name, hp, maxHp, damageMin, damageMax, att, def, speed, x, y, shots, maxShots, dist);
    }

public Crossbowman (String name){
    super("",10,10,2,3,6,3,9,0,0,16,16,0); 
    super.name = name;
}


@Override
public String getInfo() {
    return String.format("Я арбалетчик %s Speed: %d shots: %d", name, speed,shots);
}



    

}
