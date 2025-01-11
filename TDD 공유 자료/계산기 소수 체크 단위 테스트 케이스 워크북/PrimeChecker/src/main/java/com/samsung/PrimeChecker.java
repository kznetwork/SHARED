package com.samsung;

public class PrimeChecker {
    public static String checkPrime(String input) {
        try {
            int number = Integer.parseInt(input);

            if (number < 0) {
                return "Invalid: Negative number";
            } else if (number == 0 || number == 1) {
                return "No";
            } else if (number > 1000) {
                return "Invalid: Out of range";
            } else if (isPrime(number)) {
                return "Yes";
            } else {
                return "No";
            }
        } catch (NumberFormatException e) {
            if (input.isBlank()) {
                return "Invalid: Blank input";
            }
            return "Invalid: Non-numeric input";
        }
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkPrime("-1"));    // Invalid: Negative number
        System.out.println(checkPrime("0"));     // No
        System.out.println(checkPrime("3"));     // Yes
        System.out.println(checkPrime("1000"));  // No
        System.out.println(checkPrime("1001"));  // Invalid: Out of range
        System.out.println(checkPrime("27"));    // No
        System.out.println(checkPrime("r"));     // Invalid: Non-numeric input
        System.out.println(checkPrime(" "));     // Invalid: Blank input
    }
}
