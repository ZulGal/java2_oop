package java2.java2_oop.Unit;

public class Spearman extends Soldier{

    public Spearman(String name){
        super("",10,10,1,3,4,5,4,0,0,0,0,0);  
        super.name = name;
}

@Override
public void step() {
    // TODO Auto-generated method stub
}

@Override
public String getInfo() {
    return String.format("Я копейщик %s Speed: %d", name, speed);
}       
}
