abstract class Shape {
  void draw();
}

class Circle extends Shape {
  @override
  void draw() {
    print("Menggambar lingkaran");
  }
}

void main() {
  Shape s = Circle();
  s.draw();
}
