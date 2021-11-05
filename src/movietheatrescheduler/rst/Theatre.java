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
public class Theatre {

    //New Arraylist for all of the movies we're storing
    ArrayList<Movies> shows = new ArrayList<>();

    //Build a constructor that 
    public Theatre() {
        shows.add(new Movies("Super Mario Brothers: The Movie!", "Bowser is back at it again, and this time he's going to travel to his past and future self to finally capture Peach. But, when an accidental error in his time machine causes a rift in the time continium, Mario must travel through parrallel timeline in order to save his beloved Princess.", new String[]{"07:00 AM", "10:30 AM", "12:45 PM", "03:00 PM", "07:30 PM", "10:00 PM"}));
        shows.add(new Movies("The Second Re-Awaking", "The war is on. The hunt is real. And the truth is a lie. Nothing is spoken to anyone, and no one speaks to anyone, as the revolution is charging the fresh promsise of a new and better life. All it takes is a single truth to unwind the more subtle truths.", new String[]{"11:00 AM", "09:00 PM"}));
        shows.add(new Movies("Depressing Film: The 3 Hour Drama: Real Life Edition", "It's been 15 years since Derek and his lover Jane had to seperate from each other due to the 1875 conflict. Upon their day of reconceliation, they find that things might not have been the way they wanted it to be.", new String[]{"03:00 PM", "05:30 PM", "08:00 PM", "11:00 PM"}));
    }

    public void DisplayShows() {
        int counter=1;
        for (Movies m : shows) {
            System.out.println(counter+") "+m.title);
            for (String t : m.timings) {
                System.out.print(t + "\t");
            }
                counter++;
            System.out.println("\n");
        }
    }

    public void UserInput(int userChoice, int userTime) {
        if (userChoice == 1) {
            if (userTime == 1) {

            }
        }
    }

    public void DisplayDescriptions(int userChoice) {
            if (userChoice == 1) {
                System.out.println(shows.get(0).movieDescription);
            } else if (userChoice == 2) {
                System.out.println(shows.get(1).movieDescription);
            } else if (userChoice == 3) {
                System.out.println(shows.get(1).movieDescription);
            }
        
    }

}
