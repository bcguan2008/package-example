package com.laix.human;

public class Human {
    
    public String sayHelloWorld(){
        return "Hello World!";
    }


    public static void main(String[] args){
        System.out.println(new Human().sayHelloWorld());
    }
}
