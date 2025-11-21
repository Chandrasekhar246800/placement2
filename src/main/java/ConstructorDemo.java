public class ConstructorDemo {
    public static void main(String[] args) {
        
        Student student1 = new Student();
        student1.display();
        
        System.out.println();   
    }
}

class Student {
    String name;
    int age;
    
    public Student() {
        this.name = "chandra";
        this.age = 18;
    }
    
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
