public class Dog extends Pet {
    // Instance variable(s)
    private String breed;

    // Constructors
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public Dog() {
        super("Max", 2);
        this.breed = "Alaskan Malamute";
    }
    // makeNoise() method
    public void makeNoise() {
        System.out.println("Bark!");
    }

    // toString method
    public String toString() {
        String str = "Breed:" + breed;
        return str;
    }

    // Getter
    public String getBreed() {
        return this.breed;
    }

    // Setter
    public void setBreed(String breed) {
        if (breed.trim().length() != 0) {
            this.breed = breed;
        }
    }
}