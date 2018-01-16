/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubixsolver;

import java.util.ArrayList;

/**
 *
 * @author friesdj
 */
public class RubixSolver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Side sides = new Side();
        
        sides.generateSides();
        sides.printSides();
    }
}    

