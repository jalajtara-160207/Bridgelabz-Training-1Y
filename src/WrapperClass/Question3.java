package WrapperClass;
import java.lang.Integer;
import java.util.List;
import java.util.ArrayList;

public class Question3 {
    public void Boxing()
    {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("List :-"+list);
        int sum=0;
        for(Integer num:list)
        {
            sum+=num;
        }
        System.out.println("Sum of lIst:-"+sum);

    }

    static void main() {
        Question3 q3=new Question3();
        q3.Boxing();
    }
}
