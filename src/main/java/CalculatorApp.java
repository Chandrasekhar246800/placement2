import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("=== Advanced Calculator ===");
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();
            System.out.print("Enter operation (+, -, *, /): ");
            char operation = sc.next().charAt(0);
            BasicCalculator calc = new BasicCalculator(num1, num2);
            double result = 0;
            switch(operation) {
                case '+':
                    result = calc.add();
                    break;
                case '-':
                    result = calc.subtract();
                    break;
                case '*':
                    result = calc.multiply();
                    break;
                case '/':
                    result = calc.divide();
                    break;
                default:
                    System.out.println("Invalid operation");
                    sc.close();
                    return;
            }
            System.out.println("Result: " + result);
            System.out.println("\nOverloading");
            ScientificCalculator sciCalc = new ScientificCalculator();
            System.out.println("Add 2 integers: " + sciCalc.calculate((int) num1, (int) num2));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid input");
        } finally {
            sc.close();
        }
    }
}
abstract class Calculator {
    abstract double performOperation(double a, double b);
}
class BasicCalculator extends Calculator {
    private double num1;
    private double num2;
    public BasicCalculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public double getNum1() {
        return num1;
    }
    public void setNum1(double num1) {
        this.num1 = num1;
    }
    public double getNum2() {
        return num2;
    }
    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    double performOperation(double a, double b) {
        return a + b;
    }
    public double add() {
        return num1 + num2;
    }
    public double subtract() {
        return num1 - num2;
    }
    public double multiply() {
        return num1 * num2;
    }
    public double divide() {
        if(num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return num1 / num2;
    }
}
class ScientificCalculator {
    public ScientificCalculator() {
        System.out.println("Scientific Calculator initialized");
    }
    public int calculate(int a, int b) {
        return a + b;
    }
    public int calculate(int a, int b, int c) {
        return a + b + c;
    }
    public double calculate(double a, double b) {
        return a + b;
    }
}
