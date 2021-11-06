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

    //Create Array List of type Tickets
    ArrayList<Tickets> tix = new ArrayList<>();

    public Money() {
        tix.add(new Tickets("Standard", 4.50, 20));
        tix.add(new Tickets("3D", 6.50, 50));
        tix.add(new Tickets("IMAX", 8.50, 30));
    }

    public void DisplayTickets() {
        //Show first ticket type
        System.out.println(tix.get(0).tixType + "\t$" + tix.get(0).tixCost + "\tTickets Available: " + tix.get(0).tixNumber);
        //Show second ticket type
        System.out.println(tix.get(1).tixType + "\t\t$" + tix.get(1).tixCost + "\tTickets Available: " + tix.get(1).tixNumber);
        //Show third ticket type
        System.out.println(tix.get(2).tixType + "\t\t$" + tix.get(2).tixCost + "\tTickets Available: " + tix.get(2).tixNumber);
    }
    
    
    
    

}
