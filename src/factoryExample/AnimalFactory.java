package factoryExample;

public class AnimalFactory {
    public Animal createAnimal(String type){
        try {
            if (type == null || type.isEmpty()) {
                return null;
            }
            if (type.toLowerCase().equals("dog")) {
                return new Dog();
            }
            if (type.toLowerCase().equals("cat")) {
                return new Cat();
            }
            if (type.toLowerCase().equals("bird")) {
                return new Bird();
            }
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
        return null;
    }
}
