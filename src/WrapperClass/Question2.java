package WrapperClass;

public class Question2 {
    public void wrapperToPrimitive()
    {
        Double num1 = 33.33;
        double num2 = 33.33;

        int num3 = (int)num2;
        System.out.println("Double Object:-"+num1);
        System.out.println("double primitive:-"+num1);
        System.out.println("Integer primtive:-"+num1);
    }

    static void main() {
        Question2 q2 = new Question2();
        q2.wrapperToPrimitive();
    }
}