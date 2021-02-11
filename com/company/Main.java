package com.company;

import java.util.Random;
public class Main {
    public static final int FULL_TIME=1;
    public static final int PART_TIME=2;


    public static void main(String[] args) {
        int random= (int)(Math.random()*10)%2;
        if(random==0){
            System.out.println("employee is present");

        }
        else{
            System.out.println("employee is absent");
        }


    }

}

