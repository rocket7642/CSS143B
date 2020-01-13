public class Main {

    public static void main(String[] args) {

        // create a cat object by calling the copy constructor
        Cat cocoTheCat = new Cat("Coco", "he", 5, "white");

        // create a cat object by calling the copy constructor
        Dog maxTheDog = new Dog("Max", "she", 3, "Mike");

        cocoTheCat.play();
        maxTheDog.play();
    }
}
