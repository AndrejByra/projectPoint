package sk.akademiasovy.point;

import java.util.Random;

public class Point implements Geometry {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point ()
    {
        this (0, 0);
        //x=0;
        //y=0;
    }

    public int getX ()
    {
        return x;
    }

    public int getY ()
    {
        return y;
    }

    public int getQuadrant ()
    {
        if (x>0 && y>0)
            return 1;
        else if (x<0 && y>0)
            return 2;
        else if (x<0 && y<0)
            return 3;
        else if (x>0 && y<0)
            return 4;
        else
            return 0;
    }

    public void generateRandomCord ()
    {
        Random random=new Random();
        this.x=random.nextInt(41)-20;
        this.y=random.nextInt(41)-20;
    }

    public double getDistance ()
    {
        return Math.sqrt(x*x+y*y);
    }

    public void printPointInfo ()
    {
        System.out.println("X: "+getX());
        System.out.println("Y: "+getY());
        System.out.println("Quadrant: "+getQuadrant());
        System.out.println("Distance: "+getDistance());
    }

    public double getDistanceFromOtherPoint (Point other)
    {
        return Math.sqrt(Math.pow(x-other.getX(),2)+Math.pow(y-other.getY(),2));
    }

    public void doAxialSymmetric (char type)
    {
        if(type=='x'){
            this.y=this.y*(-1);
        }
        else if (type=='y'){
            this.x=this.x*(-1);
        }
        else
            return;
    }

    public void doPointReflection ()
    {
        this.x=this.x*(-1);
        this.y=this.y*(-1);
    }
}
