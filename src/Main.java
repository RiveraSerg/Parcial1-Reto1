import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int validar;
        Scanner scan = new Scanner(System.in);

        do{
            System.out.print("Tipo de operación: ");
            String operation = scan.next();
            switch (operation) {
                case "SUMA" -> {
                    System.out.print("Operando 1: ");
                    int parameter1 = scan.nextInt();
                    System.out.print("Operando 2: ");
                    int parameter2 = scan.nextInt();
                    System.out.println(parameter1 + " + " + parameter2 + " = " + (parameter1 + parameter2));
                    validar = 1;
                }
                case "RESTA" -> {
                    System.out.print("Operando 1: ");
                    int parameter1 = scan.nextInt();
                    System.out.print("Operando 2: ");
                    int parameter2 = scan.nextInt();
                    System.out.println(parameter1 + " - " + parameter2 + " = " + (parameter1 - parameter2));
                    validar = 1;
                }
                case "MULTIPLICACION" -> {
                    System.out.print("Operando 1: ");
                    int parameter1 = scan.nextInt();
                    System.out.print("Operando 2: ");
                    int parameter2 = scan.nextInt();
                    System.out.println(parameter1 + " * " + parameter2 + " = " + (parameter1 * parameter2));
                    validar = 1;
                }
                case "DIVISION" -> {
                    System.out.print("Operando 1: ");
                    int parameter1 = scan.nextInt();
                    System.out.print("Operando 2: ");
                    int parameter2 = scan.nextInt();
                    System.out.println(parameter1 + " / " + parameter2 + " = " + (parameter1 / parameter2));
                    validar = 1;
                }
                default -> {
                    System.out.println("Operación no soportada");
                    validar = 2;
                }
            }
        }while(validar < 2);

    }
}