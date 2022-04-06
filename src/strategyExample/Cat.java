package strategyExample;

public class Cat extends Animal {
   private String owner;

    public Cat(String name, Integer age, String owner) {
        super(name, age);
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
