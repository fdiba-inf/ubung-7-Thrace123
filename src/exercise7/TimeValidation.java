package exercise7;

import java.util.Scanner;

public class TimeValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter hours: ");
        int hours = input.nextInt();

        System.out.print("Enter minutes: ");
        int minutes = input.nextInt();

        boolean timeValid = false; // Call validation methods
        System.out.println("Time valid: " + timeValid);
    }

    public static boolean areHoursValid(int hours) {
        // Implement method
        if (hours >= 0 && hours < 24) {
          return true;
        } else {
          return false;
        }
    }


    public static boolean areMinutesValid(int minutes) {
        // Implement method
    if (minutes >= 0 && minutes < 60) {
          return true;
      } else {
          return false;
        }
    }
