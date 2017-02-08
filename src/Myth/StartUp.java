/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Myth;

/**
 *
 * @author Leslee
 */
public class StartUp {
    
    public static void main (String [] args){
      
        AbominableSnowman abs = new AbominableSnowman();
        abs.setAge(2343);
        abs.setOrigin("first sighted in Indus Valley");
        abs.setSightingLocation("recently sighted in the mountains of Colorodo.");
        System.out.println("The age of the abominable snowman species is estimated to be " + 
                abs.getAge() + " years old.  It was " + abs.getOrigin() + ". And was " + 
                abs.getSightingLocation());
    }
}
