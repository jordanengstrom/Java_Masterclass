package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        printMegaBytesAndKiloBytes(2500);
//        printMegaBytesAndKiloBytes(-1024);
//        printMegaBytesAndKiloBytes(5000);
//
//        shouldWakeUp(true, 1);
//        shouldWakeUp(false, 2);
//        shouldWakeUp(true, 8);
//        shouldWakeUp(true, -1);
//
//        isLeapYear(-1600);
//        isLeapYear(1600);
//        isLeapYear(2017);
//        isLeapYear(2000);
//        isLeapYear(1800);
//        isLeapYear(1924);
//
//        areEqualByThreeDecimalPlaces(-3.1756, -3.175);
//        areEqualByThreeDecimalPlaces(3.175, 3.176);
//        areEqualByThreeDecimalPlaces(3.0, 3.0);
//        areEqualByThreeDecimalPlaces(-3.123, 3.123);
//
//        hasEqualSum(1, 1, 1);
//        hasEqualSum(1, 1, 2);
//        hasEqualSum(1, -1, 0);
//
//        hasTeen(9, 99, 19);
//        hasTeen(23, 15, 42);
//        hasTeen(22, 23, 24);
//
//        isTeen(9);
//        isTeen(13);
//
//        area(5.0);
//        area(-1);
//        area(5.0, 4.0);
//        area(-1.0, 4.0);
//        area(10.0,5.0);
//
//        printYearsAndDays(525600);
//        printYearsAndDays(1052100);
//        printYearsAndDays(516600);
//
//        printEqual(1, 1, 1);
//        printEqual(1, 1, 2);
//        printEqual(-1, -1, -1);
//        printEqual(1, 2, 3);
//
//        isCatPlaying(true, 10);
//        isCatPlaying(false, 36);
//        isCatPlaying(false, 35);
//
//        printNumberInWord(1);
//        printNumberInWord(9);
//        printNumberInWord(4);
//        printNumberInWord(145);
//        printNumberInWord(-5);
//
//        printYearsAndDays(525600);
//        printYearsAndDays(1051200);
//        printYearsAndDays(561600);
//
//        System.out.println(getDurationString(65, 45));
//        System.out.println(getDurationString(3959L));
//        System.out.println(getDurationString(-41));
//        System.out.println(getDurationString(65, 9));
//
//        printDayOfTheWeek(0);
//        printDayOfTheWeek(10);
//        printDayOfTheWeek(-1);
//        printDayOfTheWeek(5);
//
//        sum3and5();
//
//        isOdd(3);
//        isOdd(14);
//        isOdd(21);
//
//        sumOdd(1, 100);
//        sumOdd(-1, 100);
//        sumOdd(100, 100);
//        sumOdd(100, -100);
//        sumOdd(100, 1000);
//
//        sumDigits(-1);
//        sumDigits(932);
//        sumDigits(125);
//        sumDigits(0);
//        sumDigits(9);
//        sumDigits(10);
//        sumDigits(125);
//        sumDigits(-125);
//        sumDigits(4);
//        sumDigits(32123);
//
//        isPalindrome(1230);
//        isPalindrome(-1230);
//        isPalindrome(3);
//        isPalindrome(123);
//        isPalindrome(-111);
//
//        sumFirstAndLastDigit(252);
//        sumFirstAndLastDigit(257);
//        sumFirstAndLastDigit(0);
//        sumFirstAndLastDigit(5);
//        sumFirstAndLastDigit(-10);
//
//        getEvenDigitSum(123465789);
//        getEvenDigitSum(252);
//        getEvenDigitSum(-22);
//
//        hasSharedDigit(12, 23);
//        hasSharedDigit(9, 99);
//        hasSharedDigit(15, 55);
//
//        hasSameLastDigit (41, 22, 71);
//        hasSameLastDigit (23, 32, 42);
//        hasSameLastDigit (9, 99, 999);
//
//        getGreatestCommonDivisor(25, 15);
//        getGreatestCommonDivisor(12, 30);
//        getGreatestCommonDivisor(9, 18);
//        getGreatestCommonDivisor(81, 153);
//
//        printFactors(6);
//        printFactors(32);
//        printFactors(10);
//        printFactors(-1);
//
//        isPerfectNumber(6);
//        isPerfectNumber(28);
//        isPerfectNumber(5);
//        isPerfectNumber(-1);
//
//        numberToWords(123);
//        numberToWords(1010);
//        numberToWords(1000);
//        numberToWords(-12);
//
//        reverse(-121);
//        reverse(1212);
//        reverse(1234);
//        reverse(100);
//
//        getDigitCount(0);
//        getDigitCount(123);
//        getDigitCount(-12);
//        getDigitCount(5200);
//
//        canPack(1, 0, 4);
//        canPack(1, 0, 5);
//        canPack(0, 5, 4);
//        canPack(2, 2, 11);
//        canPack(-3, 2, 12);

//        canPack(2,1, 5);
//        canPack(1, 0, 4);
        canPack(6, 2, 17);
//
//        getUserInput();
//
//        inputThenPrintSumAndAverage();
//
//        getBucketCount(-3.4, 2.1, 1.5, 2);
//        getBucketCount(3.4, 2.1, 1.5, 2);
//        getBucketCount(2.75, 3.25, 2.5, 1);

//        getDaysInMonth(1, 2020);
//        getDaysInMonth(2, 2020);
//        getDaysInMonth(2, 2018);
//        getDaysInMonth(-1, 2020);
//        getDaysInMonth(1, -2020);

//
//        getBucketCount(-3.4, 2.1, 1.5);
//        getBucketCount(3.4, 2.1, 1.5);
//        getBucketCount(7.25, 4.3, 2.35);
//
//        getBucketCount(3.4, 1.5);
//        getBucketCount(6.26, 2.2);
//        getBucketCount(3.26, 0.75);

    }



    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        // 1 MB = 1024 KB
        if (kiloBytes >= 0) {
            int rKB = kiloBytes % 1024;
            int MB = kiloBytes / 1024;
            System.out.println(kiloBytes + " KB = " + MB + " MB and " + rKB + " KB");
        } else {
            System.out.println("Invalid Value");
        }
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay > 22 && hourOfDay <= 23 && barking == true) {
            System.out.println("true");
            return true;
        } else if (hourOfDay < 8 && hourOfDay >= 0 && barking == true) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if (!(month > 0 && month < 13) || (!(year >= 1 && year <= 9999))) {
            System.out.println(-1);
            return -1;
        } else {
            int answer = -1;
            switch (month) {
                case 1: month= 1;
                    System.out.println(31);
                    answer = 31;
                    break;
                case 2: month = 2;
                    boolean x = isLeapYear(year);
                    if (x) {
                        System.out.println(29);
                        answer = 29;
                    } else {
                        System.out.println(28);
                        answer = 28;
                    }
                    break;
                case 3: month = 3;
                        answer = 31;
                        break;
                case 4: month = 4;
                        answer = 30;
                        break;
                case 5: month = 5;
                        answer = 31;
                        break;
                case 6: month = 6;
                        answer = 30;
                        break;
                case 7: month = 7;
                        answer = 31;
                        break;
                case 8: month = 8;
                        answer = 31;
                        break;
                case 9: month = 9;
                        answer = 30;
                        break;
                case 10: month = 10;
                         answer = 31;
                         break;
                case 11: month = 11;
                         answer = 30;
                         break;
                case 12: month = 12;
                         answer = 31;
                         break;
                default:
                        answer = -1;
                        break;
            }
            return answer;
        }
    }

    public static boolean isLeapYear(int year) {
        if (!(year >= 1 && year <= 9999)) {
            System.out.println("false");
            return false;
        } else if (year % 400 == 0) {
            System.out.println("true");
            return true;
        } else if (year % 100 == 0) {
            System.out.println("false");
            return false;
        } else if (year % 4 == 0) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    public static boolean areEqualByThreeDecimalPlaces(double param1, double param2) {

//      You can also use Math.floor(paramx)
        double modx = param1 - (param1 % 1);
        double mody = param2 - (param2 % 1);

        boolean answer = false;

        if (modx != mody) {
//            System.out.println("ANSWER: " + answer);
            return answer;

        } else if (param1 == param2) {
            answer = true;
//            System.out.println("ANSWER: "  + answer);
            return answer;
        } else {
            answer = true;
            String x = Double.toString(param1);
            String y = Double.toString(param2);

            int i = x.indexOf(".");
//            System.out.println("I = " + i);
            int max = i + 3;

            while ((i <= max) && answer) {
                char xx = x.charAt(i);
                char years = y.charAt(i);

                if (xx != years) {
                    answer = false;
                } else {
                    answer = true;
                    i += 1;
                }
            }
        }
//        System.out.println("ANSWER: " + answer);
        return answer;
    }

    public static boolean hasEqualSum(int param1, int param2, int param3) {
        if (param1 + param2 == param3) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    public static boolean hasTeen(int param1, int param2, int param3) {
        if (((param1 <= 19) && (param1 >= 13)) ||
                ((param2 <= 19) && (param2 >= 13)) ||
                ((param3 <= 19) && (param3 >= 13))) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    public static boolean isTeen(int param1) {
        if ((param1 <= 19) && (param1 >= 13)) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        } else {
            double area = (Math.PI) * (Math.pow(radius, 2.0));
            System.out.println(area);
            return area;
        }
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        } else {
            double area = x * y;
            System.out.println(area);
            return area;
        }
    }

    public static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println(INVALID_VALUE_MESSAGE);
        } else {
            String minutesString = minutes + " min = ";

            long years = minutes / 525600;
            long remMin = minutes % 525600;
            double days = (double) remMin * (1.0 / 60.0) * (1.0 / 24.0);
            int intDays = (int) days;


            String yearsString = years + " y and ";
            String daysString = intDays + " d";

            System.out.println(minutesString + yearsString + daysString);
        }
    }

    public static void printEqual(int param1, int param2, int param3) {
        if (param1 < 0 || param2 < 0 || param3 < 0) {
            System.out.println("Invalid Value");
        } else if (((param1 / param2) == 1) && ((param2 / param3) == 1)) {
            System.out.println("All numbers are equal");
        } else if ((param1 != param2) && (param2 != param3) && (param3 != param1)) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {

        boolean answer;
        if (summer && temperature >= 25 && temperature <= 45) {
            answer = true;
            return answer;
        } else if (!summer && temperature >= 25 && temperature <= 35) {
            answer = true;
            return answer;
        } else {
            answer = false;
            return answer;
        }
    }

    public static void printNumberInWord(int i) {
        String message;

        switch (i) {
            case 0:
                message = "ZERO";
                System.out.println(message);
                break;
            case 1:
                message = "ONE";
                System.out.println(message);
                break;
            case 2:
                message = "TWO";
                System.out.println(message);
                break;
            case 3:
                message = "THREE";
                System.out.println(message);
                break;
            case 4:
                message = "FOUR";
                System.out.println(message);
                break;
            case 5:
                message = "FIVE";
                System.out.println(message);
                break;
            case 6:
                message = "SIX";
                System.out.println(message);
                break;
            case 7:
                message = "SEVEN";
                System.out.println(message);
                break;
            case 8:
                message = "EIGHT";
                System.out.println(message);
                break;
            case 9:
                message = "NINE";
                System.out.println(message);
                break;
            default:
                message = "OTHER";
                System.out.println(message);
                break;
        }
    }

    private static String getDurationString(long minutes, long seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        } else {
            long hours = minutes / 60;
            String hoursString = hours + "h";

            if (hours < 10) {
                hoursString = "0" + hoursString;
            }

            long remMin = minutes % 60;
            String minutesString = remMin + "m";

            if (remMin < 10) {
                minutesString = "0" + minutesString;
            }

            String secondsString = seconds + "s";
            if (seconds < 10) {
                secondsString = "0" + secondsString;
            }

            return hoursString + " " + minutesString + " " + secondsString;
        }

    }

    private static String getDurationString(long seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        } else {
            long minutes = seconds / 60;
            long remSec = seconds % 60;

            return getDurationString(minutes, remSec);
        }
    }

    public static void printDayOfTheWeek(int param) {
        String DayOfWeek;
        switch (param) {
            case 0:
                DayOfWeek = "Sunday";
                System.out.println(DayOfWeek);
                break;
            case 1:
                DayOfWeek = "Monday";
                System.out.println(DayOfWeek);
                break;
            case 2:
                DayOfWeek = "Tuesday";
                System.out.println(DayOfWeek);
                break;
            case 3:
                DayOfWeek = "Wednesday";
                System.out.println(DayOfWeek);
                break;
            case 4:
                DayOfWeek = "Thursday";
                System.out.println(DayOfWeek);
                break;
            case 5:
                DayOfWeek = "Friday";
                System.out.println(DayOfWeek);
                break;
            case 6:
                DayOfWeek = "Saturday";
                System.out.println(DayOfWeek);
                break;
            default:
                System.out.println("Invalid day");
        }
    }

    public static int sum3and5() {
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if (count <= 4) {
                if ((i % 3 == 0) && (i % 5 == 0)) {
                    System.out.println(count);
                    System.out.println("Found Number: " + i);
                    sum += i;
                    count++;
                }
            } else {
                break;
            }

        }
        System.out.println("FINAL SUM: " + sum);
        return sum;
    }

    public static boolean isOdd(int number) {
        boolean answer;
        if (number < 0) {
            answer = false;
        } else if (number % 2 != 0) {
            answer = true;
        } else {
            answer = false;
        }
        //System.out.println(answer);
        return answer;
    }

    public static int sumOdd(int start, int end) {
        if (end < start || start < 0 || end < 0) {
            //System.out.println(-1);
            return -1;

        } else {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
            //System.out.println(sum);
            return sum;
        }
    }

    public static int sumDigits(int number) {
        // INSTRUCTOR'S SOLUTION
        if (number < 10) {
            System.out.println(-1);
            return -1;
        }

        int sum = 0;
        while (number > 0) {
            // extract the least significant digit
            int digit = number % 10;
            sum += digit;

            // drop the least significant digit
            number /= 10;
        }

        System.out.println("SUM: " + sum);
        return sum;

//        FIRST CORRECT ATTEMPT:
//        if (number < 10) {
//            System.out.println(-1);
//            return -1;
//        } else {
//            String numString = Integer.toString(number);
//            int sum = 0;
//            for (int i = 0; i < numString.length(); i++) {
//                char letter = numString.charAt(i);
//                int n = Character.getNumericValue(letter);
//                sum += n;
//            }
//            System.out.println(sum);
//            return sum;
//        }
    }

    public static boolean isPalindrome(int number) {
        boolean answer = false;
        int absNumber = Math.abs(number);
        int origNum = absNumber;
        int reverse = 0;

        if (Math.abs(number) < 10) {
            //System.out.println("false");
            answer = false;
        } else {
            while (absNumber != 0) {
                int lastDigit = absNumber % 10;
                reverse *= 10;
                reverse += lastDigit;
                absNumber /= 10;
            }

            //System.out.println("REVERSE " + reverse);
            //System.out.println("ORIGNUM " + origNum);
            if (origNum == reverse) {
                //System.out.println("true");
                answer = true;
            }
        }
        System.out.println(answer);
        return answer;
    }

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            System.out.println("-1");
            return -1;
        } else if (number < 9 && number >= 0) {
            int sum = number + number;
            System.out.println(sum);
            return number + number;
        } else {
            int lastDigit = number % 10;
            int firstDigit = number;
            while (firstDigit >= 10) {
                firstDigit /= 10;
            }
            int sum2 = lastDigit + firstDigit;
            System.out.println(sum2);
            return lastDigit + firstDigit;

        }

    }

    public static int getEvenDigitSum(int number) {

        int sum = 0;

        if (number < 0) {
            //System.out.println("-1");
            return -1;
        } else {
            int digit = number;
            do {
                int newLastDigit = digit % 10;
                digit /= 10;
                if (newLastDigit % 2 == 0) {
                    sum += newLastDigit;
                }

            } while (digit > 0);
            //System.out.println(sum);
            return sum;
        }
    }

    public static boolean hasSharedDigit(int x, int y) {
        int x1 = x / 10;
        int x2 = x % 10;
        int y1 = y / 10;
        int y2 = y % 10;
        if ((x < 10 || x > 99) || (y < 10 || y > 99)) {
            System.out.println("false");
            return false;
        } else if ((x1 == y1 ||
                x1 == y2 ||
                x2 == y1 ||
                x2 == y2)) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;

        }
    }

//    public static boolean hasSameLastDigit(int x, int y, int z) {
//        if ((x < 10 || x > 1000) || (y < 10 || y > 1000) || (z < 10 || z > 1000)) {
//            System.out.println("false");
//            return false;
//        } else {
//
//        }
//    }

    public static boolean hasSameLastDigit(int x, int y, int z) {
        boolean answer;

        if (isValid(x) && isValid(y) && isValid(z)) {
            if (x % 10 == y % 10) {
                answer = true;
            } else if (y % 10 == z % 10) {
                answer = true;
            } else if (z % 10 == x % 10) {
                answer = true;
            } else {
                answer = false;
            }
        } else {
            answer = false;
        }
        System.out.println(answer);
        return answer;
    }

    public static boolean isValid(int x) {
        boolean answer;
        if (x < 10 || x > 1000) {
            answer = false;
        } else {
            answer = true;
        }
        return answer;
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            System.out.println(-1);
            return -1;
        } else {
            int gcd = -1;
            for (int divisor = 1; divisor <= first; divisor++) {
                if ((first % divisor == 0) && (second % divisor == 0)) {
                    gcd = divisor;
                }
            }
            System.out.println(gcd);
            return gcd;
        }
    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        } else {
            for (int divisor = 1; divisor <= number; divisor++) {
                if (number % divisor == 0) {
                    System.out.println(divisor);
                }
            }
        }
    }

    public static boolean isPerfectNumber(int number) {
        boolean answer;
        if (number < 1) {
            answer = false;
        } else {
            int divSum = 0;
            for (int divisor = 1; divisor < number; divisor++) {
                if (number % divisor == 0) {
                    divSum += divisor;
                }
            }
            if (divSum == number) {
                answer = true;
            } else {
                answer = false;
            }
        }
        System.out.println(answer);
        return answer;
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int esrever = reverse(number);

            for (int i = 0; i < getDigitCount(number); i++) {
                int currentDigit = esrever % 10;
                esrever /= 10;
                String numberString;

                switch (currentDigit) {
                    case 0:
                        numberString = "Zero";
                        System.out.println(numberString);
                        break;
                    case 1:
                        numberString = "One";
                        System.out.println(numberString);
                        break;
                    case 2:
                        numberString = "Two";
                        System.out.println(numberString);
                        break;
                    case 3:
                        numberString = "Three";
                        System.out.println(numberString);
                        break;
                    case 4:
                        numberString = "Four";
                        System.out.println(numberString);
                        break;
                    case 5:
                        numberString = "Five";
                        System.out.println(numberString);
                        break;
                    case 6:
                        numberString = "Six";
                        System.out.println(numberString);
                        break;
                    case 7:
                        numberString = "Seven";
                        System.out.println(numberString);
                        break;
                    case 8:
                        numberString = "Eight";
                        System.out.println(numberString);
                        break;
                    case 9:
                        numberString = "Nine";
                        System.out.println(numberString);
                        break;
                    default:
                        numberString = "Invalid numberString";
                        System.out.println(numberString);
                        break;
                }
            }
        }
    }

    public static int reverse(int number) {
        int reverse = 0;
        int absNumber = Math.abs(number);
        while (absNumber != 0) {
            int lastDigit = absNumber % 10;
            reverse *= 10;
            reverse += lastDigit;
            absNumber /= 10;
        }
        if (number < 0) {
            reverse *= -1;
            //System.out.println(reverse);
            return reverse;
        } else {
            //System.out.println(reverse);
            return reverse;
        }
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            //System.out.println(-1);
            return -1;
        } else {
            int count = 0;
            do {
                count += 1;
                number /= 10;
            } while (number > 0);
            //System.out.println(count);
            return count;
        }
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        boolean answer = false;
        int bigMass = 5 * bigCount;
        int smallMass = 1 * smallCount;
        int totalMass = bigMass + smallCount;

        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            answer = false;
        }

        if (totalMass >= goal) {
            if (totalMass % goal == 0 || bigMass % goal == 0) {
                answer = true;
            } else if ((totalMass >= goal) && (bigCount < goal)) {
                answer = true;
            } else {
                answer = false;
            }
        } else {
            answer = false;
        }
        System.out.println(answer);
        return answer;
    }

    public static void getUserInput() {

        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;

        while (counter < 10) {
            int order = counter + 1;
            System.out.println("Enter number #" + order + ": ");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;

            } else {
                System.out.println("Invalid number");
            }

            scanner.nextLine(); // handle end of line (enter key)
        }
        System.out.println("sum = " + sum);
        scanner.close();
    }

    public static void minMaxChallenge() {

        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;   //  2,147,483,648
        int max = Integer.MIN_VALUE;   // -2,147,483,648
        boolean first = true;

        while(true) {
            System.out.println("Enter number: ");

            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {

                int number = scanner.nextInt();

                if(first) {
                    first = false;
                    min = number;
                    max = number;
                }

                if(number > max) {
                    max = number;
                }

                if(number < min) {
                    min = number;
                }

            } else {
                break;
            }

            scanner.nextLine();
        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);
        scanner.close();
    }

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        long roundedAvg = 0;

        while (true) {

            //System.out.println("Enter number: ");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                sum += number;
                count += 1;
                roundedAvg = Math.round((double) sum / (double)  count);

            } else {
                break;
            }
            scanner.nextLine();
        }

        System.out.println("SUM = " + sum + " AVG = " + roundedAvg);
        scanner.close();
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        if((width <= 0) || (height <= 0) || (areaPerBucket <= 0) || (extraBuckets < 0)) {

            System.out.println("-1");
            return -1;

        } else {

            double area = width * height;
            int bucketCount = 0;
            double extraArea = extraBuckets * areaPerBucket;

            while ((bucketCount * areaPerBucket) + extraArea < area) {
                bucketCount++;
            }
            System.out.println(bucketCount);
            return bucketCount;
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {

        if((width <= 0) || (height <= 0) || (areaPerBucket <= 0)) {

            System.out.println("-1");
            return -1;

        } else {
            //getBucketCount(7.25, 4.3, 2.35);
            double area = width * height;
            int bucketCount = 0;

            while ((bucketCount * areaPerBucket) < area) {
                bucketCount++;
            }
            System.out.println(bucketCount);
            return bucketCount;
        }

    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if((area <= 0) || (areaPerBucket <= 0)) {

            System.out.println("-1");
            return -1;

        } else {
            int bucketCount = 0;

            while ((bucketCount * areaPerBucket) < area) {
                bucketCount++;
            }
            System.out.println(bucketCount);
            return bucketCount;
        }
    }
}
