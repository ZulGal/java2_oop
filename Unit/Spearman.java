package java2.java2_oop.Unit;


public class Spearman extends Soldier{

    
    public Spearman(String name, int x,int y){
        super(name,x,y,10,10,1,3,4,5,4,0,0,0,"Stand"); 
        super.name = name;
    }

    @Override
    public String getInfo() {
        return String.format("Копейщик2   %s",super.getInfo());
    }  
}
