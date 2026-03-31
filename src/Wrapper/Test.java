package Wrapper;

public class Test
{
    public static void main(String args[])
    {
        int a =10;
        Integer b =20;

        Integer c =30;
        Integer d =Integer.max(b,c);
        System.out.println("This is the Max Value."+d);
        System.out.println(a+b);


        String s1 = "10";
        String s2 = "20";

        Integer i1 = Integer.valueOf(s1);

        Integer i2 = Integer.valueOf(s2);

        System.out.println(s1+s2);

        System.out.println(s1+s2);
    }
}
