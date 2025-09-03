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

public class Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog("Buddy");
        d.sound();
    }
}
