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
        int sidenum=0;
        ArrayList<Side> sides = new ArrayList<>();
        do{
            Side side = new Side();
            sides.add(side);
            System.out.println(sidenum);
            sidenum++;
            
        }while(sidenum<9);
        
        
        
        for(Side s: sides){
            s.generateSides();
            s.printSides();
            
            
        }
        
    }
}    

