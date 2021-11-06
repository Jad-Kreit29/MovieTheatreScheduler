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

    //Make new variables for each movie's title, description, rating, and review
    String title;
    String movieDescription;
    String movieRating;
    String movieReview;
    String[] timings;

    //Create a constructor that makes a blueprint with all of the new variables
    public Movies(String title, String movieDescription, String movieRating, String movieReview, String[] timings) {
        this.title = title;
        this.movieDescription = movieDescription;
        this.movieRating = movieRating;
        this.movieReview = movieReview;
        this.timings = timings;
    }

}
