import static org.junit.Assert.*;
import org.junit.*;
import java.util.NoSuchElementException;

public class LinkedListTests {
    @Test
    public void testPrependToEmptyList() {
        LinkedList list = new LinkedList();
        assertNull(list.root);
        list.prepend(5);
        assertEquals(5, list.root.value);
        assertNull(list.root.next);
    }

    @Test
    public void testPrependToNonEmptyList() {
        LinkedList list = new LinkedList();
        list.prepend(5);
        list.prepend(10);
        assertEquals(10, list.root.value);
        assertEquals(5, list.root.next.value);
        assertNull(list.root.next.next);
    }

    
    @Test
    public void testAppendToEmptyList() {
        LinkedList list = new LinkedList();
        assertNull(list.root);
        list.append(5);
        assertEquals(5, list.root.value);
        assertNull(list.root.next);
    }

    @Test
    public void testAppendToNonEmptyList() {
        LinkedList list = new LinkedList();
        list.append(5);
        list.append(10);
        assertEquals(5, list.root.value);
        assertEquals(10, list.root.next.value);
        assertNull(list.root.next.next);
    }

    @Test
    public void testFirstInEmptyList() {
        LinkedList list = new LinkedList();
        try {
            list.first();
            fail("Expected NoSuchElementException to be thrown");
        } catch (NoSuchElementException e) {
            // Expected exception
        }
    }

    @Test
    public void testFirstInNonEmptyList() {
        LinkedList list = new LinkedList();
        list.append(5);
        assertEquals(5, list.first());
        list.append(10);
        assertEquals(5, list.first());
    }

    @Test
    public void testLastInEmptyList() {
        LinkedList list = new LinkedList();
        try {
            list.last();
            fail("Expected NoSuchElementException to be thrown");
        } catch (NoSuchElementException e) {
            // Expected exception
        }
    }

    @Test
    public void testLastInNonEmptyList() {
        LinkedList list = new LinkedList();
        list.append(5);
        assertEquals(5, list.last());
        list.append(10);
        assertEquals(10, list.last());
    }

    @Test
    public void testToStringEmptyList() {
        LinkedList list = new LinkedList();
        assertEquals("", list.toString());
    }

    @Test
    public void testToStringNonEmptyList() {
        LinkedList list = new LinkedList();
        list.append(5);
        assertEquals("5 ", list.toString());
        list.append(10);
        assertEquals("5 10 ", list.toString());
    }

    @Test
    public void testLengthEmptyList() {
        LinkedList list = new LinkedList();
        assertEquals(0, list.length());
    }

    @Test
    public void testLengthNonEmptyList() {
        LinkedList list = new LinkedList();
        list.append(5);
        assertEquals(1, list.length());
        list.append(10);
        assertEquals(2, list.length());
    }

    
}