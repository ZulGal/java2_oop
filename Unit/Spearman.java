package java2.java2_oop.Unit;

public class Spearman extends Soldier{

    public Spearman(String name){
        super(100,100,18,6,2,22,22,3);  
        super.name = name;
}

@Override
public void step() {
    // TODO Auto-generated method stub
}

@Override
public String getInfo() {
    // TODO Auto-generated method stub
    return "Я копейщик "+ name;
}       
}
