package com.day4;

public class OOPExercises { 
    public static void main(String[] args) { 
        A objA = new A(); 
        System.out.println("in main(): "); 
        
     /**  
      * The part that causes errors:
      * 
      * System.out.println("objA.a = "+objA.a); 
      * objA.a = 222;
      */
        //The code to make it work:
        System.out.println("objA.a = "+ objA.getA());
        objA.setA(222);
        System.out.println("Now objA.a = "+ objA.getA());
    } 
} 
