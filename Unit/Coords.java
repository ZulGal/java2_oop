package java2.java2_oop.Unit;


public class Coords {
    public int x;
    public int y;

    public Coords(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {return x;}
    public int getY() {return y;}

    public Double getDist(Coords opponent){
        return Math.sqrt(Math.pow(x-opponent.x,2)+Math.pow(y-opponent.y,2) );
    }
    public boolean isLeft(Coords opponent){
        return ((x-opponent.x)>0);
    }
    public boolean isUp(Coords opponent){
        return ((y- opponent.y)<0);
    }
    public boolean freeLeft(Coords friend){
        return (x-1 - friend.x == 0);
    }
    public boolean freeUp(Coords friend){
        return (y-1 - friend.y == 0);
    }

}    