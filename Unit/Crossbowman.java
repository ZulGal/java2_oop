package java2.java2_oop.Unit;


public class Crossbowman extends Archer {

public Crossbowman(float hp, int maxHp, int damage, int att, int def, int shots, int maxShots, float dist,String name) {
        super(hp, maxHp, damage, att, def, shots, maxShots, dist);
        super.name = name;
    }

public Crossbowman (String name){
    super(150,150,12,5,3,22,22,3);  
    super.name = name;

}

@Override
public void step() {
    // TODO Auto-generated method stub
    
}

@Override
public String getInfo() {
    return "Я арбалетчик " + name;
}



    

}
