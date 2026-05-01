package Regex_Assignment;

import java.util.regex.*;
import java.util.*;
public class Question7
{
        public static void main(String[] args) {
            String text = "Visit https://www.google.com and http://example.org for more info.";

            // Regex:
            // https?://  -> matches http:// or https://
            // \\S+       -> matches all non-space characters (the rest of the URL)
            String regex = "https?://\\S+";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);
            List<String> links = new ArrayList<>();
            while (matcher.find())
            {
                links.add(matcher.group());
            }
            System.out.println(String.join(", ", links));
        }
    }