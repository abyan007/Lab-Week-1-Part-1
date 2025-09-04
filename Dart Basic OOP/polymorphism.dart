class Animal {
  void sound() {
    print("Hewan bersuara...");
  }
}

class Cat extends Animal {
  @override
  void sound() {
    print("Kucing mengeong");
  }
}

class Dog extends Animal {
  @override
  void sound() {
    print("Anjing menggonggong");
  }
}

void main() {
  Animal a1 = Cat();
  Animal a2 = Dog();

  a1.sound(); 
  a2.sound(); 
}
