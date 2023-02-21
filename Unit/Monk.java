package java2.java2_oop.Unit;

public class Monk extends Mag {

    public Monk (String name){
            super("",30,30,-4,-4,12,7,5,0,0,1,0);
            super.name = name;
        }    

    @Override
    public void step() {
        // TODO Auto-generated method stub
    }

    @Override
    public String getInfo(){
        return String.format("Я монах %s Speed: %d", name, speed);
    }
    
}
