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
        shows.add(new Movies("Title","Descriptions",new String[] {"7:00","9:00"}));
        Movies m2=new Movies("The second film", "This is just a blatant money grab", new String[] {"1:00","2:00"});
        shows.add(m2);
        
    }
    
    public void DisplayShows(){
        for (Movies m:shows){
            System.out.println(m.title+": "+m.movieDescription);
            for (String t:m.timings){
                System.out.print(t+"\t");
            }
            System.out.println("\n");
        }
    }
   
    
}
