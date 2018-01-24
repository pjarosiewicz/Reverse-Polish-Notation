package com.pjarosiewicz;
import java.util.*;
import java.util.NoSuchElementException;

public class Stack <T> {

    private LinkedList<T> stack;
    public Stack() {
        this.stack = new LinkedList<>();
    }

    public void push(T t){
        stack.addLast(t);
    }

    public T pop(){
        if(isEmpty()){
            return null;
        }
        return stack.removeLast();
    }

    public T peek(){
        if(isEmpty()){
            return null;
        } return stack.getLast();
    }

    public boolean isEmpty(){
        try {
            if(stack.getFirst() != null)
                return false;
        } catch (NoSuchElementException noSuchElementException) {};
        return true;
    }
    public void stackSize(){
        System.out.println(stack.size());
    }

}



