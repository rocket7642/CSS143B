public class Cat extends Animal {

    public Cat(String name, String gender, int age) {
        // calling the base class constructor
        super(name, gender, age);
    }

    void speak() {
        System.out.println("Cat " + getName() + " says 'Moew'");
    }

    void play() {
        System.out.println("Cat " + getName() + " jumps on a kitchen table");
    }
}


