package Regex_Assignment;

import java.util.regex.*;
import java.util.*;
public class Question5
{
        public static void main(String[] args) {
            String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";

            // Regex:
            // \b        -> word boundary
            // [A-Z]     -> starts with uppercase letter
            // [a-z]*    -> followed by lowercase letters
            String regex = "\\b[A-Z][a-z]*\\b";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);
            List<String> words = new ArrayList<>();
            while (matcher.find())
            {
                words.add(matcher.group());
            }
            System.out.println(String.join(", ", words));
        }
    }