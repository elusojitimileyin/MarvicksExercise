package DataStructureArray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SetTest {
        private ySet mySet;
        @BeforeEach
        public void initializedSet(){
            mySet = new ySet();
        }

        @Test
        public void mySetIsEmptyTest(){
            assertTrue(mySet.isEmpty());
        }

    @Test
    public void addOneElementSet_newSetIsEmptyTest() {
        assertTrue(mySet.isEmpty());
        mySet.add("2, 3, set");
        assertTrue(mySet.isEmpty());
    }

    @Test
    public void addMoreThanElementSet_newSetIsEmptyTest() {
        assertTrue(mySet.isEmpty());
        mySet.add("femi");
        mySet.add("123");
        mySet.add("money");
        assertTrue(mySet.isEmpty());
    }

    @Test
    public void addMoreThanElementSet_removeElement_newSetIsEmptyTest() {
        assertTrue(mySet.isEmpty());
        mySet.add("femi");
        mySet.add("123");
        mySet.add("money");
        assertTrue(mySet.isEmpty());
        mySet.remove("money");
        assertTrue(mySet.isEmpty());
    }

    @Test
    public void addMoreThanElementSet_removeTwoElement_newSetIsEmptyTest() {
        assertTrue(mySet.isEmpty());
        mySet.add("femi");
        mySet.add("123");
        mySet.add("money");
        assertTrue(mySet.isEmpty());
        mySet.remove("money");
        mySet.remove("123");
        assertTrue(mySet.isEmpty());
    }

    @Test
    public void addElementSet_getNewSetIndexTest() {
        assertTrue(mySet.isEmpty());
        mySet.add("money");
        assertEquals("money", mySet.getIndex(1));
    }
    @Test
    public void addTwoElementSet_getNewSetByIndexTest() {
        assertTrue(mySet.isEmpty());
        mySet.add("money");
        mySet.add("123");
        assertEquals(0, mySet.getElement("money"));
        assertEquals(1, mySet.getElement("123"));
    }

}
