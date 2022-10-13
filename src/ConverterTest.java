import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConverterTest {
    Converter converter;

    @BeforeEach
    void setUp() {
        converter = new Converter();
    }

    @Test
    void testConvertFromMetersToMiles() {
        String from = "meters";
        String to = "miles";
        double value = 1000.0;
        double result = value * 0.000621371;
        assertEquals(result, converter.convert(value,from,to));
    }

    @Test
    void testConvertFromMetersToFoots() {
        String from = "meters";
        String to = "foots";
        double value = 1000.0;
        double result = value * 3.28084;
        assertEquals(result, converter.convert(value,from,to));
    }

    @Test
    void testConvertFromMilesToArshins() {
        String from = "miles";
        String to = "arshins";
        double value = 1000;
        double result = value * 2262.857142857;
        assertEquals(result, converter.convert(value,from,to));
    }
}
