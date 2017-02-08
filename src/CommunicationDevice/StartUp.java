/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommunicationDevice;

/**
 *
 * @author Leslee
 */
public class StartUp {
    
    public static void main (String [] args){    
        CellPhone cell = new CellPhone();
        cell.setPhoneNumber("555-555-5555");
        cell.setPhoneType("Apple iPhone 7plus");
        System.out.println("Your phone number is " + cell.getPhoneNumber() + " and your "
                + "cell phone is a " + cell.getPhoneType());
    }
}
