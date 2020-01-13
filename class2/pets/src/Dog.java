public class Dog extends Animal{

    private String owner;

    public Dog(String name, String gender, int age, String favoriteHuman) {
        // calling the base class constructor
        super(name, gender, age);

        // set dog specific property
        this.owner = favoriteHuman;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    void speak() {
        System.out.println("Dog " + getName() + " says 'Woof'");
    }

    void play() {
        System.out.println("Dog " + getName() + " is chasing toy in living room");
    }
}


