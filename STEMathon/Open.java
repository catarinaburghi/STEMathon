package STEMathon;

import java.util.Scanner;

public class Open {
    public static void main(String[] args) {
        //Declaring variables and Scanner
        //The Scanner in this example code represents the actions of the H2O Float
        Scanner hr = new Scanner(System.in);
        int heartrate;
        //Heart rate from the monitor
        System.out.println("Heartrate= bpm");
        heartrate = hr.nextInt();

        //if and else statements
        /*In this case the statement would be 
        *if (heartrate > 100 in under 1 second){
        * action.deploy = true
        * action.alarm = true
        *} esle if (heartrate <60 in under 1 second){
        *action.deploy = true
        *action.alarm = true
        *}*/
        if (heartrate > 100) {
            System.out.println("Floaty has been deployed and the Alarm is beeping!");

        } else if (heartrate < 60) {
            System.out.println("Floaty has been deployed and the Alarm is beeping!");
        } else {
            System.out.println("Continue having fun!");
        }

    }

}
