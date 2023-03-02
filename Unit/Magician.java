package java2.java2_oop.Unit;


public class Magician extends Mag {

    public Magician (String name, int x, int y){
        super(name,x,y,30,30,-5,-5,17,12,9,1,0,"Stand");
        super.name = name;
    }    

@Override
public String getInfo(){
    return String.format("Колдун1     %s",super.getInfo());
}
    
}
