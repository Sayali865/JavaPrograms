package classprograms;
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat barks");
    }
}

// Main class
public class Programs4 {
    public static void main(String[] args) {
        // Create Animal object
        Animal animal = new Animal();
        animal.makeSound();
        Cat cat = new Cat();
        
        cat.makeSound();
    }
}
