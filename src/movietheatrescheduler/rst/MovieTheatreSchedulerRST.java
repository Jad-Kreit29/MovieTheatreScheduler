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
        
        //Set variable for making choices
        String userExplination = "";
        int userChoice = 0;
        int userTime = 0;
        String movieTime = "";

        //Build a new theatre object
        Theatre t = new Theatre();
        
        //Build a new money type
        Money m = new Money();
        
        //Welcome the user to the theatre
        System.out.println("Hello! Welcome to the Screenefy Movie Theatre. This is a brand new location, so we don\'t have many movies to offer right now!");
        //Present the films and the timings to the user
        System.out.println("\nHere's what we have! Choose a movie (1, 2, 3) and then enter a time (1, 2, 3, etc)");

        //Run the DisplayShows method
        t.DisplayShows();

        userChoice = in.nextInt();
        in.nextLine();
        System.out.println("Do you want to hear what the movie is about? (y/n)");
        userExplination = in.nextLine();
        if (userExplination.toLowerCase().startsWith("y")) {
            t.DisplayDescriptions(userChoice);
        }

        System.out.println("\nWhat time do you want to see this movie? (1, 2, 3, etc)");
        userTime = in.nextInt();

        movieTime = t.UserInput(userChoice, userTime);
        System.out.println("\nTime: " + movieTime);
        
        //Show the user the availbe screening options
        System.out.println("\nWe've got three screening options. Choose the one that you want! (1, 2, 3)");
        m.DisplayTickets();
        userChoice = in.nextInt();
        
        
        //Close Scanner
        in.close();

    }

}
