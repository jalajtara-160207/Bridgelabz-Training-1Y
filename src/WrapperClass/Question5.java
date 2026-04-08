package WrapperClass;

public class Question5 {
    public static void main(String args[])
    {
        int intValue = Integer.parseInt("123");
        System.out.println("Integer.parseInt(\"123\")="+intValue);

        double doubleValue = Double.parseDouble("3.14");
        System.out.println("Double.parseDouble(\"3.14\")="+doubleValue);

        boolean boolValue = Boolean.parseBoolean("true");
        System.out.println("Boolean.parseBoolean(\"true\")="+boolValue);

        String binaryString = Integer.toBinaryString(10);
        System.out.println("Integer.toBinaryString(10)="+binaryString);
    }
}
