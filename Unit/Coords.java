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


    // public class Vector2D {
    //     protected int posX;
    //     protected int posY;
    
    //     public Vector2D(int posX, int posY) {
    //         this.posX = posX;
    //         this.posY = posY;
    //     }
    
    //     protected double getDistance(Vector2D oponent){
    //         return Math.sqrt(Math.pow(posX - oponent.posX,2) + Math.pow(posY - oponent.posY,2));
    //     }

    public Double getDist(Coords opponent){
        // System.out.println(x);
        // System.out.println(y);
        // System.out.println(opponent.x);
        // System.out.println(opponent.y);
        // System.out.println(Math.sqrt(Math.pow(x-opponent.x,2)+Math.pow(y-opponent.y,2) ));
        return Math.sqrt(Math.pow(x-opponent.x,2)+Math.pow(y-opponent.y,2) );
    }
    public boolean closeRange(Coords opponent){
        return ((Math.abs(x-opponent.x)<2)&(Math.abs(y-opponent.y)<2));
    }
    public boolean isLeft(Coords opponent){
        return ((x>opponent.x));
    }
    public boolean isUp(Coords opponent){
        return ((y< opponent.y));
    }
    public boolean freeLeft(Coords friend){
        return !((x-1==friend.x)&&(y==friend.y));
    }
    public boolean freeRight(Coords friend){
        return !((x+1 ==friend.x)&&(y==friend.y));
    }
    public boolean freeUp(Coords friend){
        return !((y+1 == friend.y)&&(x==friend.x));
    }
    public boolean freeDown(Coords friend){
        return !((y-1 == friend.y)&&(x==friend.x));
    }
    public boolean noInkrementBorderY(Coords coords){
        return ((y>=1)&&(y<=9));
    }
    public boolean noInkrementBorderX(Coords coords){
        return ((x>=1)&&(y<=9));
    }
    public boolean noDekrementBorderY(Coords coords){
        return ((y>=2)&&(y<=10));
    }
    public boolean noDekrementBorderX(Coords coords){
        return ((x>=2)&&(y<=10));
    }
    public boolean noInkrementY(Coords coords) {
        return false;
    }
    

}    