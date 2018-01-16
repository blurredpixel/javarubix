/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubixsolver;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
/**
 *
 * @author friesdj
 */
public class Side {
    
    private int[]row1;
    private int[]row2;
    private int[]row3;
    private Hashtable<String, Integer> colorCodes;
        
    
  public Side(){
      row1 = new int[3];
      row2 = new int[3];
      row3 = new int[3];
      this.colorCodes= new Hashtable<String,Integer>();
      
  }  
    
    private int generateRnd(){
        int rnd = (int)(Math.random()*5)+1;
        return rnd;
    }
    
    
    
    
    
    
    
    public void generateSides(){
        int i;
        /**
         * 1: Red
         * 2: Blue
         * 3: Green
         * 4: Yellow
         * 5: Orange
         * 6: White
         */
        
        for(i=0;i<row1.length;i++){
            row1[i]=generateRnd();
            
        }
        for(i=0;i<row2.length;i++){
            row2[i]=generateRnd();
            
        }
        for(i=0;i<row3.length;i++){
            row3[i]=generateRnd();
            
        }
        
        
    }
    
    public void evalColors(int[] row){
        
        
        
        int redCount=0;
        int blueCount =0;
        int greenCount = 0;
        int yellowCount = 0;
        int orangeCount =0;
        int whiteCount =0;
        
        int i;
        for(i=0;i<3;i++){
            switch(row[i]){
                case 1: redCount++;
                case 2: blueCount++;
                case 3: greenCount++;
                case 4: yellowCount++;
                case 5: orangeCount++;
                case 6: whiteCount++;
            }
            
        }
        colorCodes.put("Red", redCount);
        colorCodes.put("Blue", blueCount);
        colorCodes.put("Green", greenCount);
        colorCodes.put("Yellow", yellowCount);
        colorCodes.put("Orange", orangeCount);
        colorCodes.put("White", whiteCount);
        
        
        
        
        
    }
    
    
    public void printSides(){
        this.evalColors(row1);
        this.evalColors(row2);
        this.evalColors(row3);
        Integer red = colorCodes.get("Red");
        Integer blue = colorCodes.get("Blue");
        Integer green = colorCodes.get("Green");
        Integer yellow = colorCodes.get("Yellow");
        Integer orange = colorCodes.get("Orange");
        Integer white = colorCodes.get("White");
        
        System.out.println("Red: "+red);
        System.out.println("Blue: "+blue);
        System.out.println("Green: "+green);
        System.out.println("Yellow: "+yellow);
        System.out.println("Orange: "+orange);
        System.out.println("White: "+white);
        
    
}





}//end of class