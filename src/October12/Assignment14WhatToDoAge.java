package October12;

public class Assignment14WhatToDoAge {
    public static void main(String[] args) {

        // call your method here
        whatYouCanDo(20);


    }

    public static void whatYouCanDo(int age){
        if (age<=0){
            System.out.println("Not a valid age.");
        }else  if (age<16){
            System.out.println("You can't drive.");
        }else if (age>16 && age<17){
            System.out.println("You can drive but not vote.");
        }else if (age>18 && age<24){
            System.out.println("You can vote but not rent a car.");
        }else if (age>25 && age<110) {
            System.out.println("You can do pretty much anything.");
        }else {
            System.out.println("Are you a human being?");
        }
    }
}
//create your method here


