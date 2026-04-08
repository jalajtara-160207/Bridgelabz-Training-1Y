package WrapperClass;
import java.util.ArrayList;
import java.util.Collections;
public class Question7 {
public static void main(String args[])
{
    double[]prices = {10.5,20.0,35.75,5.5};
    ArrayList<Double>priceList = new ArrayList<>();
    for(double p:prices)
    {
        priceList.add(p);
    }
    double highestPrice = Collections.max(priceList);

    double sum = 0;
    for(double p:priceList)
    {
        sum+=p;
    }
    double averagePrice = sum/priceList.size();

    System.out.println("Prices:"+priceList);
    System.out.println("Highest Price:"+highestPrice);
    System.out.println("Averaeg Price:"+averagePrice);
}
}
