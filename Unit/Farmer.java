package java2.java2_oop.Unit;

public class Farmer extends Man{

    // private  int shots;
    // public void setSht(int sht) {if (sht>=0) this.shots = sht;}
    // public float getSht(){return shots;}

    // private  int spear;
    // public void setSpr(int spr) {if (spr>=0) this.spear = spr;}
    // public float getSpr(){return spear;}
    float dist;
    String name;

    public Farmer(float hp, int maxHp, int damage) {
        super(hp, maxHp, damage);
        // this.shots = shots;
        // this.spear = spear;
    }

    public Farmer (String name){
        super(120,120,500);
        this.name = name;
    }

    @Override
    public void step() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public String getInfo() {
        return "Я фермер "+ name;
    }
    
    public float getDist(){return dist;}
}        

// public class Farmer extends Farm {

//     public Farmer(int fd, int sht, int spr) {
//         super(fd, sht, spr);
//         super.name = name;
//     }
//     public Farmer (String name){
//         super(1000,500,100);
//         super.name = name;

//     }
//     @Override
//     public void step() {
//         // TODO Auto-generated method stub
        
//     }
//     @Override
//     public String getInfo() {
//         return "Я фермер "+ name;
//     }
    
// }
