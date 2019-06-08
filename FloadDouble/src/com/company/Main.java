package com.company;

public class Main {

    public static void main(String[] args) {

        //width of int = 32 (4 bytes)
        int myIntValue = 5 / 2;
        float myFloatValue = 5f / 2f;
        double myDoubleValue = 5d / 2d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue );
        System.out.println("myDoubleValue = " + myDoubleValue);

        // Convert a given number of pounds to kilograms
        // 1. Create a variable to store the number of pounds
        // 2. Calculate the number of kilograms for the number above and store in a variable
        // 3. Print out the result
        //
        // NOTES: 1 pound is equal to 0.45359237 kilograms

        double conversionFactor = 0.45359237d;
        double lbs = 4d;
        double kg = lbs * conversionFactor;
        System.out.println("Pounds to kilograms: " + kg);

        System.out.println("Operator Challenge:");

        // 1. Create a double variable with the value 20
        // 2. Create a second variable of type double with the value of 80
        // 3. Add both numbers up and multiply by 25
        // 4. Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
        // 5. Write an "if" statement that displays a message "Total was over the limit"
        //    if the remaining (#4) is equal to 20 or less

        double twenty = 20d;
        double eighty = 80d;
        double x = (twenty + eighty) * 25;
        double y = x % 40;

        if (y > 20)
            System.out.println("Total was over the limit");
        else
            System.out.println(y);
    }
}
