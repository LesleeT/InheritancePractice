/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mammal;

/**
 *
 * @author Leslee
 */
public class StartUp {
    
    public static void main(String [] args){
        Human human = new Human();
        human.setAge(35);
        human.setName("Leslee");
        human.setGender("Female");
        System.out.println("Your name is " + human.getName() + ", your gender is " + 
                human.getGender() + ", and your age is " + human.getAge() + ".");
        
    }
}
