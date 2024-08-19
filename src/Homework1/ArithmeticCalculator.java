import java.util.Scanner;

public class ArithmeticCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("introdu primul numar:");
        double num1 = scanner.nextDouble();

        System.out.println("introdu semnul de operatiei (+, -, *, /):");
        char operation = scanner.next().charAt(0);

        System.out.println("introdu al doilea numar:");
        double num2 = scanner.nextDouble();

        double result = 0;
        boolean validOperation = true;

        if (operation == '+') {
            result = num1 + num2;
        } else if (operation == '-') {
            result = num1 - num2;
        } else if (operation == '*') {
            result = num1 * num2;
        } else if (operation == '/') {

            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Eroare: diviziunea cu zero nu este posibila.");
                validOperation = false;
            }
        } else {

            System.out.println("Eroare: operatiune invalida.");
            validOperation = false;
        }

        if (validOperation) {
            System.out.println("resultatul este: " + result);
        }
    }
}
