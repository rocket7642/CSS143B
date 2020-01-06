public class Main {

    public static void main(String[] args) {

        // print out the 99 bottles lyric from http://www.99-bottles-of-beer.net/lyrics.html
        for (int i=99; i>0; i--) {
            System.out.println( i + " bottles of beer on the wall, " + i + " bottles of beer.");
            if (i>1) {
                System.out.println("Take one down and pass it around, " + (i - 1) + " bottles of beer on the wall.\n");
            } else {
                System.out.println("Take one down and pass it around, no more bottles of beer on the wall.\n");
            }
        }

        System.out.println("No more bottles of beer on the wall, no more bottles of beer.\n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.");
    }
}
