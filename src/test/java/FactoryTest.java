import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactoryTest {
    private ShapeFactory shapeFactory;

    @BeforeEach
    void setUp() {
        shapeFactory = new ShapeFactory();
    }

    @Test
    void shapeCircle() {
        System.out.println("Running: testShapeCircle");
        Shape shape = shapeFactory.getShape("Circle");
        assertNotNull(shape);
    }

    @Test
    void shapeOctagon() {
        System.out.println("Running: testShapeOctagon");
        Shape shape = shapeFactory.getShape("Octagon");
        assertNotNull(shape);
    }
}
