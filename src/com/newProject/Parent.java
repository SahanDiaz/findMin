package com.newProject;

import static com.newProject.Main.scanner;

public class Parent {
    public int[] readIntegers(){

        System.out.print("plese enter element count : ");
        int count = scanner.nextInt();
        int[] arr = new int[count];
        System.out.println("please enter num of element one by one : ");
        for (int x =0; x<arr.length;x++){
            System.out.print("element "+(x+1)+ " : ");
            arr[x] = scanner.nextInt();
        }
        scanner.close();
        return arr;
    }
    public int findMin(int[] arr1){
        int min = arr1[0];
        for (int a=0;a<arr1.length-1;a++){
            if (arr1[a] > arr1[a + 1]) min = arr1[a+1];
        }
        return min;
    }
}
