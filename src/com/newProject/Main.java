package com.newProject;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        Parent parent = new Parent();
        System.out.println("min value :     "+parent.findMin(parent.readIntegers()));

    }



}
