/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Philosophy;

/**
 *
 * @author Leslee
 */
public class StartUp {
    
    public static void main (String [] args){
        
        BigBangTheory bbt = new BigBangTheory();
        bbt.setPhilosopher("a");
        bbt.setExplanation("b");
        bbt.setHypothesis("c");
        System.out.println(bbt.getExplanation() + bbt.getPhilosopher() + bbt.getHypothesis());
    }
    
}
