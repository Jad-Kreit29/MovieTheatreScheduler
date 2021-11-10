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
public class Cart {

    String movieChoice;
    String movieTime;
    String ageGroup;
    String screenType;
    int quantity;
    double sum;

    //Create an Array List of type String and Int to store the information of each ticket the user chose
    ArrayList<CartInformation> cart = new ArrayList<>();

    public void CartAdder(String movieChoice, String movieTime, String ageGroup, String screenType, double sum, String row, int seat) {
        cart.add(new CartInformation(movieChoice, movieTime, ageGroup, screenType, row, seat, sum));
    }

    public void DisplayCart() {
        double sum = 0;
        for (int s = 0; s < cart.size(); s++) {
            sum += cart.get(s).sum;
        }
        System.out.println("\n\n\n\n-------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("RECIPT");
        for (int c = 0; c < cart.size(); c++) {
            System.out.println(cart.get(c).movieChoice + "\t" + cart.get(c).movieTime + "\t" + cart.get(c).ageGroup + " " + cart.get(c).screenType + "\t$" + cart.get(c).sum + "\tSeat: " + cart.get(c).row + cart.get(c).seat);
        }
        System.out.println("\n\n\nTOTAL: " + "$" + sum);

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

}
