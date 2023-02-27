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
    
    public static void main(String[] args) {

        ArrayList <Man> team1 = new ArrayList <> ();
        ArrayList <Man> team2 = new ArrayList <> ();
        for (int i = 0; i < 10; i++) {
           
            int k = new Random().nextInt(4);
            switch (k){
                case 0: team1.add (new Bandit(getName(),1, (i+1)));
                break;
                case 1: team1.add (new Farmer(getName(),1,i+1));
                break;
                case 2: team1.add (new Magician(getName(),1,i+1));
                break;
                case 3: team1.add (new Sniper(getName(),1,i+1));
                break;
            }
        // System.out.printf("i: ",i);  
        // System.out.println(team1.get(i).getInfo());  
        }
     
        for (int i = 0; i < 10; i++) {
            int k = new Random().nextInt(4);
            switch (k){
                case 0: team2.add (new Crossbowman(getName(),10,i+1));
                break;
                case 1:
                team2.add (new Farmer(getName(),10,i+1));
                break;
                case 2: team2.add (new Spearman(getName(),10,i+1));
                break;
                case 3: 
                team2.add (new Monk(getName(),10,i+1));
                break;
            }
            // System.out.printf("i: ",i);  
            // System.out.println(team1.get(i).getInfo()); 
        } 
        teamSort(team1);
        teamSort(team2);
        System.out.println();
        System.out.println("1 список");
        System.out.println("Class   minDamage    maxDamage    Attack    Defence    Speed      Hp          Shoots    x      y");
        teamPrint(team1);
        System.out.println();
        System.out.println("2 список");
        System.out.println("Class   minDamage    maxDamage    Attack    Defence    Speed      Hp          Shoots    x      y");
        teamPrint(team2);
        // crossman.step();
        // sniper.step();

        ArrayList <Man> teams = new ArrayList <> ();
        int k =10;
        for (int i = 0; i < k; i++) {
            teams.add(team1.get(i));
            teams.add(team2.get(i));
         }
        
         System.out.println("Сортированный общий список");
        teamSort(teams);
        teamPrint(teams);
        // for (int i = 0; i < teamAll.size(); i++) {
        //     System.out.println(teamAll.get(i).getInfo());
        // }
        while(true){

            for (int i = 0; i < teams.size(); i++) {
                if(teams.get(i).coords.x == 1) {
                    step(team1,team2);
                }else{
                    step(team2,team1);
                }
            
            System.out.println();
            System.out.println(i);
            System.out.println("1 список");
            System.out.println("Class   minDamage    maxDamage    Attack    Defence    Speed      Hp          Shoots    x      y");
            teamPrint(team1);
            System.out.println();
            System.out.println("2 список");
            System.out.println("Class   minDamage    maxDamage    Attack    Defence    Speed      Hp          Shoots    x      y");
            teamPrint(team2);

            try (Scanner sc = new Scanner(System.in)) {
                System.out.print("Нажмите Enter");
                sc.nextLine();
            }
        
        }        

        }    

    }
        private static void step(ArrayList<Man> team1, ArrayList<Man> team2) {
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
        private static void teamPrint(ArrayList <Man> team){
            for (int i = 0; i < team.size(); i++) {
                System.out.println(team.get(i).getInfo());
            }    
        } 
        // private ArrayList<Man> teamMerge(ArrayList<Man> team1, ArrayList<Man> team2){
        //     ArrayList <Man> team = new ArrayList <> ();
        //     int k =0;
        //     for (int i = 0; i < k; i++) {
        //         team.add(team1.get(i));
        //         team.add(team2.get(i));
        //      }
        //     return team;    

        // }
            
        private static String getName(){
            String name = String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
            return name;
        }
        

}     

