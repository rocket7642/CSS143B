public class Cat {
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

    public Cat(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    void speak() {
        System.out.println("Cat " + name + " says 'Moew'");
    }

    void play() {
        System.out.println("Cat " + name + " jumps on a kitchen table");
    }
}


