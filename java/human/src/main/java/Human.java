package com.laix.human;

public class Human {
    
    public String sayHelloWorld(){
        return "Hello World!";
    }

    public void useTool(){
        System.out.println("i can use some tools!");
    }

    public static void main(String[] args){
        System.out.println(new Human().sayHelloWorld());
        new Human().useTool();
    }
}
