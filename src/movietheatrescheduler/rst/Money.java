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

    //Create Array List of type Tickets for age group
    ArrayList<Tickets> tixAge = new ArrayList<>();

    public Money() {
        tixType.add(new Tickets("Standard", 4.50, 20));
        tixType.add(new Tickets("3D", 6.50, 50));
        tixType.add(new Tickets("IMAX", 8.50, 30));
        tixAge.add(new Tickets("Child", 2.20));
        tixAge.add(new Tickets("Teen", 3.20));
        tixAge.add(new Tickets("Adult", 4.20));
        tixAge.add(new Tickets("Elder", 1.20));
    }

    public void DisplayTicketType() {
        //Show first ticket type
        System.out.println(tixType.get(0).tixType + "\t$" + tixType.get(0).tixCost + "\tTickets Available: " + tixType.get(0).tixNumber);
        //Show second ticket type
        System.out.println(tixType.get(1).tixType + "\t\t$" + tixType.get(1).tixCost + "\tTickets Available: " + tixType.get(1).tixNumber);
        //Show third ticket type
        System.out.println(tixType.get(2).tixType + "\t\t$" + tixType.get(2).tixCost + "\tTickets Available: " + tixType.get(2).tixNumber);
    }

    public void DisplayTicketAge() {
        //Show first age group
        System.out.println(tixAge.get(0).tixAge + "\t$" + tixAge.get(0).tixAgeCost);
        //Show second age group
        System.out.println(tixAge.get(1).tixAge + "\t$" + tixAge.get(1).tixAgeCost);
        //Show third age group
        System.out.println(tixAge.get(2).tixAge + "\t$" + tixAge.get(2).tixAgeCost);
        //Show fourth age group
        System.out.println(tixAge.get(3).tixAge + "\t$" + tixAge.get(3).tixAgeCost);
    }

    public double cost(double typeCost, double ageCost) {
        double cost = 0;
        if (typeCost == 1) {
            if (ageCost == 1) {
                cost = tixType.get(0).tixCost + tixAge.get(0).tixAgeCost;
            } else if (ageCost == 2) {
                cost = tixType.get(0).tixCost + tixAge.get(1).tixAgeCost;
            } else if (ageCost == 3) {
                cost = tixType.get(0).tixCost + tixAge.get(2).tixAgeCost;
            } else if (ageCost == 4) {
                cost = tixType.get(0).tixCost - tixAge.get(3).tixAgeCost;
            }
        } else if (typeCost == 2) {
            if (ageCost == 1) {
                cost = tixType.get(1).tixCost + tixAge.get(0).tixAgeCost;
            } else if (ageCost == 2) {
                cost = tixType.get(1).tixCost + tixAge.get(1).tixAgeCost;
            } else if (ageCost == 3) {
                cost = tixType.get(1).tixCost + tixAge.get(2).tixAgeCost;
            } else if (ageCost == 4) {
                cost = tixType.get(1).tixCost - tixAge.get(3).tixAgeCost;
            }
        } else if (typeCost == 3) {
            if (ageCost == 1) {
                cost = tixType.get(2).tixCost + tixAge.get(0).tixAgeCost;
            } else if (ageCost == 2) {
                cost = tixType.get(2).tixCost + tixAge.get(1).tixAgeCost;
            } else if (ageCost == 3) {
                cost = tixType.get(2).tixCost + tixAge.get(2).tixAgeCost;
            } else if (ageCost == 4) {
                cost = tixType.get(2).tixCost - tixAge.get(3).tixAgeCost;
            }
        }

        return cost;

    }

}
