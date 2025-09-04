class Animal {
  void sound() {
    print("Hewan bersuara...");
  }
}

class Dog extends Animal {
  @override
  void sound() {
    print("Anjing menggonggong");
  }
}

void main() {
  var d = Dog();
  d.sound();
}
