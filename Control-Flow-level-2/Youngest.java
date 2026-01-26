import java.util.Scanner;

class Youngest {
    public static void main(String args[]) {
        Scanner y = new Scanner(System.in);

        System.out.println("Enter age and height for Amar: ");
        int ageA1 = y.nextInt();
        int heightA1 = y.nextInt();

        System.out.println("Enter age and height for Akbar: ");
        int ageA2 = y.nextInt();
        int heightA2 = y.nextInt();

        System.out.println("Enter age and height for Anthony: ");
        int ageA3 = y.nextInt();
        int heightA3 = y.nextInt();

        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        String youngestFriend = (youngestAge == ageAmar) ? "Amar" : (youngestAge == ageAkbar) ? "Akbar" : "Anthony";
        System.out.println("Youngest Friend: " + youngestFriend);

        int tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        String tallestFriend = (tallestHeight == heightAmar) ? "Amar" : (tallestHeight == heightAkbar) ? "Akbar" : "Anthony";
        System.out.println("Tallest Friend: " + tallestFriend);
        sc.close();
    }
}