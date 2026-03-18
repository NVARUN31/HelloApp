package com.srm.helloapp;

public class HelloApp {

    public static void main(String[] args) {

        // Check if name is provided
        if(args.length > 0) {
            System.out.println("Hello " + args[0]);
        } 
        else {
            System.out.println("Hello");
        }

    }

}