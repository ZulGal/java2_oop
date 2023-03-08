package java2.java2_oop;

import java.util.*;

import java2.java2_oop.Unit.Bandit;
import java2.java2_oop.Unit.Crossbowman;
import java2.java2_oop.Unit.Farmer;
import java2.java2_oop.Unit.Magician;
import java2.java2_oop.Unit.Man;
import java2.java2_oop.Unit.Monk;
import java2.java2_oop.Unit.Names;
import java2.java2_oop.Unit.Sniper;
import java2.java2_oop.Unit.Spearman;


public class Main {

    static final int UNITS = 10;
    public static ArrayList <Man> team1 = new ArrayList <> ();
    public static ArrayList <Man> team2 = new ArrayList <> ();
    public static ArrayList <Man> teams = new ArrayList <> ();
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < UNITS; i++) {
            int k = new Random().nextInt(4);
            switch (k){
                case 0: team1.add (new Bandit(getName(),i+1,1));
                break;
                case 1: team1.add (new Farmer(getName(),i+1,1));
                break;
                case 2: team1.add (new Magician(getName(),i+1,1));
                break;
                case 3: team1.add (new Sniper(getName(),i+1,1));
                break;
            }
        }
        
        for (int i = 0; i < UNITS; i++) {
            int k = new Random().nextInt(4);
            switch (k){
                case 0: team2.add (new Crossbowman(getName(),i+1,10));
                break;
                case 1: team2.add (new Farmer(getName(),i+1,10));
                break;
                case 2: team2.add (new Spearman(getName(),i+1,10));
                break;
                case 3: team2.add (new Monk(getName(),i+1,10));
                break;
            }
        } 

        teamSort(team1);
        teamSort(team2);

        for (int i = 0; i < UNITS; i++) {
            teams.add(team1.get(i));
            teams.add(team2.get(i));
        }
        teamPrint(teams,"All");
            
        while(true){
            int l = 1;
            for (Man man: teams) {
                View.view();
                System.out.printf("step: %s  ",l);
                System.out.println(man.getClass());

                if (team1.contains(man)){
                    man.step(team1, team2);
                    teamPrint(team1,"1");
                }    
                else{
                    man.step(team2, team1);
                    teamPrint(team2,"2");
                }
                l++;
                
            }
            System.out.print("Нажмите Enter");
            sc.nextLine();     
        }              
     }          
           
        
        private static void teamSort(ArrayList <Man> team){
            team.sort(new Comparator<Man>() {
                @Override
                public int compare(Man o1, Man o2){
                    return o2.getSpeed() - o1.getSpeed();
                }
            }   
            );
        } 
        private static void teamPrint(ArrayList <Man> team,String n){
            System.out.printf("team %s",n);
            System.out.println();
            System.out.println("step Class         name    minDam  maxDam   Att     Def    Speed   Hp   maxHP   x    y   State   Shoots");
            for (int i = 0; i < team.size(); i++) {
                if (n=="1"){
                    String s =String.format("%3d %s",2*i+1,team.get(i).getInfo());
                    System.out.println(s);
                }else if (n =="2") {
                    String s =String.format("%3d %s",2*i+2,team.get(i).getInfo());
                    System.out.println(s);
                }else {
                    String s =String.format("%3d %s",i+1,team.get(i).getInfo());
                    System.out.println(s);
                } 
            }    
        } 
            
        private static String getName(){
            String name = String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
            return name;
        }
        

}  


