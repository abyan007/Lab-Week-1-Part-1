class Animal {
    void sound() {
        System.out.println("Hewan bersuara...");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Kucing mengeong");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Anjing menggonggong");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal a1 = new Cat();
        Animal a2 = new Dog();

        a1.sound();
        a2.sound(); 
    }
}
