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
public class SeatingArrangement {

    public void DisplaySeats() {
        char seatRow = 'A';
        for (int i = 0; i < 4; i++) {
            System.out.println(seatRow + "  " + "X X X X .... X X X X");
            seatRow++;
        }
        System.out.println("   1 2 3 4 .... 22 23 24 25");
    }

}
