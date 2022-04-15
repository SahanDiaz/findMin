package com.newProject;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
	// write your code here
//        Parent parent = new Parent();
       // System.out.println("min value :     "+parent.findMin(parent.readIntegers()));
//        parent.reverse(parent.readIntegers());
        boolean quit = false;
        printInstruction();
        int choice;
        while (!quit){
            System.out.print("enter your choice : ");
            choice = scanner.nextInt();
            scanner.nextLine();

                switch (choice){
                    case 0:
                        printInstruction();
                        break;
                    case 1:
                        groceryList.printGroceryList();
                        break;
                    case 2:
                        addItem();
                        break;
                    case 3:
                        modifyItem();
                        break;
                    case 4:
                        removeItem();
                        break;
                    case 5:
                        searchItem();
                        break;
                    case 6:
                        quit =true;
                        break;
                    default:
                        String s = "please enter 0-6 input";
                        System.out.println(s);
                        break;
                }
        }
        }
    private static void printInstruction(){
        System.out.println("0 - menu");
        System.out.println("1 - get Item List");
        System.out.println("2 - add a item");
        System.out.println("3 - modify item");
        System.out.println("4 - remove item");
        System.out.println("5 - search item ");
        System.out.println("6 - quit");
    }
    private static void addItem(){
        System.out.print("please enter your grocery item : ");
        groceryList.addGroceryItem(scanner.nextLine());
    }
    private static void modifyItem(){
        System.out.print("please enter  position of item :");
        int position = scanner.nextInt();
        scanner.nextLine();
        if(position <= groceryList.getSize()){
            System.out.print("please enter new grocery item : ");
            String  item = scanner.nextLine();
            groceryList.modifyGroceryItems(position,item);
        }else {
            System.out.println("enter position number between 0 - "+groceryList.getSize());
        }

    }
    private static void removeItem(){
        groceryList.printGroceryList();
        System.out.print("please enter  position of item :");
        int position = scanner.nextInt();
        if(position>=0){
            groceryList.removeGroceryItem(position);
        }
    }
    private static void searchItem(){
        System.out.print("please enter find item name");
       String dfs =  groceryList.findItem(scanner.nextLine());
        System.out.println((dfs==null)?("your item : " +dfs+" is in stock "):"out of stock");
    }



}
