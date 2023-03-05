package java2.java2_oop.Unit;

import java.util.ArrayList;

public class Monk extends Mag {

    
    public Monk (String name, int x, int y){
        super(name,x,y,30,30,-4,-4,12,7,9,1,0,"Stand");
        super.name = name;
    }  

    @Override
    public String getInfo(){
        return String.format("Монах2      %s",super.getInfo());
    }

    
}
