package strategyExample;

public class Animal {
    private String name;
    private Integer age;

    public CurrentActivity currentActivity = new ActivitySleeping();

    public Animal(String name, Integer age) {
        this.name = name;
        this.age = age;
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

    public void setCurrentActivity(CurrentActivity currentActivity) {
        this.currentActivity = currentActivity;
    }

    public String showActivity(){
        return currentActivity.showCurrentActivity();
    }
}
