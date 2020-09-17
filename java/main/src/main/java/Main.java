package com.laix.main;

import com.laix.human.Human;
import com.laix.engineer.Engineer;

public class Main {

    public static void main(String[] args){
        new Engineer().coding();
        System.out.println(new Engineer().sayHelloWorld());
        /**
            v1,v2 
        */
        //System.out.println(new Human().sayHelloWorld());
        /**
            v3 
        */
        new Human().useTool();

    }

}
