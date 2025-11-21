public class MethodOverriding {
    public static void main(String[] args) {        
        Animal animal = new Animal();
        animal.sound();
        animal.move();
        
        System.out.println();
        Dog dog = new Dog();
        dog.sound();
        dog.move();
        
        System.out.println();
        Cat cat = new Cat();
        cat.sound();
        cat.move();
        
    
    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
    
    void move() {
        System.out.println("Animal moves");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks: Bow Bow");
    }
    
    void move() {
        System.out.println("Dog runs on four legs");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows: Meow Meow");
    }
    
    void move() {
        System.out.println("Cat walks silently");
    }
}

