package STEMathon;

import java.util.Scanner;

public class Probability {

    // variables that don't change
    private static final double PERC = 0.91;

    public static void main(String[] args) {

        // Declaring my variables
        Scanner sc = new Scanner(System.in);
        int kids;

        System.out.println("According to the National Autism Association in June of 2016,");
        System.out.println(
                "The risk of death by drowning is twice as high for children with ASD than in the General population");
        System.out.println(
                "In 2011, accidental drowning accounted for 91% of injury-related deaths in the U.S among kids with ASD");
        System.out.println("ages 14 years and younger.");
        System.out.println("Please enter the number of children living with ASD: ");
        kids = sc.nextInt();

        double drowned = kids * PERC;

        System.out.print("Out of " + kids);
        System.out.print(" kids who live with ASD who died in their childhood, " + drowned);
        System.out.print(" died due to drowning.");
    }
}
