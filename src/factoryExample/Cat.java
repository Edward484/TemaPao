package factoryExample;

public class Cat implements Animal{
    private String name;
    private Integer age;
    private String owner;

    public Cat(String name, Integer age, String owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public Cat(){
        this.name = "new born";
        this.age = 0;
        this.owner = "no owner, please adopt";
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

    @Override
    public String toString() {
        return "factoryExample.Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", owner='" + owner + '\'' +
                '}';
    }

    @Override
    public void makeAnimalEat() {
        System.out.println("factoryExample.Cat is eating");
    }
}
