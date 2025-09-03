class Animal {
    String name;
    Animal(String name) {
        this.name = name;
    }

    void sound() {
        System.out.println("Hewan bersuara...");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(name + " menggonggong: Woof!");
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(name + " mengeong: Meow!");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal a1 = new Dog("Tommy");
        Animal a2 = new Cat("Kitty");

        a1.sound(); // Dog
        a2.sound(); // Cat
    }
}
