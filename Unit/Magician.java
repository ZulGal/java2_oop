package java2.java2_oop.Unit;


public class Magician extends Mag {

    public Magician (String name, int x, int y){
        super(name,x,y,30,30,-5,-5,17,12,9,1,0);
        super.name = name;
    }    

@Override
public String getInfo(){
    return String.format("Колдун    %d           %d          %d          %d         %d      %1f      %d      %d      %d",minDamage,maxDamage, att,def, speed,hp, mana,coords.x,coords.y);
}

    
}
