import java.util.HashMap;
import java.util.Scanner;

public class Converter {
    HashMap<String, Integer> types;
    Double[][] multipliers = {
            {1.0, 0.000621371, 3.28084, 39.3701, 0.7112},
            {1609.34, 1.0, 5280.0, 63360.0, 1144.562608},
            {0.3048, 0.000189394, 1.0, 12.0, 0.21677376},
            {0.0254, 1.5783e-5, 0.0833333, 1.0, 0.01806448},
            {0.7112, 0.0004419190552, 2.333333408, 28.00001512, 1.0}
    };
    public Converter() {
        types = new HashMap<>();
        types.put("meters", 0);
        types.put("miles", 1);
        types.put("foots", 2);
        types.put("inches", 3);
        types.put("arshin", 4);
    }


    double convert(double value, String from, String to){
        return value * (multipliers[types.get(from)][types.get(to)]);
    }

    String getType(){
        final Scanner scanner = new Scanner(System.in);
        String type;
        do{
            System.out.println("Enter numbering system: ");
            type = scanner.nextLine();
        } while(!types.containsKey(type));
        return type;
    }
}
