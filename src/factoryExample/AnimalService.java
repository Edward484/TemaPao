package factoryExample;

import java.util.Scanner;

public class AnimalService {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Create a dog, cat or bird?");
        String animalType = scanner.nextLine();
        Animal animal = animalFactory.createAnimal(animalType);
        animal.makeAnimalEat();

        String owner = "";
        if(!animalType.toLowerCase().equals("bird")) {
            System.out.println("Please enter your name: ");
            owner = scanner.nextLine();
        }

        String animalName = "";
        System.out.println("Please enter the name you want to give to your new born animal: ");
        animalName = scanner.nextLine();


        if (animal instanceof Cat) {
            ((Cat) animal).setOwner(owner);
            ((Cat) animal).setName(animalName);
        } else if (animal instanceof Dog) {
            ((Dog) animal).setOwner(owner);
            ((Dog) animal).setName(animalName);
        } else if (animal instanceof Bird) {
            ((Bird) animal).setName(animalName);
        }

       System.out.println(animal.toString());





    }

}
