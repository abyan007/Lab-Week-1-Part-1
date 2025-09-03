class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void introduce() {
        System.out.println("Halo, nama saya " + name + ", umur saya " + age);
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        Student s1 = new Student("Abyan", 20);
        s1.introduce();
    }
}
