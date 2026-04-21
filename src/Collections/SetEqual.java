package Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class SetEqual
{
        public static boolean areSetsEqual_Method1(int[] arr1, int[] arr2) {
            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();

            for (int val : arr1) set1.add(val);
            for (int val : arr2) set2.add(val);

            return set1.equals(set2);
        }
        public static boolean areSetsEqual_Method2(int[] arr1, int[] arr2) {
            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();
            for (int val : arr1) set1.add(val);
            for (int val : arr2) set2.add(val);
            return set1.containsAll(set2) && set2.containsAll(set1);
        }
        public static boolean areSetsEqual_Method3(int[] arr1, int[] arr2) {
            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();
            for (int val : arr1) set1.add(val);
            for (int val : arr2) set2.add(val);
            if (set1.size() != set2.size()) return false;
            for (int element : set1) {
                if (!set2.contains(element)) return false;
            }
            return true;
        }
        public static void checkAndPrint(String label, int[] arr1, int[] arr2) {
            boolean m1 = areSetsEqual_Method1(arr1, arr2);
            boolean m2 = areSetsEqual_Method2(arr1, arr2);
            boolean m3 = areSetsEqual_Method3(arr1, arr2);
            System.out.println("--------------------------------------------------");
            System.out.println("Test Case       : " + label);
            System.out.println("Set 1           : " + Arrays.toString(arr1));
            System.out.println("Set 2           : " + Arrays.toString(arr2));
            System.out.println("Method 1 (equals)      : " + m1);
            System.out.println("Method 2 (containsAll) : " + m2);
            System.out.println("Method 3 (manual)      : " + m3);
            System.out.println("Final Result    : " + (m1 ? "Sets are EQUAL" : "Sets are NOT EQUAL"));
        }
        public static void main(String[] args) {
            checkAndPrint(
                    "Basic Equal Sets",
                    new int[]{1, 2, 3},
                    new int[]{3, 2, 1}
            );
            checkAndPrint(
                    "Different Elements",
                    new int[]{1, 2, 3},
                    new int[]{1, 2, 4}
            );
            checkAndPrint(
                    "Different Sizes",
                    new int[]{1, 2, 3},
                    new int[]{1, 2}
            );
            checkAndPrint(
                    "Duplicates in Input",
                    new int[]{1, 2, 2, 3},
                    new int[]{3, 3, 1, 2}
            );
            checkAndPrint(
                    "Single Element Equal",
                    new int[]{7},
                    new int[]{7}
            );
            checkAndPrint(
                    "Single Element Not Equal",
                    new int[]{7},
                    new int[]{9}
            );
            checkAndPrint(
                    "Both Empty Sets",
                    new int[]{},
                    new int[]{}
            );
            checkAndPrint(
                    "Larger Equal Sets",
                    new int[]{10, 20, 30, 40, 50},
                    new int[]{50, 40, 30, 20, 10}
            );
        }
    }