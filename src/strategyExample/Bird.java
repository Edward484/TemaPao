package strategyExample;

public class Bird extends Animal {
  private Integer wingSpan;

    public Bird(String name, Integer age, Integer wingSpan) {
        super(name, age);
        this.wingSpan = wingSpan;
    }

    public Integer getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(Integer wingSpan) {
        this.wingSpan = wingSpan;
    }
}
