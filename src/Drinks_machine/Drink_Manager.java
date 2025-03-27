package Drinks_machine;
import Shop.Order;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Drink_Manager {
    public void Order (Drinks drink) {
        List<Drinks> order= new ArrayList<>();
        order.add(drink);
    }
    public int order_cost(List<Drinks> drinks) {
        int cost=0;
        for(Drinks drink:drinks) {
            cost+=drink.getPrice();
        }
        return cost;
    }
    public List<Drinks> input_order(){
        List<Drinks> order= new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int choice=sc.nextInt();
            switch(choice){
                case 1: Order(Drinks.COFFEE);
                case 2: Order(Drinks.TEA);
                case 3: Order(Drinks.LEMONADE);
                case 4: Order(Drinks.COCA_COLA);
                case 5: Order(Drinks.WATER);
                case 6: Order(Drinks.MINERAL_WATER);
            }
        }
        return order;
    }

}

