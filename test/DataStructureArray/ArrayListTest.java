package DataStructureArray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {
    private ArrayList strings;

    @BeforeEach
    public void initializedstrings() {

        strings = new ArrayList();
    }

    @Test
    public void newArrayIsEmptyTest() {
        assertTrue(strings.isEmpty());
    }

    @Test
    public void addOneElementArray_newArrayIsEmptyTest() {
        assertTrue(strings.isEmpty());
        strings.add("G-strings");
        assertTrue(strings.isEmpty());
    }

    @Test
    public void addMoreThanElementArray_newArrayIsEmptyTest() {
        assertTrue(strings.isEmpty());
        strings.add("G-strings");
        strings.add("S-strings");
        strings.add("D-strings");
        assertTrue(strings.isEmpty());
    }

    @Test
    public void addMoreThanElementArray_removeElement_newArrayIsEmptyTest() {
        assertTrue(strings.isEmpty());
        strings.add("G-strings");
        strings.add("S-strings");
        strings.add("D-strings");
        assertTrue(strings.isEmpty());
        strings.remove("G-strings");
        assertTrue(strings.isEmpty());
    }

    @Test
    public void addMoreThanElementArray_removeTwoElement_newArrayIsEmptyTest() {
        assertTrue(strings.isEmpty());
        strings.add("G-strings");
        strings.add("S-strings");
        strings.add("D-strings");
        assertTrue(strings.isEmpty());
        strings.remove("G-strings");
        strings.remove("S-strings");
        assertTrue(strings.isEmpty());
    }

    @Test
    public void addElementArray_getNewArrayIndexTest() {
        assertTrue(strings.isEmpty());
        strings.add("G-strings");
        assertEquals("G-strings", strings.getIndex(1));
    }
    @Test
    public void addTwoElementArray_getNewArrayByIndexTest() {
        assertTrue(strings.isEmpty());
        strings.add("G-strings");
        strings.add("D-strings");
        assertEquals(0, strings.getElement("G-strings"));
        assertEquals(1, strings.getElement("D-strings"));
    }
}