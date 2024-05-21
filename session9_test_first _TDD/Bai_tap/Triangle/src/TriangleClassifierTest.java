import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TriangleClassifierTest {

    @Test
    public void testEquilateralTriangle() {
        assertEquals("Tam giác đều", TriangleClassifier.classifyTriangle(2, 2, 2));
    }

    @Test
    public void testIsoscelesTriangle() {
        assertEquals("Tam giác cân", TriangleClassifier.classifyTriangle(2, 2, 3));
    }

    @Test
    public void testScaleneTriangle() {
        assertEquals("Tam giác thường", TriangleClassifier.classifyTriangle(3, 4, 5));
    }

    @Test
    public void testNotATriangle() {
        assertEquals("Không phải là tam giác", TriangleClassifier.classifyTriangle(8, 2, 3));
    }

    @Test
    public void testNotATriangleNegativeSide() {
        assertEquals("Không phải là tam giác", TriangleClassifier.classifyTriangle(-1, 2, 1));
    }

    @Test
    public void testNotATriangleZeroSide() {
        assertEquals("Không phải là tam giác", TriangleClassifier.classifyTriangle(0, 1, 1));
    }
}
