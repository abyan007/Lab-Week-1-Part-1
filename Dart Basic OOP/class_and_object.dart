class Student {
  String name;
  Student(this.name);

  void sayHello() {
    print("Halo, saya $name");
  }
}

void main() {
  var s1 = Student("Abyan");
  s1.sayHello();
}
