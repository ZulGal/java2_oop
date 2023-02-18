package java2.java2_oop.Unit;

public class Magician extends Mag {

public Magician(String name){
        super(100,100,18,6,2,22,22,3);  
        super.name = name;
}
@Override
public String getInfo(){
    return "Я колдун " + name;
}
    
}
