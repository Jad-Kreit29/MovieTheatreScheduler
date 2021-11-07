/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movietheatrescheduler.rst;

import java.util.*;

/**
 *
 * @author Jad Kreit
 */
public class Money {

    //Create Array List of type Tickets for type of tickets
    ArrayList<Tickets> tixType = new ArrayList<>();
    
    //Create Array List of type Tickets for age group tickets
    ArrayList<Tickets> tixAge = new ArrayList<>();

    public Money() {
        tixType.add(new Tickets("Standard", 4.50, 20));
        tixType.add(new Tickets("3D", 6.50, 50));
        tixType.add(new Tickets("IMAX", 8.50, 30));
    }

    public void DisplayTickets() {
        //Show first ticket type
        System.out.println(tixType.get(0).tixType + "\t$" + tixType.get(0).tixCost + "\tTickets Available: " + tixType.get(0).tixNumber);
        //Show second ticket type
        System.out.println(tixType.get(1).tixType + "\t\t$" + tixType.get(1).tixCost + "\tTickets Available: " + tixType.get(1).tixNumber);
        //Show third ticket type
        System.out.println(tixType.get(2).tixType + "\t\t$" + tixType.get(2).tixCost + "\tTickets Available: " + tixType.get(2).tixNumber);
    }
    
    
    public double cost (double moneyRequired) {
        double cost = 0;
        if (moneyRequired == 1) {
            cost = 4.50;
        } else if (moneyRequired == 2) {
            cost = 6.50;
        } else if (moneyRequired == 3) {
            cost = 8.50;
        }
        
        return cost;
        
    }
    
    
    

}
