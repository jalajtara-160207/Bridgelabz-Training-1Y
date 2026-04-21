package Collections;

import java.util.*;
public class Frequency
{
        public static Map<String, Integer> countFrequency_Method1(String[] arr) {
            Map<String, Integer> freqMap = new HashMap<>();

            for (String item : arr) {
                if (freqMap.containsKey(item)) {
                    freqMap.put(item, freqMap.get(item) + 1);
                } else {
                    freqMap.put(item, 1);
                }
            }
            return freqMap;
        }
        public static Map<String, Integer> countFrequency_Method2(String[] arr) {
            Map<String, Integer> freqMap = new HashMap<>();

            for (String item : arr) {
                freqMap.put(item, freqMap.getOrDefault(item, 0) + 1);
            }
            return freqMap;
        }
        public static Map<String, Integer> countFrequency_Method3(String[] arr) {
            Map<String, Integer> freqMap = new HashMap<>();

            for (String item : arr) {
                freqMap.merge(item, 1, Integer::sum);
            }
            return freqMap;
        }
        public static Map<String, Integer> countFrequency_Method4(String[] arr) {
            Map<String, Integer> freqMap = new LinkedHashMap<>();

            for (String item : arr) {
                freqMap.put(item, freqMap.getOrDefault(item, 0) + 1);
            }
            return freqMap;
        }
        public static Map<String, Integer> countFrequency_Method5(String[] arr) {
            Map<String, Integer> freqMap = new TreeMap<>();

            for (String item : arr) {
                freqMap.put(item, freqMap.getOrDefault(item, 0) + 1);
            }
            return freqMap;
        }
        public static String mostFrequent(Map<String, Integer> freqMap) {
            return Collections.max(freqMap.entrySet(),
                    Map.Entry.comparingByValue()).getKey();
        }
        public static String leastFrequent(Map<String, Integer> freqMap) {
            return Collections.min(freqMap.entrySet(),
                    Map.Entry.comparingByValue()).getKey();
        }
        public static Map<String, Integer> sortByFrequency(Map<String, Integer> freqMap) {
            List<Map.Entry<String, Integer>> entries = new ArrayList<>(freqMap.entrySet());
            entries.sort((a, b) -> b.getValue() - a.getValue());

            Map<String, Integer> sorted = new LinkedHashMap<>();
            for (Map.Entry<String, Integer> entry : entries) {
                sorted.put(entry.getKey(), entry.getValue());
            }
            return sorted;
        }
        public static void printFrequency(String label, String[] input, Map<String, Integer> freqMap) {
            System.out.println("==================================================");
            System.out.println("Test Case       : " + label);
            System.out.println("Input           : " + Arrays.toString(input));
            System.out.println("Frequency Map   : " + freqMap);
            System.out.println("Total Elements  : " + input.length);
            System.out.println("Unique Elements : " + freqMap.size());
            if (!freqMap.isEmpty()) {
                System.out.println("Most  Frequent  : \"" + mostFrequent(freqMap)
                        + "\" (" + freqMap.get(mostFrequent(freqMap)) + " times)");
                System.out.println("Least Frequent  : \"" + leastFrequent(freqMap)
                        + "\" (" + freqMap.get(leastFrequent(freqMap)) + " times)");
                System.out.println("Sorted by Freq  : " + sortByFrequency(freqMap));
            }
        }

        public static void main(String[] args) {
            String[] input1 = {"apple", "banana", "apple", "orange"};
            Map<String, Integer> result1 = countFrequency_Method2(input1);
            printFrequency("Classic Fruit Example", input1, result1);
            String[] input2 = {"java", "java", "java", "java"};
            Map<String, Integer> result2 = countFrequency_Method2(input2);
            printFrequency("All Same Elements", input2, result2);
            String[] input3 = {"red", "green", "blue", "yellow"};
            Map<String, Integer> result3 = countFrequency_Method2(input3);
            printFrequency("All Unique Elements", input3, result3);
            String[] input4 = {"Apple", "apple", "APPLE", "apple"};
            Map<String, Integer> result4 = countFrequency_Method2(input4);
            printFrequency("Case Sensitive Strings", input4, result4);
            String[] input5 = {"hello"};
            Map<String, Integer> result5 = countFrequency_Method2(input5);
            printFrequency("Single Element", input5, result5);
            String[] input6 = {"dog", "cat", "dog", "fish", "cat", "dog"};
            Map<String, Integer> result6 = countFrequency_Method2(input6);
            printFrequency("Animals Frequency", input6, result6);
            String[] input7 = {"apple", "banana", "apple", "orange"};
            System.out.println("==================================================");
            System.out.println("Comparing All 5 Methods on: " + Arrays.toString(input7));
            System.out.println("Method 1 (HashMap manual)     : " + countFrequency_Method1(input7));
            System.out.println("Method 2 (getOrDefault)       : " + countFrequency_Method2(input7));
            System.out.println("Method 3 (merge)              : " + countFrequency_Method3(input7));
            System.out.println("Method 4 (LinkedHashMap order): " + countFrequency_Method4(input7));
            System.out.println("Method 5 (TreeMap sorted)     : " + countFrequency_Method5(input7));
            System.out.println("==================================================");
        }
    }