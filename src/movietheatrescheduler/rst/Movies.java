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
public class Movies {

    String title;
    String movieDescription;
    String[] timings;

    public Movies(String title, String movieDescription, String[] timings) {
        this.title = title;
        this.movieDescription = movieDescription;
        this.timings = timings;
    }

}
