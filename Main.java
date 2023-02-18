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

        ArrayList <Man> list = new ArrayList <> ();

        for (int i = 0; i < 10; i++) {
            int k = new Random().nextInt(6);
            switch (k){
                case 0: list.add (new Bandit(getName()));
                break;
                case 1: list.add (new Crossbowman(getName()));
                break;
                case 2: list.add (new Farmer(getName()));
                break;
                case 3: list.add (new Magician(getName()));
                break;
                case 4: list.add (new Monk(getName()));
                break;
                case 5: list.add (new Sniper(getName()));
                break;
                case 6: list.add (new Spearman(getName()));
                break;
            }
        }
        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j).getInfo());
        }

    }
        private static String getName(){
            String name = String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
            return name;
        }
}    
