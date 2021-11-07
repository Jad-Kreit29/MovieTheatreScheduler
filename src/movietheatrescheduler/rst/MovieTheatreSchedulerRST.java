/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movietheatrescheduler.rst;

import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Jad Kreit
 */
public class MovieTheatreSchedulerRST {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        //Build Scanner
        Scanner in = new Scanner(System.in);

        //Set variable for making choices
        String userExplination = "";
        String movieChoice = "";
        String movieTime = "";
        String screenType = "";
        String ageGroup = "";
        int userChoice = 0;
        int userTime = 0;
        int quantity = 0;
        double typeCost = 0;
        double ageCost = 0;
        double sum = 0;

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

        //Decide what film the user picked
        if (userChoice == 1) {
            movieChoice = "Super Mario Brothers: The Movie!";
        } else if (userChoice == 2) {
            movieChoice = "The Second Re-Awaking";
        } else if (userChoice == 3) {
            movieChoice = "Depressing Film: The 3 Hour Drama: Real Life Edition";
        }
        
        System.out.println("\nWhat time do you want to see this movie? (1, 2, 3, etc)");
        userTime = in.nextInt();

        movieTime = t.UserInput(userChoice, userTime);
        System.out.println("\nTime: " + movieTime);

        //Show the user the availbe screening options
        System.out.println("\nWe've got three screening options. Choose the one that you want! (1, 2, 3)");
        m.DisplayTicketType();
        typeCost = in.nextInt();
        
        //Decide what screen type the user picked
        if (typeCost == 1) {
            screenType = "Standard";
        } else if (typeCost == 2) {
            screenType = "3D";
        } else if (typeCost == 3) {
            screenType = "IMAX";
        }
        
        //Show the user the different age group options
        System.out.println("\nWe've got four age groups. Which one do you want? (1, 2, 3, 4)");
        m.DisplayTicketAge();
        ageCost = in.nextInt();
        sum = m.cost(typeCost, ageCost);
        
        //Decide what age group the user picked
        if (ageCost == 1) {
            ageGroup = "Child";
        } else if (ageCost == 2) {
            ageGroup = "Teen";
        } else if (ageCost == 3) {
            ageGroup = "Adult";
        } else if (ageCost == 4) {
            ageGroup = "Elder";
        }
        
        
        //Ask how many of those tickets the user will be purchasing
        System.out.println("\nHow many of those tickets will you buy?");
        quantity = in.nextInt();
        sum = sum * quantity;
        

        //Show the user what they've picked
        System.out.println("\nAlright! Here's what you'll be seeing:\n\n" + movieChoice + "\t" + movieTime + "\t" + "X" + quantity + " " + ageGroup + " " + screenType + ":\t$" + sum);

        //Thank the user for coming
        System.out.println("\nThank you so much for coming! We hope you have a great experience!");

        //Close Scanner
        in.close();

    }

}
