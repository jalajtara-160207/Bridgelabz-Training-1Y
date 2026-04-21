package Collections;

import java.util.Arrays;

public class RotateElements
{
    public static int[] rotateLeft(int[] arr, int k)
    {
        int n=arr.length;
        if(n==0)
            return arr;
            k = k%n;
            if(k<0) k+=n;
            int [] rotated = new int[n];
            for(int i=0;i<n;i++)
            {
                rotated[i]=arr[(i+k)%n];
            }
            return rotated;
    }
    public static int[] rotateRight(int[] arr, int k)
    {
        return rotateLeft(arr,-k);
    }
    public static void  main(String[] args)
    {
        int[] og = {10,20,30,40,50,60,70,80,90,10};
        int rotateBy = 2;
        System.out.println("Original List: "+ Arrays.toString(og));
        System.out.println("Rotate By: "+ rotateBy+"positions");


        int[]leftrotated = rotateLeft(og,rotateBy);
        System.out.println("Left Rotated: "+Arrays.toString(leftrotated));
        int[]rightroated = rotateRight(og,rotateBy);
        System.out.println("Right Rotated: "+Arrays.toString(rightroated));

        System.out.println("\n---Additional Test Cases---");
        int[]test1 = {1,2,3,4,5,6,7};
        System.out.println("Original List: "+ Arrays.toString(test1));
        System.out.println("Rotate Left 3:"+ Arrays.toString(rotateLeft(test1,rotateBy)));
        System.out.println("Rotate Right 3:"+ Arrays.toString(rotateRight(test1,rotateBy)));

        int[]test2 = {5,10,15};
        System.out.println("Original List: "+ Arrays.toString(test2));
        System.out.println("Rotate Left 7:"+ Arrays.toString(rotateLeft(test2,rotateBy)));

        int[]test3 = {42};
        System.out.println("Original List: "+ Arrays.toString(test3));
        System.out.println("Rotate Right 5:"+ Arrays.toString(rotateRight(test3,rotateBy)));
    }
}
