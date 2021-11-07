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
    ArrayList<CartInformation> cart1 = new ArrayList<>();
    ArrayList<CartInformation> cart2 = new ArrayList<>();

    public void CartAdder(String movieChoice, String movieTime, String ageGroup, String screenType, int quantity, double sum) {
        cart1.add(new CartInformation(movieChoice, movieTime, ageGroup, screenType));
        cart2.add(new CartInformation(quantity, sum));
    }

    public void DisplayCart() {
        double sum = 0;
        for (int s = 0; s < cart2.size(); s++) {
            sum += cart2.get(s).sum;
        }
        System.out.println("\n\n\n\n-------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("RECIPT");
        for (int c = 0; c < cart1.size(); c++) {
            System.out.println(cart1.get(c).movieChoice + "\t" + cart1.get(c).movieTime + "\tX" + cart2.get(c).quantity + " " + cart1.get(c).ageGroup + " " + cart1.get(c).screenType + "\t$" + " " + cart2.get(c).sum);
        }
        System.out.println("TOTAL: " + sum);
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

}
