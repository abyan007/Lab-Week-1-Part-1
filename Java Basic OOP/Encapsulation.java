class Person {
    private String name; // private

    public String getName() { // getter
        return name;
    }

    public void setName(String name) { // setter
        this.name = name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Budi");
        System.out.println("Nama person: " + p.getName());
    }
}
