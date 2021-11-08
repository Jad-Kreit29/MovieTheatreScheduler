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

    //Build a constructor that holds all of the movies that are going to be played.
    public Theatre() {
        shows.add(new Movies("Super Mario Brothers: The Movie!", "\nBowser is back at it again, and this time he's going to travel to his past and future self to finally capture Peach.\nBut, when an accidental error in his time machine causes a rift in the time continium,\nMario must travel through parrallel timeline in order to save his beloved Princess.", "\nRating: PG", "\nIGN: 'Mamma-Mia, that was one spicy movie! Wahoo!'", new String[]{"07:00 AM", "10:30 AM", "12:45 PM", "03:00 PM", "07:30 PM", "10:00 PM"}));
        shows.add(new Movies("The Second Re-Awaking", "\nThe war is on. The hunt is real. And the truth is a lie. Nothing is spoken to anyone, and no one speaks to anyone.\nThe revolution is charging the fresh promsise of a new and better life.\nAll it takes is a single truth to unwind the more subtle truths.", "\nRating: PG-13", "\nNWT: 'War. War is terrible. This felt right out of George Orwell's 1984'", new String[]{"11:00 AM", "09:00 PM"}));
        shows.add(new Movies("Depressing Film: The 3 Hour Drama: Real Life Edition", "\nIt's been 15 years since Derek and his lover, Jane, had to seperate from each other due to the 1875 conflict.\nUpon their day of reconceliation, they find that things might not have been the way they wanted it to be.", "\nRating: S for Sad", "\nThe Verge: 'I cried so much through this, I needed my own reconcelliation with myself!'", new String[]{"03:00 PM", "05:30 PM", "08:00 PM", "11:00 PM"}));
    }

    //Method for displaying the titles of each film along with their timings
    public void DisplayShows() {
        int counter = 1;
        for (Movies m : shows) {
            System.out.println(counter + ") " + m.title);
            for (String t : m.timings) {
                System.out.print(t + "\t");
            }
            counter++;
            System.out.println("\n");
        }
    }

    //Method for deciding what time the user picked
    public String UserInput(int userChoice, int userTime) {
        String movieTime = "";
        if (userChoice == 1) {
            if (userTime == 1) {
                movieTime = "07:00 AM";
            } else if (userTime == 2) {
                movieTime = "10:30 AM";
            } else if (userTime == 3) {
                movieTime = "12:45 PM";
            } else if (userTime == 4) {
                movieTime = "03:00 PM";
            } else if (userTime == 5) {
                movieTime = "07:30 PM";
            } else if (userTime == 6) {
                movieTime = "10:00 PM";
            }
        } else if (userChoice == 2) {
            if (userTime == 1) {
                movieTime = "11:00 AM";
            } else if (userTime == 2) {
                movieTime = "09:00 PM";
            }
        } else if (userChoice == 3) {
            if (userTime == 1) {
                movieTime = "03:300 PM";
            } else if (userTime == 2) {
                movieTime = "05:30 PM";
            } else if (userTime == 3) {
                movieTime = "08:00 PM";
            } else if (userTime == 4) {
                movieTime = "11:00 PM";
            }
        }
        return movieTime;
    }

    //Method for displaying the description, rating, and comment for each film
    public void DisplayDescriptions(int userChoice) {
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
        if (userChoice == 1) {
            System.out.println(shows.get(0).title);
            System.out.println(shows.get(0).movieDescription);
            System.out.println(shows.get(0).movieRating);
            System.out.println(shows.get(0).movieReview);
        } else if (userChoice == 2) {
            System.out.println(shows.get(1).title);
            System.out.println(shows.get(1).movieDescription);
            System.out.println(shows.get(1).movieRating);
            System.out.println(shows.get(1).movieReview);
        } else if (userChoice == 3) {
            System.out.println(shows.get(2).title);
            System.out.println(shows.get(2).movieDescription);
            System.out.println(shows.get(2).movieRating);
            System.out.println(shows.get(2).movieReview);
        }

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");

    }

}
