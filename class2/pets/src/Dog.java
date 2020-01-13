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

    @Override
    public void speak() {
        System.out.println("Dog " + getName() + " says 'Woof'");
    }

    @Override
    public void play() {
        System.out.println(owner + "'s dog " + getName() + " is chasing toy in living room");
    }

    @Override
    public void play(String toy) {
        if (toy == null || toy.isBlank() || toy.isEmpty()) {
            return;
        }

        System.out.println(owner + "'s dog " + getName() + " is playing with a " + toy);
    }
}


