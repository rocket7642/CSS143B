public class Main {

    public static void main(String[] args) {

        int numOfCats = 3;
        int numOfDogs = 2;

        // animals[] is to hold all the cats and dogs
        Animal animals[] = new Animal[numOfCats+numOfDogs];

        // add cats to animals[]
        String catColors[] = {"white", "red", "black"};
        for (int i=0; i<numOfCats; i++) {
            animals[i] = new Cat("cat" + i, "he", i+2, catColors[i]);

        }

        String dogOwners[] = {"Tom", "David"};
        // add dogs to animals[]
        for (int i=0; i<numOfDogs; i++) {
            animals[numOfCats+i] = new Dog("dogs" + i, "he", i+2, dogOwners[i]);
        }

        // let all the cats and dogs in the array play using play()
        for (int i=0; i<animals.length; i++) {
            animals[i].play();  // late binding
        }

        System.out.println(""); // add a new line

        // call the overloaded play function
        // let all the cats and dogs in the array play using play()
        for (int i=0; i<animals.length; i++) {
            if (animals[i] instanceof Cat) {
                continue;
            }
            animals[i].play("chewing bone");
        }
    }
}
