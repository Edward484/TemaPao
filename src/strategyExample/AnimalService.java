package strategyExample;

import java.util.Scanner;

public class AnimalService {
    public static void main(String[] args) {
        Animal Coco = new Cat("Coco", 5, "Eduard");
        Animal Rocky = new Dog("Rocky", 2, "Marinica", 24);
        Animal Birdy = new Bird("Birdy", 2, 10);

        System.out.println("Dog "+ Rocky.showActivity());
        System.out.println("Cat "+ Coco.showActivity());
        System.out.println("Bird "+ Birdy.showActivity());

        Scanner scanner = new Scanner(System.in);
        System.out.println("What should you dog do now? 1 = Sleep, 2 = Eat, 3 = Play");
        String activity = scanner.nextLine();
        if( activity.equals("1")){
            Rocky.setCurrentActivity(new ActivitySleeping());
        }
        if( activity.equals("2")){
            Rocky.setCurrentActivity(new ActivityEating());
        }
        if( activity.equals("3")){
            Rocky.setCurrentActivity(new ActivityPlay());
        }

        System.out.println("Dog "+Rocky.showActivity());
        Coco.setCurrentActivity(new ActivityPlay());
        System.out.println( "Cat "+Coco.showActivity());
        Birdy.setCurrentActivity(new ActivityEating());
        System.out.println("Bird "+ Birdy.showActivity());
    }
}
