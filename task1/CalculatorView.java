import java.util.Scanner;

public class CalculatorView {

    public double userInputOne() {
        double value1 = 0;
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        if (reader.hasNextDouble()) {
            value1 = reader.nextInt();
        }else {
            throw new ArithmeticException("Введите число!");
        }
        return value1;
    }

    public double userInputTwo() {
        double value2 = 0;
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите второе число: ");
        if (reader.hasNextDouble()) {
            value2 = reader.nextInt();
        }else {
            throw new ArithmeticException("Введите число!");
        }
        return value2;
    }
    public String userInputOperator() {
        String operator = "";
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите арифметическое действие (+, -, *, /): ");
        if (reader.hasNextLine()) {
            operator = reader.nextLine();
        }
        return operator;
    }
    public void printResult(double result) {
        System.out.println("Результат: " + result);
    }
    public void printError(String errorMessage) {
        System.out.println(errorMessage);
    }
}