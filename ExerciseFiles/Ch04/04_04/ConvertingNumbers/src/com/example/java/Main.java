package com.example.java;

public class Main {

    public static void main(String[] args) {

        int intValue1 = 56;
        int intValue2 = intValue1;
        System.out.println("The 2nd value is " + intValue2);

        long longValue1 = intValue1;
        //intでの結果が表示される
        System.out.println("The long value is " + longValue1);

        //Cast
        short shortValue1 = (short) intValue1;
        System.out.println("The short value is " + shortValue1);

        int intValue3 = 1024;
        byte byteValue = (byte) intValue3;
        //byte has a range from -127 to 128. The we lost the data here.
        System.out.println("The byte value is " + byteValue);

        double doubleValue = 3.999999d;
        int intValue4 = (int) doubleValue;
        //3
        System.out.println("Double to int: " + intValue4);
    }

}
