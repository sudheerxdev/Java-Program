package COM.SUDHEER.JavaLab;
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
// dog inherite property from animal(inheritance)
class Dog extends Animal {
    // method overriding (run time polymorphism)
    void sound() {
        System.out.println("Dog barks");
    }
}

class TestPolymorphism {
    public static void main(String[] args) {
        Animal a = new Dog(); // Polymorphism
        a.sound();
    }
}