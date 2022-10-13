import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Converter {
    HashMap<String, Integer> numSystem;
    Double[][] multipliers = {
            {1.0, 0.000621371, 3.28084, 39.3701, 1.40607424071991},
            {1609.34, 1.0, 5280.0, 63360.0, 2262.857142857},
            {0.3048, 0.000189394, 1.0, 12.0, 0.4285714285714},
            {0.0254, 1.5783e-5, 0.0833333, 1.0, 0.03571428571428},
            {0.7112, 0.0004419190552, 2.333333408, 28.00001512, 1.0}
    };
    public Converter() {
        numSystem = new HashMap<>();
        numSystem.put("meters", 0);
        numSystem.put("miles", 1);
        numSystem.put("foots", 2);
        numSystem.put("inches", 3);
        numSystem.put("arshins", 4);
    }

    double convert(double value, String from, String to){
        return value * (multipliers[numSystem.get(from)][numSystem.get(to)]);
    }

    String getType(){
        final Scanner scanner = new Scanner(System.in);
        String type;
        do{
            type = scanner.nextLine().toLowerCase(Locale.ROOT);
        } while(!numSystem.containsKey(type));
        return type;
    }
}
