package strategyExample;

public class Dog extends Animal {

    private String owner;
    private Integer speed;

    public Dog(String name, Integer age, String owner, Integer speed) {
        super(name, age);
        this.owner = owner;
        this.speed = speed;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }
}
