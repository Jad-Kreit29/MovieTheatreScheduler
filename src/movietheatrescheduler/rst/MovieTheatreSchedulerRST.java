/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movietheatrescheduler.rst;

import java.util.*;

/**
 *
 * @author Jad Kreit
 */
public class MovieTheatreSchedulerRST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Build Scanner
        Scanner in = new Scanner(System.in);
        ArrayList<Movies> films=new ArrayList<>();
        //Set variable for making choices
        int userChoice = 0;

        //Welcome the user to the theatre
        System.out.println("Hello! Welcome to the Screenefy Movie Theatre. This is a brand new location, so we don\'t have many movies to offer right now!");
        
        
        //Show the available movies
        System.out.println("\nHere are the movies we have!\n\nSuper Mario Brothers: The Movie!");
        //Since this is the only film currently, show availble times
        System.out.println("\nHere are the avalable times:");
        Movies m1=new Movies();
        m1.times= new Timings("10:30 AM", "03:30 PM", "09:30 PM");
        films.add(m1);
        
        Movies m2=new Movies();
        m2.times=new Timings("11:00 AM", "05:00 PM", "08:30 PM");
        films.add(m2);
        
        for (Movies x:films){
            x.times.getTimes();
        }
        //Ask for which time they want to see
        System.out.println("Which time do you want to see? (1, 2, 3)");
        userChoice = in.nextInt();
        //String items = movieOneTime.UserInput(userChoice);
        
        //Display added items
       // System.out.println("\nYour items: Super Mario Brothers: The Movie!" + "\t" + items + "\t" + "Price: $5.99");
        
        //Close Scanner
        in.close();

    }

}
