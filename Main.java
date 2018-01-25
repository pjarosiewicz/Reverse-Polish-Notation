package com.pjarosiewicz;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static Stack<Float> mystack = new Stack<>();

    public static void main(String[] args) {
        float number;
        String operator;
        System.out.println("Please enter number or operator");
        while((!sc.hasNext("exit"))){
            if(sc.hasNextFloat()){
                number = sc.nextFloat();
                sc.nextLine();
                mystack.push(number);
                System.out.println("you have entered: " + number);
            } else if(sc.hasNextLine()){
                float a,b;
                
                a = mystack.pop();
                b = mystack.pop();
                
                operator = sc.nextLine();
                switch(operator){
                    case "+":
                        //a = mystack.pop();
                        //b = mystack.pop();
                        mystack.push(a+b);
                        break;
                    case "-":
                        //a = mystack.pop();
                        //b = mystack.pop();
                        mystack.push(b-a);
                        break;
                    case "*":
                        //a = mystack.pop();
                        //b = mystack.pop();
                        mystack.push(a*b);
                        break;
                    case "/":
                        //a = mystack.pop();
                        //b = mystack.pop();
                        mystack.push(b/a);
                        break;
                    default:
                        System.out.println("Please enter one of arithmetic operators (+,-,*,/");
                        break;
                }
            }
            System.out.println("last item "+ mystack.peek());
            System.out.print("stack size: ");mystack.stackSize();
        }
    }
}


