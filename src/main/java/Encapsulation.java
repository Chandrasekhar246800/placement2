public class Encapsulation {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Chandra");
        emp.setAge(25);
        emp.setSalary(50000);
        System.out.println("Employee Details:");
        System.out.println("Name: " + emp.getName());
        System.out.println("Age: " + emp.getAge());
        System.out.println("Salary: " + emp.getSalary());
    }
}
class Employee {
    private String name;
    private int age;
    private double salary;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        }
    }
    public int getAge() {
        return age;
    }
    public void setSalary(double salary) {
        if(salary > 0) {
            this.salary = salary;
        }
    }
    public double getSalary() {
        return salary;
    }
}
