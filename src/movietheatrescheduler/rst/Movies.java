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
public class Movies {
    
    private String movieDesc;
    private String movieRating;
    private String comment;

    public Movies(String movieDesc, String movieRating, String comment) {
        this.movieDesc = movieDesc;
        this.movieRating = movieRating;
        this.comment = comment;
    }

    public String getMovieDesc() {
        return movieDesc;
    }

    public String getMovieRating() {
        return movieRating;
    }

    public String getComment() {
        return comment;
    }
    
    public void movieDescription() {
        
    }
    
    
}
