package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReverseList {
    public static <T> void reverseArrayList(ArrayList<T> list) {
        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            T temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }

    public static <T> void reverseLinkedList(LinkedList<T> list) {
        int size = list.size();
        Object[] arr = list.toArray();
        for (int i = 0; i < size; i++) {
            @SuppressWarnings("unchecked")
            T value = (T) arr[size - 1 - i];
            list.set(i, value);
        }
    }

    public static void printlist(String label, List<?> list) {
        System.out.println(label + ": [");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(", ");
            }
            System.out.println("]");
        }
    }

    static void main(String[] args) {
        System.out.println("==============ArrayList==============");
        ArrayList<Integer> list = new ArrayList<>();
        for (int val : new int[]{1, 2, 3, 4, 5}) {
            list.add(val);
            printlist("Input", list);
            reverseArrayList(list);
            printlist("Output", list);

            System.out.println("\n==============LinkedList==============");
            LinkedList<Integer> list2 = new LinkedList<>();
            for (int val1 : new int[]{1, 2, 3, 4, 5}) {
                list2.add(val1);
                printlist("Input", list2);
                reverseLinkedList(list2);
                printlist("Output", list2);

                System.out.println("\n==============String Arraylist==============");
                ArrayList<String> list3 = new ArrayList<>();
                for (String s : new String[]{"Apple", "Banana", "Cherry", "Date"}) {
                    list3.add(s);
                    printlist("Input", list3);
                    reverseArrayList(list3);
                    printlist("Output", list3);
                }
            }
        }
    }
}