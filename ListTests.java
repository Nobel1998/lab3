import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class ListTests {

    @Test
    public void testFilterWithEmptyList() {
        List<String> emptyList = new ArrayList<>();
        StringChecker checker = (s) -> s.startsWith("b");
        List<String> result = ListExamples.filter(emptyList, checker);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testFilterWithAllMatching() {
        List<String> list = List.of("apple", "avocado", "banana");
        StringChecker checker = (s) -> s.startsWith("a");
        List<String> result = ListExamples.filter(list, checker);
        assertEquals(2, result.size());
        assertTrue(result.get(0).equals("apple"));
        assertTrue(result.get(1).equals("avocado"));

    }

    @Test
    public void testFilterWithNoneMatching() {
        List<String> list = List.of("apple", "avocado", "banana");
        StringChecker checker = (s) -> s.startsWith("z");
        List<String> result = ListExamples.filter(list, checker);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testMergeBothEmpty() {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> result = ListExamples.merge(list1, list2);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testMergeOneEmpty() {
        List<String> list1 = List.of("apple");
        List<String> list2 = new ArrayList<>();
        List<String> result = ListExamples.merge(list1, list2);
        assertEquals(1, result.size());
        assertTrue(result.contains("apple"));
    }

    @Test
    public void testMergeBothNonEmpty() {
        List<String> list1 = List.of("apple", "carrot");
        List<String> list2 = List.of("banana", "date");
        List<String> result = ListExamples.merge(list1, list2);
        assertEquals(List.of("apple", "banana", "carrot", "date"), result);
    }

}
