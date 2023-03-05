package java2.java2_oop.Unit;

import java.util.ArrayList;

import javax.swing.text.html.FormView;

public abstract class Man  implements Gameinterface{

    public String name;
    public Coords coords;
    public float hp;
    protected void setHp(float  hp) {if (hp>=0) this.hp = hp;}
    public float getHp(){return hp;}
    protected int maxHp, minDamage, maxDamage, att, def, speed;
    public String state;
    protected static int heroCnt;

    // coords = new Vector2D(posX, posY);
    // state = "Stand";
    // heroCnt++;

    @Override
    public String toString() {
        return name +
                " H:" + Math.round(hp) +
                " D:" + def +
                " A:" + att +
                " Dmg:" + Math.round(Math.abs((minDamage+maxDamage)/2)) +
                state;
    }
    
        public int getSpeed(){return speed;} 

        public Man(String name, int x,int y, float hp, int maxHp, int minDamage, int maxDamage, int att, int def,
                int speed, String state) {
            this.name = name;
            coords = new Coords(x,y);
            this.hp = hp;
            this.maxHp = maxHp;
            this.minDamage = minDamage;
            this.maxDamage = maxDamage;
            this.att = att;
            this.def = def;
            this.speed = speed;
            this.state = state;
            heroCnt++;
        }

        public String getName() {
            return name;
        }
        public int[] getCoords() {return new int[]{coords.x, coords.y};}

        public int findNearest(ArrayList<Man> team) {
            Double min = (double) 100; 
            int index = 0;
            for (int i = 0; i < team.size(); i++) {
                if (min>coords.getDist(team.get(i).coords)){
                    index = i;
                    min = coords.getDist(team.get(i).coords);
                }
            }
            System.out.println(String.format("indexNearest: %d",index)); 
            return index;   
        } 
        

        protected void getDamage(float damage){
            this.hp -= damage;
            if (hp <= 0) {
                hp = 0;
                state = "Die";
            }
            if (hp > maxHp) hp = maxHp;
        } 
  

        @Override
        public void step(ArrayList<Man> team1, ArrayList<Man> team2){} 

        @Override
        public String getInfo() {
            return String.format("%6s %7d %7d %7d %7d %7d %7.2f %3d %7d %3d %7s",name,minDamage,maxDamage, att,def, speed,hp,maxHp,coords.x,coords.y,state);
        }

    
}
    
    
    


