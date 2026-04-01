package com.srm.helloapp;

public class Student {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello World");
        } else {
            String result = "Hello ";

            // Add names with comma
            for (String name : args) {
                result = result + name + ", ";
            }

            // Remove last comma and space
            result = result.substring(0, result.length() - 2);

            System.out.println(result);
        }
    }
}