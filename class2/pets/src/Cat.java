public class Cat extends Animal {

    private String furColor;

    public Cat(String name, String gender, int age, String furColor) {
        // calling the base class constructor
        super(name, gender, age);

        // set cat specific property
        this.furColor = furColor;
    }

    public String getFurColor() {
        return furColor;
    }

    // cat specific method
    void purr() {
        System.out.println("Cat " + getName() + ": Purrrrrrr...");
    }

    @Override
    public void speak() {
        System.out.println("Cat " + getName() + " says 'Moew'");
    }

    @Override
    public void play() {
        System.out.println(furColor + " cat " + getName() + " jumps on a kitchen table");
    }

    // an overload of function play with different argument
    public void play(String toy) {
        if (toy != null || !toy.isEmpty() || !toy.isBlank()) {
            System.out.println("Cat " + getName() + " is playing with " + toy);
        }
    }
}


