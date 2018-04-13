/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cyaddd
 */
public class Customer {
    private List<Meal> orders;
    private double tipPercentage;
    private String name;

    public Customer(String name, double tipPercentage) {
        orders = new ArrayList<>();
        this.name = name;
        this.tipPercentage = tipPercentage;
    }
    
    public void order(Meal meal, int amount){
        for (int i = 0; i < amount; i++) {
            orders.add(meal);
        }
    }

    public void setTipPercentage(double tipPercentage) {
        this.tipPercentage = tipPercentage;
    }
    
    public void printBill(){
        double totalPrice = 0;
        String lastType = "";
        
        for (Meal order : orders) {
            if(lastType != order.getType()){
                lastType = order.getType();
                System.out.println(order.getType());
            }
            totalPrice += order.getPrice();
            System.out.println("   " + order.getName());
        }
        totalPrice = totalPrice * tipPercentage;   
        System.out.println("Total: " + (double)totalPrice);
    }
}
