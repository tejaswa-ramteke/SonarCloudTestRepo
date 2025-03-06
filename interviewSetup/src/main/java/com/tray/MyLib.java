package com.tray;

public class MyLib {
    private String password = "12345"; // Hardcoded password (Security issue)

    public void printTest1() {
        System.out.println("You are setup correctly if you see this.");
    }

    public void riskyMethod() {
        int unusedVariable = 10; // Unused variable (Code smell)

        try {
            int result = divide(10, 0); // Potential division by zero (Bug)
            System.out.println("Result: " + result);
        } catch (Exception e) {
            // Empty catch block (Code smell)
        }
    }

    public int divide(int a, int b) {
        return a / b; // Possible division by zero
    }
}
