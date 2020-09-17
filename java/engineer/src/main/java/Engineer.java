package com.laix.engineer;

import com.laix.human.Human;

public class Engineer extends Human{
    
    public void coding(){
        System.out.println("i am coding now!");
    }

    public static void main(String[] args){
        new Engineer().coding();
        System.out.println(new Engineer().sayHelloWorld());
    }

}
