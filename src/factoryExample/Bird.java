package factoryExample;

public class Bird implements Animal{
    private String name;
    private Integer age;
    private Integer wingSpan;

    public Bird(String name, Integer age, Integer wingSpan) {
        this.name = name;
        this.age = age;
        this.wingSpan = wingSpan;
    }



    public String toString() {
        return "factoryExample.Bird{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", wingSpan=" + wingSpan +
                '}';
    }

    public Bird(){
        this.name = "new born";
        this.age = 0;
        this.wingSpan = 30;
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

    public Integer getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(Integer wingSpan) {
        this.wingSpan = wingSpan;
    }

    @Override
    public void makeAnimalEat() {
        System.out.println("factoryExample.Bird is eating");
    }
}
