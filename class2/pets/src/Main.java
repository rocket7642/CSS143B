public class Main {

    public static void main(String[] args) {

        // create a cat object by calling the copy constructor
        Cat cocoTheCat = new Cat("Coco", "he", 5);
        cocoTheCat.speak();
        cocoTheCat.play();
        System.out.printf("Cat %s's age is now %d\n", cocoTheCat.getName(), cocoTheCat.getAge());

        // create a cat object by calling the copy constructor
        Dog maxTheDog = new Dog("Max", "she", 3);
        maxTheDog.speak();
        maxTheDog.play();
        System.out.printf("Dog %s's age is now %d\n", maxTheDog.getName(), maxTheDog.getAge());
    }
}
