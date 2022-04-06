package factoryExample;

public class Dog implements Animal{

    private String name;
    private Integer age;
    private String owner;
    private Integer speed;

    public Dog(String name, Integer age, String owner, Integer speed) {
        this.name = name;
        this.age = age;
        this.owner = owner;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "factoryExample.Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", owner='" + owner + '\'' +
                ", speed=" + speed +
                '}';
    }

    public Dog() {
        this.name = "new born";
        this.age = 0;
        this.owner = "no owner, ready to adopt";
        this.speed = 20;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
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

    @Override
    public void makeAnimalEat() {
        System.out.println("factoryExample.Dog is eating");
    }

}
