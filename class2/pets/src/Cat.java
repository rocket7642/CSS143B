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

    void speak() {
        System.out.println("Cat " + getName() + " says 'Moew'");
    }

    void play() {
        System.out.println("Cat " + getName() + " jumps on a kitchen table");
    }

}


