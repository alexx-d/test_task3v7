import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        Converter converter = new Converter();
        System.out.print("Enter the number you want to convert: ");
        double value = scanner.nextDouble();
        System.out.print("Enter the value of your number: ");
        String originalNumSystem = converter.getType();
        System.out.print("Enter the value you want to convert to: ");
        String newNumSystem = converter.getType();
        System.out.println(value + " " + originalNumSystem + " = "
                + converter.convert(value,originalNumSystem,newNumSystem) + " " + newNumSystem);
    }
}