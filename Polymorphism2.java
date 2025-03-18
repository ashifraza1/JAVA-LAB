class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}
public class Polymorphism2 {
    public static void main(String[] args) {
        Dog D = new Dog();
        D.makeSound();
        Cat C = new Cat();
        C.makeSound();
    }
}

