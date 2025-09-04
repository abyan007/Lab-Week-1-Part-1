class Person {
  String _name = "";

  set name(String value) => _name = value;
  String get name => _name;
}

void main() {
  var p = Person();
  p.name = "Budi";
  print("Nama: ${p.name}");
}
