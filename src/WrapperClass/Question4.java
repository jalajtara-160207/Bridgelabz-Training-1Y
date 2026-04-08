package WrapperClass;

public class Question4
{
    public void wrapperComparison()
    {
        Integer a = 100;
        Integer b =100;
        Integer c = 200;
        Integer d = 200;
        System.out.println(a==b);
        System.out.println(c==d);
    }

    static void main()
    {
        Question4 q4 = new Question4();
        q4.wrapperComparison();
    }
}
