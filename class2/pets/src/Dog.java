public class Dog extends Animal{

    public Dog(String name, String gender, int age) {
        // calling the base class constructor
        super(name, gender, age);
    }

    void speak() {
        System.out.println("Dog " + getName() + " says 'Woof'");
    }

    void play() {
        System.out.println("Dog" + getName() + " is chasing toy in living room");
    }
}


