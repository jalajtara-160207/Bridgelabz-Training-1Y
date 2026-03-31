package MultiThreading;

public class Runner
{
    static void main(String[] args)
    {
        A a = new A();
        B b = new B();


        a.setPriority(10);
        b.setPriority(6);
        a.start();
        b.start();

    }
}
