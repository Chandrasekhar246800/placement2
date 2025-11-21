public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("=== Method Overloading Demo ===");
        Calculator calc = new Calculator();
        
        System.out.println("Add two integers: " + calc.add(10, 20));
        System.out.println("Add three integers: " + calc.add(10, 20, 30));
        System.out.println("Add two doubles: " + calc.add(10.5, 20.5));
        System.out.println("Concatenate strings: " + calc.add("Hello", " World"));
    }
}

class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    
    int add(int a, int b, int c) {
        return a + b + c;
    }
    
    double add(double a, double b) {
        return a + b;
    }
    
    String add(String a, String b) {
        return a + b;
    }
}
