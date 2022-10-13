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
    void testConvertFromMilesToArshin() {
        String from = "miles";
        String to = "arshin";
        double value = 1000.0;
        double result = value * 1144.562608;
        assertEquals(result, converter.convert(value,from,to));
    }
}
