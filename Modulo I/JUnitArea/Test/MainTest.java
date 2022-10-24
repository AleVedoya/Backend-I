import com.alevedoya.Area;
import com.alevedoya.AreaCircle;
import com.alevedoya.AreaRectangle;
import com.alevedoya.exception.ExceptionMayorACero;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MainTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testArea() throws ExceptionMayorACero {
        //Arrange
        Area areaCircle = new AreaCircle(20);
        Area areaRectangle = new AreaRectangle(45);

        //Act
        double result1 = areaCircle.calculateArea();
        double result2 = areaRectangle.calculateArea();

        //Assert
        Assertions.assertEquals(1256.6370614359173, result1 );
        Assertions.assertEquals(2025.0, result2);
    }
}