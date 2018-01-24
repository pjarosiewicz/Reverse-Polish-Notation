package com.pjarosiewicz;

import org.junit.Before;
import static org.junit.Assert.*;

public class StackTest4 {

    private Stack<String> testStack;
    private String testString = "Test String";
    private String anotherTestString = "Another Test String";

    @Before
    public void setUp(){
        testStack = new Stack<>();
    }

    @org.junit.Test
    public void push() {
        testStack.push(testString);
        assertFalse(testStack.isEmpty());
    }

    @org.junit.Test
    public void popFromEmptyStack() {
        testStack.pop();
        assertTrue(testStack.isEmpty());
    }
    @org.junit.Test
    public void popObjectFromStack(){
        testStack.push(testString);
        testStack.pop();
        assertNotNull(testStack.isEmpty());
    }

    @org.junit.Test
    public void peekEmptyStack() {
        testStack.peek();
        assertTrue(testStack.isEmpty());
    }
    @org.junit.Test
    public void peekObjectInStack() {
        testStack.push(testString);
        testStack.peek();
        assertNotNull(testStack.isEmpty());
    }
    @org.junit.Test
    public void peekManyObjectsInStack()  {
        testStack.push(testString);
        testStack.push(anotherTestString);
        String test = testStack.peek();
        assertSame(anotherTestString, test);
    }

    @org.junit.Test
    public void isEmptyWhenEmpty()  {
       assertTrue(testStack.isEmpty());
    }

    @org.junit.Test
    public void isEmptyWhenObject()  {
        testStack.push(testString);
        assertFalse(testStack.isEmpty());
    }
}
