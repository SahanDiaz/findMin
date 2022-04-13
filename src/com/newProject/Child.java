package com.newProject;

public class Child {
    public int[] arr = new int[5];

    public int[] arrFn(){
        for (int x=0;x< arr.length;x++){
            arr[x] = x*24;
        }
        return arr;
    }
}
