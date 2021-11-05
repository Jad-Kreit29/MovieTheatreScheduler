/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movietheatrescheduler.rst;

/**
 *
 * @author Jad Kreit
 */
public class Timings {

    private String time1;
    private String time2;
    private String time3;

    public Timings(String time1, String time2, String time3) {
        this.time1 = time1;
        this.time2 = time2;
        this.time3 = time3;
    }

    public void getTimes() {
        System.out.println(time1 + "\t" + time2 + "\t" + time3);
    }

    //Method for determining the user's choice
    public String UserInput(int userChoice) {
        int pass = 0;
        String ticketTime = "";
        do {
            if (userChoice == 1) {
                System.out.println("\nGreat Choice!");
                ticketTime = this.time1;
                pass++;
            } else if (userChoice == 2) {
                System.out.println("\nGreat Choice!");
                ticketTime = "03:30 PM";
                pass++;
            } else if (userChoice == 3) {
                System.out.println("\nGreat Choice!");
                ticketTime = "09:30 PM";
                pass++;
            } else {
                System.out.println("Not a vaild timing!");
            }
            return ticketTime;

        } while (pass != 1);
    }

}
