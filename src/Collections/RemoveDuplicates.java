package Collections;

import java.util.*;
public class RemoveDuplicates {

        public static List<Integer> removeDuplicates_Method1(int[] arr) {
            Set<Integer> seen = new LinkedHashSet<>();
            for (int val : arr) {
                seen.add(val);
            }
            return new ArrayList<>(seen);
        }
        public static List<Integer> removeDuplicates_Method2(int[] arr) {
            Set<Integer> seen = new HashSet<>();
            List<Integer> result = new ArrayList<>();

            for (int val : arr) {
                if (!seen.contains(val)) {
                    seen.add(val);
                    result.add(val);
                }
            }
            return result;
        }
        public static List<Integer> removeDuplicates_Method3(int[] arr) {
            List<Integer> result = new ArrayList<>();

            for (int i = 0; i < arr.length; i++) {
                boolean isDuplicate = false;
                for (int j = 0; j < i; j++) {
                    if (arr[j] == arr[i]) {
                        isDuplicate = true;
                        break;
                    }
                }
                if (!isDuplicate) {
                    result.add(arr[i]);
                }
            }
            return result;
        }
        public static List<Integer> removeDuplicates_Method4(int[] arr) {
            List<Integer> result = new ArrayList<>();

            for (int val : arr) {
                if (!result.contains(val)) {
                    result.add(val);
                }
            }
            return result;
        }
        public static List<String> removeDuplicatesString(List<String> inputList) {
            Set<String> seen = new LinkedHashSet<>();
            seen.addAll(inputList);
            return new ArrayList<>(seen);
        }
        public static int countDuplicatesRemoved(int[] arr, List<Integer> result) {
            return arr.length - result.size();
        }
        public static List<Integer> findDuplicateElements(int[] arr) {
            Set<Integer> seen     = new HashSet<>();
            Set<Integer> dupSet   = new LinkedHashSet<>();

            for (int val : arr) {
                if (!seen.add(val)) {
                    dupSet.add(val);
                }
            }
            return new ArrayList<>(dupSet);
        }
        public static void printResult(String label, int[] input, List<Integer> output) {
            List<Integer> duplicates = findDuplicateElements(input);
            int removed              = countDuplicatesRemoved(input, output);

            System.out.println("==================================================");
            System.out.println("Test Case          : " + label);
            System.out.println("Input              : " + Arrays.toString(input));
            System.out.println("Output             : " + output);
            System.out.println("Original Size      : " + input.length);
            System.out.println("After Removal Size : " + output.size());
            System.out.println("Duplicates Removed : " + removed);
            System.out.println("Duplicate Elements : " +
                    (duplicates.isEmpty() ? "None" : duplicates));
        }

        public static void main(String[] args) {
            int[] input1 = {3, 1, 2, 2, 3, 4};
            List<Integer> result1 = removeDuplicates_Method1(input1);
            printResult("Classic Example", input1, result1);
            int[] input2 = {10, 20, 30, 40, 50};
            List<Integer> result2 = removeDuplicates_Method1(input2);
            printResult("No Duplicates", input2, result2);
            int[] input3 = {7, 7, 7, 7, 7};
            List<Integer> result3 = removeDuplicates_Method1(input3);
            printResult("All Same Elements", input3, result3);
            int[] input4 = {1, 5, 3, 5, 1, 8, 3, 9, 8};
            List<Integer> result4 = removeDuplicates_Method1(input4);
            printResult("Multiple Duplicates", input4, result4);
            int[] input5 = {42};
            List<Integer> result5 = removeDuplicates_Method1(input5);
            printResult("Single Element", input5, result5);
            int[] input6 = {5, 5, 1, 2, 3, 5};
            List<Integer> result6 = removeDuplicates_Method1(input6);
            printResult("Duplicates at Start & End", input6, result6);
            int[] input7 = {1, 2, 3, 4, 5, 1, 2, 3, 6, 7, 4, 8, 5, 9, 10};
            List<Integer> result7 = removeDuplicates_Method1(input7);
            printResult("Larger Input", input7, result7);
            List<String> strInput = Arrays.asList("apple", "banana", "apple");
            List<String> strResult = removeDuplicatesString(strInput);
            System.out.println("==================================================");
            System.out.println("Test Case          : String List");
            System.out.println("Input              : " + strInput);
            System.out.println("Output             : " + strResult);
            int[] input9 = {3, 1, 2, 2, 3, 4};
            System.out.println("==================================================");
            System.out.println("Comparing All 4 Methods on: " + Arrays.toString(input9));
            System.out.println("Method 1 (LinkedHashSet)     : " + removeDuplicates_Method1(input9));
            System.out.println("Method 2 (HashSet tracker)   : " + removeDuplicates_Method2(input9));
            System.out.println("Method 3 (Nested loop)       : " + removeDuplicates_Method3(input9));
            System.out.println("Method 4 (List contains)     : " + removeDuplicates_Method4(input9));
            System.out.println("==================================================");
        }
    }