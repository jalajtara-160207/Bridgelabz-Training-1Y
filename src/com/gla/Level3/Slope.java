package com.gla.Level3;

public class Slope {
    public static double slope(int x1,int y1,int x2,int y2)
    {
        if(x2 - x1 == 0)
        {
            return Double.POSITIVE_INFINITY;
        }
        return (double)(y2-y1)/(x2-x1);
    }
    public static boolean checkcollinearslope(int x1,int y1,int x2,int y2,int x3,int y3)
    {
        double slopeAB = slope(x1,y1,x2,y2);
        double slopeBC = slope(x2,y2,x3,y3);
        return slopeAB == slopeBC;
    }
    public static boolean checkcollineararea(int x1,int y1,int x2,int y2,int x3,int y3)
    {
        int area = x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2);
        return area == 0;
    }
    public static void main(String args[])
    {
        int x1=2,y1=4;
        int x2=4,y2=6;
        int x3=6,y3=8;
        System.out.println("Checking points A(2,4),B(4,6),C(6,8): ");
        if(checkcollinearslope(x1,y1,x2,y2,x3,y3))
        {
            System.out.println("Collinear (Slope Method)");
        }
        else {
            System.out.println("Not Collinear(Slope Method)");
        }
        if(checkcollineararea(x1,y1,x2,y2,x3,y3))
        {
            System.out.println("Collinear (Area Method)");
        }
        else {
            System.out.println("Not Collinear(Area Method)");
        }
    }
}
