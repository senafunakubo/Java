package com.example.java;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        double value = .012;

        double pSum = value + value + value;

        //Sum of primitive: 0.036000000000000004になってしまう
        System.out.println("Sum of primitive: " +pSum);


        String strValue = Double.toString(value);
        System.out.println("strValue: " + strValue);


        BigDecimal bigValue = new BigDecimal(strValue);
        BigDecimal bSum = bigValue.add(bigValue).add(bigValue);

        System.out.println("Sum of BigDecimals: " + bSum.toString());

    }

}
