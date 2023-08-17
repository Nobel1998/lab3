import static org.junit.Assert.*;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class FileTests {

    @Test
    public void testGetFilesForSomeFilesDirectory() throws IOException {
        File inputDirectory = new File("some-files/");
        List<File> files = FileExample.getFiles(inputDirectory);
        
        List<File> expectedFiles = Arrays.asList(
            new File("some-files/a.txt"),
            new File("some-files/more-files/b.txt"),
            new File("some-files/more-files/c.java"),
            new File("some-files/even-more-files/d.java"),
            new File("some-files/even-more-files/a.txt")
        );
        
        assertEquals(expectedFiles.size(), files.size());
        assertTrue(files.containsAll(expectedFiles));
    }

    @Test
    public void testGetFilesForMoreFilesSubdirectory() throws IOException {
        File inputDirectory = new File("some-files/more-files");
        List<File> files = FileExample.getFiles(inputDirectory);
        
        List<File> expectedFiles = Arrays.asList(
            new File("some-files/more-files/b.txt"),
            new File("some-files/more-files/c.java")
        );
        
        assertEquals(expectedFiles.size(), files.size());
        assertTrue(files.containsAll(expectedFiles));
    }

    @Test
    public void testGetFilesForAFile() throws IOException {
        File inputFile = new File("some-files/a.txt");
        List<File> files = FileExample.getFiles(inputFile);
        
        assertEquals(1, files.size());
        assertTrue(files.contains(inputFile));
    }

}
