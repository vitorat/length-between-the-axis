/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartesian.plane;

/**
 *
 * @author Vitor
 */
import java.util.Scanner;

public class Main
{

    public static void main(String args[]){
        
        Scanner leia = new Scanner(System.in);
        
        int getPointAx, getPointAy, getPointBx, getPointBy;
        
        
        Point point1 = new Point();   
        
        
        
        System.out.println("Type the x axis of point A: ");
        point1.setPointAx( leia.nextInt()); 
        getPointAx = point1.getPointAx();
        
        System.out.println("Type the y axis of point A: ");
        point1.setPointAy( leia.nextInt()); 
        getPointAy = point1.getPointAy();
        
        System.out.println("Type the x axis of point B: ");
        point1.setPointBx( leia.nextInt()); 
        getPointBx = point1.getPointBx();
        
        System.out.println("Type the y axis of point B: ");
        point1.setPointBy( leia.nextInt()); 
        getPointBy = point1.getPointBy();
       
        
        System.out.println("Distance between A("+getPointAx+", "+getPointAy+") and B(" +getPointBx+", "+getPointBy+") is: "+point1.distance(getPointAx, getPointAy, getPointBx, getPointBy));
        
        
        
        
}
}
