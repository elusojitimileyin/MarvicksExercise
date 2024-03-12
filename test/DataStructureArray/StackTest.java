package DataStructureArray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StackTest {
    private MyStack myStack;
    @BeforeEach
    public void initializedStack(){

        myStack = new MyStack();
    }

    @Test
    public void myStackIsEmptyTest(){
        assertTrue(myStack.isEmpty());
    }
    @Test
    public void addOneElementToMyStack_myStackIsEmptyTest(){
        assertTrue(myStack.isEmpty());
        myStack.pushAdd("file one");
    }
    @Test
    public void addMoreThanOneElementToMyStack_myStackIsEmptyTest(){
        assertTrue(myStack.isEmpty());
        myStack.pushAdd("file one");
        myStack.pushAdd("file two");
        myStack.pushAdd("file three");
        assertEquals(3,myStack.size(3));
    }
    @Test
    public void addMoreThanOneElementToMyStack_removeElement_myStackIsEmptyTest(){
        assertTrue(myStack.isEmpty());
        myStack.pushAdd("file one");
        myStack.pushAdd("file two");
        myStack.pushAdd("file three");
        assertEquals(3,myStack.size(3));

        myStack.popRemove(2, myStack.size(3));
    }
    @Test
    public void addMoreThanOneElementToMyStack_removeMoreOneElement_myStackIsEmptyTest(){
        assertTrue(myStack.isEmpty());
        myStack.pushAdd("file one");
        myStack.pushAdd("file two");
        myStack.pushAdd("file three");
        assertEquals(3,myStack.size(3));

        myStack.popRemove(2, myStack.size(3));
        myStack.popRemove(1, myStack.size(3));
    }

    @Test
    public void addMoreThanOneElementToMyStack_removeMoreOneElement_addAnotherElement_myStackIsEmptyTest(){
        assertTrue(myStack.isEmpty());
        myStack.pushAdd("file one");
        myStack.pushAdd("file two");
        myStack.pushAdd("file three");
        assertEquals(3,myStack.size(3));

        myStack.popRemove(2, myStack.size(3));
        myStack.popRemove(1, myStack.size(3));
        myStack.pushAdd("file four");
        myStack.pushAdd("file five");
        myStack.pushAdd("file six");

    }
}
