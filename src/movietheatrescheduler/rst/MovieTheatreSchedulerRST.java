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
        String repeatChoice = "";
        int userChoice = 0;
        int userTime = 0;
        int quantity = 0;
        double userMoney = 0;
        double typeCost = 0;
        double ageCost = 0;
        double sum = 0;
        double sumTot = 0;

        String row = "";
        int seat = 0;

        ArrayList<Double> totalReciptCost = new ArrayList<>();

        //Variable for quitting the main loop of the program
        int mainCheck = 0;

        //Build a new theatre object
        Theatre t = new Theatre();

        //Build a new money type
        Money m = new Money();

        //Build a new cart
        Cart c = new Cart();

        //Build a new seaing arrangement
        SeatingArrangement s = new SeatingArrangement();

        //Create a while loop to keep program running so that user can add multiple tickets if they want
        do {
            //Welcome the user to the theatre
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Hello! Welcome to the Screenefy Movie Theatre. This is a brand new location, so we don\'t have many movies to offer right now!");
            //Present the films and the timings to the user
            TimeUnit.SECONDS.sleep(2);
            System.out.println("\nHere's what we have! Choose a movie that you want to see (1, 2, 3)");

            //Run the DisplayShows method
            t.DisplayShows();

            //Variable for checking the movie the user has picked.
            int movieChoiceCheck = 0;
            do {
                userChoice = in.nextInt();
                if (userChoice > 3 || userChoice < 1) {
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println("This movie doesn\'t exist! Pick one we have listed");
                } else if (userChoice == 1 || userChoice == 2 || userChoice == 3) {
                    movieChoiceCheck++;
                }
            } while (movieChoiceCheck != 1);

            //Ask for what time the user wants to see the film
            System.out.println("\nWhat time do you want to see this movie? (1, 2, 3, etc)");

            do {
                userTime = in.nextInt();
                movieTime = t.UserInput(userChoice, userTime);
                if (!movieTime.toUpperCase().endsWith("M")) {
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println("Time doesn't exist! Pick a different time");
                }
            } while (!movieTime.toUpperCase().endsWith("M"));
            System.out.println("\nTime: " + movieTime);

            in.nextLine();
            TimeUnit.SECONDS.sleep(1);
            System.out.println("\nDo you want to hear what the movie is about? (y/n)");

            int check1 = 0;
            do {
                userExplination = in.nextLine();
                if (userExplination.toLowerCase().startsWith("y")) {
                    check1++;
                    TimeUnit.SECONDS.sleep(1);
                    t.DisplayDescriptions(userChoice);
                } else if (userExplination.toLowerCase().startsWith("n")) {
                    check1++;
                } else if (!userExplination.toLowerCase().startsWith("y") && !userExplination.toLowerCase().startsWith("n")) {
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println("Not a vaild option. Provide a Yes or No answer");
                }
            } while (check1 != 1);
            //Decide what film the user picked
            if (userChoice == 1) {
                movieChoice = "Super Mario Brothers: The Movie!";
            } else if (userChoice == 2) {
                movieChoice = "The Second Re-Awaking";
            } else if (userChoice == 3) {
                movieChoice = "Depressing Film: The 3 Hour Drama: Real Life Edition";
            }
            TimeUnit.SECONDS.sleep(1);

            //Show the user the availbe screening options
            TimeUnit.SECONDS.sleep(1);
            System.out.println("\nWe've got three screening options. Choose the one that you want! (1, 2, 3)");
            m.DisplayTicketType();

            int check2 = 0;
            do {
                typeCost = in.nextInt();
                if (typeCost == 1 || typeCost == 2 || typeCost == 3) {
                    check2++;
                } else if (typeCost > 3 || typeCost < 1) {
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println("That screening option doesn't exist. Pick one that's lised!");
                }
            } while (check2 != 1);

            //Decide what screen type the user picked
            if (typeCost == 1) {
                screenType = "Standard";
            } else if (typeCost == 2) {
                screenType = "3D";
            } else if (typeCost == 3) {
                screenType = "IMAX";
            }

            //Show the user the different age group options
            TimeUnit.SECONDS.sleep(1);
            System.out.println("\nWe've got four age groups. Elders get a $1.20 off their price! Which one do you want? (1, 2, 3, 4)");
            m.DisplayTicketAge();

            int check3 = 0;
            do {
                ageCost = in.nextInt();
                if (ageCost == 1 || ageCost == 2 || ageCost == 3 || ageCost == 4) {
                    check3++;
                } else if (ageCost > 4 || ageCost < 1) {
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println("We don't have that age group. Pick one we have listed!");
                }
            } while (check3 != 1);

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
            //Figure out if the user has inputed more tickets than what is available
            boolean test = false;
            do {
                TimeUnit.SECONDS.sleep(1);
                System.out.println("\nHow many of those tickets will you buy?");
                quantity = in.nextInt();
                test = m.TixAvailable(quantity, typeCost);
            } while (!test);
            totalReciptCost.add(sumTot = sum * quantity);

            in.nextLine();

            //Show possible seating arrangment and have the user pick a seat for as many tickets as they will buy
            TimeUnit.SECONDS.sleep(1);
            System.out.println("\nHere are our seating arrangement! Our theatre is able to hold 100 seats per screen. Type the Seating Row (A, B, C, D) and then the seat number (1...25)");

            s.DisplaySeats();

            //Create Array List for seat row and seat number
            ArrayList<String> userSeatsRow = new ArrayList<>();
            ArrayList<Integer> userSeatNumber = new ArrayList<>();

            for (int i = 1; i <= quantity; i++) {
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Pick the seating option for ticket " + i);
                int check5 = 0;
                do {
                    StringTokenizer line = new StringTokenizer(in.nextLine());
                    row = (line.nextToken());
                    row.toUpperCase();
                    seat = Integer.parseInt(line.nextToken());

                    if ((row.equals("A") || row.equals("B") || row.equals("C") || row.equals("D")) && (seat >= 1 && seat <= 25)) {
                        check5++;
                        userSeatsRow.add(row);
                        userSeatNumber.add(seat);
                    }

                    if (!row.equals("A") && !row.equals("B") && !row.equals("C") && !row.equals("D")) {
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println("\nThis row doesn't exist. Pick one that we have!");
                    }
                    if (seat > 25 || seat < 1) {
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println("\nThis seat doesn't exist. Pick one that we have!");
                    }
                } while (check5 != 1);
            }

            //Show the user what they've picked
            TimeUnit.SECONDS.sleep(2);
            System.out.println("\nAlright! Here's what you'll be seeing:\n\n" + movieChoice + "\t" + movieTime + "\t" + "X" + quantity + " " + ageGroup + " " + screenType + ":\t$" + sumTot);
            for (int i = 0; i < userSeatsRow.size(); i++) {
                c.CartAdder(movieChoice, movieTime, ageGroup, screenType, sum, userSeatsRow.get(i), userSeatNumber.get(i));

            }

            //Ask if the user wants to go through and purchase another ticket
            TimeUnit.SECONDS.sleep(1);
            System.out.println("\nDo you want to buy another ticket for something else? (y/n)");

            int check4 = 0;
            do {
                repeatChoice = in.nextLine();
                if (repeatChoice.toLowerCase().startsWith("n")) {
                    check4++;
                    mainCheck++;
                } else if (repeatChoice.toLowerCase().startsWith("y")) {
                    check4++;
                } else if (!repeatChoice.toLowerCase().startsWith("y") && !repeatChoice.toLowerCase().startsWith("n")) {
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println("\nWhat do you mean? Tell us a Yes or No answer");
                }
            } while (check4 != 1);

        } while (mainCheck != 1);

        double totalCost = 0;

        for (double z : totalReciptCost) {
            totalCost += z;
        }

        TimeUnit.SECONDS.sleep(1);
        //Ask the user to input the amount of money they have, and see if they can pay the price
        System.out.println("\nYour total is up to: $" + totalCost + " How much money are you going to pay?");

        int check6 = 0;
        do {
            userMoney = in.nextDouble();
            if (userMoney < sumTot) {
                TimeUnit.SECONDS.sleep(1);
                System.out.println("This is insufficient amount of money. Please pay the remainder of the amount required");
            } else if (userMoney >= sumTot) {
                TimeUnit.SECONDS.sleep(2);
                System.out.println("\nTRANSACTION COMPLETE...");
                check6++;
            }
        } while (check6 != 1);

        //Thank the user for coming
        TimeUnit.SECONDS.sleep(4);
        c.DisplayCart();
        System.out.println("\nThank you so much for coming! We hope you have a great experience!");

        //Close Scanner
        in.close();

    }

}
