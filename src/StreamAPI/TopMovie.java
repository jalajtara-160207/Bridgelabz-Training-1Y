package StreamAPI;

import java.util.*;
import java.util.stream.*;
public class TopMovie {
        static class Movie {
            String title;
            String genre;
            double rating;
            int releaseYear;
            Movie(String title, String genre, double rating, int releaseYear) {
                this.title = title;
                this.genre = genre;
                this.rating = rating;
                this.releaseYear = releaseYear;
            }
            @Override
            public String toString() {
                return String.format("%-35s | Genre: %-12s | Rating: %.1f | Year: %d",
                        title, genre, rating, releaseYear);
            }

            public static int getReleaseYear(Object o) {
                return 0;
            }

            public static double getRating(Object o) {
                return 0;
            }
        }
        public static void main(String[] args) {
            List<Movie> movies = Arrays.asList(
                    new Movie("Oppenheimer",               "Drama",     8.9, 2023),
                    new Movie("Barbie",                    "Comedy",    7.0, 2023),
                    new Movie("The Batman",                "Action",    7.8, 2022),
                    new Movie("Top Gun: Maverick",         "Action",    8.3, 2022),
                    new Movie("Avatar: The Way of Water",  "Sci-Fi",    7.6, 2022),
                    new Movie("Everything Everywhere",     "Sci-Fi",    7.8, 2022),
                    new Movie("The Whale",                 "Drama",     7.7, 2022),
                    new Movie("Dune: Part Two",            "Sci-Fi",    8.5, 2024),
                    new Movie("Poor Things",               "Drama",     8.0, 2023),
                    new Movie("Killers of the Flower Moon","Drama",     7.6, 2023),
                    new Movie("Past Lives",                "Romance",   7.9, 2023),
                    new Movie("Godzilla x Kong",           "Action",    6.3, 2024),
                    new Movie("Civil War",                 "Thriller",  7.3, 2024),
                    new Movie("Deadpool & Wolverine",      "Action",    7.8, 2024),
                    new Movie("Inside Out 2",              "Animation", 7.8, 2024),
                    new Movie("Alien: Romulus",            "Horror",    7.3, 2024),
                    new Movie("Twisters",                  "Action",    6.8, 2024),
                    new Movie("The Substance",             "Horror",    7.5, 2024),
                    new Movie("A Quiet Place: Day One",    "Horror",    6.9, 2024),
                    new Movie("Longlegs",                  "Thriller",  5.8, 2024)
            );
            System.out.println("            TOP 5 TRENDING MOVIES (2022-2024)             ");
            List<Movie> top5 = movies.stream()

                    // filter(): only recent movies (2022 onwards) with rating >= 7.5
                    .filter(m -> m.releaseYear >= 2022 && m.rating >= 7.5)

                    // sorted(): primary → rating descending | secondary → year descending
                    .sorted(Comparator.comparingDouble(Movie::getRating)
                            .reversed()
                            .thenComparingInt(Movie::getReleaseYear)
                            .reversed())

                    // limit(): top 5 only
                    .limit(5)
                    .collect(Collectors.toList());
            // ── 3. Print results ─────────────────────────────────────────────────
            System.out.println(" Results after filter() → sorted() → limit()\n");
            System.out.println("──────────────────────────────────────────────────────────────────");

            int rank = 1;
            for (Movie m : top5) {
                System.out.printf(" #%d  %s%n", rank++, m);
            }
            System.out.println("──────────────────────────────────────────────────────────────────");
            System.out.println("\n Stream operations used:");
            System.out.println("   • filter()  → releaseYear >= 2022 AND rating >= 7.5");
            System.out.println("   • sorted()  → by rating DESC, then releaseYear DESC");
            System.out.println("   • limit(5)  → top 5 results only");
        }
        static double getRating(Movie m)  { return m.rating; }
        static int getReleaseYear(Movie m) { return m.releaseYear; }
    }

