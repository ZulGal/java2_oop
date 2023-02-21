package java2.java2_oop;

import java.util.*;
import java.util.Random;

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

        Crossbowman crossman = new Crossbowman(getName());
        Sniper sniper = new Sniper(getName());

        ArrayList <Man> list1 = new ArrayList <> ();
        ArrayList <Man> list2 = new ArrayList <> ();
        for (int i = 0; i < 10; i++) {
            int k = new Random().nextInt(4);
            switch (k){
                case 0: list1.add (new Bandit(getName()));
                break;
                case 1: list1.add (new Farmer(getName()));
                break;
                case 2: list1.add (new Magician(getName()));
                break;
                case 3: list1.add (sniper);
                break;
            }
        }
        for (int i = 0; i < 10; i++) {
            int k = new Random().nextInt(4);
            switch (k){
                case 0: list2.add (crossman);
                break;
                case 1: list2.add (new Monk(getName()));
                break;
                case 2: list2.add (new Spearman(getName()));
                break;
                case 3: list2.add (new Farmer(getName()));
                break;
            }
        } 
        

        list1.sort(new Comparator<Man>() {
            @Override
            public int compare(Man o1, Man o2){
                return o2.getSpeed() - o1.getSpeed();
            }
        }   
        );
        list2.sort(new Comparator<Man>() {
            @Override
            public int compare(Man o1, Man o2){
                return o2.getSpeed() - o1.getSpeed();
            }
        }   
        );
        System.out.println();
        System.out.println("1 список");
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i).getInfo());
        }
        System.out.println();
        System.out.println("2 список");
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i).getInfo());
        }
        ArrayList <Man> listAll = new ArrayList <> ();
        System.out.println();

        int k =0;
        if (list1.size()<=list2.size()){ k = list1.size();}    
        else { k = list2.size();}
        

        for (int i = 0; i < k; i++) {
           listAll.add(list1.get(i));
           listAll.add(list2.get(i));
        }
        crossman.step();
        sniper.step();


        System.out.println("Сортированный общий список c обработанным shots");
        for (int i = 0; i < listAll.size(); i++) {
            System.out.println(listAll.get(i).getInfo());
        }
    }
        private static String getName(){
            String name = String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
            return name;
        }

}     

