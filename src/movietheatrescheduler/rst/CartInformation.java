/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movietheatrescheduler.rst;

/**
 *
 * @author Jad Kreit
 */
public class CartInformation {

    //Make variables the cart
    String movieChoice;
    String movieTime;
    String ageGroup;
    String screenType;
    String row;
    int seat;
    double sum;

    public CartInformation(String movieChoice, String movieTime, String ageGroup, String screenType, String row, int seat, double sum) {
        this.movieChoice = movieChoice;
        this.movieTime = movieTime;
        this.ageGroup = ageGroup;
        this.screenType = screenType;
        this.row = row;
        this.seat = seat;
        this.sum = sum;
    }

}
