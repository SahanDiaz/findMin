package com.newProject;

import java.util.ArrayList;

public class GroceryList {
    private int[] myNum =new int[40];
    private ArrayList<String> groceryList  = new ArrayList<>();

    public void addGroceryItem(String item ){
        groceryList.add(item);
    }
    public int getSize(){
       return groceryList.size();
    }
    public void printGroceryList(){
        System.out.println("you have "+ groceryList.size()+" itm in your grocery list"  );
        for(int i=0;i<groceryList.size();i++){
            System.out.println(i+1 + " . " + groceryList.get(i));
        }
    }
    public void modifyGroceryItems(int position,String newItem ){
        groceryList.set(position,newItem);
        System.out.println("Grocery item "+ (position+1)+ " has been modified. " );
    }
    public void removeGroceryItem(int position){
        groceryList.remove(position);
    }
    public String findItem (String searchItem){
//        boolean exists = groceryList.contains(searchItem);

        int position = groceryList.indexOf(searchItem);
        if(groceryList.size()>position && position>=0){
            return groceryList.get(position);
        }
        return null;
    }
}