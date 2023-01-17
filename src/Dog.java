public class Dog {
    //Properties
    private String name;
    private String breed;

    //constructors

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    public Dog() {
        this.name = "";
        this.breed = "";
    }
    // getter or accessor method
    public String getName() {
        return name;
    }
    // setter or mutator method
    public void setName(String name) {
        this.name = name;
    }
    // getter or accessor method
    public String getBreed() {
        return breed;
    }
    // setter or mutator method
    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}
