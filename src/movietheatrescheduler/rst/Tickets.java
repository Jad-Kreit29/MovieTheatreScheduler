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
public class Tickets {

    //Make variables for all of the different screening ticket type
    String tixType;
    double tixCost;
    int tixNumber;
    
    //Make vairables for different age group ticket type
    String tixAge;
    double tixAgeCost;
    

    //Make varaibles for all of the different age group tickets
    public Tickets(String tixType, double tixCost, int tixNumber) {
        this.tixType = tixType;
        this.tixCost = tixCost;
        this.tixNumber = tixNumber;
    }

    public Tickets(String tixAge, double tixAgeCost) {
        this.tixAge = tixAge;
        this.tixAgeCost = tixAgeCost;
    }
    

}
