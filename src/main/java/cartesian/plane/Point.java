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
public class Point {
    private int pointAx;
    private int pointAy;
    private int pointBx;
    private int pointBy;
    
public Point(){
}

public Point(int newPointAx, int newPointAy, int newPointBx, int newPointBy){
    pointAx = newPointAx;
    pointAy = newPointAy;
    pointBx = newPointBx;
    pointBy = newPointBy;
}

public void setPointAx(int newPointAx){
    pointAx = newPointAx;
}

public int getPointAx(){
    return pointAx;
}

public void setPointAy(int newPointAy){
    pointAy = newPointAy;
}

public int getPointAy(){
    return pointAy;
}

public void setPointBx(int newPointBx){
    pointBx = newPointBx;
}

public int getPointBx(){
    return pointBx;
}

public void setPointBy(int newPointBy){
    pointBy = newPointBy;
}

public int getPointBy(){
    return pointBy;
}

public double distance(double pointAx, double pointAy, double pointBx, double pointBy){
    double x = ((pointAx - pointBx)*(pointAx - pointBx))+((pointAy - pointBy)*(pointAy - pointBy));
    double distance = Math.sqrt(x);
    return distance;
}

}
