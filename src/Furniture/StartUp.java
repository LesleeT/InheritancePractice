/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Furniture;

/**
 *
 * @author Leslee
 */
public class StartUp {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Chair chair = new Chair();
        chair.setFurnitureMaker("Broyhill");
        System.out.println("The make of your chair is " + chair.getFurnitureMaker());
       
        Recliner rec = new Recliner();
        rec.setFabric("Leather");
        System.out.println("You chose " + rec.getFabric() + "for the material of your recliner");
        
        
    }
}
