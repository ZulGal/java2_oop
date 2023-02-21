package java2.java2_oop.Unit;

public abstract class Man implements Gameinterface{

    public String name;
    private float hp;
    public void setHp(float hp) {if (hp>=0) this.hp = hp;}
    public float getHp(){return hp;}
    public int maxHp, minDamage, maxDamage, att, def, speed, x, y;
    

    public Man(String name, float hp, int maxHp, int minDamage, int maxDamage, int att, int def, int speed, int x,
            int y) {
        this.name = name;
        this.hp = hp;
        this.maxHp = maxHp;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.att = att;
        this.def = def;
        this.speed = speed;
        this.x = x;
        this.y = y;
    }
    public int getSpeed(){return speed;} 
    public float getX(){return x; }
    public float getY(){return y;}

    
   @Override
   public void step() {
       // TODO Auto-generated method stub
       
   }

    @Override
    public String getInfo(){return "";}

    @Override
    public String toString() {
        return String.format("%s %d", this.name, this.speed);
    }
    
}
    
    
    


