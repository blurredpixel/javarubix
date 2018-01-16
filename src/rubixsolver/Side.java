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
public class Side {
    
    private int[]row1;
    private int[]row2;
    private int[]row3;
    
  public Side(){
      row1 = new int[9];
      row2 = new int[9];
      row3 = new int[9];
      
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
    
    public void printSides(){
        int redCount=0;
        int blueCount =0;
        int greenCount = 0;
        int yellowCount = 0;
        int orangeCount =0;
        int whiteCount =0;
        
        int i;
        for(i=0;i<row1.length;i++){
            System.out.println("Side1: "+row1[i]);
            switch(row1[i]){
                case 1: redCount++;
                case 2: blueCount++;
                case 3: greenCount++;
                case 4: yellowCount++;
                case 5: orangeCount++;
                case 6: whiteCount++;
            }
            
            
            
        }
        System.out.println("Red: "+ redCount);
            System.out.println("Blue: "+ blueCount);
            System.out.println("Green: "+ greenCount);
            System.out.println("Yellow: "+ yellowCount);
            System.out.println("Orange: "+ orangeCount);
            System.out.println("White: "+ whiteCount);
            
        for(i=0;i<row2.length;i++){
            System.out.println("Side2: "+row2[i]);
            switch(row2[i]){
                case 1: redCount++;
                case 2: blueCount++;
                case 3: greenCount++;
                case 4: yellowCount++;
                case 5: orangeCount++;
                case 6: whiteCount++;
            }
            
            
            
        }
        
        System.out.println("Red: "+ redCount);
            System.out.println("Blue: "+ blueCount);
            System.out.println("Green: "+ greenCount);
            System.out.println("Yellow: "+ yellowCount);
            System.out.println("Orange: "+ orangeCount);
            System.out.println("White: "+ whiteCount);
            
        for(i=0;i<row3.length;i++){
            System.out.println("Side3: "+row3[i]);
            switch(row3[i]){
                case 1: redCount++;
                case 2: blueCount++;
                case 3: greenCount++;
                case 4: yellowCount++;
                case 5: orangeCount++;
                case 6: whiteCount++;
            }
            
            
        }
        
            System.out.println("Red: "+ redCount);
            System.out.println("Blue: "+ blueCount);
            System.out.println("Green: "+ greenCount);
            System.out.println("Yellow: "+ yellowCount);
            System.out.println("Orange: "+ orangeCount);
            System.out.println("White: "+ whiteCount);
        
        
    }
    
    
    
    
}
