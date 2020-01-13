public class Animal {
    private String name;
    private String gender;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }

    public Animal(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void play() {
        System.out.println("Animal " + name + " could play");
    }

    public void play(String toy) {
        System.out.println("Animal " + name + " could play with a toy like " + toy);
    }

    public void speak() {
        System.out.println("Animal " + name + " may speak");
    }
}
