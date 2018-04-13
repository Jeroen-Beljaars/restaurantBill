/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantbill;

import models.Customer;
import models.Meal;

/**
 *
 * @author jeroe
 */
public class RestaurantBill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Meal chicken = new Meal("Chicken", "Appetizer", 10);
        Meal meat = new Meal("Meat", "Entree", 20);
        Meal iceCream = new Meal("Ice", "Dessert", 2);
        
        Customer bob = new Customer("Bob", 10);
        bob.order(chicken, 1);
        bob.order(iceCream, 2);
        bob.printBill();
    }
    
}
