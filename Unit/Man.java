package java2.java2_oop.Unit;

public abstract class Man implements Gameinterface{

    private float hp;
    public void setHp(float hp) {if (hp>=0) this.hp = hp;}
    public float getHp(){return hp;}
    public int damage, att, def,maxHp;
   

    public Man(float hp, int maxHp, int damage, int att, int def) {
        this.hp = hp;
        this.maxHp = maxHp;
        this.damage = damage;
        this.att = att;
        this.def = def;
    }
    
public Man(float hp, int damage, int maxHp) {
        this.hp = hp;
        this.damage = damage;
        this.maxHp = maxHp;
    }
@Override
public void step(){}

@Override
public String getInfo(){return "";}
    
}
    
    


